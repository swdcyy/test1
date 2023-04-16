package com.kwai.link.model.ApplicationInfo;
import java.lang.Object;
import java.util.HashMap;

public class ApplicationInfo	// class@000d1d
{
    public int app_id;
    public String app_name;
    public String app_release_channel;
    public String app_version;
    public String device_id;
    public String device_model;
    public String device_name;
    public int env;
    public Map extension_info;
    public String imei_md5;
    public String kwai_did;
    public String locale;
    public String manufacturer;
    public String os_version;
    public int platform_type;
    public String sdk_version;
    public String soft_did;
    public int timezone;

    public void ApplicationInfo(){
       super();
       this.app_id = 0;
       this.platform_type = 0;
       this.timezone = 0;
       this.env = 0;
       this.extension_info = new HashMap();
    }
}
