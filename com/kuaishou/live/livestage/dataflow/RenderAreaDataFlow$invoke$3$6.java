package com.kuaishou.live.livestage.dataflow.RenderAreaDataFlow$invoke$3$6;
import msd.l;
import kotlin.jvm.internal.Lambda;
import mrd.a;
import java.lang.Object;
import ee3.i0;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class RenderAreaDataFlow$invoke$3$6 extends Lambda implements l	// class@000be5
{
    public final a $newVideoStatus;

    public void RenderAreaDataFlow$invoke$3$6(a p0){
       this.$newVideoStatus = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(i0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RenderAreaDataFlow$invoke$3$6.class, "1")) {
          return;
       }
       a.p(p0, "videoStatusForRender");
       this.$newVideoStatus.onNext(p0);
       return;
    }
}
