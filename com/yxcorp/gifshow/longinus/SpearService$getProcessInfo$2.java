package com.yxcorp.gifshow.longinus.SpearService$getProcessInfo$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.lang.String;

public final class SpearService$getProcessInfo$2 extends Lambda implements l	// class@001b7f
{
    public static final SpearService$getProcessInfo$2 INSTANCE;

    static {
       SpearService$getProcessInfo$2.INSTANCE = new SpearService$getProcessInfo$2();
    }
    public void SpearService$getProcessInfo$2(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(ActivityManager$RunningAppProcessInfo p0){
       return p0.processName;
    }
}
