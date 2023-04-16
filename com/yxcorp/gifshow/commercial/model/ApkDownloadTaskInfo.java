package com.yxcorp.gifshow.commercial.model.ApkDownloadTaskInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public class ApkDownloadTaskInfo implements Serializable	// class@00113f
{
    public String mAppIcon;
    public String mAppName;
    public String mPackageMd5;
    public String mParsedPkgName;
    public String mPkgName;
    public static final long serialVersionUID = 0xe575f1f2afb70ae3;

    public void ApkDownloadTaskInfo(){
       super();
    }
    public String getAppIcon(){
       return this.mAppIcon;
    }
    public String getAppName(){
       return this.mAppName;
    }
    public String getPkgName(){
       return this.mPkgName;
    }
}
