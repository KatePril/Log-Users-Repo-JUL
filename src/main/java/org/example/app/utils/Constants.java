package org.example.app.utils;

import javax.swing.plaf.PanelUI;

public final class Constants {
//    public final static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    public final static String DB_URL = "jdbc:mysql://localhost:3306/";
    public final static String DB_NAME = "users_demo_db";
    public final static String TABLE_USERS = "users";
    public final static String DB_USER = "admin";
    public final static String PHONE_RGX = "[0-9]{3}[\\ ][0-9]{3}-[0-9]{4}";
    public final static String WRONG_PHONE_MSG = "Wrong phone input.";
    public final static String EMAIL_RGX = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    public final static String WRONG_EMAIL_MSG = "Wrong email input.";
    public final static String ID_RGX = "[1-9]";
    public final static String WRONG_ID_MSG = "Wrong id input.";
    public final static String ID_NO_EXISTS_MSG = "There is no such ID.";

    public final static String DB_ABSENT_MSG = "\n>> No database!";
    public final static String DATA_ABSENT_MSG = "\n>> No data!";
    public final static String DATA_INSERT_MSG = "\n>> Created.";
    public final static String DATA_UPDATE_MSG = "\n>> Updated.";
    public final static String DATA_DELETE_MSG = "\n>> Deleted.";

    public final static String APP_CLOSE_MSG = "\n>> App closed.";
    public final static String INPUT_REQ_MSG = "Input required.";
    public final static String INCORRECT_VALUE_MSG = ">> Incorrect value! Try again.";

    public final static String LOG_DB_ABSENT_MSG = "Database is absent!";
    public final static String LOG_DATA_INPUTS_WRONG_MSG = "Data inputs incorrect.";
    public final static String LOG_DATA_ABSENT_MSG = "Data is absent!";
    public final static String LOG_DB_ERROR_MSG = "DB manipulations error.";

}