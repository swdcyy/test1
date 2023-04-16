package ab1.b$a;
import ab1.g;
import ab1.b;
import java.lang.Object;
import ab1.g$a;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import android.view.View;
import android.widget.ViewFlipper;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import crd.b;
import lnc.b9;
import java.util.Objects;
import ks5.m;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService;
import com.kwai.robust.PatchProxyResult;
import ab1.c;
import p91.m;
import java.lang.Math;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import ab1.a;
import erd.g;
import io.reactivex.internal.functions.Functions;

public class b$a implements g	// class@000055
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       b v = this.a.v;
       boolean b = (v != 4 && (v == 3 || v == 2))? true: false;
       return b;
    }
    public void b(g$a p0){
       this.a.z = p0;
    }
    public void c(ViewGroup p0,int p1){
       b$a ta;
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       if (!this.a.t.containsKey(Integer.valueOf(p1))) {
          return;
       }
       int i = this.a.t.get(Integer.valueOf(p1)).intValue();
       this.a.t.remove(Integer.valueOf(p1));
       this.a.s.removeView(p0);
       b uob = 2;
       if (this.a.s.getChildCount() < uob) {
          this.a.s.stopFlipping();
       }
       Iterator iterator = this.a.t.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          int i1 = uEntry.getValue().intValue();
          if (i1 > i) {
             i1 = i1 - 1;
             uEntry.setValue(Integer.valueOf(i1));
          }
       }
       i = 1;
       if (this.a.t.containsKey(Integer.valueOf(i))) {
          ta = this.a;
          if (ta.v != uob) {
             ta.v = 4;
          }
       }else {
          b9.a(this.a.A);
          ta = this.a;
          ta.x = i;
          ta.v = i;
       }
       if (!this.a.t.size()) {
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, b.class, "6") && ta.w != null) {
             uob = ta.y;
             if (uob != null) {
                ta.v = 0;
                ta.q.c(uob);
                ta.w = false;
             }
          }
       }
       return;
    }
    public void d(long p0){
       this.a.u = p0;
    }
    public void e(ViewGroup p0,int p1){
       boolean b;
       b x;
       b uob = b.class;
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (this.a.t.containsKey(Integer.valueOf(p1))) {
          return;
       }
       this.a.s.addView(p0);
       this.a.t.put(Integer.valueOf(p1), Integer.valueOf(this.a.t.size()));
       b$a ta = this.a;
       b = true;
       Object[] objArray = null;
       if (ta.w == null) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, uob, "5")) {
             if (ta.y == null) {
                x = ta.r;
                c uoc = PatchProxy.applyOneRefs(x, ta, uob, "8");
                if (uoc != PatchProxyResult.class) {
                }else {
                   uoc = new c(ta, x);
                }
                ta.y = uoc;
             }
             ta.q.b(ta.y);
          }
          ta.w = b;
       }
       ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, uob, "4")) {
          if (ta.t.containsKey(Integer.valueOf(b)) && ta.t.get(Integer.valueOf(b)).intValue()) {
             ta.s.setDisplayedChild(ta.t.get(Integer.valueOf(b)).intValue());
          }
          x = ta.x;
          if (x == null) {
             if (ta.s.getChildCount() > b && (!ta.s.isFlipping() && ta.v == 4)) {
                ta.s.startFlipping();
                ta.v = 3;
             }
          }else if(x != null && ta.t.containsKey(Integer.valueOf(b))){
             long l = ta.u - ta.p.s();
             if (l > 0) {
                ta.x = false;
                ta.v = 2;
                ta.A = t.timer(Math.min(l, 0x7530), TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new a(ta), Functions.d());
             }
          }
       }
    label_0126 :
       return;
    }
}
