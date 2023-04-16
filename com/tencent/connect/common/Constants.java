package com.tencent.connect.common.Constants;
import java.lang.StringBuilder;
import java.lang.String;
import java.io.File;
import java.lang.Object;

public class Constants	// class@000e47
{
    public static String APP_SPECIFIC_ROOT;
    public static String KEY_ENABLE_SHOW_DOWNLOAD_URL;
    public static String KEY_GUILD_TYPE;
    public static String KEY_GUILD_URL;
    public static String KEY_PROXY_APPID;
    public static String KEY_QRCODE;
    public static String KEY_RESTORE_LANDSCAPE;
    public static String KEY_SCOPE;
    public static String QQ_SHARE_TEMP_DIR;
    public static String VALUE_GUILD_CREATE;
    public static String VALUE_GUILD_JOIN;

    static {
       String separator = File.separator;
       StringBuilder str = "tencent"+separator+"mobileqq"+separator;
       Constants.APP_SPECIFIC_ROOT = str+"opensdk";
       Constants.QQ_SHARE_TEMP_DIR = "tmp";
       Constants.KEY_RESTORE_LANDSCAPE = "key_restore_landscape";
       Constants.KEY_SCOPE = "key_scope";
       Constants.KEY_QRCODE = "key_qrcode";
       Constants.KEY_ENABLE_SHOW_DOWNLOAD_URL = "key_enable_show_download_url";
       Constants.KEY_PROXY_APPID = "key_proxy_appid";
       Constants.KEY_GUILD_TYPE = "guild_type";
       Constants.KEY_GUILD_URL = "guild_url";
       Constants.VALUE_GUILD_CREATE = "create";
       Constants.VALUE_GUILD_JOIN = "join";
    }
    public void Constants(){
       super();
    }
}
