package com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import uo7.a0;
import com.yxcorp.gifshow.share.widget.slide.ForwardBottomSheetDialogFragment;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$Companion;
import nsd.u;
import android.os.Build;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import android.os.Build$VERSION;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$a;
import android.content.DialogInterface$OnCancelListener;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$b;
import android.content.DialogInterface$OnDismissListener;
import djc.a;
import com.kwai.sharelib.ui.SharePanelFragment;
import lnc.a1;
import oic.g1;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$showListener$1;
import msd.q;
import java.util.ArrayList;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$f;
import java.util.HashMap;
import kotlin.LazyThreadSafetyMode;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$iconAnimatorList$2;
import msd.a;
import qrd.p;
import qrd.s;
import mhc.f0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.Pair;
import ap7.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import yo7.b;
import msd.l;
import uo7.a0$a;
import brd.t;
import java.util.concurrent.TimeUnit;
import brd.z;
import io.reactivex.android.schedulers.a;
import mp7.m;
import mp7.n;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import mp7.e;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$d;
import mhc.e0;
import uo7.i0;
import mhc.p1;
import uo7.h0;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import java.util.Map;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$e;
import mhc.x;
import mhc.o2;
import com.kwai.sharelib.model.PainterModel;
import mhc.o0;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelData;
import mhc.q;
import java.util.List;
import com.kwai.sharelib.model.ShareInitResponse$ShareTheme;
import mp7.a;
import mp7.c;
import com.yxcorp.gifshow.share.widget.ForwardIMSectionFragment;
import java.util.Collection;
import uo7.j0;
import java.util.Collections;
import uo7.a;
import ip7.h;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.text.TextUtils;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$c;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$i;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$j;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Exception;
import java.lang.Throwable;
import android.util.Log;
import k2b.u1;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import com.google.gson.JsonObject;
import ekd.k0;
import djc.u;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$h;
import djc.u$a;
import djc.w;
import djc.t;
import com.kwai.sharelib.model.ShareInitResponse$PanelPoster;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import i2b.a;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import android.animation.Animator;
import android.content.DialogInterface;
import com.kwai.sharelib.model.ShareInitResponse$ThemeElement;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.share.view.ShadowContainerLayout;
import java.lang.Number;
import java.lang.Float;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.content.res.Resources;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$g;
import android.view.View$OnClickListener;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import djc.j0;
import android.view.ViewTreeObserver;
import ekd.h;
import android.view.ViewTreeObserver$OnPreDrawListener;
import ekd.f;
import com.kwai.sharelib.model.PosterConfig;
import n80.b;
import q87.c;
import androidx.fragment.app.FragmentActivity;

public class ForwardGridSectionFragment extends ForwardBottomSheetDialogFragment implements a0	// class@001cd2
{
    public final a A;
    public final SharePanelFragment B;
    public a C;
    public c D;
    public w E;
    public String F;
    public final String G;
    public ShareInitResponse$PanelPoster H;
    public boolean I;
    public u J;
    public o0 K;
    public q L;
    public e0 M;
    public b N;
    public q O;
    public int P;
    public final ArrayList Q;
    public final ForwardGridSectionFragment$f R;
    public SharePosInfo S;
    public String T;
    public float U;
    public GifshowActivity V;
    public final Map W;
    public boolean X;
    public boolean Y;
    public final p Z;
    public static final boolean U0;
    public static boolean V0;
    public static final ForwardGridSectionFragment$Companion W0;

    static {
       u ou = null;
       ForwardGridSectionFragment.W0 = new ForwardGridSectionFragment$Companion(ou);
       String mANUFACTURER = Build.MANUFACTURER;
       a.o(mANUFACTURER, "Build.MANUFACTURER");
       Objects.requireNonNull(mANUFACTURER, "null cannot be cast to non-null type java.lang.String");
       mANUFACTURER = mANUFACTURER.toLowerCase();
       a.o(mANUFACTURER, "\(this as java.lang.String\).toLowerCase\(\)");
       boolean b = false;
       if (StringsKt__StringsKt.O2(mANUFACTURER, "vivo", b, 2, ou) && (Build$VERSION.SDK_INT >= 30 && a.t().d("vivoAdr11DisableAnimation", b))) {
          b = true;
       }
    label_003a :
       ForwardGridSectionFragment.U0 = b;
    }
    public void ForwardGridSectionFragment(){
       super();
       this.oh(new ForwardGridSectionFragment$a(this));
       this.k0(new ForwardGridSectionFragment$b(this));
       this.A = new a();
       this.B = new SharePanelFragment();
       this.G = a1.p(0x7f101c7f);
       this.I = true;
       this.L = new g1(new ForwardGridSectionFragment$showListener$1(this));
       this.Q = new ArrayList();
       this.R = new ForwardGridSectionFragment$f(this);
       this.W = new HashMap();
       this.X = true;
       this.Z = s.b(LazyThreadSafetyMode.NONE, ForwardGridSectionFragment$iconAnimatorList$2.INSTANCE);
    }
    public static void Mh(ForwardGridSectionFragment p0,f0 p1,int p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = -1;
       }
       if (PatchProxy.isSupport(ForwardGridSectionFragment.class) && (!PatchProxy.applyVoidTwoRefs(p1, Integer.valueOf(p2), p0, ForwardGridSectionFragment.class, "10") && p1 != null)) {
          p0.Q.add(new Pair(Integer.valueOf(p2), p1));
       }
       return;
    }
    public void Cf(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionFragment.class, "19")) {
          return;
       }
       a.p(p0, "forwardPoster");
       this.B.r = p0;
       return;
    }
    public boolean Eg(){
       Object obj = PatchProxy.apply(null, this, ForwardGridSectionFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableShareAnyGlobalBackupData", false);
    }
    public void Ih(){
       if (PatchProxy.applyVoid(null, this, ForwardGridSectionFragment.class, "26")) {
          return;
       }
       this.P = 2;
       ForwardGridSectionFragment tN = this.N;
       if (tN != null) {
          tN.g("DROP_DOWN");
       }
       super.Ih();
       return;
    }
    public void J8(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionFragment.class, "37")) {
          return;
       }
       a.p(p0, "currentPainterModelSetter");
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, a0$a.class, "4")) {
          a.p(p0, "currentPainterModelSetter");
       }
       return;
    }
    public boolean Kh(){
       Object obj = PatchProxy.apply(null, this, ForwardGridSectionFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.ai() ^ 0x01);
    }
    public void L6(t p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionFragment.class, "23")) {
          return;
       }
       String str = "observable";
       a.p(p0, str);
       ForwardGridSectionFragment tB = this.B;
       Objects.requireNonNull(tB);
       if (!PatchProxy.applyVoidOneRefs(p0, tB, SharePanelFragment.class, "7")) {
          a.p(p0, str);
          tB.l = p0.delay(10, TimeUnit.SECONDS).observeOn(a.c()).subscribe(new m(tB), n.b);
       }
       return;
    }
    public final GifshowActivity Lh(){
       ForwardGridSectionFragment obj = PatchProxy.applyWithListener(null, this, ForwardGridSectionFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.V;
       if (obj == null) {
          a.S("activity");
       }
       PatchProxy.onMethodExit(ForwardGridSectionFragment.class, "1");
       return obj;
    }
    public e Nh(){
       Object obj = PatchProxy.apply(null, this, ForwardGridSectionFragment.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ForwardGridSectionFragment$d(this);
    }
    public final e0 Oh(){
       return this.M;
    }
    public final p1 Ph(i0 p0){
       p1 obj = PatchProxy.applyOneRefs(p0, this, ForwardGridSectionFragment.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ShareInitResponse$SharePanelElement mActionUrl = p0.a().mActionUrl;
       a.o(mActionUrl, "op.operationDisplay.mActionUrl");
       String str = new h0(mActionUrl).c();
       if (str != null) {
          obj = this.W.get(str);
          if (obj == null) {
          label_0030 :
             ForwardGridSectionFragment$e uoe = new ForwardGridSectionFragment$e(str, o2.i(str));
             if (str != null) {
                this.W.put(str, uoe);
             }
          }
       }else {
          goto label_0030 ;
       }
       return obj;
    }
    public void Qg(PainterModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionFragment.class, "18")) {
          return;
       }
       a.p(p0, "painterModel");
       this.B.q = p0;
       return;
    }
    public final a Qh(){
       return this.A;
    }
    public void R5(ArrayList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionFragment.class, "20")) {
          return;
       }
       a.p(p0, "tkConfigList");
       this.B.t = p0;
       return;
    }
    public final o0 Rh(){
       return this.K;
    }
    public void S6(ShareInitResponse$SharePanelData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionFragment.class, "38")) {
          return;
       }
       a.p(p0, "sharePanel");
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, a0$a.class, "3")) {
          a.p(p0, "sharePanel");
       }
       return;
    }
    public final q Sh(){
       return this.O;
    }
    public final List Th(){
       Object obj = PatchProxy.apply(null, this, ForwardGridSectionFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Z.getValue();
    }
    public final b Uh(){
       return this.N;
    }
    public int Vh(){
       return 0x7f0d0490;
    }
    public void W8(ShareInitResponse$ShareTheme p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionFragment.class, "16")) {
          return;
       }
       a.p(p0, "theme");
       this.B.Zg(p0);
       return;
    }
    public final String Wh(){
       return this.F;
    }
    public final SharePanelFragment Xh(){
       return this.B;
    }
    public final a Yh(){
       return this.C;
    }
    public final c Zh(){
       return this.D;
    }
    public void a8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionFragment.class, "14")) {
          return;
       }
       a.p(p0, "listener");
       this.N = p0;
       ForwardGridSectionFragment tB = this.B;
       Objects.requireNonNull(tB);
       if (!PatchProxy.applyVoidOneRefs(p0, tB, SharePanelFragment.class, "4")) {
          a.p(p0, "listener");
          tB.n = p0;
       }
       return;
    }
    public boolean ai(){
       return this instanceof ForwardIMSectionFragment;
    }
    public boolean bi(){
       return this instanceof ForwardIMSectionFragment;
    }
    public final boolean ci(){
       return this.X;
    }
    public void dd(List p0){
       j0 oj0;
       boolean b = this;
       ForwardGridSectionFragment obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, b, ForwardGridSectionFragment.class, "24")) {
          return;
       }
       String str = "operationList";
       a.p(obj, str);
       int i = 1;
       b.I = p0.isEmpty() ^ i;
       ArrayList uArrayList = new ArrayList();
       uArrayList.addAll(obj);
       int i1 = 0;
       if (b.E != null) {
          oj0 = obj.get(i1);
          String str1 = null;
          if (oj0 != null) {
             List list = (oj0.a().size() == i && a.g("banner", oj0.a().get(i1).a().mElementType))? 1: null;
             if (list) {
             label_005b :
                str1 = "Collections.emptyList\(\)";
                if (oj0 == null) {
                   List list1 = Collections.emptyList();
                   a.o(list1, str1);
                   j0 oj01 = new j0(list1, "FANS_BANNER", null, null, 12, null);
                   uArrayList.add(i1, oj0);
                }else {
                   list = Collections.emptyList();
                   a.o(list, str1);
                   j0 oj02 = new j0(list, "FANS_BANNER", null, null, 12, null);
                   uArrayList.add(i, oj0);
                }
             }
          }
          oj0 = str1;
          goto label_005b ;
       }
       if (uArrayList.size() <= i) {
          i = false;
       }
       b.Jh(i);
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          oj0 = iterator.next();
          Iterator iterator1 = oj0.a().iterator();
          int i2 = 0;
          while (iterator1.hasNext()) {
             Object obj1 = iterator1.next();
             int i3 = i2 + 1;
             if (i2 < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             if (!TextUtils.isEmpty(obj1.a().mId) && a.g(obj1.a().mId, b.F)) {
                ForwardGridSectionFragment g = b.G;
                a.o(g, "recentChannelShowText");
                oj0.a().set(i2, new ForwardGridSectionFragment$c(obj1, g));
             }
             i2 = i3;
          }
       }
       ForwardGridSectionFragment$i oi = new ForwardGridSectionFragment$i(b);
       b.C = oi;
       ForwardGridSectionFragment b1 = b.B;
       a.m(oi);
       Objects.requireNonNull(b1);
       if (!PatchProxy.applyVoidTwoRefs(uArrayList, oi, b1, SharePanelFragment.class, "2")) {
          a.p(uArrayList, str);
          a.p(oi, "uiController");
          b1.h = uArrayList;
          b1.i = oi;
       }
       ForwardGridSectionFragment$j oj = new ForwardGridSectionFragment$j(b, obj);
       b.D = oj;
       obj = b.B;
       a.m(oj);
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidOneRefs(oj, obj, SharePanelFragment.class, "8")) {
          a.p(oj, "listener");
          obj.k = oj;
       }
       return;
    }
    public void di(){
       if (PatchProxy.applyVoid(null, this, ForwardGridSectionFragment.class, "30")) {
          return;
       }
       this.P = 1;
       this.B.Ug();
       return;
    }
    public void dismiss(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ForwardGridSectionFragment.class, "33")) {
          return;
       }
       super.dismiss();
       ForwardGridSectionFragment tA = this.A;
       Objects.requireNonNull(tA);
       if (!PatchProxy.applyVoid(objArray, tA, a.class, "2") && tA.a != null) {
          u1.R("B526435", "DISMISS "+System.currentTimeMillis()+' '+Log.getStackTraceString(new Exception()), 13);
       }
       return;
    }
    public void dismissAllowingStateLoss(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ForwardGridSectionFragment.class, "32")) {
          return;
       }
       super.dismissAllowingStateLoss();
       ForwardGridSectionFragment tA = this.A;
       Objects.requireNonNull(tA);
       if (!PatchProxy.applyVoid(objArray, tA, a.class, "5") && tA.a != null) {
          u1.R("B526435", "DISMISS_A "+System.currentTimeMillis()+' '+Log.getStackTraceString(new Exception()), 13);
       }
       return;
    }
    public boolean ei(View p0,Animator$AnimatorListener p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ForwardGridSectionFragment.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "view");
       a.p(p1, "listener");
       return false;
    }
    public final void fi(GifshowActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionFragment.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.V = p0;
       return;
    }
    public final void gi(boolean p0){
       this.X = p0;
    }
    public String j2(){
       return "normal";
    }
    public void n8(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionFragment.class, "13")) {
          return;
       }
       String str = "extParam";
       a.p(p0, str);
       String str1 = null;
       this.F = k0.h(p0, "recentChannel", str1);
       u$a b = u.b;
       ForwardGridSectionFragment$h oh = new ForwardGridSectionFragment$h(this);
       Objects.requireNonNull(b);
       String str2 = PatchProxy.applyThreeRefs(p0, this, oh, b, u$a.class, "1");
       if (str2 != PatchProxyResult.class) {
       }else {
          a.p(p0, str);
          a.p(this, "fragment");
          Iterator iterator = u.a.iterator();
          while (iterator.hasNext()) {
             str1 = iterator.next().a(p0, this, oh);
             if (str1 != null) {
                break ;
             }
          }
          str2 = str1;
       }
       this.E = str2;
       return;
    }
    public void nd(ShareInitResponse$PanelPoster p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionFragment.class, "15")) {
          return;
       }
       a.p(p0, "panelPoster");
       this.H = p0;
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ForwardGridSectionFragment.class, "5");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(this.getLayoutInflater(), 0x7f0d048b, p1, false);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ForwardGridSectionFragment.class, "35")) {
          return;
       }
       super.onDestroy();
       if (this.Y != null && this.X != null) {
          Iterator iterator = this.Th().iterator();
          while (iterator.hasNext()) {
             iterator.next().cancel();
          }
       }
       return;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, ForwardGridSectionFragment.class, "36")) {
          return;
       }
       super.onDetach();
       ForwardGridSectionFragment.V0 = false;
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionFragment.class, "34")) {
          return;
       }
       a.p(p0, "dialog");
       this.R.a(this, this.P);
       super.onDismiss(p0);
       return;
    }
    public void onStart(){
       GradientDrawable gradientDraw;
       int i1;
       int i8;
       float[] uofloatArray;
       int i10;
       Object[] objArray1;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, ForwardGridSectionFragment.class, "9")) {
          return;
       }
       super.onStart();
       View view = obj.B.getView();
       view = (view != null)? view.findViewById(R.id.forward_panel_background): objArray;
       ShareInitResponse$ShareTheme shareTheme = obj.B.Vg();
       int i = 1;
       if (view != null) {
          ShareInitResponse$ShareTheme mPanel = shareTheme.mPanel;
          if (mPanel != null && (mPanel.mBackgroundColour != null || mPanel.mCornerRadius.intValue() > 0)) {
             try{
                gradientDraw = new GradientDrawable();
                ShareInitResponse$ThemeElement mBackgroundC = shareTheme.mPanel.mBackgroundColour;
                if (mBackgroundC == null) {
                   mBackgroundC = "";
                }
                i1 = Color.parseColor(mBackgroundC);
             }catch(java.lang.Exception e0){
                i1 = a1.a(R.color.arg_RES_7f060094);
             }
             ShareInitResponse$ThemeElement mCornerRadiu = shareTheme.mPanel.mCornerRadius;
             int i2 = 0;
             int i3 = (mCornerRadiu != null)? mCornerRadiu.intValue(): 0;
             float f = (float)a1.e((float)i3);
             gradientDraw.setColor(i1);
             int i4 = 7;
             int i5 = 6;
             int i6 = 5;
             int i7 = 4;
             i8 = 3;
             int i9 = 8;
             if (!this.bi()) {
                if (this.ai()) {
                   uofloatArray = new float[i9];
                   uofloatArray[i2] = 0;
                   uofloatArray[i] = 0;
                   uofloatArray[2] = 0;
                   uofloatArray[i8] = 0;
                   uofloatArray[i7] = f;
                   uofloatArray[i6] = f;
                   uofloatArray[i5] = f;
                   uofloatArray[i4] = f;
                }else {
                   uofloatArray = new float[i9];
                   uofloatArray[i2] = f;
                   uofloatArray[i] = f;
                   uofloatArray[2] = f;
                   uofloatArray[i8] = f;
                   uofloatArray[i7] = 0;
                   uofloatArray[i6] = 0;
                   uofloatArray[i5] = 0;
                   uofloatArray[i4] = 0;
                }
             }else {
                uofloatArray = new float[i9];
                uofloatArray[i2] = f;
                uofloatArray[i] = f;
                uofloatArray[2] = f;
                uofloatArray[i8] = f;
                uofloatArray[i7] = f;
                uofloatArray[i6] = f;
                uofloatArray[i5] = f;
                uofloatArray[i4] = f;
             }
             gradientDraw.setCornerRadii(uofloatArray);
             view.setBackground(gradientDraw);
          }
       }
       view = e0.B.getView();
       View view1 = (view != null)? view.findViewById(0x7f0a0fdf): null;
       if (view1 != null) {
          ShareInitResponse$ShareTheme mPanel1 = shareTheme.mPanel;
          if (mPanel1 != null) {
             ShareInitResponse$ThemeElement mCornerRadiu1 = mPanel1.mCornerRadius;
             if (mCornerRadiu1 != null) {
                i10 = a1.e((float)mCornerRadiu1.intValue());
             label_00ed :
                float f1 = (float)i10;
                float f2 = (float)a1.d(0x7f070409);
                float f3 = (float)a1.d(0x7f07040a);
                if (this.ai()) {
                   f3 = - f3;
                }
                float f4 = f3;
                i8 = a1.a(R.color.arg_RES_7f061ea5);
                view1.setCornerRadius((f1 + (float)i));
                if (!PatchProxy.isSupport(ShadowContainerLayout.class) || !PatchProxy.applyVoidFourRefs(Float.valueOf(f2), Float.valueOf(0), Float.valueOf(f4), Integer.valueOf(i8), view1, ShadowContainerLayout.class, "2")) {
                   view1.c.setShadowLayer(f2, 0, f4, i8);
                   view1.invalidate();
                }
             }
          }
          i10 = a1.d(R.dimen.arg_RES_7f070408);
          goto label_00ed ;
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ForwardGridSectionFragment.class, "6")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.U = this.getResources().getDimension(0x7f070ca1) * 0x3fc00000;
       e uoe = this.getChildFragmentManager().beginTransaction();
       uoe.f(R.id.share_panel, this.B);
       uoe.l();
       p0.setOnClickListener(new ForwardGridSectionFragment$g(this));
       ForwardGridSectionFragment tB = this.B;
       tB.e = true;
       RecyclerView$n on = null;
       tB.d = on;
       if (!PatchProxy.applyVoid(on, this, ForwardGridSectionFragment.class, "8")) {
          Dialog dialog1 = this.getDialog();
          if (dialog1 != null) {
             Window window1 = dialog1.getWindow();
             if (window1 != null) {
                window1.setWindowAnimations(R.style.arg_RES_7f1103dc);
             }
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionFragment.class, "7")) {
          j0 oj0 = new j0(this, p0);
          if (!this.ei(p0, oj0) && !ForwardGridSectionFragment.U0) {
             if (this.ai()) {
                p0.getViewTreeObserver().addOnPreDrawListener(new h(p0, 300, oj0));
             }else {
                f.g(p0, 132, oj0);
             }
          }
       }
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             window.setDimAmount(0.20f);
          }
       }
       return;
    }
    public void r3(PosterConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionFragment.class, "17")) {
          return;
       }
       a.p(p0, "posterConfig");
       this.B.p = p0;
       return;
    }
    public void show(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ForwardGridSectionFragment.class, "4")) {
          return;
       }
       ForwardGridSectionFragment tA = this.A;
       ForwardGridSectionFragment tI = this.I;
       Objects.requireNonNull(tA);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(tI), this, tA, uoa, "1")) {
          a.p(this, "fragment");
          if (tA.a != null) {
             u1.R("B526435", "SHOW "+System.currentTimeMillis()+' '+ForwardGridSectionFragment.W0.a()+", "+tI+", "+this.isAdded(), 13);
          }
       }
       int i = 0;
       if (ForwardGridSectionFragment.V0) {
          objArray = new Object[i];
          b.C().w("ShareDebugLog", "ForwardGridSectionFragment cannot show because isHasShowing", objArray);
          return;
       }else if(this.I != null){
          tA = this.V;
          if (tA == null) {
             a.S("activity");
          }
          this.Cb(tA.getSupportFragmentManager(), "");
          Dialog obj = PatchProxy.apply(objArray, this, ForwardGridSectionFragment.class, "27");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = this.getDialog();
             b = (obj != null && (obj.isShowing() && !this.isRemoving()))? true: false;
          }
          ForwardGridSectionFragment.V0 = b;
          Object[] objArray1 = new Object[i];
          b.C().w("ShareDebugLog", "ForwardGridSectionFragment isDialogShowing\(\)"+ForwardGridSectionFragment.V0, objArray1);
       }
       this.R.d(this);
       tA = this.N;
       if (tA != null) {
          tA.a(this);
       }
       return;
    }
    public void v8(i0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionFragment.class, "21")) {
          return;
       }
       if (p0 != null) {
          this.B.v = p0;
       }
       return;
    }
}
