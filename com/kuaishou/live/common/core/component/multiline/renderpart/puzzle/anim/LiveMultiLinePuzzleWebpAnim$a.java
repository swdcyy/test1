package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleWebpAnim$a;
import hc.c;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleWebpAnim;
import msd.a;
import hc.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.ImageView;
import java.lang.Boolean;
import msd.l;

public final class LiveMultiLinePuzzleWebpAnim$a extends c	// class@0015a5
{
    public final LiveMultiLinePuzzleWebpAnim a;
    public final a b;

    public void LiveMultiLinePuzzleWebpAnim$a(LiveMultiLinePuzzleWebpAnim p0,a p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLinePuzzleWebpAnim$a.class, "1")) {
          return;
       }
       a.p(p0, "drawable");
       this.a.a.setVisibility(8);
       this.b.invoke();
       this.a.d.invoke(Boolean.TRUE);
       return;
    }
}
