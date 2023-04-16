package com.kwai.debug.wartermark.DebugWaterMark$emptyHelper$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import ri5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DebugWaterMark$emptyHelper$2 extends Lambda implements a	// class@000cf8
{
    public static final DebugWaterMark$emptyHelper$2 INSTANCE;

    static {
       DebugWaterMark$emptyHelper$2.INSTANCE = new DebugWaterMark$emptyHelper$2();
    }
    public void DebugWaterMark$emptyHelper$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, DebugWaterMark$emptyHelper$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
}
