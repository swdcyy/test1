package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleWebpAnim$start$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import msd.a;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveMultiLinePuzzleWebpAnim$start$1 extends Lambda implements l	// class@0015a6
{
    public final a $onFinish;

    public void LiveMultiLinePuzzleWebpAnim$start$1(a p0){
       this.$onFinish = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLinePuzzleWebpAnim$start$1.class, "1")) {
          return;
       }
       this.$onFinish.invoke();
       return;
    }
}
