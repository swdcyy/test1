package bb3.g;
import erd.k;
import com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import kotlin.Pair;
import java.lang.Boolean;
import java.lang.Integer;
import db3.i;
import java.util.Objects;
import lc3.b;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.lang.Number;
import eb3.a;
import a2.i0;
import bb3.i;
import android.view.View$OnLayoutChangeListener;
import androidx.constraintlayout.widget.Guideline;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import qrd.l1;

public final class g implements k	// class@000360
{
    public final LiveLiteLayoutManager a;

    public void g(LiveLiteLayoutManager p0){
       this.a = p0;
       super();
    }
    public final Object a(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5){
       g og = g.class;
       int i = 0;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          Object obj = PatchProxy.apply(objArray, this, og, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.q(p0, "t1");
       a.q(p1, "t2");
       a.q(p2, "t3");
       a.q(p3, "t4");
       a.q(p4, "t5");
       a.q(p5, "t6");
       p4 = p4.booleanValue();
       this.a.i(p0.intValue());
       this.a.j(p1.intValue());
       p0 = this.a;
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(LiveLiteLayoutManager.class) || !PatchProxy.applyVoidTwoRefs(p2, Boolean.valueOf(p4), p0, LiveLiteLayoutManager.class, "23")) {
          p0.U.d(p2);
          p0.a(p2);
          if (!PatchProxy.isSupport(LiveLiteLayoutManager.class) || !PatchProxy.applyVoidTwoRefs(p2, Boolean.valueOf(p4), p0, LiveLiteLayoutManager.class, "25")) {
             p1 = p0.s.getLayoutParams();
             if (p2.b() && p4 == null) {
                p1.width = p2.b();
             }else if(p4 != null){
                p1.width = i;
             }else {
                p1.width = a.b(p0.l, Integer.valueOf(78));
             }
             p0.s.setLayoutParams(p1);
          }
          p1 = p0.l;
          if (i0.Y(p1) && !p1.isLayoutRequested()) {
             p0.h();
             p0.c();
          }else {
             p1.addOnLayoutChangeListener(new i(p0));
          }
       }
       p0 = this.a;
       int i1 = p3.intValue();
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(LiveLiteLayoutManager.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), p0, LiveLiteLayoutManager.class, "17")) {
          p0.r.setGuidelineEnd(i1);
          p0 = p0.q.getLayoutParams();
          Objects.requireNonNull(p0, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          if (i1 > 0) {
             i = a1.d(R.dimen.arg_RES_7f070589);
          }
          p0.bottomMargin = i;
       }
       return l1.a;
    }
}
