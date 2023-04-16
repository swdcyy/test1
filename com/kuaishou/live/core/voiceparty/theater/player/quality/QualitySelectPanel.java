package com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectPanel;
import androidx.lifecycle.LifecycleOwner;
import android.view.ViewGroup;
import vw2.a;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectPanel$a;
import erd.g;
import crd.b;
import com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectPanel$1;
import msd.a;
import u63.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.Pair;
import mrd.a;
import java.util.List;
import vf2.s;
import com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectPanel$show$1;
import com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectPanel$show$2;
import com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectPanel$show$3;
import com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectPanel$show$4;
import com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectPanel$show$5;
import java.lang.Boolean;
import qrd.l1;

public final class QualitySelectPanel	// class@0019b7
{
    public s a;
    public Pair b;
    public final ViewGroup c;
    public final a d;
    public final l e;
    public final l f;

    public void QualitySelectPanel(LifecycleOwner p0,ViewGroup p1,a p2,l p3,l p4){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "container");
       a.p(p2, "qualitySwitchDelegate");
       a.p(p3, "qualityChangeAction");
       a.p(p4, "panelVisibleAction");
       super();
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       a.a(p0, new QualitySelectPanel$1(p2.a().observeOn(d.a).subscribe(new QualitySelectPanel$a(this))));
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, QualitySelectPanel.class, "1")) {
          return;
       }
       QualitySelectPanel tb = this.b;
       if (tb != null) {
          s os = new s(tb.component1(), new QualitySelectPanel$show$1(tb.component2()), new QualitySelectPanel$show$2(this), new QualitySelectPanel$show$3(this), new QualitySelectPanel$show$4(this), new QualitySelectPanel$show$5(this));
          if (v1.e()) {
             this.f.invoke(Boolean.TRUE);
          }
          this.a = v1;
       }
       return;
    }
}
