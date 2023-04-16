package com.kwai.feature.api.platform.bridge.beans.JsInstalledAppVersionParams;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class JsInstalledAppVersionParams implements Serializable	// class@00105e
{
    public final String mAppVersion;
    public final int mResult;
    public static final long serialVersionUID = 0x1fb69a8dcaaab047;

    public void JsInstalledAppVersionParams(String p0){
       super();
       this.mResult = 1;
       this.mAppVersion = p0;
    }
}
