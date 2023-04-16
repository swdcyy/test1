package com.yxcorp.gifshow.longinus.MessageSdkSpearService$getProcessInfo$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.lang.String;

public final class MessageSdkSpearService$getProcessInfo$2 extends Lambda implements l	// class@001b79
{
    public static final MessageSdkSpearService$getProcessInfo$2 INSTANCE;

    static {
       MessageSdkSpearService$getProcessInfo$2.INSTANCE = new MessageSdkSpearService$getProcessInfo$2();
    }
    public void MessageSdkSpearService$getProcessInfo$2(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(ActivityManager$RunningAppProcessInfo p0){
       return p0.processName;
    }
}
