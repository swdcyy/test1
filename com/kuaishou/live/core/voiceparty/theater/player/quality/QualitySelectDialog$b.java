package com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectDialog$b;
import wf2.c$c;
import wf2.c;
import com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectDialog;
import java.util.List;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import msd.l;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.common.c;

public final class QualitySelectDialog$b implements c$c	// class@0019ac
{
    public final c a;
    public final QualitySelectDialog b;
    public final List c;
    public final LiveQualityItem d;
    public final l e;
    public final a f;

    public void QualitySelectDialog$b(c p0,QualitySelectDialog p1,List p2,LiveQualityItem p3,l p4,a p5){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public final void a(LiveQualityItem p0,LiveQualityItem p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, QualitySelectDialog$b.class, "1")) {
          return;
       }
       a.p(p1, "newType");
       this.a.q(0);
       if (a.g(p0, p1) ^ 0x01) {
          this.e.invoke(p1);
       }
       PatchProxy.onMethodExit(QualitySelectDialog$b.class, "1");
       return;
    }
}
