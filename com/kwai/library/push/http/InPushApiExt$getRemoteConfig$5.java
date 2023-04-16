package com.kwai.library.push.http.InPushApiExt$getRemoteConfig$5;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import com.kwai.library.push.http.bean.PayloadConf$ConfData;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import com.kwai.library.push.channel.bean.InPushConfig;

public final class InPushApiExt$getRemoteConfig$5 extends MutablePropertyReference1Impl	// class@0008c6
{
    public static final l INSTANCE;

    static {
       InPushApiExt$getRemoteConfig$5.INSTANCE = new InPushApiExt$getRemoteConfig$5();
    }
    public void InPushApiExt$getRemoteConfig$5(){
       super(PayloadConf$ConfData.class, "mInPushConfig", "getMInPushConfig\(\)Lcom/kwai/library/push/channel/bean/InPushConfig;", 0);
    }
    public Object get(Object p0){
       return p0.mInPushConfig;
    }
    public void set(Object p0,Object p1){
       p0.mInPushConfig = p1;
    }
}
