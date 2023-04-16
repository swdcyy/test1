package com.kwai.kxb.push.PushActionParams;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class PushActionParams	// class@0007e0
{
    public final String bundleId;
    public final long requestApiIntervalInSeconds;
    public final long requestApiStartTimeInSecond;
    public final boolean shouldRequestApi;
    public final long taskId;
    public final int versionCode;
    public final String versionName;

    public void PushActionParams(){
       a.p("", "bundleId");
       a.p("", "versionName");
       super();
       this.bundleId = "";
       this.versionCode = -1;
       this.versionName = "";
       this.taskId = -1;
       this.requestApiIntervalInSeconds = 600;
       this.requestApiStartTimeInSecond = 0;
       this.shouldRequestApi = true;
    }
    public final String a(){
       return this.bundleId;
    }
    public final int b(){
       return this.versionCode;
    }
    public final String c(){
       return this.versionName;
    }
}
