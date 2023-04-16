package com.yxcorp.gifshow.growth.cleaner.impl.CleanerPushSwitch$Companion$DEFAULT_CONFIG$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerPushSwitch;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CleanerPushSwitch$Companion$DEFAULT_CONFIG$2 extends Lambda implements a	// class@00130a
{
    public static final CleanerPushSwitch$Companion$DEFAULT_CONFIG$2 INSTANCE;

    static {
       CleanerPushSwitch$Companion$DEFAULT_CONFIG$2.INSTANCE = new CleanerPushSwitch$Companion$DEFAULT_CONFIG$2();
    }
    public void CleanerPushSwitch$Companion$DEFAULT_CONFIG$2(){
       super(0);
    }
    public final CleanerPushSwitch invoke(){
       Object obj = PatchProxy.apply(null, this, CleanerPushSwitch$Companion$DEFAULT_CONFIG$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CleanerPushSwitch();
    }
    public Object invoke(){
       return this.invoke();
    }
}
