package com.union.aimei.pc.im.easemob.comm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 信息
 *
 * @author liurenkai
 * @time 2018/8/13 19:28
 */
public class OrgInfo {

    public static final Logger logger = LoggerFactory.getLogger(OrgInfo.class);
    public static String ORG_NAME;
    public static String APP_NAME;

    static {
        InputStream inputStream = OrgInfo.class.getClassLoader().getResourceAsStream("config.properties");
        Properties prop = new Properties();
        try {
            prop.load(inputStream);
            System.out.println("prop:" + prop.toString());
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
        ORG_NAME = prop.getProperty("ORG_NAME");
        APP_NAME = prop.getProperty("APP_NAME");
    }
}
