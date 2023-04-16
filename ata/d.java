package ata.d;
import ata.d$a;
import nsd.u;
import wq6.h;
import wq6.f;
import android.widget.FrameLayout;
import pr6.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ata.d$e;
import ata.d$d;
import crd.a;
import com.airbnb.lottie.LottieAnimationViewCopy;
import com.kwai.framework.model.kcube.TabViewInfo$TabLottie;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.j;
import tra.b;
import q87.c;
import android.content.Context;
import com.kwai.kcube.ext.widget.TabAutoSizeLayout$LayoutParams;
import lnc.a1;
import android.widget.FrameLayout$LayoutParams;
import qrd.l1;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import android.view.View;
import ata.d$b;
import java.util.concurrent.Callable;
import brd.m;
import t45.d;
import brd.z;
import ata.d$c;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kwai.kcube.TabIdentifier;
import wq6.g;
import java.lang.Number;
import java.lang.CharSequence;
import java.lang.Integer;
import android.content.SharedPreferences;
import oe6.n;
import java.lang.StringBuilder;
import java.lang.Runnable;
import ekd.k1;
import android.os.Build$VERSION;

public final class d	// class@0002fc
{
    public boolean a;
    public s b;
    public TabViewInfo$TabLottie c;
    public FrameLayout d;
    public LottieAnimationViewCopy e;
    public Integer f;
    public final i g;
    public final Runnable h;
    public final a i;
    public b j;
    public final h k;
    public final f l;
    public final FrameLayout m;
    public final d n;
    public static final d$a o;

    static {
       d.o = new d$a(null);
    }
    public void d(h p0,f p1,FrameLayout p2,d p3){
       a.p(p0, "tab");
       a.p(p1, "containerController");
       a.p(p2, "parent");
       a.p(p3, "fragmentWrapper");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.g = new d$e(this);
       this.h = new d$d(this);
       this.i = new a();
    }
    public static final LottieAnimationViewCopy a(d p0){
       p0 = p0.e;
       if (p0 == null) {
          a.S("lottieView");
       }
       return p0;
    }
    public static final TabViewInfo$TabLottie b(d p0){
       p0 = p0.c;
       if (p0 == null) {
          a.S("mTabLottie");
       }
       return p0;
    }
    public static void f(d p0,boolean p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = p0.n.getLifecycle().getCurrentState().isAtLeast(Lifecycle$State.RESUMED);
       }
       p0.e(p1, p2);
       return;
    }
    public final void c(TabViewInfo$TabLottie p0){
       d uod = d.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, str)) {
          return;
       }
       if (p0 != null) {
          Object[] objArray = null;
          Object[] obj = PatchProxy.apply(objArray, p0, TabViewInfo$TabLottie.class, str);
          boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): j.h(p0.mTabLottieUrl) ^ true;
          if (b) {
             this.c = p0;
             if (!PatchProxy.applyVoid(objArray, this, uod, "4") && this.d == null) {
                obj = new Object[0];
                b.C().w("TabLottieViewHelper", "createView", obj);
                FrameLayout uFrameLayout = new FrameLayout(this.m.getContext());
                TabAutoSizeLayout$LayoutParams layoutParams = new TabAutoSizeLayout$LayoutParams(0, a1.d(0x7f070315));
                int i = 17;
                layoutParams.gravity = i;
                layoutParams.a = true;
                uFrameLayout.setLayoutParams(layoutParams);
                uFrameLayout.setClipToPadding(0);
                uFrameLayout.setClipChildren(0);
                this.d = uFrameLayout;
                LottieAnimationViewCopy lottieAnimat = new LottieAnimationViewCopy(this.m.getContext());
                FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams(-2, -2);
                layoutParams1.gravity = i;
                lottieAnimat.setLayoutParams(layoutParams1);
                lottieAnimat.setTranslationY((float)a1.e(-10.00f));
                lottieAnimat.setAutoPlay(true);
                lottieAnimat.setRepeatCount(-1);
                this.e = lottieAnimat;
                d td = this.d;
                if (td == null) {
                   a.S("rootView");
                }
                d te = this.e;
                if (te == null) {
                   a.S("lottieView");
                }
                td.addView(te);
                td = this.m;
                te = this.d;
                if (te == null) {
                   a.S("rootView");
                }
                td.addView(te);
             }
             this.i();
             return;
          }
       }
       this.h();
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("TabLottieViewHelper", "bindLottieView", objArray);
       d tc = this.c;
       String str = "mTabLottie";
       if (tc == null) {
          a.S(str);
       }
       int i = this.g(tc.mId);
       g og = 1;
       d tc1 = this.c;
       if (tc1 == null) {
          a.S(str);
       }
       TabViewInfo$TabLottie mLottieDispl = tc1.mLottieDisplayMaxCount;
       if (og <= mLottieDispl && i >= mLottieDispl) {
          this.h();
          return;
       }else {
          this.j = m.r(new d$b(this)).B(d.c).u(d.a).y(new d$c(this), Functions.d());
          return;
       }
    }
    public final void e(boolean p0,boolean p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uod, "7")) {
          return;
       }
       if (this.l.O(this.k.M2()) && this.a != null) {
          if (!p1 || !this.l.isSelected()) {
             d te = this.e;
             if (te == null) {
                a.S("lottieView");
             }
             te.r();
          }else {
             d tc = this.c;
             if (tc == null) {
                a.S("mTabLottie");
             }
             TabViewInfo$TabLottie mLottieDispl = tc.mLottieDisplayStyle;
             if (mLottieDispl != 1) {
                if (mLottieDispl != 2) {
                   if (p0) {
                      this.k();
                   }else {
                      this.j();
                   }
                }else {
                   this.j();
                }
             }else if(p0){
                this.j();
             }else {
                this.k();
             }
          }
       }
       return;
    }
    public final int g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       d uod = (p0 == null || !p0.length())? 1: null;
       if (uod) {
          return -1;
       }else {
          uod = this.f;
          if (uod != null) {
             return uod.intValue();
          }else {
             return n.b().getInt("activity_tab_lottie_play_"+p0, 0);
          }
       }
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       d td = this.d;
       if (td != null) {
          if (td == null) {
             a.S("rootView");
          }
          td.setVisibility(8);
          k1.m(this.h);
          td = this.j;
          if (td != null) {
             td.dispose();
          }
          this.a = false;
          Object[] objArray = new Object[false];
          b.C().w("TabLottieViewHelper", "hideView", objArray);
       }
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("TabLottieViewHelper", "initView", objArray);
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 28) {
          this.d();
       }else if(sDK_INT >= 23){
          d uod = 0x2710;
          d tc = this.c;
          if (tc == null) {
             a.S("mTabLottie");
          }
          if (tc.mDelay > 0) {
             uod = this.c;
             if (uod == null) {
                a.S("mTabLottie");
             }
             uod = uod.mDelay;
          }
          k1.r(this.h, uod);
       }
       return;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, d.class, "9")) {
          return;
       }
       d te = this.e;
       String str = "lottieView";
       if (te == null) {
          a.S(str);
       }
       if (!te.p()) {
          te = this.e;
          if (te == null) {
             a.S(str);
          }
          te.s();
       }else {
          te = this.e;
          if (te == null) {
             a.S(str);
          }
          te.y();
       }
       te = this.d;
       if (te == null) {
          a.S("rootView");
       }
       te.setVisibility(0);
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, d.class, "8")) {
          return;
       }
       d td = this.d;
       if (td == null) {
          a.S("rootView");
       }
       td.setVisibility(8);
       td = this.e;
       if (td == null) {
          a.S("lottieView");
       }
       td.f();
       return;
    }
}
