package com.kuaishou.live.livestage.LiveStageManagerImpl$start$layoutConfigFromSignal$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import oe3.h;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import fe3.b;
import com.kuaishou.live.livestage.f;
import kotlin.jvm.internal.a;
import qrd.r0;

public final class LiveStageManagerImpl$start$layoutConfigFromSignal$1 extends Lambda implements p	// class@000bd5
{
    public static final LiveStageManagerImpl$start$layoutConfigFromSignal$1 INSTANCE;

    static {
       LiveStageManagerImpl$start$layoutConfigFromSignal$1.INSTANCE = new LiveStageManagerImpl$start$layoutConfigFromSignal$1();
    }
    public void LiveStageManagerImpl$start$layoutConfigFromSignal$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final Pair invoke(h p0,h p1){
       LayoutConfig obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveStageManagerImpl$start$layoutConfigFromSignal$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Pair pair = null;
       if (p1.a() != null) {
          obj = p0.a();
          b uob = (obj != null)? obj.b(): pair;
          if (a.g(uob, p1.a().a())) {
             pair = r0.a(p1.a(), p0.a());
          }
       }
       return pair;
    }
}
