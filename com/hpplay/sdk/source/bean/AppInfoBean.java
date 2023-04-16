package com.hpplay.sdk.source.bean.AppInfoBean;
import java.lang.Object;
import java.lang.String;

public class AppInfoBean	// class@000644
{
    public String appID;
    public int manifestVer;
    public String name;
    public String pkg;
    public String version;

    public void AppInfoBean(){
       super();
    }
    public String getAppID(){
       return this.appID;
    }
    public int getManifestVer(){
       return this.manifestVer;
    }
    public String getName(){
       return this.name;
    }
    public String getPkg(){
       return this.pkg;
    }
    public String getVersion(){
       return this.version;
    }
    public void setAppID(String p0){
       this.appID = p0;
    }
    public void setManifestVer(int p0){
       this.manifestVer = p0;
    }
    public void setName(String p0){
       this.name = p0;
    }
    public void setPkg(String p0){
       this.pkg = p0;
    }
    public void setVersion(String p0){
       this.version = p0;
    }
}
