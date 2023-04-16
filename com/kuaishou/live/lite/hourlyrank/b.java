package com.kuaishou.live.lite.hourlyrank.b;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper$a;
import com.kuaishou.live.lite.hourlyrank.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.widget.ViewFlipper;
import com.kuaishou.live.lite.hourlyrank.LiveLiteHourlyRankPendantView;
import qb3.k;
import java.lang.Runnable;
import e93.f;

public class b implements LiveViewFlipper$a	// class@0009b9
{
    public final c b;

    public void b(c p0){
       this.b = p0;
       super();
    }
    public void a(View p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "2")) {
          return;
       }
       LiveLiteHourlyRankPendantView currentView = this.b.p.getCurrentView();
       f.k("HourlyRank.showNextView", new k(this, currentView), this.b, 500);
       if (currentView != null) {
          this.b.Z2(currentView.getRankType());
       }
       return;
    }
    public void b(View p0,int p1){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, b.class, "1")) {
          return;
       }
       b tb = this.b;
       if (tb.z != null) {
          tb.c3();
       }
       return;
    }
}
