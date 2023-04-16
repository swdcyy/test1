package f5b.c;
import com.yxcorp.gifshow.magic.ui.widget.SmoothPagerSlidingTabStrip$c;
import f5b.c$a;
import nsd.u;
import lnc.a1;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import com.kwai.feature.post.api.widget.SmoothSlidingTabStrip;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.activity.GifshowActivity;
import s5b.b;
import java.lang.StringBuilder;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import q87.c;
import com.yxcorp.gifshow.model.CDNUrl;
import w36.b;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import m5b.a;
import androidx.lifecycle.ViewModel;
import m5b.c;
import v36.a;
import w36.a;
import crd.b;
import lnc.b9;
import io.reactivex.subjects.PublishSubject;
import f5b.g;
import erd.g;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import f5b.h;
import java.lang.Boolean;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import qrd.l1;
import android.view.ViewParent;
import ub.b;
import f5b.f;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.magic.ui.widget.SmoothPagerSlidingTabStrip;
import com.kwai.feature.post.api.magic.webp.vm.MagicBaseWebpVM;
import java.util.Objects;

public final class c extends SmoothPagerSlidingTabStrip$c	// class@0028a6
{
    public c A;
    public b B;
    public b C;
    public final String D;
    public b r;
    public GifshowActivity s;
    public FrameLayout t;
    public KwaiImageView u;
    public View v;
    public View w;
    public Bitmap x;
    public a y;
    public a z;
    public static final int E;
    public static final int F;
    public static final c$a G;

    static {
       c.G = new c$a(null);
       c.E = a1.e(50.00f);
       c.F = a1.e(22.00f);
    }
    public void c(String p0,String p1){
       a.p(p0, "name");
       super(p0, p0);
       this.D = p1;
    }
    public View l(Context p0,int p1,ViewPager p2,SmoothSlidingTabStrip p3,ViewGroup p4){
       Object[] objArray;
       c ts;
       b uob;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "context");
       View view = super.l(p0, p1, p2, p3, p4);
       if (!view instanceof FrameLayout) {
          a.o(view, "view");
          return view;
       }else if(!p0 instanceof GifshowActivity){
          return view;
       }else {
          this.s = p0;
          this.t = view;
          Object[] objArray1 = new Object[0];
          b.D().s("MagicEmojiTab", "buildTabView, position:"+p1+", name:"+this.f(), objArray1);
          this.v = view.findViewById(0x7f0a2a48);
          this.w = view.findViewById(0x7f0a2a49);
          c tr = this.r;
          if (tr != null) {
             objArray = new Object[0];
             b.D().s("MagicEmojiTab", "magicWebpData:"+this.r, objArray);
             if (tr.e() != null) {
                Object[] objArray2 = null;
                if (!PatchProxy.applyVoid(objArray2, this, uoc, "6")) {
                   objArray1 = new Object[0];
                   b.D().s("MagicEmojiTab", "registerPublishers", objArray1);
                   if (this.y == null) {
                      ts = this.s;
                      a.m(ts);
                      this.y = ViewModelProviders.of(ts).get(a.class);
                   }
                   if (this.A == null) {
                      ts = this.s;
                      a.m(ts);
                      this.A = ViewModelProviders.of(ts).get(c.class);
                   }
                   if (this.z == null) {
                      c ty = this.y;
                      a.m(ty);
                      this.z = new a(ty);
                   }
                   b9.a(this.B);
                   ts = this.A;
                   if (ts != null) {
                      PublishSubject publishSubje = ts.u0();
                      if (publishSubje != null) {
                         uob = publishSubje.subscribe(new g(this));
                      label_011a :
                         this.B = uob;
                         b9.a(this.C);
                         ts = this.s;
                         if (ts != null) {
                            t ot = ts.m();
                            if (ot != null) {
                               objArray2 = ot.subscribe(new h(this));
                            }
                         }
                         this.C = objArray2;
                      }
                   }
                   uob = objArray2;
                   goto label_011a ;
                }
                this.n(1);
             }
          }
          return view;
       }
    }
    public final void n(boolean p0){
       c tu;
       c tu1;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "2")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       b.D().s("MagicEmojiTab", "bindImage", objArray);
       if (this.t == null) {
          return;
       }
       c tr = this.r;
       if (tr != null) {
          long l = a1.k();
          b uob = null;
          if (tr.e() != null && (tr.d() - l <= 0 && l - tr.c() <= 0)) {
             if (this.u == null) {
                KwaiImageView kwaiImageVie = new KwaiImageView(this.s);
                kwaiImageVie.setLayoutParams(new FrameLayout$LayoutParams(i, i, 17));
                this.u = kwaiImageVie;
             }
             tu = this.u;
             a.m(tu);
             if (tu.getParent() == null) {
                tu = this.t;
                if (tu != null) {
                   tu.addView(this.u);
                }
             }
             if (p0) {
                tu1 = this.u;
                a.m(tu1);
                f uof = PatchProxy.applyOneRefs(tu1, this, uoc, "3");
                if (uof != PatchProxyResult.class) {
                }else {
                   uof = new f(this, tu1);
                }
                uob = uof;
             }
             tu1 = this.u;
             if (tu1 != null) {
                CDNUrl[] uCDNUrlArray = tr.e();
                a.m(uCDNUrlArray);
                tu1.b0(uCDNUrlArray, uob, c.E, c.F);
             }
          }else {
             tu1 = this.u;
             if (tu1 != null && a.g(tu1.getParent(), this.t)) {
                uoc = this.t;
                if (uoc != null) {
                   uoc.removeView(tu1);
                }
             }
             tu1 = this.v;
             uoc = 1;
             if (tu1 != null && tu1.getParent() == null) {
                tu = this.t;
                if (tu != null) {
                   tu.addView(tu1);
                }
                tu = 1;
             }
             tu1 = this.w;
             if (tu1 != null) {
                if (tu1.getParent() == null) {
                   tu = this.t;
                   if (tu != null) {
                      tu.addView(tu1);
                   }
                }else {
                   int i1 = tu;
                }
                i = uoc;
             }
             if (i) {
                tu1 = this.t;
                if (tu1 != null) {
                   SmoothPagerSlidingTabStrip smoothPagerS = this.o(tu1);
                   if (smoothPagerS != null) {
                      uoc = this.v;
                      if (uoc != null) {
                         smoothPagerS.r(uoc);
                      }
                      uoc = this.w;
                      if (uoc != null) {
                         smoothPagerS.w(uoc);
                      }
                   }
                }
             }
             this.x = uob;
             tu1 = this.y;
             if (tu1 != null) {
                tu1.E(tr);
             }
          }
       }
       return;
    }
    public final SmoothPagerSlidingTabStrip o(View p0){
       ViewParent parent;
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SmoothPagerSlidingTabStrip smoothPagerS = null;
       if (p0.getParent() != null) {
          if (p0.getParent() instanceof SmoothPagerSlidingTabStrip) {
             parent = p0.getParent();
             Objects.requireNonNull(parent, "null cannot be cast to non-null type com.yxcorp.gifshow.magic.ui.widget.SmoothPagerSlidingTabStrip");
             smoothPagerS = parent;
          }else if(p0.getParent() instanceof View){
             parent = p0.getParent();
             Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
             smoothPagerS = this.o(parent);
          }
       }
       return smoothPagerS;
    }
}
