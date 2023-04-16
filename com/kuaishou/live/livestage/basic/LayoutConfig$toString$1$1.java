package com.kuaishou.live.livestage.basic.LayoutConfig$toString$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import fe3.e;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class LayoutConfig$toString$1$1 extends Lambda implements l	// class@000be0
{
    public static final LayoutConfig$toString$1$1 INSTANCE;

    static {
       LayoutConfig$toString$1$1.INSTANCE = new LayoutConfig$toString$1$1();
    }
    public void LayoutConfig$toString$1$1(){
       super(1);
    }
    public final CharSequence invoke(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LayoutConfig$toString$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return "    "+p0;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
