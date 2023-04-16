package dfc.v;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ncc.g;
import android.content.Context;
import wkd.b;
import java.util.Objects;
import java.lang.Boolean;
import com.kwai.framework.abtest.f;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import dfc.s;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import brd.t;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import cfc.b;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import k2b.f3;
import k9c.h;
import k2b.e0;
import hm8.a;
import com.yxcorp.gifshow.util.DateUtils;
import ekd.k1;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.sdk.switchconfig.a;
import dfc.t;
import msd.l;
import androidx.core.view.ViewKt;
import dfc.v$a;
import com.yxcorp.gifshow.widget.m;
import dfc.q;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import mrd.c;
import mrd.a;
import im8.f;

public class v extends PresenterV2	// class@0021b5
{
    public c A;
    public a B;
    public f C;
    public ViewTreeObserver$OnGlobalLayoutListener D;
    public TextView p;
    public TextView q;
    public KwaiImageView[] r;
    public View s;
    public View t;
    public View u;
    public View v;
    public View w;
    public ImageView x;
    public int y;
    public BaseFragment z;

    public void v(){
       super();
    }
    public void E8(){
       g og;
       boolean b;
       v ov = v.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ov, "3")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoid(objArray, this, ov, "4")) {
          int i = -83154551;
          if (this.getContext() != null) {
             og = b.a(i);
             Objects.requireNonNull(og);
             Object obj = PatchProxy.apply(objArray, og, g.class, "10");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else if(og.l == null){
                og.l = Boolean.valueOf(f.a("enableNewsSlideEntranceIconOpt"));
             }
             b = og.l.booleanValue();
             if (b) {
                this.x.setImageDrawable(a1.f(R.drawable.arg_RES_7f08211d));
             }
          }
          og = b.a(i);
          Objects.requireNonNull(og);
          Object obj1 = PatchProxy.apply(objArray, og, g.class, "11");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(og.k == null){
             og.k = Boolean.valueOf(f.a("enableNewsSlideEntranceLayoutOpt"));
          }
          b = og.k.booleanValue();
          if (b) {
             ViewGroup$LayoutParams layoutParams = this.w.getLayoutParams();
             int i1 = a1.e(76.00f);
             if (layoutParams instanceof ViewGroup$MarginLayoutParams && i1 != layoutParams.height) {
                layoutParams.height = i1;
                this.w.setLayoutParams(layoutParams);
             }
             this.v.setVisibility(0);
          }
       }
       this.X7(this.B.subscribe(new s(this), Functions.d()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, v.class, "8")) {
          return;
       }
       if (this.D != null) {
          this.q.getViewTreeObserver().removeOnGlobalLayoutListener(this.D);
          this.D = null;
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, v.class, "6")) {
          return;
       }
       this.u.setVisibility(0);
       if (!PatchProxy.applyVoid(null, null, b.class, "5")) {
          i3 oi3 = i3.f();
          oi3.d("redpoint_loc", "news_slide");
          oi3.c("style", Integer.valueOf(1));
          f3 uof3 = f3.l("2636862", "REDPOINT");
          uof3.m(oi3.toString());
          uof3.g();
       }
       h.c(null, h.d(1, "BottomMessage", "TopFriendWatching", null, 0, null, null));
       if (DateUtils.H(a.f())) {
          a.m((a.d() + 1));
       }else {
          a.m(1);
       }
       a.p(k1.i());
       return;
    }
    public void doBindView(View p0){
       v ov = v.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ov, "1")) {
          return;
       }
       View view = m1.f(p0, R.id.news_entrance);
       this.p = m1.f(view, 0x7f0a39c1);
       this.q = m1.f(view, 0x7f0a39c0);
       this.s = m1.f(p0, 0x7f0a39be);
       KwaiImageView[] kwaiImageVie = new KwaiImageView[]{m1.f(p0, 0x7f0a39bc),m1.f(p0, 0x7f0a39bd)};
       this.r = kwaiImageVie;
       this.t = m1.f(p0, 0x7f0a03e9);
       this.u = m1.f(view, 0x7f0a39c2);
       this.x = m1.f(view, 0x7f0a39bb);
       this.v = m1.f(view, 0x7f0a049f);
       this.w = view;
       q obj = PatchProxy.apply(null, null, ov, "9");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().d("enableBigAvatarInUserList", 0);
       if (b) {
          ViewKt.h(this.x, t.b);
       }
       m1.b(p0, new v$a(this), R.id.news_entrance);
       if (this.t == null) {
          return;
       }else {
          obj = new q(this);
          this.D = obj;
          this.q.getViewTreeObserver().addOnGlobalLayoutListener(obj);
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v.class, "2")) {
          return;
       }
       this.z = this.r8("REMINDER_HOST_FRAGMENT");
       this.A = this.r8("NEWS_ENTRANCE_ACTION");
       this.B = this.r8("NEWS_ENTRANCE_RESPONSE");
       this.C = this.x8("HAS_NEWS_ENTRANCE_SUBTITLE_CONSUMED");
       return;
    }
}
