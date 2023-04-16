package com.kuaishou.live.core.basic.activity.LivePlayTestActivity$cleanMemory$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.app.Activity;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LivePlayTestActivity$cleanMemory$2 extends Lambda implements l	// class@00181f
{
    public static final LivePlayTestActivity$cleanMemory$2 INSTANCE;

    static {
       LivePlayTestActivity$cleanMemory$2.INSTANCE = new LivePlayTestActivity$cleanMemory$2();
    }
    public void LivePlayTestActivity$cleanMemory$2(){
       super(1);
    }
    public final CharSequence invoke(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePlayTestActivity$cleanMemory$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       String localClassNa = p0.getLocalClassName();
       a.o(localClassNa, "it.localClassName");
       return localClassNa;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
