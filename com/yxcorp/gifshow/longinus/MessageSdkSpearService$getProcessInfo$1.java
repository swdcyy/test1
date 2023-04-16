package com.yxcorp.gifshow.longinus.MessageSdkSpearService$getProcessInfo$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.lang.Boolean;

public final class MessageSdkSpearService$getProcessInfo$1 extends Lambda implements l	// class@001b78
{
    public final int $myUid;

    public void MessageSdkSpearService$getProcessInfo$1(int p0){
       this.$myUid = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(ActivityManager$RunningAppProcessInfo p0){
       boolean b = (p0.uid == this.$myUid)? true: false;
       return b;
    }
}
