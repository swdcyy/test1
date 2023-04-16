package bsa.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import bsa.b$a;
import nsd.u;
import xq6.a;
import ln5.b;
import bsa.b$f;
import bsa.b$e;
import android.view.View;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wq6.f;
import com.kwai.kcube.decorator.IContainerDecorator;
import zq6.r;
import pn5.a;
import zq6.p;
import pr6.d;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import brd.t;
import bsa.b$g;
import erd.r;
import bsa.b$h;
import erd.g;
import crd.b;
import yq6.e;
import do5.a;
import bsa.b$i;
import yq6.a;
import xq6.b;
import zq6.b;
import bsa.b$j;
import zq6.u;
import zq6.s;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import fr6.i;
import java.lang.Boolean;
import wra.b;
import bo5.a;
import android.animation.ValueAnimator;
import bsa.b$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import bsa.b$c;
import android.animation.Animator$AnimatorListener;
import com.kwai.robust.PatchProxyResult;
import mrd.c;
import wra.a;
import brd.y;
import android.view.ViewStub;
import bsa.c;
import android.view.View$OnClickListener;
import bsa.d;
import java.lang.Runnable;
import bsa.e;
import java.util.List;
import wq6.g;
import po5.c;
import pr6.b;
import k2b.e0;
import ura.b;
import ekd.m1;
import bsa.b$d;

public final class b extends PresenterV2	// class@00045b
{
    public final b$e A;
    public final int B;
    public final a p;
    public IContainerDecorator q;
    public b r;
    public final b s;
    public View t;
    public View u;
    public View v;
    public View w;
    public View x;
    public View y;
    public SlidingPaneLayout$d z;
    public static final b$a C;

    static {
       b.C = new b$a(null);
    }
    public void b(int p0){
       super();
       this.B = p0;
       this.p = new a();
       this.s = new b();
       this.z = new b$f(this);
       this.A = new b$e(this);
    }
    public static final View P8(b p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("mBlockTabBg");
       }
       return p0;
    }
    public static final View R8(b p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("mHomeTabBg");
       }
       return p0;
    }
    public static final View S8(b p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mMaskView");
       }
       return p0;
    }
    public static final View V8(b p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("mTabLayout");
       }
       return p0;
    }
    public void E8(){
       a a;
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b tq = this.q;
       String str = "mContainerDecorator";
       if (tq == null) {
          a.S(str);
       }
       p c = a.c;
       a.o(c, "HomeBlockTopStateId.BLOCK_FLOAT_TAB_EXPAND");
       tq.c().e0().a(c, this.s);
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       this.X7(tq.e().h().g().filter(b$g.b).subscribe(new b$h(this)));
       tq = this.p;
       b tq1 = this.q;
       if (tq1 == null) {
          a.S(str);
       }
       a = a.a;
       a.o(a, "HomeTabHostActionId.TAB_CLICK");
       tq.a(tq1.c().c0().a(a, new b$i(this)));
       tq = this.p;
       tq1 = this.q;
       if (tq1 == null) {
          a.S(str);
       }
       p a1 = a.a;
       a.o(a1, "HomeBlockTopStateId.X_BLOCK_TAB_BACKGROUND");
       tq.a(tq1.a().b(a1, new b$j(this)));
       FragmentActivity activity = this.getActivity();
       a.m(activity);
       q.p0(activity).v0(this.z);
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       tq.c().W(this.A);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       a.m(activity);
       q.p0(activity).C0(this.z);
       b tq = this.q;
       if (tq == null) {
          a.S("mContainerDecorator");
       }
       tq.c().b(this.A);
       this.p.c();
       return;
    }
    public final void W8(boolean p0){
       boolean b;
       b tt;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "8")) {
          return;
       }
       uob = this.r;
       String str = "mHomeBlockViewState";
       if (uob == null) {
          a.S(str);
       }
       if (!uob.d()) {
          return;
       }else {
          uob = this.r;
          if (uob == null) {
             a.S(str);
          }
          b = false;
          uob.g(b);
          uob = this.s;
          b tx = this.x;
          if (tx == null) {
             a.S("mTabLayout");
          }
          uob.a(tx.getMeasuredHeight(), b);
          uob = this.q;
          if (uob == null) {
             a.S("mContainerDecorator");
          }
          p d = a.D;
          a.o(d, "HomeTopStateId.TAB_ROTATE_DEGREES");
          uob.c().e0().a(d, Boolean.TRUE);
          String str1 = "mMaskView";
          if (!p0) {
             tt = this.t;
             if (tt == null) {
                a.S("mRootView");
             }
             tt.setVisibility(8);
             tt = this.u;
             if (tt == null) {
                a.S(str1);
             }
             tt.setAlpha(0);
             tt = this.y;
             if (tt != null) {
                tt.setAlpha(0);
             }
             tt = this.y;
             if (tt != null) {
                tt.setVisibility(8);
             }
          }else {
             tt = this.u;
             if (tt == null) {
                a.S(str1);
             }
             float f = 0x3f800000;
             tt.setAlpha(f);
             tt = this.y;
             if (tt != null) {
                tt.setAlpha(f);
             }
             tt = this.v;
             if (tt == null) {
                a.S("mHomeTabBg");
             }
             tt.setAlpha(f);
             tt = this.w;
             if (tt == null) {
                a.S("mBlockTabBg");
             }
             tt.setAlpha(f);
             ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
             a.o(valueAnimato, "animator");
             valueAnimato.setDuration(150);
             valueAnimato.addUpdateListener(new b$b(this));
             valueAnimato.addListener(new b$c(this));
             valueAnimato.start();
          }
          return;
       }
    }
    public final boolean X8(){
       boolean b;
       b uob = b.class;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, uob, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.r;
       String str = "mHomeBlockViewState";
       if (obj == null) {
          a.S(str);
       }
       b = false;
       if (obj.c() != 2) {
          if (this.B == 2) {
             uob = this.r;
             if (uob == null) {
                a.S(str);
             }
             uob.a().onNext(a.c);
          }
          return b;
       }else {
          obj = this.r;
          if (obj == null) {
             a.S(str);
          }
          if (obj.d()) {
             this.W8(true);
          }else if(PatchProxy.applyVoid(objArray, this, uob, "7")){
             obj = this.r;
             if (obj == null) {
                a.S(str);
             }
             if (!obj.d()) {
                if (!PatchProxy.applyVoid(objArray, this, uob, "3")) {
                   View view = this.m8();
                   a.o(view, "rootView");
                   ViewStub viewStub = view.getRootView().findViewById(R.id.block_selector_bottom_mask_view_stub_nasa);
                   if (viewStub != null && !viewStub.getLayoutResource()) {
                      viewStub.setLayoutResource(R.layout.arg_RES_7f0d010d);
                      viewStub.setInflatedId(R.id.block_selector_bottom_mask_root_view);
                      this.y = viewStub.inflate();
                   }
                   obj = this.y;
                   if (obj != null) {
                      obj.setOnClickListener(new c(this));
                   }
                }
                obj = this.r;
                if (obj == null) {
                   a.S(str);
                }
                obj.g(true);
                obj = this.x;
                if (obj == null) {
                   a.S("mTabLayout");
                }
                obj.post(new d(this));
                obj = this.q;
                str = "mContainerDecorator";
                if (obj == null) {
                   a.S(str);
                }
                p d = a.D;
                a.o(d, "HomeTopStateId.TAB_ROTATE_DEGREES");
                obj.c().e0().a(d, Boolean.TRUE);
                obj = this.t;
                if (obj == null) {
                   a.S("mRootView");
                }
                obj.setVisibility(b);
                obj = this.u;
                if (obj == null) {
                   a.S("mMaskView");
                }
                obj.setAlpha(0);
                obj = this.y;
                if (obj != null) {
                   obj.bringToFront();
                }
                obj = this.y;
                if (obj != null) {
                   obj.setVisibility(b);
                }
                obj = this.y;
                if (obj != null) {
                   obj.setAlpha(0);
                }
                obj = this.v;
                if (obj == null) {
                   a.S("mHomeTabBg");
                }
                obj.setAlpha(0);
                obj = this.w;
                if (obj == null) {
                   a.S("mBlockTabBg");
                }
                obj.setAlpha(0);
                ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                a.o(valueAnimato, "animator");
                valueAnimato.setDuration(150);
                valueAnimato.addUpdateListener(new e(this));
                valueAnimato.start();
                if (!PatchProxy.applyVoid(objArray, this, uob, "9")) {
                   uob = this.q;
                   if (uob == null) {
                      a.S(str);
                   }
                   List children = uob.c().getChildren();
                   b tq = this.q;
                   if (tq == null) {
                      a.S(str);
                   }
                   obj = c.C;
                   a.o(obj, "HomeFragmentFuncIds.LOG_PAGE");
                   e0 uoe0 = tq.e().e(obj);
                   b.c(children, "HOT_CHANNEL_TAB", true, uoe0);
                }
             }
          }
          return true;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       this.t = p0;
       View view = m1.f(p0, R.id.block_float_tabs_mask);
       a.o(view, "bindWidget\(rootView, R.id.block_float_tabs_mask\)");
       this.u = view;
       view = m1.f(p0, R.id.block_tabs);
       a.o(view, "bindWidget\(rootView, R.id.block_tabs\)");
       this.x = view;
       view = p0.findViewById(R.id.home_tab_bg);
       a.o(view, "rootView.findViewById\(R.id.home_tab_bg\)");
       this.v = view;
       p0 = m1.f(p0, R.id.block_tab_bg);
       a.o(p0, "bindWidget\(rootView, R.id.block_tab_bg\)");
       this.w = p0;
       b tu = this.u;
       if (tu == null) {
          a.S("mMaskView");
       }
       tu.setOnClickListener(new b$d(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       Object obj = this.q8(IContainerDecorator.class);
       a.o(obj, "inject\(IContainerDecorator::class.java\)");
       this.q = obj;
       obj = this.q8(b.class);
       a.o(obj, "inject\(HomeBlockViewState::class.java\)");
       this.r = obj;
       return;
    }
}
