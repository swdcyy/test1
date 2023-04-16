package com.kwai.library.push.http.InPushApiExt$getRemoteConfig$2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import com.kwai.library.push.http.bean.PayloadConf;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import com.kwai.library.push.http.bean.PayloadConf$ConfData;

public final class InPushApiExt$getRemoteConfig$2 extends MutablePropertyReference1Impl	// class@0008c4
{
    public static final l INSTANCE;

    static {
       InPushApiExt$getRemoteConfig$2.INSTANCE = new InPushApiExt$getRemoteConfig$2();
    }
    public void InPushApiExt$getRemoteConfig$2(){
       super(PayloadConf.class, "mData", "getMData\(\)Lcom/kwai/library/push/http/bean/PayloadConf$ConfData;", 0);
    }
    public Object get(Object p0){
       return p0.mData;
    }
    public void set(Object p0,Object p1){
       p0.mData = p1;
    }
}
