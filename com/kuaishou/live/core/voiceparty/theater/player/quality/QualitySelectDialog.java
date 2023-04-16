package com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectDialog;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import vw2.a;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectDialog$a;
import erd.g;
import crd.b;
import com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectDialog$1;
import msd.a;
import u63.a;
import com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectDialog$show$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import mrd.a;
import com.google.common.base.Optional;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import java.util.List;
import com.kwai.live.gzone.widget.e$a;
import wf2.c;
import t02.a0;
import com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectDialog$b;
import wf2.c$c;
import com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectDialog$c;
import wf2.c$b;
import qrd.l1;

public final class QualitySelectDialog	// class@0019af
{
    public c a;
    public final Activity b;
    public final a c;
    public final l d;

    public void QualitySelectDialog(LifecycleOwner p0,Activity p1,a p2,l p3){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "activity");
       a.p(p2, "qualitySwitchDelegate");
       a.p(p3, "qualityChangeAction");
       super();
       this.b = p1;
       this.c = p2;
       this.d = p3;
       a.a(p0, new QualitySelectDialog$1(this, p2.a().observeOn(d.a).subscribe(new QualitySelectDialog$a(this))));
    }
    public static void c(QualitySelectDialog p0,l p1,a p2,int p3,Object p4){
       QualitySelectDialog$show$1 iNSTANCE = (p3 & 0x02)? QualitySelectDialog$show$1.INSTANCE: null;
       p0.b(p1, iNSTANCE);
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, QualitySelectDialog.class, "2")) {
          return;
       }
       QualitySelectDialog ta = this.a;
       if (ta != null) {
          ta.q(0);
          this.a = null;
       }
       return;
    }
    public final void b(l p0,a p1){
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, QualitySelectDialog.class, str)) {
          return;
       }
       a.p(p0, "selectQuality");
       a.p(p1, "onDismiss");
       this.a();
       QualitySelectDialog tc = this.c;
       Objects.requireNonNull(tc);
       Pair pair = PatchProxy.apply(null, tc, a.class, str);
       if (pair != PatchProxyResult.class) {
       }else {
          Pair pair1 = tc.b.i();
          a.m(pair1);
          Object obj = pair1.getFirst().i();
          a.m(obj);
          pair = new Pair(obj.get(), pair1.getSecond());
       }
       LiveQualityItem liveQualityI = pair.component1();
       List list = pair.component2();
       c uoc = new c(new e$a(this.b), null);
       uoc.o0(list);
       uoc.l0(liveQualityI);
       QualitySelectDialog$b uob = new QualitySelectDialog$b(uoc, this, list, liveQualityI, p0, p1);
       uoc.n0(v2);
       QualitySelectDialog$c uoc1 = new QualitySelectDialog$c(this, list, liveQualityI, p0, p1);
       uoc.m0(v2);
       uoc.Z();
       this.a = uoc;
       return;
    }
}
