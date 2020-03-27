package com.aeert.droolsdemo.config;

import com.aeert.SessionFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author l'amour solitaire
 * @description import
 * @date 2019/9/26 上午9:08
 */
@Configuration
@Import({SessionFactory.class})
public class ImportConfig {

}
