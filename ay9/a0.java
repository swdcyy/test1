package ay9.a0;
import ay9.q;
import com.yxcorp.gifshow.activity.GifshowActivity;
import jh5.a;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import tkd.b;
import tkd.d;
import nl9.u;
import com.yxcorp.gifshow.entity.QPhoto;
import qp7.x0;
import qp7.b;
import com.kwai.slide.play.detail.information.caption.l;
import ay9.r;
import z1.a;
import lnc.u9;
import lnc.a1;
import ay9.a0$a;
import ay9.t;
import ay9.s;
import tyc.s4$a;
import com.yxcorp.gifshow.label.tag.hashtag.PhotoCommonHashTagHelper$a;
import b89.a$b;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.b;
import brd.t;
import e8a.d;
import ay9.w;
import ay9.v;
import erd.g;
import crd.b;
import qp7.d;
import com.kwai.robust.PatchProxyResult;
import com.kwai.slide.play.detail.information.caption.i;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.c;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.slide.play.detail.information.caption.k;
import ay9.x;
import io.reactivex.internal.functions.Functions;
import java.util.Objects;
import androidx.collection.LruCache;
import ay9.y;
import java.lang.Runnable;

public class a0 extends q	// class@0002ea
{
    public d L;
    public final Handler M;
    public static final int N;

    public void a0(GifshowActivity p0,a p1){
       super(p0, p1);
       this.M = new Handler();
    }
    public final void A0(SpannableStringBuilder p0,boolean p1){
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa0, "3")) {
          return;
       }
       SpannableStringBuilder spannableStr = new SpannableStringBuilder(p0);
       this.E().r(spannableStr, p1, true);
       d.a(-1694791652).KM(this.v, spannableStr, d.a(-1694791652).e7(this.v, spannableStr), new r(this));
       return;
    }
    public final void B0(SpannableStringBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "7")) {
          return;
       }
       p0.append(" ");
       p0.setSpan(new u9(a1.e(4.00f)), p0.length(), p0.length(), 33);
       p0.append(a1.p(R.string.arg_RES_7f1004d1));
       p0.setSpan(new a0$a(this), p0.length(), p0.length(), 33);
       return;
    }
    public final void C0(){
       if (PatchProxy.applyVoid(null, this, a0.class, "8")) {
          return;
       }
       this.L.a(t.a, new s(this), this.o0());
       this.j(this.L.c().subscribe(new w(this), new v(this)));
       return;
    }
    public void m0(boolean p0){
       if (PatchProxy.isSupport(a0.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, a0.class, "14")) {
          return;
       }
       a0 tL = this.L;
       if (tL != null) {
          tL.m();
          this.L = null;
       }
       return;
    }
    public d p0(){
       return this.L;
    }
    public d q(){
       i oi = PatchProxy.apply(null, this, a0.class, "15");
       if (oi != PatchProxyResult.class) {
       }else {
          oi = new i();
       }
       return oi;
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, a0.class, "1")) {
          return;
       }
       this.L = c.o0(this.u).p0(this.v, this.A.C());
       this.j(this.i.f(new x(this), Functions.d()));
       this.C0();
       return;
    }
    public void x0(){
       if (PatchProxy.applyVoid(null, this, a0.class, "2")) {
          return;
       }
       c uoc = c.o0(this.u);
       q tv = this.v;
       Objects.requireNonNull(uoc);
       if (!PatchProxy.applyVoidOneRefs(tv, uoc, c.class, "5")) {
          uoc.b.remove(tv.getPhotoId());
       }
       this.L = c.o0(this.u).p0(this.v, false);
       this.C0();
       return;
    }
    public void y0(){
       if (PatchProxy.applyVoid(null, this, a0.class, "13")) {
          return;
       }
       this.M.post(new y(this));
       return;
    }
}
