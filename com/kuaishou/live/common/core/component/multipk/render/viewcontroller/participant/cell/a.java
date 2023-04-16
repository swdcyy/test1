package com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.a;
import androidx.lifecycle.Observer;
import lu1.c;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkDuetContinuousWinView;
import java.util.Objects;
import jw1.b;
import jw1.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.Runnable;
import ekd.k1;
import lu1.b;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkDuetContinuousWinView$c;
import du1.d;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import androidx.lifecycle.LiveData;
import ut1.o;
import lu1.q;
import st1.c;
import st1.a;
import gu1.a;
import java.lang.Integer;
import gu1.d;
import java.util.concurrent.Future;
import pu1.g;

public final class a implements Observer	// class@001696
{
    public final c b;
    public final LiveMultiPkRenderCellViewModel c;

    public void a(c p0,LiveMultiPkRenderCellViewModel p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       boolean b;
       d uod;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, str)) {
       }else {
          a.o(p0, "enable");
          if (p0.booleanValue()) {
             this.b.y3();
             p0 = this.b.K;
             a.m(p0);
             int i = 0;
             p0.setVisibility(i);
             if (!PatchProxy.applyVoid(null, p0, LiveMultiPkDuetContinuousWinView.class, "2") && p0.L()) {
                LiveMultiPkDuetContinuousWinView b1 = p0.B;
                LiveMultiPkDuetContinuousWinView c = p0.C;
                LiveMultiPkDuetContinuousWinView g = p0.G;
                Objects.requireNonNull(b1);
                if (!PatchProxy.applyVoidTwoRefs(c, g, b1, b.class, str)) {
                   k1.p(new a(b1, c, g), b1);
                }
             }
             p0.setOnContinuousWinIconClickListener(new b(this));
             e0 uoe0 = this.b.x3().i();
             ClientContent$LiveStreamPackage liveStreamPa = this.b.x3().a();
             p0 = this.c.z0().getValue();
             int i1 = (p0 != null)? p0.a(): 0;
             b = this.b.q3();
             c uoc = this.b.O.l();
             p0 = a.class;
             if (PatchProxy.isSupport(p0)) {
                Object[] objArray = new Object[]{uoe0,liveStreamPa,Integer.valueOf(i1),Boolean.valueOf(b),uoc,Integer.valueOf(3)};
                if (!PatchProxy.applyVoid(objArray, null, p0, "16")) {
                }
             }else {
             }
          }else {
             p0 = this.b.K;
             if (p0 != null) {
                p0.setVisibility(8);
             }
          }
       }
       return;
    }
}
