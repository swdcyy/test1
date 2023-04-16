package dfc.k;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import dfc.m;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import lnc.a1;
import android.animation.ObjectAnimator;
import android.animation.ArgbEvaluator;
import android.animation.TypeEvaluator;
import dfc.l;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.merchant.live.cart.onsale.audience.preload.d;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import java.util.concurrent.TimeUnit;
import dfc.i;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Integer;
import o07.o;

public class k implements PopupInterface$h	// class@0021a8
{
    public final m b;

    public void k(m p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       m om = m.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       k tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tb, om, "4")) {
          int[] ointArray = new int[]{a1.a(0x7f062057),a1.a(0x7f061758)};
          ObjectAnimator objectAnimat = ObjectAnimator.ofInt(tb.q, "backgroundColor", ointArray);
          tb.r = objectAnimat;
          objectAnimat.setEvaluator(new ArgbEvaluator());
          tb.r.setDuration(250);
          tb.r.addListener(new l(tb));
          tb.r.start();
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, om, "5")) {
          b uob = t.fromCallable(d.b).subscribeOn(d.c).delay(2500, TimeUnit.MILLISECONDS, d.a).subscribe(new i(tb), Functions.d());
          tb.t = uob;
          tb.X7(uob);
       }
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, k.class, "2")) {
          return;
       }
       this.b.R8();
       return;
    }
    public void J(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "3")) {
          return;
       }
       this.b.R8();
       return;
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
