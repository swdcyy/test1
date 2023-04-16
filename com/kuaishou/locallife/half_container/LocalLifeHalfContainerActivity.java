package com.kuaishou.locallife.half_container.LocalLifeHalfContainerActivity;
import ik0.a;
import ik0.o;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import com.kuaishou.locallife.half_container.LocalLifeHalfContainerActivity$sessionId$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.locallife.half_container.LocalLifeHalfContainerActivity$b;
import com.kuaishou.locallife.half_container.LocalLifeHalfContainerActivity$a;
import com.kuaishou.locallife.half_container.HalfParams;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.locallife.half_container.logger.CloseType;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import ekd.x0;
import android.content.Context;
import com.yxcorp.utility.n;
import moc.b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import zsd.u;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.utility.SystemUtil;
import uv8.h1;
import e17.i;
import android.os.SystemClock;
import jr3.a;
import java.lang.Long;
import jr3.b;
import java.lang.Runnable;
import t45.c;
import com.kuaishou.locallife.half_container.LocalLifeHalfContainerActivity$c;
import ekd.k1;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import android.os.Bundle;
import ekd.i;
import ir3.a;
import com.yxcorp.gifshow.widget.SwipeLayout$b;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import java.util.Objects;
import jr3.c;
import android.view.View;
import com.kuaishou.locallife.half_container.view.LocalLifeHalfContainerView;
import com.yxcorp.widget.selector.view.SelectShapeConstraintLayout;
import com.yxcorp.widget.selector.view.SelectShapeView;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import kotlin.jvm.internal.Ref$ObjectRef;
import zf6.k;
import com.kuaishou.locallife.half_container.ColorMode;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import kr3.a;
import android.widget.FrameLayout;
import ir3.c;
import com.kuaishou.locallife.half_container.view.LocalLifeHalfContainerView$a;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import ir3.d;
import com.kuaishou.locallife.half_container.view.LocalLifeHalfContainerBehavior;
import com.kuaishou.locallife.half_container.view.LocalLifeHalfContainerBehavior$a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import ir3.e;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;
import android.net.Uri$Builder;
import com.kuaishou.krn.model.LaunchModel;
import at6.a;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import ir3.b;
import ik0.g;
import com.kuaishou.krn.delegate.c$b;
import com.kuaishou.krn.delegate.c;
import zj0.x;
import ps6.e;
import com.yxcorp.gifshow.util.rx.RxBus;
import sw5.a;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.locallife.half_container.LocalLifeHalfContainerActivity$initFrag$1;
import ir3.f;
import msd.l;
import erd.g;
import crd.b;
import tkd.b;
import tkd.d;
import xw5.a;
import lnc.b9;

public final class LocalLifeHalfContainerActivity extends SingleFragmentActivity implements a, o	// class@001494
{
    public SelectShapeConstraintLayout A;
    public SelectShapeView B;
    public View C;
    public KwaiEmptyStateView D;
    public View E;
    public SwipeLayout F;
    public String G;
    public long H;
    public int I;
    public HalfParams J;
    public a K;
    public QPhoto L;
    public b M;
    public final p N;
    public boolean O;
    public boolean P;
    public int Q;
    public LocalLifeHalfContainerActivity$b R;
    public LocalLifeHalfContainerActivity$a S;
    public HashMap T;
    public KwaiRnFragment y;
    public LocalLifeHalfContainerView z;

    public void LocalLifeHalfContainerActivity(){
       super();
       this.N = s.c(LocalLifeHalfContainerActivity$sessionId$2.INSTANCE);
       this.Q = -1;
       this.R = new LocalLifeHalfContainerActivity$b(this);
       this.S = new LocalLifeHalfContainerActivity$a(this);
    }
    public static final HalfParams A3(LocalLifeHalfContainerActivity p0){
       p0 = p0.J;
       if (p0 == null) {
          a.S("halfParams");
       }
       return p0;
    }
    public final void B3(CloseType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeHalfContainerActivity.class, "15")) {
          return;
       }
       this.E3(p0);
       this.finish();
       return;
    }
    public final String C3(){
       Object obj = PatchProxy.apply(null, this, LocalLifeHalfContainerActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.N.getValue();
    }
    public final boolean D3(){
       LocalLifeHalfContainerActivity localLifeHal = LocalLifeHalfContainerActivity.class;
       Object[] objArray = null;
       Intent obj = PatchProxy.apply(objArray, this, localLifeHal, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getIntent();
       Uri data = (obj != null)? obj.getData(): objArray;
       boolean b = false;
       if (data == null) {
          return b;
       }else if(this.G != null && this.J != null){
          return true;
       }else {
          obj = this.getIntent();
          a.o(obj, "intent");
          String str = x0.a(obj.getData(), "krn");
          this.Q = this.getIntent().getIntExtra("SOURCE_PHOTO_SAVE_ID", -1);
          this.I = this.getIntent().getIntExtra("EXTRA_KEY_DISPLAY_HEIGHT", n.v(this));
          Object obj1 = b.b(this.Q);
          if (obj1 != null) {
             if (obj1 instanceof QPhoto) {
                objArray = obj1;
             }
             if (objArray != null) {
                this.L = objArray;
             }
          }
          String str1 = x0.a(x0.f(str), "halfParams");
          boolean b1 = (str == null || u.S1(str))? true: false;
          if (!b1) {
             b1 = (str1 == null || u.S1(str1))? 1: 0;
             if (!b1) {
                this.G = str;
                Object obj2 = a.a.h(str1, HalfParams.class);
                a.o(obj2, "Gsons.KWAI_GSON.fromJson…, HalfParams::class.java\)");
                this.J = obj2;
                if (obj2 == null) {
                   a.S("halfParams");
                }
                if (!PatchProxy.applyVoidOneRefs(obj2, this, localLifeHal, "5") && (u.S1(obj2.getBiz()) && SystemUtil.I())) {
                   h1.a.b("！！！本地生活半屏容器 biz字段不能为空！！！");
                }
             label_00d0 :
                return true;
             }
          }
          return b;
       }
    }
    public final void E3(CloseType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeHalfContainerActivity.class, "16")) {
          return;
       }
       LocalLifeHalfContainerActivity tK = this.K;
       if (tK != null) {
          long l = SystemClock.elapsedRealtime() - this.H;
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(l), tK, uoa, "2")) {
             a.p(p0, "closeType");
             c.a(new b(tK, p0, l));
          }
       }
       return;
    }
    public void U0(boolean p0){
       LocalLifeHalfContainerActivity localLifeHal = LocalLifeHalfContainerActivity.class;
       if (PatchProxy.isSupport(localLifeHal) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, localLifeHal, "17")) {
          return;
       }
       k1.o(new LocalLifeHalfContainerActivity$c(this, p0));
       return;
    }
    public boolean Wc(boolean p0){
       return false;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LocalLifeHalfContainerActivity.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, LocalLifeHalfContainerActivity.class, "12")) {
          return;
       }
       if (this.P == null || this.O != null) {
          this.E3(CloseType.BACK_KEY);
          super.onBackPressed();
       }
       LocalLifeHalfContainerActivity ty = this.y;
       if (ty == null) {
          a.S("rnFragment");
       }
       if (ty.onBackPressed()) {
          return;
       }else {
          super.onBackPressed();
          return;
       }
    }
    public void onCreate(Bundle p0){
       LocalLifeHalfContainerActivity tG;
       String light;
       LocalLifeHalfContainerActivity tJ1;
       a a;
       LocalLifeHalfContainerActivity tA;
       LocalLifeHalfContainerActivity localLifeHal = LocalLifeHalfContainerActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, localLifeHal, "2")) {
          return;
       }
       Object[] objArray = null;
       String str = null;
       boolean b = true;
       if (!PatchProxy.applyVoid(objArray, this, localLifeHal, "3")) {
          this.H = SystemClock.elapsedRealtime();
          i.i(this, str, str, b);
          SwipeLayout swipeLayout = w9.b(this, new a(this));
          a.o(swipeLayout, "SwipeBack.attach\(this, o…LIDE_BACK\)\n      }\n    }\)");
          this.F = swipeLayout;
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d0033);
       if (this.D3()) {
          String str1 = "1";
          if (!PatchProxy.applyVoid(objArray, this, localLifeHal, "6")) {
             tG = this.J;
             if (tG == null) {
                a.S("halfParams");
             }
             String pageName = tG.getPageName();
             if (u.S1(pageName)) {
                tG = this.G;
                if (tG == null) {
                   a.S("krnUrl");
                }
                pageName = x0.a(x0.f(tG), "componentName");
             }
             tA = this.J;
             if (tA == null) {
                a.S("halfParams");
             }
             a.o(pageName, "pageName");
             String str3 = this.C3();
             a.o(str3, "sessionId");
             this.K = new a(tA.getBiz(), pageName, str3);
             long longExtra = this.getIntent().getLongExtra("EXTRA_KEY_ROUTER_HANDLE_DURATION", 0);
             tG = this.K;
             a.m(tG);
             Objects.requireNonNull(tG);
             a uoa = a.class;
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Long.valueOf(longExtra), tG, uoa, str1)) {
                c.a(new c(tG, longExtra));
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, localLifeHal, "10")) {
             View view = this.findViewById(R.id.activity_container);
             a.o(view, "findViewById\(R.id.activity_container\)");
             this.z = view;
             view = this.findViewById(R.id.llhc_slide_layout);
             a.o(view, "findViewById\(R.id.llhc_slide_layout\)");
             this.A = view;
             view = this.findViewById(R.id.llhc_drag_bar);
             a.o(view, "findViewById\(R.id.llhc_drag_bar\)");
             this.B = view;
             view = this.findViewById(R.id.llhc_loading_view);
             a.o(view, "findViewById\(R.id.llhc_loading_view\)");
             this.C = view;
             view = this.findViewById(R.id.llhc_error_view);
             a.o(view, "findViewById\(R.id.llhc_error_view\)");
             this.D = view;
             view = this.findViewById(R.id.fragment_container);
             a.o(view, "findViewById\(R.id.fragment_container\)");
             this.E = view;
             Ref$ObjectRef objectRef = new Ref$ObjectRef();
             objectRef.element = "";
             Ref$ObjectRef objectRef1 = new Ref$ObjectRef();
             objectRef1.element = "";
             LocalLifeHalfContainerActivity tJ = this.J;
             if (tJ == null) {
                a.S("halfParams");
             }
             if (tJ.getDisableDarkMode() || !k.d()) {
                tJ = this.J;
                if (tJ == null) {
                   a.S("halfParams");
                }
                objectRef.element = tJ.getMaskColor().getLight();
                tJ = this.J;
                if (tJ == null) {
                   a.S("halfParams");
                }
                light = tJ.getDragBarColor().getLight();
                tJ1 = this.J;
                if (tJ1 == null) {
                   a.S("halfParams");
                }
                objectRef1.element = tJ1.getBackgroundColor().getLight();
             }else {
                tJ = this.J;
                if (tJ == null) {
                   a.S("halfParams");
                }
                objectRef.element = tJ.getMaskColor().getDark();
                tJ = this.J;
                if (tJ == null) {
                   a.S("halfParams");
                }
                light = tJ.getDragBarColor().getDark();
                tJ1 = this.J;
                if (tJ1 == null) {
                   a.S("halfParams");
                }
                objectRef1.element = tJ1.getBackgroundColor().getDark();
             }
             Window window = this.getWindow();
             String str2 = "window";
             a.o(window, str2);
             WindowManager$LayoutParams attributes = window.getAttributes();
             LocalLifeHalfContainerActivity tJ2 = this.J;
             if (tJ2 == null) {
                a.S("halfParams");
             }
             attributes.dimAmount = tJ2.getMaskOpacity();
             attributes.windowAnimations = 0x7f01004a;
             this.getWindow().addFlags(2);
             Window window1 = this.getWindow();
             a.o(window1, str2);
             window1.setAttributes(attributes);
             tJ1 = this.z;
             if (tJ1 == null) {
                a.S("containerView");
             }
             LocalLifeHalfContainerActivity tJ3 = this.J;
             if (tJ3 == null) {
                a.S("halfParams");
             }
             if (!tJ3.getMaskOpacity() - null) {
                tJ1.setBackgroundColor(a.a.a(objectRef.element));
             }
             tJ1.setOnCustomClickListener(new c(this, objectRef));
             tG = this.B;
             if (tG == null) {
                a.S("dragBar");
             }
             b uob1 = new b();
             a = a.a;
             uob1.v(a.a(light));
             uob1.g(KwaiRadiusStyles.FULL);
             tG.setBackground(uob1.a());
             tG = this.A;
             light = "slideLayout";
             if (tG == null) {
                a.S(light);
             }
             ViewGroup$LayoutParams layoutParams = tG.getLayoutParams();
             float f = (float)this.I;
             LocalLifeHalfContainerActivity tJ4 = this.J;
             if (tJ4 == null) {
                a.S("halfParams");
             }
             layoutParams.height = (int)(f * tJ4.getHeight());
             uob1 = new b();
             uob1.v(a.a(objectRef1.element));
             uob1.g(new d(this, objectRef1));
             tG.setBackground(uob1.a());
             LocalLifeHalfContainerBehavior$a b1 = LocalLifeHalfContainerBehavior.b;
             tA = this.A;
             if (tA == null) {
                a.S(light);
             }
             LocalLifeHalfContainerBehavior localLifeHal1 = b1.a(tA);
             localLifeHal1.setState(3);
             localLifeHal1.setSkipCollapsed(b);
             localLifeHal1.setPeekHeight(str);
             localLifeHal1.c(str);
             localLifeHal1.setBottomSheetCallback(new e(this));
             tG = this.B;
             if (tG == null) {
                a.S("dragBar");
             }
             LocalLifeHalfContainerActivity tJ5 = this.J;
             if (tJ5 == null) {
                a.S("halfParams");
             }
             if (!tJ5.getHasDragBar()) {
                str = 8;
             }
             tG.setVisibility(str);
          }
          if (!PatchProxy.applyVoid(objArray, this, localLifeHal, "8")) {
             tG = this.G;
             if (tG == null) {
                a.S("krnUrl");
             }
             Uri$Builder uBuilder = x0.f(tG).buildUpon();
             uBuilder.appendQueryParameter("enableBackBtnHandler", "false");
             uBuilder.appendQueryParameter("llhcSessionId", this.C3());
             uBuilder.appendQueryParameter("containerSource", "llhc");
             uBuilder.appendQueryParameter("llhcLaunch", str1);
             uBuilder.appendQueryParameter("androidDisplayHeight", String.valueOf(this.I));
             uBuilder.appendQueryParameter("photoSaveId", String.valueOf(this.Q));
             Uri uri = uBuilder.build();
             a.o(uri, "uriBuilder.build\(\)");
             LaunchModel launchModel = a.a(uri);
             Bundle uBundle = new Bundle();
             uBundle.putParcelable("rn_launch_model", launchModel);
             LocalLifeHalfContainerActivity ty = this.y;
             if (ty == null) {
                a.S("rnFragment");
             }
             ty.setArguments(uBundle);
             ty = this.y;
             if (ty == null) {
                a.S("rnFragment");
             }
             b uob = new b(this, launchModel, ty);
             tG = this.y;
             if (tG == null) {
                a.S("rnFragment");
             }
             c uoc = c.a().b("KDS_BRIDGE_CONTEXT", uob).a();
             a.o(uoc, "KrnDelegateConfig.builde…Y, bridgeContext\).build\(\)");
             tG.setKrnDelegateConfig(uoc);
             tG = this.y;
             if (tG == null) {
                a.S("rnFragment");
             }
             tG.Gg(this.R);
             tG = this.y;
             if (tG == null) {
                a.S("rnFragment");
             }
             tG.ah(this.S);
             tG = this.y;
             if (tG == null) {
                a.S("rnFragment");
             }
             tG.setAttachedWindow(this.getWindow());
             tG = this.y;
             if (tG == null) {
                a.S("rnFragment");
             }
             tG.setCloseHandler(this);
             this.M = RxBus.f.f(a.class).observeOn(d.a).subscribe(new f(new LocalLifeHalfContainerActivity$initFrag$1(this)));
          }
       }else {
          this.B3(CloseType.URL_ERROR);
          h1.a.a(R.string.arg_RES_7f103ce2);
       }
       return;
    }
    public void onDestroy(){
       LocalLifeHalfContainerActivity localLifeHal = LocalLifeHalfContainerActivity.class;
       if (PatchProxy.applyVoid(null, this, localLifeHal, "13")) {
          return;
       }
       super.onDestroy();
       boolean b = true;
       if (!PatchProxy.isSupport(localLifeHal) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, this, localLifeHal, "14")) {
          d.a(0x2ac28c95).vT(b, this.Q);
       }
       d.a(0x2ac28c95).o0(false);
       b.f(this.Q);
       b9.a(this.M);
       return;
    }
    public Fragment u3(){
       KwaiRnFragment obj = PatchProxy.apply(null, this, LocalLifeHalfContainerActivity.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KwaiRnFragment();
       this.y = obj;
       return obj;
    }
    public boolean x0(){
       LocalLifeHalfContainerActivity obj = PatchProxy.apply(null, this, LocalLifeHalfContainerActivity.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.F;
       if (obj == null) {
          a.S("mSwipeLayout");
       }
       return obj.getEnabled();
    }
    public void z3(){
       if (PatchProxy.applyVoid(null, this, LocalLifeHalfContainerActivity.class, "4")) {
          return;
       }
       if (this.D3()) {
          super.z3();
       }
       return;
    }
}
