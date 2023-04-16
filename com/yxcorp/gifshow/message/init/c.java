package com.yxcorp.gifshow.message.init.c;
import ok.h;
import java.lang.Object;
import com.kwai.social.startup.reminder.model.IMConfigInfo;
import java.lang.Long;

public final class c implements h	// class@001d4e
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object apply(Object p0){
       return Long.valueOf((p0.mSiXinServiceTokenIntervalSeconds * 1000));
    }
}
