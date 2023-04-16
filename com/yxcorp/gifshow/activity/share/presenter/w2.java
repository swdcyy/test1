package com.yxcorp.gifshow.activity.share.presenter.w2;
import android.widget.AdapterView$OnItemClickListener;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import com.yxcorp.gifshow.activity.share.presenter.w2$j;
import lnc.a1;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.activity.share.presenter.w2$l;
import com.yxcorp.gifshow.activity.share.presenter.w2$i;
import com.yxcorp.gifshow.activity.share.presenter.w2$k;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.yxcorp.utility.n;
import zw8.k5;
import java.lang.Runnable;
import android.view.View;
import com.yxcorp.gifshow.activity.share.presenter.u2;
import android.app.Activity;
import ekd.i;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$OnLayoutChangeListener;
import android.widget.LinearLayout;
import xw8.p0;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.x;
import zw8.g5;
import com.yxcorp.gifshow.activity.share.presenter.q2;
import erd.g;
import crd.b;
import y26.a;
import zw8.e5;
import com.yxcorp.gifshow.activity.share.presenter.r2;
import zw8.f5;
import com.yxcorp.gifshow.activity.share.presenter.s2;
import zw8.o5;
import android.view.View$OnTouchListener;
import zw8.h5;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.edit.draft.Workspace$Type;
import ow8.c;
import java.lang.Boolean;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Publish;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.RelativeLayout;
import android.os.Handler;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Integer;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.FrameLayout;
import java.lang.Math;
import android.widget.ScrollView;
import com.kwai.library.widget.scrollview.ScrollViewEx$c;
import com.kwai.library.widget.scrollview.ScrollViewEx;
import a2.m0;
import a2.i0;
import com.yxcorp.gifshow.activity.share.presenter.w2$p;
import a2.n0;
import zw8.q5;
import a2.p0;
import com.yxcorp.gifshow.activity.share.presenter.w2$a;
import com.yxcorp.gifshow.activity.share.presenter.w2$b;
import com.yxcorp.gifshow.activity.share.presenter.w2$c;
import zw8.p5;
import com.yxcorp.gifshow.activity.share.presenter.w2$d;
import zw8.j5;
import com.yxcorp.gifshow.activity.share.presenter.w2$e;
import com.yxcorp.gifshow.activity.share.presenter.w2$f;
import zw8.d5;
import com.yxcorp.gifshow.activity.share.presenter.w2$g;
import com.yxcorp.gifshow.activity.share.presenter.w2$h;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.activity.share.presenter.ShareTitleAccessoryFragment;
import android.animation.ValueAnimator;
import android.animation.ObjectAnimator;
import com.yxcorp.gifshow.activity.share.presenter.t2;
import android.animation.TimeInterpolator;
import zw8.n5;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.activity.share.presenter.w2$o;
import android.animation.Animator$AnimatorListener;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Publish$b;
import wkd.b;
import cg6.c;
import kzc.f;
import kzc.e;
import com.yxcorp.gifshow.widget.popup.c;
import com.yxcorp.gifshow.activity.share.presenter.w2$m;
import com.yxcorp.gifshow.activity.share.presenter.w2$n;
import java.util.Objects;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import kotlin.jvm.internal.a;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import zw8.i5;
import ekd.m1;
import com.kwai.library.widget.layout.LinearLayoutEx;
import com.yxcorp.gifshow.widget.EmojiEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.activity.share.presenter.v2;
import android.view.animation.Interpolator;
import zw8.w5;
import java.util.Map;
import bba.b;
import android.widget.AdapterView;
import java.lang.Long;

public class w2 extends PresenterV2 implements AdapterView$OnItemClickListener, g	// class@001452
{
    public View A;
    public ShareTitleAccessoryFragment B;
    public QPhoto C;
    public ViewGroup D;
    public View E;
    public RecyclerView F;
    public FrameLayout G;
    public View H;
    public ScrollViewEx I;
    public c J;
    public Map K;
    public p0 L;
    public GifshowActivity M;
    public QPhoto N;
    public b O;
    public boolean P;
    public f Q;
    public int R;
    public boolean S;
    public View$OnLayoutChangeListener T;
    public int U;
    public int U0;
    public int V;
    public int V0;
    public int W;
    public int W0;
    public boolean X;
    public int X0;
    public boolean Y;
    public int Y0;
    public boolean Z;
    public int Z0;
    public int a1;
    public boolean b1;
    public boolean c1;
    public int d1;
    public int e1;
    public boolean f1;
    public boolean g1;
    public Runnable h1;
    public ValueAnimator i1;
    public ValueAnimator j1;
    public ValueAnimator k1;
    public int l1;
    public int m1;
    public ViewTreeObserver$OnGlobalLayoutListener n1;
    public ViewTreeObserver$OnGlobalLayoutListener o1;
    public final long p;
    public View q;
    public LinearLayoutEx r;
    public View s;
    public LinearLayout t;
    public EmojiEditText u;
    public View v;
    public EmojiEditText w;
    public RelativeLayout x;
    public ConstraintLayout y;
    public ScrollViewEx z;

    public void w2(){
       super();
       this.p = 200;
       this.K = new HashMap();
       this.Q = new w2$j(this);
       boolean b = false;
       this.S = b;
       this.U = b;
       this.Y = b;
       this.U0 = a1.e(33.00f);
       this.V0 = a1.e(54.00f);
       this.W0 = a1.e(156.00f);
       this.X0 = a1.e(96.00f);
       this.Y0 = a1.e(18.00f);
       this.Z0 = a1.e(10.00f);
       this.a1 = a1.e(80.00f);
       boolean b1 = true;
       this.b1 = b1;
       this.c1 = b1;
       this.d1 = b;
       this.e1 = this.U0;
       if (!PostExperimentUtils.A1() && !PostExperimentUtils.y1()) {
          b1 = false;
       }
       this.f1 = b1;
       this.g1 = b;
       this.h1 = new w2$l(this);
       this.i1 = null;
       this.j1 = null;
       this.k1 = null;
       this.l1 = b;
       this.m1 = b;
       this.n1 = new w2$i(this);
       this.o1 = new w2$k(this);
       return;
    }
    public void E8(){
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoid(null, this, w2.class, "3")) {
          return;
       }
       this.U = n.c(this.M, 100.00f);
       this.A.post(new k5(this));
       if (!PatchProxy.applyVoid(null, this, w2.class, "8")) {
          this.T = new u2(this);
          if (i.e(this.M)) {
             this.q.getLayoutParams().topMargin = - n.A(this.M);
          }
          this.t.addOnLayoutChangeListener(this.T);
       }
       ActivityEvent dESTROY = ActivityEvent.DESTROY;
       this.X7(this.L.b.compose(c.c(this.M.m(), dESTROY)).subscribe(new g5(this), q2.b));
       this.L.e.a.subscribe(new e5(this), r2.b);
       this.X7(this.L.f.compose(c.c(this.M.m(), dESTROY)).subscribe(new f5(this), s2.b));
       this.s.setOnTouchListener(new o5(this));
       this.t.post(new h5(this));
       if (!PatchProxy.applyVoid(null, this, w2.class, "7")) {
          this.s.setBackgroundColor(a1.a(R.color.arg_RES_7f061982));
       }
       Workspace$Type aTLAS = Workspace$Type.ATLAS;
       boolean b = false;
       boolean b1 = (c.i(this.J, this.N) != aTLAS && (c.i(this.J, this.N) == Workspace$Type.SINGLE_PICTURE || c.i(this.J, this.N) == Workspace$Type.LONG_PICTURE))? true: false;
       this.Z = b1;
       if (PostExperimentUtils.d() && this.Z != null) {
          w2 obj = PatchProxy.apply(null, this, w2.class, "18");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             obj = this.O;
             if (obj != null) {
                if (this.P == null || obj.v() == null) {
                   Object[] objArray = new Object[b];
                   a.b().s("share_draft_tag", "getCaptionTitleOpen caption title open is null", objArray);
                }else {
                   b1 = this.O.v().getCaptionTitleOpen();
                   Object[] objArray1 = new Object[b];
                   a.b().s("share_draft_tag", "getDraftCaption: "+b1, objArray1);
                }
             }
             b1 = false;
          }
          if (!b1) {
             obj = PatchProxy.apply(null, this, w2.class, "20");
             if (obj != patchProxyRe) {
                b2 = obj.booleanValue();
             }else {
                w2 tC = this.C;
                b2 = (tC != null && (DraftUtils.W(tC, this.J) && !TextUtils.x(this.C.getCaptionTitle())))? true: false;
             }
             if (!b2) {
             label_0190 :
                this.S = b;
                this.h9(true);
                if (c.i(this.J, this.N) == aTLAS || c.i(this.J, this.N) == Workspace$Type.SINGLE_PICTURE) {
                   if (this.S != null) {
                      this.u.getViewTreeObserver().addOnGlobalLayoutListener(this.n1);
                   }else {
                      this.u.getViewTreeObserver().removeOnGlobalLayoutListener(this.n1);
                   }
                }
                if (c.i(this.J, this.N) == Workspace$Type.LONG_PICTURE) {
                   if (this.S != null) {
                      this.x.getViewTreeObserver().addOnGlobalLayoutListener(this.o1);
                   }else {
                      this.x.getViewTreeObserver().removeOnGlobalLayoutListener(this.o1);
                   }
                }
             }
          }
          b = true;
          goto label_0190 ;
       }
    label_01ed :
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, w2.class, "4")) {
          return;
       }
       w2 tM = this.M;
       if (tM != null && tM.V2() != null) {
          this.M.V2().removeCallbacks(this.h1);
       }
       Object[] objArray = new Object[0];
       a.b().w("ShareKeyboardStatus", "onDestroy: ", objArray);
       this.Y8();
       return;
    }
    public final void P8(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(w2.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, w2.class, "24")) {
          return;
       }
       ConstraintLayout$LayoutParams layoutParams = this.D.getLayoutParams();
       layoutParams.i = -1;
       layoutParams.h = 0;
       layoutParams.topMargin = (p2 - p1) + this.Z0;
       this.D.setLayoutParams(layoutParams);
       RelativeLayout$LayoutParams layoutParams1 = this.y.getLayoutParams();
       p0 = p0 - p1;
       layoutParams1.height = p0;
       this.y.setLayoutParams(layoutParams1);
       RelativeLayout$LayoutParams layoutParams2 = this.H.getLayoutParams();
       layoutParams2.topMargin = (p0 + n.p(this.y)[1]) - p3;
       this.H.setLayoutParams(layoutParams2);
       return;
    }
    public void R8(int p0,int p1,int p2,int p3,RelativeLayout$LayoutParams p4,ConstraintLayout$LayoutParams p5){
       if (PatchProxy.isSupport(w2.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, this, w2.class, "33")) {
             return;
          }
       }
       p4.height = (p2 + p0) + p1;
       this.y.setLayoutParams(p4);
       p5.height = (p3 + p0) + p1;
       this.D.setLayoutParams(p5);
       return;
    }
    public void S8(int p0,int p1,int p2){
       if (PatchProxy.isSupport(w2.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, w2.class, "23")) {
          return;
       }
       this.P8(p0, p1, p1, p2);
       this.l1 = p0 - p1;
       this.F.setVisibility(8);
       if (!PatchProxy.applyVoid(null, this, w2.class, "25")) {
          w2 tG = this.G;
          p1 = 0;
          if (tG != null) {
             int[] ointArray = new int[2];
             tG.getLocationOnScreen(ointArray);
             p1 = this.G.getHeight() + ointArray[1];
          }
          tG = this.W - a1.e(48.00f);
          p1 = p1 - tG;
          if (p1 > 0 && tG > 0) {
             this.d1 = Math.max(this.d1, p1);
          }
          if (this.I.getScrollY()) {
             this.I.fullScroll(33);
          }
       }
       return;
    }
    public void V8(boolean p0){
       if (PatchProxy.isSupport(w2.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, w2.class, "9")) {
          return;
       }
       this.L.k(p0);
       if (p0) {
          this.A.setVisibility(8);
       }else {
          this.c9();
          this.z.setScrollViewListener(null);
       }
       return;
    }
    public void W8(){
       m0 om0;
       m0 om01;
       if (PatchProxy.applyVoid(null, this, w2.class, "28")) {
          return;
       }
       RelativeLayout$LayoutParams height = this.y.getLayoutParams().height;
       long l = 150;
       if (this.S != null) {
          this.x.setAlpha(0);
          om0 = i0.c(this.x);
          om0.a(0x3f800000);
          om0.d(l);
          om0.h(50);
          om0.f(new w2$p(this));
          om0.j();
          this.v.setTranslationY((float)(- this.e1));
          om0 = this.e9(this.v);
          om0.i(new q5(this, height));
          om0.f(new w2$a(this, height));
          om0.j();
          this.E.setTranslationY((float)(- this.e1));
          om01 = this.e9(this.E);
          om01.f(new w2$b(this));
          om01.j();
       }else {
          this.x.setAlpha(0x3f800000);
          om0 = i0.c(this.x);
          om0.a(0);
          om0.d(l);
          om0.f(new w2$c(this));
          om0.j();
          this.v.setTranslationY((float)this.e1);
          om0 = this.e9(this.v);
          om0.i(new p5(this, height));
          om0.f(new w2$d(this, height));
          om0.j();
          this.E.setTranslationY((float)this.e1);
          om01 = this.e9(this.E);
          om01.l(new j5(this));
          om01.f(new w2$e(this));
          om01.j();
       }
       return;
    }
    public final void X8(int p0,int p1,int p2,RelativeLayout$LayoutParams p3,ConstraintLayout$LayoutParams p4){
       w2 ow2 = this;
       if (PatchProxy.isSupport(w2.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, w2.class, "32")) {
             return;
          }
       }
       w2 s = ow2.S;
       float f = 0x3f800000;
       float f1 = (s != null)? 0: 0x3f800000;
       if (s == null) {
          f = 0;
       }
       ow2.x.setAlpha(f1);
       m0 om0 = i0.c(ow2.x);
       om0.a(f);
       om0.d(150);
       om0.h(50);
       om0.f(new w2$f(this, f));
       om0.j();
       float f2 = (float)(- p0);
       ow2.v.setTranslationY(f2);
       m0 om01 = this.e9(ow2.v);
       w2 ow21 = this;
       int i = p0;
       int i1 = p1;
       int i2 = p2;
       RelativeLayout$LayoutParams layoutParams = p3;
       ConstraintLayout$LayoutParams layoutParams1 = p4;
       d5 uod5 = new d5(ow21, i, i1, i2, layoutParams, layoutParams1);
       om01.i(v12);
       w2$g og = new w2$g(ow21, i, i1, i2, layoutParams, layoutParams1);
       om01.f(v12);
       om01.j();
       ow2.E.setTranslationY(f2);
       if (ow2.S != null) {
          ow2.E.setVisibility(0);
       }
       om0 = this.e9(ow2.E);
       om0.f(new w2$h(this));
       om0.j();
       return;
    }
    public final void Y8(){
       if (PatchProxy.applyVoid(null, this, w2.class, "14")) {
          return;
       }
       if (this.B != null) {
          Object[] objArray = new Object[0];
          a.b().w("ShareKeyboardStatus", "releaseKeyboardPopupWindow\(\)", objArray);
          this.B.dismiss();
          w2 tB = this.B;
          tB.x = null;
          tB.y = null;
          this.B = null;
       }
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, w2.class, "26")) {
          return;
       }
       if (this.F != null) {
          w2 tk1 = this.k1;
          if (tk1 == null || !tk1.isRunning()) {
             tk1 = this.i1;
             int i = 1;
             int i1 = 0;
             if (tk1 != null && tk1.isRunning()) {
                this.i1.cancel();
                tk1 = 1;
             }else {
                tk1 = null;
             }
             w2 tj1 = this.j1;
             if (tj1 != null && tj1.isRunning()) {
                this.j1.cancel();
                tk1 = 1;
             }
             int i2 = this.F.getMeasuredHeight() + this.Y0;
             w2 ta1 = this.a1;
             this.d1 = ((this.u.getHeight() - i2) < ta1)? (ta1 + i2) - this.u.getHeight(): i1;
             this.F.setVisibility(i1);
             this.F.setAlpha(0);
             m0 om0 = i0.c(this.F);
             om0.a(0x3f800000);
             om0.h(50);
             om0.d(150);
             om0.j();
             int[] ointArray = new int[]{i2,i1};
             ValueAnimator valueAnimato = ObjectAnimator.ofInt(ointArray);
             this.k1 = valueAnimato;
             valueAnimato.setDuration(200);
             this.k1.setInterpolator(t2.a);
             RelativeLayout$LayoutParams layoutParams = this.y.getLayoutParams();
             if (tk1 != null) {
                tk1 = this.l1;
                if (tk1 != null) {
                label_00b2 :
                   this.k1.addUpdateListener(new n5(this, i2, layoutParams, tk1));
                   this.k1.addListener(new w2$o(this, layoutParams, tk1, i2));
                   this.k1.start();
                }
             }
             int height = this.y.getHeight();
             goto label_00b2 ;
          }
       }
       return;
    }
    public final void a9(boolean p0,boolean p1){
       if (PatchProxy.isSupport(w2.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, w2.class, "17")) {
          return;
       }
       int i = 0;
       if (this.O == null) {
          Object[] objArray = new Object[i];
          a.b().s("share_draft_tag", "saveIfAddPhotosTitle: publish draft is null", objArray);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          a.b().s("share_draft_tag", "saveIfAddPhotosTitle "+p0, objArray1);
          this.O.c0();
          Publish$b uob = this.O.k();
          uob.copyOnWrite();
          uob.instance.setCaptionTitleOpen(p0);
          this.O.g((p1 ^ 0x01));
          return;
       }
    }
    public final void b9(int p0,int p1){
       if (PatchProxy.isSupport(w2.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, w2.class, "13")) {
          return;
       }
       if (!b.a(-799467951).c().d().m(this.M)) {
          return;
       }
       if (this.Z != null) {
          Object[] objArray = new Object[0];
          String str = "ShareKeyboardStatus";
          a.b().w(str, "showKeyboardPopupWindow\(\)", objArray);
          if (this.B == null) {
             ShareTitleAccessoryFragment shareTitleAc = new ShareTitleAccessoryFragment();
             this.B = shareTitleAc;
             shareTitleAc.mh("check_box_init_state", this.S);
             this.B.x = new w2$m(this);
             this.B.y = new w2$n(this);
          }
          if (this.B != null) {
             objArray = new Object[0];
             a.b().w(str, "showKeyboardPopupWindow\(\) show", objArray);
             w2 tB = this.B;
             Objects.requireNonNull(tB);
             if (!PatchProxy.isSupport(ShareTitleAccessoryFragment.class) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), tB, ShareTitleAccessoryFragment.class, "7") && tB.r != p1)) {
                tB.r = p1;
                Dialog dialog = tB.getDialog();
                if (dialog != null) {
                   Window window = dialog.getWindow();
                   if (window != null) {
                      WindowManager$LayoutParams attributes = window.getAttributes();
                      a.o(attributes, "attr");
                      tB.uh(attributes);
                      window.setAttributes(attributes);
                   }
                }
             }
             w2 tB1 = this.B;
             tB1.r = p1;
             tB1.show(this.M.getSupportFragmentManager(), "Test");
             this.h9(0);
          }
       }
       return;
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, w2.class, "12")) {
          return;
       }
       this.A.postDelayed(new i5(this), 100);
       return;
    }
    public void d9(){
       if (PatchProxy.applyVoid(null, this, w2.class, "31")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.y.getLayoutParams();
       ViewGroup$LayoutParams layoutParams1 = this.D.getLayoutParams();
       RelativeLayout$LayoutParams height = layoutParams.height;
       ViewGroup$MarginLayoutParams height1 = layoutParams1.height;
       if (this.S != null) {
          this.X8(this.e1, height, height1, layoutParams, layoutParams1);
       }else {
          this.X8((- this.e1), height, height1, layoutParams, layoutParams1);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w2.class, "2")) {
          return;
       }
       this.z = m1.f(p0, 0x7f0a374c);
       this.s = m1.f(p0, 0x7f0a2efa);
       this.r = m1.f(p0, 0x7f0a2ef6);
       this.q = m1.f(p0, 0x7f0a3324);
       this.u = m1.f(p0, 0x7f0a0ca8);
       this.v = m1.f(p0, 0x7f0a0cac);
       this.t = m1.f(p0, 0x7f0a3698);
       this.A = m1.f(p0, 0x7f0a3317);
       this.w = m1.f(p0, 0x7f0a3f52);
       this.x = m1.f(p0, 0x7f0a307b);
       this.y = m1.f(p0, 0x7f0a31f3);
       this.D = m1.f(p0, 0x7f0a0ca7);
       this.E = m1.f(p0, 0x7f0a3f4c);
       this.F = m1.f(p0, 0x7f0a305a);
       this.G = m1.f(p0, 0x7f0a4024);
       this.H = m1.f(p0, 0x7f0a13cc);
       this.I = m1.f(p0, 0x7f0a374c);
       return;
    }
    public final m0 e9(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w2.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       m0 om0 = i0.c(p0);
       om0.k(0);
       om0.e(this.a);
       om0.d(200);
       return om0;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w2.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new w5();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, w2.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(w2.class, new w5());
       }else {
          obj.put(w2.class, null);
       }
       return obj;
    }
    public void h9(boolean p0){
       w2 tu;
       if (PatchProxy.isSupport(w2.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, w2.class, "15")) {
          return;
       }
       if (c.i(this.J, this.N) == Workspace$Type.ATLAS || c.i(this.J, this.N) == Workspace$Type.SINGLE_PICTURE) {
          if (!PatchProxy.isSupport(w2.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, w2.class, "16")) {
             if (this.S != null) {
                this.x.setVisibility(0);
                this.E.setVisibility(0);
                tu = this.u;
                tu.setShadowLayer((float)tu.getExtendedPaddingTop(), 0, 0, 0);
                this.v.setPadding(0, a1.d(R.dimen.arg_RES_7f070271), 0, 0);
             }else {
                this.x.setVisibility(8);
                this.E.setVisibility(8);
                this.v.setPadding(0, 0, 0, 0);
             }
             this.a9(this.S, p0);
          }
       }else if(c.i(this.J, this.N) != Workspace$Type.LONG_PICTURE || (PatchProxy.isSupport(w2.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, w2.class, "19"))){
          if (this.S != null) {
             this.x.setVisibility(0);
             this.E.setVisibility(0);
             tu = this.u;
             tu.setShadowLayer((float)tu.getExtendedPaddingTop(), 0, 0, 0);
             this.v.setPadding(0, a1.d(R.dimen.arg_RES_7f070271), 0, 0);
          }else {
             this.x.setVisibility(8);
             this.E.setVisibility(8);
             this.v.setPadding(0, 0, 0, 0);
          }
          this.a9(this.S, p0);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, w2.class, "1")) {
          return;
       }
       this.J = this.t8("WORKSPACE");
       this.L = this.r8("SHARE_PAGE_PRESENTER_MODEL");
       this.M = this.r8("SHARE_ACTIVITY");
       this.N = this.t8("SHARE_QPHOTO");
       this.P = this.r8("HAS_DRAFT_DATA").booleanValue();
       this.O = this.t8("PUBLISH");
       this.C = this.t8("SHARE_QPHOTO");
       this.K = this.r8("LISTENERS_MAP");
       return;
    }
    public void onItemClick(AdapterView p0,View p1,int p2,long p3){
       if (PatchProxy.isSupport(w2.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Long.valueOf(p3), this, w2.class, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().w("ShareKeyboardStatus", "click emoji position: "+p2, objArray);
       this.u.h(p0.getItemAtPosition(p2));
       return;
    }
}
