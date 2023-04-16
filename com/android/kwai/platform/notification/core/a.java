package com.android.kwai.platform.notification.core.a;
import com.android.kwai.platform.notification.core.NotificationConfig;
import java.lang.Object;
import kotlin.jvm.internal.a;
import t7.e;
import java.lang.String;
import java.lang.StringBuilder;

public final class a	// class@000407
{
    public final NotificationConfig mConfig;
    public final String mErrorMsg;
    public final long mRequestInterval;
    public final int mResult;

    public final NotificationConfig a(){
       return this.mConfig;
    }
    public final long b(){
       return this.mRequestInterval;
    }
    public final int c(){
       return this.mResult;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof a && (a.g(this.mConfig, p0.mConfig) && (!this.mRequestInterval - p0.mRequestInterval && (this.mResult == p0.mResult && a.g(this.mErrorMsg, p0.mErrorMsg)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a tmConfig = this.mConfig;
       int i = 0;
       int i1 = (tmConfig != null)? tmConfig.hashCode(): 0;
       i1 = ((((i1 * 31) + e.a(this.mRequestInterval)) * 31) + this.mResult) * 31;
       a tmErrorMsg = this.mErrorMsg;
       if (tmErrorMsg != null) {
          i = tmErrorMsg.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       return "NotificationConfigWrapper\(mConfig="+this.mConfig+", mRequestInterval="+this.mRequestInterval+", mResult="+this.mResult+", mErrorMsg="+this.mErrorMsg+"\)";
    }
}
