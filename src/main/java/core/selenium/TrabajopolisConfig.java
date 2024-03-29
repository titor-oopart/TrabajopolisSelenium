/*
 * @(#) TrabajopolisConfig.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package core.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

/**
 * TrabajopolisConfig class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public final class TrabajopolisConfig {
    private InputStream input;
    private Properties properties;
    private String username;
    private String password;
    private String urlLogin;
    private String urlProfile;
    private String urlBase;
    private static TrabajopolisConfig trabajopolisConfig;
    private String urlCurriculum;
    private String urlFillCurriculum;

    /**
     * Constructor sets properties.
     */
    private TrabajopolisConfig() {
        properties = config();
    }

    /**
     * Gets instance for init properties.
     *
     * @return trabajopolisConfig
     */
    public static TrabajopolisConfig getInstance() {
        if (trabajopolisConfig == null) {
            trabajopolisConfig = new TrabajopolisConfig();
        }
        return trabajopolisConfig;
    }

    /**
     * Gets values from amazon properties for the tests.
     *
     * @return properties - Properties with all data of the user.
     */
    public Properties config() {
        try {
            input = new FileInputStream(System.getProperty("user.dir") + "/trabajopolis.properties");
            properties = new Properties();
            properties.load(input);
            username = properties.getProperty("username");
            password = properties.getProperty("password");
            urlLogin = properties.getProperty("urlLogin");
            urlProfile = properties.getProperty("urlProfile");
            urlBase = properties.getProperty("urlBase");
            urlCurriculum = properties.getProperty("urlCurriculum");
            urlFillCurriculum = properties.getProperty("urlFillCurriculum");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new NullPointerException("This file not exist!!");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }

    /**
     * Gets username.
     *
     * @return username - Credential for loginSuccessfully.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gets password.
     *
     * @return password - Credential for loginSuccessfully.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Gets urlLogin.
     *
     * @return urlLogin - Page transport.
     */
    public String getUrlLogin() {
        return urlLogin;
    }

    /**
     * Gets urlProfile.
     *
     * @return urlProfile - Page transport.
     */
    public String getUrlProfile() {
        return urlProfile;
    }

    /**
     * Gets urlBase.
     *
     * @return urlBase - Page transport.
     */
    public String getUrlBase() {
        return urlBase;
    }

    /**
     * Gets urlCurriculum.
     *
     * @return urlCurriculum - Page transport.
     */
    public String getUrlCurriculum() {
        return urlCurriculum;
    }

    /**
     * Gets urlFillCurriculum.
     *
     * @return urlFillCurriculum - Page transport.
     */
    public String getUrlFillCurriculum() {
        return urlFillCurriculum;
    }
}
