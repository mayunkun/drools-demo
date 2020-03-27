package com.aeert.droolsdemo;

import com.aeert.SessionFactory;
import com.aeert.droolsdemo.fact.Person;
import org.junit.jupiter.api.Test;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {DroolsDemoApplication.class})
class DroolsDemoApplicationTests {

    @Autowired
    private SessionFactory sessionFactory;

    @Test
    void contextLoads() throws InterruptedException {
        for (int i = 0; i < 50; i++) {
            Long start = System.currentTimeMillis();
            KieSession ksession = null;
            try {
                ksession = sessionFactory.getSession("rulesAge");

                Person person = new Person();
                person.setName("蔡徐坤");
                person.setAge(12);
                ksession.insert(person);

                ksession.fireAllRules(1);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
//                ksession.dispose();
            }
            System.out.println("耗时:" + (System.currentTimeMillis() - start));
            Thread.sleep(5000);
        }

    }
//    @Test
//    void contextLoads() throws InterruptedException {
//        String myRule = "package com.aeert.droolsdemo.fact;\n" +
//                "dialect  \"mvel\"\n" +
//                "\n" +
//                "rule \"person\"\n" +
//                "    when\n" +
//                "        $person : Person(age<16 || age>50)\n" +
//                "    then\n" +
//                "        System.out.println(\"这个人的年龄不符合要求！\");\n" +
//                "end";
//        Long start = System.currentTimeMillis();
//        KieSession ksession = null;
//        try {
//
//            KieHelper helper = new KieHelper();
//            helper.addContent(myRule, ResourceType.DRL);
//            Long start1 = System.currentTimeMillis();
//            ksession = helper.build().newKieSession();
//            System.out.printf("耗时:" + (System.currentTimeMillis() - start1));
//
//            Person person = new Person();
//            person.setName("蔡徐坤");
//            person.setAge(12);
//            ksession.insert(person);
//
//            ksession.fireAllRules(1);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            ksession.dispose();
//        }
//        System.out.println("耗时:" + (System.currentTimeMillis() - start));
//    }
}
