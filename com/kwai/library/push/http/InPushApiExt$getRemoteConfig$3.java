package com.kwai.library.push.http.InPushApiExt$getRemoteConfig$3;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import com.kwai.library.push.http.bean.PayloadConf$ConfData;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public final class InPushApiExt$getRemoteConfig$3 extends MutablePropertyReference1Impl	// class@0008c5
{
    public static final l INSTANCE;

    static {
       InPushApiExt$getRemoteConfig$3.INSTANCE = new InPushApiExt$getRemoteConfig$3();
    }
    public void InPushApiExt$getRemoteConfig$3(){
       super(PayloadConf$ConfData.class, "mIsSyn", "getMIsSyn\(\)Z", 0);
    }
    public Object get(Object p0){
       return Boolean.valueOf(p0.mIsSyn);
    }
    public void set(Object p0,Object p1){
       p0.mIsSyn = p1.booleanValue();
    }
}
