package com.kuaishou.tuna.plc.render.poi.PLCWeak5RenderPoi$shouldInitData$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.lang.String;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class PLCWeak5RenderPoi$shouldInitData$1 extends Lambda implements l	// class@00106b
{
    public final Ref$ObjectRef $realLocationTextIfNeed;

    public void PLCWeak5RenderPoi$shouldInitData$1(Ref$ObjectRef p0){
       this.$realLocationTextIfNeed = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PLCWeak5RenderPoi$shouldInitData$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       this.$realLocationTextIfNeed.element = p0;
       return;
    }
}
