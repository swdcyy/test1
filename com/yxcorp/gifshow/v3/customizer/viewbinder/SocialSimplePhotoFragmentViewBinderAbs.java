package com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsDisableNormalPublishPhotoFragmentViewBinder;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$a;
import nsd.u;
import lnc.a1;
import c35.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import crd.a;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$c;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$p;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$j;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$i;
import com.kwai.feature.post.api.feature.bridge.GoToPostFinishEventResult$FileAndType;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import uwc.c;
import androidx.lifecycle.ViewModel;
import rwc.j;
import uwc.a;
import faa.a;
import q87.c;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.StringBuilder;
import java.lang.System;
import qkd.b;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import kotlin.Pair;
import java.lang.Boolean;
import lwc.h;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import hba.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Text;
import com.kuaishou.edit.draft.StickerResult;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.CharSequence;
import android.text.TextUtils;
import j80.f;
import java.lang.Float;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.SerialArg;
import com.kuaishou.android.post.SimpleEditParam;
import com.kuaishou.android.post.PostPageArg;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import android.content.Intent;
import android.app.Activity;
import kotlin.jvm.internal.Ref$ObjectRef;
import uxb.s;
import uxb.l;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$k;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$l;
import erd.o;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$m;
import erd.a;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$n;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$o;
import erd.g;
import crd.b;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.view.View;
import com.yxcorp.gifshow.widget.PressedImageView;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$q;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$r;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.widget.FlexScreenStatusData;
import toc.d;
import com.yxcorp.gifshow.v3.customizer.preview.EditorPreviewContainerLayout;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsPhotoFragmentV3ViewBinder;
import android.graphics.RectF;
import java.util.List;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.util.Collection;
import com.kuaishou.edit.draft.Asset$ShootInfo$Resolution;
import com.yxcorp.gifshow.v3.customizer.preview.BaseEditorPreviewContainerLayout;
import androidx.lifecycle.MutableLiveData;
import uwc.b;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$b;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import xvc.b;
import com.kuaishou.viewbinder.BaseViewBinder;
import lnc.r5;
import com.kuaishou.krn.event.a;
import oj0.a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import androidx.lifecycle.LifecycleOwner;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import com.yxcorp.gifshow.v3.f;
import nwc.e;
import com.yxcorp.gifshow.v3.previewer.listener.EditorFragmentBackPressedPriorityEnum;
import nwc.a;
import com.kuaishou.android.post.EditAbilityConfig;
import w46.b;
import trd.y;
import com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder;
import kotlin.Triple;
import com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder$a;
import com.yxcorp.gifshow.model.RectInfo;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$d;
import android.view.ViewOutlineProvider;
import android.widget.RelativeLayout$LayoutParams;
import kotlin.collections.CollectionsKt___CollectionsKt;
import android.content.Context;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import uoc.i;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import lnc.s6;
import com.yxcorp.gifshow.widget.textview.TextImageView;
import android.graphics.Typeface;
import com.yxcorp.gifshow.music.widget.PressedAlphaLinearLayout;
import uoc.l;
import java.lang.Number;
import uoc.j;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$e;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$f;
import java.lang.Integer;
import com.kwai.feature.post.api.feature.bridge.JsGoToPostParam;
import com.kwai.feature.post.api.feature.bridge.GoToPostValue;
import uoc.k;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$g;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$h;
import wba.h0;
import com.yxcorp.gifshow.edit.previewer.utils.StickerTextValueType;
import lnc.z2;
import lnc.o6;

public final class SocialSimplePhotoFragmentViewBinderAbs extends AbsDisableNormalPublishPhotoFragmentViewBinder	// class@000d8a
{
    public boolean A;
    public FrameLayout B;
    public KwaiImageView C;
    public PressedImageView D;
    public LinearLayout E;
    public View F;
    public LinearLayout G;
    public LinearLayout H;
    public LinearLayout I;
    public TextView J;
    public View K;
    public final ArrayList L;
    public Bitmap M;
    public Bitmap N;
    public final ArrayList O;
    public GifshowActivity P;
    public final ArrayList Q;
    public final a R;
    public AttrAnimProgressFragment S;
    public boolean T;
    public boolean U;
    public RectInfo U0;
    public double V;
    public ValueAnimator V0;
    public ArrayList W;
    public Bitmap W0;
    public String X;
    public float X0;
    public String Y;
    public float Y0;
    public RectInfo Z;
    public final a Z0;
    public final a a1;
    public final SocialSimplePhotoFragmentViewBinderAbs$j b1;
    public final SocialSimplePhotoFragmentViewBinderAbs$i c1;
    public static final int A1;
    public static final int B1;
    public static final int C1;
    public static final int D1;
    public static final int E1;
    public static final int F1;
    public static final int G1;
    public static final int H1;
    public static final int I1;
    public static final SocialSimplePhotoFragmentViewBinderAbs$a J1;
    public static final int d1;
    public static final int e1;
    public static final int f1;
    public static final int g1;
    public static final int h1;
    public static final int i1;
    public static final int j1;
    public static final int k1;
    public static final int l1;
    public static final int m1;
    public static final int n1;
    public static final int o1;
    public static final int p1;
    public static final int q1;
    public static final int r1;
    public static final int s1;
    public static final int t1;
    public static final int u1;
    public static final int v1;
    public static final int w1;
    public static final int x1;
    public static final int y1;
    public static final int z1;

    static {
       SocialSimplePhotoFragmentViewBinderAbs.J1 = new SocialSimplePhotoFragmentViewBinderAbs$a(null);
       SocialSimplePhotoFragmentViewBinderAbs.d1 = a1.e(80.00f);
       SocialSimplePhotoFragmentViewBinderAbs.e1 = a1.e(32.00f);
       SocialSimplePhotoFragmentViewBinderAbs.f1 = a1.e(20.00f);
       SocialSimplePhotoFragmentViewBinderAbs.g1 = a1.e(20.00f);
       SocialSimplePhotoFragmentViewBinderAbs.h1 = a1.e(48.00f);
       SocialSimplePhotoFragmentViewBinderAbs.i1 = a1.e(4.00f);
       SocialSimplePhotoFragmentViewBinderAbs.j1 = a1.e(68.00f);
       SocialSimplePhotoFragmentViewBinderAbs.k1 = a1.e(4.00f);
       SocialSimplePhotoFragmentViewBinderAbs.l1 = a1.e(16.00f);
       SocialSimplePhotoFragmentViewBinderAbs.m1 = a1.e(7.00f);
       SocialSimplePhotoFragmentViewBinderAbs.n1 = a1.e(32.00f);
       SocialSimplePhotoFragmentViewBinderAbs.o1 = a1.e(2.00f);
       SocialSimplePhotoFragmentViewBinderAbs.p1 = a1.e(24.00f);
       SocialSimplePhotoFragmentViewBinderAbs.q1 = a1.e(18.00f);
       SocialSimplePhotoFragmentViewBinderAbs.r1 = a1.e(14.00f);
       SocialSimplePhotoFragmentViewBinderAbs.s1 = a1.e(34.00f);
       SocialSimplePhotoFragmentViewBinderAbs.t1 = a1.e(16.00f);
       SocialSimplePhotoFragmentViewBinderAbs.u1 = a1.e(4.00f);
       SocialSimplePhotoFragmentViewBinderAbs.v1 = a1.e(8.00f);
       SocialSimplePhotoFragmentViewBinderAbs.w1 = a1.e(35.00f);
       SocialSimplePhotoFragmentViewBinderAbs.x1 = a1.e(16.00f);
       SocialSimplePhotoFragmentViewBinderAbs.y1 = a1.e(116.00f);
       SocialSimplePhotoFragmentViewBinderAbs.z1 = a1.e(40.00f);
       SocialSimplePhotoFragmentViewBinderAbs.A1 = a1.e(56.00f);
       SocialSimplePhotoFragmentViewBinderAbs.B1 = a1.e(16.00f);
       SocialSimplePhotoFragmentViewBinderAbs.C1 = a1.e(4.00f);
       SocialSimplePhotoFragmentViewBinderAbs.D1 = a1.e(40.00f);
       SocialSimplePhotoFragmentViewBinderAbs.E1 = a1.e(40.00f);
       SocialSimplePhotoFragmentViewBinderAbs.F1 = a1.e(16.00f);
       SocialSimplePhotoFragmentViewBinderAbs.G1 = a1.e(200.00f);
       SocialSimplePhotoFragmentViewBinderAbs.H1 = a1.e(0x42f00000);
       SocialSimplePhotoFragmentViewBinderAbs.I1 = a1.e(8.00f);
    }
    public void SocialSimplePhotoFragmentViewBinderAbs(c p0){
       a.p(p0, "viewHost");
       super(p0);
       this.L = new ArrayList();
       this.O = new ArrayList();
       this.Q = new ArrayList();
       this.R = new a();
       this.W = new ArrayList();
       this.X0 = 0xbf800000;
       this.Y0 = 0xbf800000;
       this.Z0 = new SocialSimplePhotoFragmentViewBinderAbs$c(this);
       this.a1 = new SocialSimplePhotoFragmentViewBinderAbs$p(this);
       this.b1 = new SocialSimplePhotoFragmentViewBinderAbs$j(this);
       this.c1 = new SocialSimplePhotoFragmentViewBinderAbs$i(this);
    }
    public static GoToPostFinishEventResult$FileAndType A0(SocialSimplePhotoFragmentViewBinderAbs p0,String p1,int p2,Object p3){
       return p0.z0(null);
    }
    public static GoToPostFinishEventResult$FileAndType D0(SocialSimplePhotoFragmentViewBinderAbs p0,String p1,int p2,Object p3){
       return p0.C0(null);
    }
    public static void I0(SocialSimplePhotoFragmentViewBinderAbs p0,boolean p1,boolean p2,int p3,Object p4){
       if (p3 & 0x01) {
          p1 = true;
       }
       if (p3 & 0x02) {
          p2 = true;
       }
       p0.H0(p1, p2);
       return;
    }
    public static final GifshowActivity t0(SocialSimplePhotoFragmentViewBinderAbs p0){
       p0 = p0.P;
       if (p0 == null) {
          a.S("mActivity");
       }
       return p0;
    }
    public final EditorDelegate B0(){
       Object[] objArray1;
       Object[] objArray = null;
       BaseEditorFragment obj = PatchProxy.apply(objArray, this, SocialSimplePhotoFragmentViewBinderAbs.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (this.A() != null) {
          obj = this.A();
          a.m(obj);
          ViewModel viewModel = ViewModelProviders.of(obj).get(c.class);
          a.o(viewModel, "ViewModelProviders.of\(ge¡­wV3ViewModel::class.java\)");
          j oj = viewModel.r0();
          a.o(oj, "viewModel.editorDelegateRef");
          EditorDelegate value = oj.getValue();
          if (value != null) {
             objArray = value;
          }else {
             objArray1 = new Object[i];
             a.D().A("SocialSimplePhotoFragmentViewBinderAbs", "textButtonContainerLayout click, editorDelegate is null", objArray1);
          }
       }else {
          objArray1 = new Object[i];
          a.D().A("SocialSimplePhotoFragmentViewBinderAbs", "textButtonContainerLayout click, fragment is null", objArray1);
       }
       return objArray;
    }
    public final GoToPostFinishEventResult$FileAndType C0(String p0){
       GoToPostFinishEventResult$FileAndType uFileAndType;
       String obj = PatchProxy.applyOneRefs(p0, this, SocialSimplePhotoFragmentViewBinderAbs.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(PostUtils.f(), "SMALL_IMAGE"+System.currentTimeMillis()).getAbsolutePath();
       if (p0 != null) {
          b.g(new File(p0), new File(obj));
          return new GoToPostFinishEventResult$FileAndType(obj, "FOREGROUND_IMAGE");
       }else {
          SocialSimplePhotoFragmentViewBinderAbs tM = this.M;
          if (tM != null) {
             BitmapUtil.M(tM, obj, DraftFileManager.l);
             uFileAndType = new GoToPostFinishEventResult$FileAndType(obj, "FOREGROUND_IMAGE");
          }else {
             uFileAndType = null;
          }
          return uFileAndType;
       }
    }
    public final Pair E0(boolean p0){
       a obj;
       SocialSimplePhotoFragmentViewBinderAbs socialSimple = SocialSimplePhotoFragmentViewBinderAbs.class;
       if (PatchProxy.isSupport(socialSimple)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, socialSimple, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.D().G0().W0();
       File uFile = null;
       if (obj != null && obj.v() != null) {
          Text text = obj.v();
          a.m(text);
          String str = "textDraft.firstMessage!!";
          a.o(text, str);
          if (text.getResult() != null) {
             Text text1 = obj.v();
             a.m(text1);
             a.o(text1, str);
             StickerResult result = text1.getResult();
             EditDecorationContainerViewV2 uEditDecorat = this.E();
             DecorationDrawer topDecoratio = (uEditDecorat != null)? uEditDecorat.getTopDecorationDrawer(): uFile;
             String outputFilePa = (topDecoratio != null)? topDecoratio.getOutputFilePath(): uFile;
             int i = 0;
             Object[] objArray = new Object[i];
             a.D().w("SocialSimplePhotoFragmentViewBinderAbs", "getTextInfo textFilePath: "+outputFilePa, objArray);
             if (!TextUtils.isEmpty(outputFilePa)) {
                a.m(outputFilePa);
                if (f.e(outputFilePa)) {
                   Bitmap uBitmap = BitmapUtil.q(new File(outputFilePa));
                   a.o(result, "result");
                   float centerX = result.getCenterX();
                   float centerY = result.getCenterY();
                   Object[] objArray1 = new Object[i];
                   a.D().w("SocialSimplePhotoFragmentViewBinderAbs", "getTextInfo update: "+p0+", centerXTp: "+centerX+", "+"centerYTp:"+centerY, objArray1);
                   if (p0) {
                      this.W0 = uBitmap;
                      this.X0 = centerX;
                      this.Y0 = centerY;
                   }
                   return new Pair(uBitmap, new Pair(Float.valueOf(centerX), Float.valueOf(centerY)));
                }
             }
          }
       }
    label_00f4 :
       return uFile;
    }
    public final boolean F0(){
       SimpleEditParam obj = PatchProxy.apply(null, this, SocialSimplePhotoFragmentViewBinderAbs.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       SimpleEditParam dEFAULT = SimpleEditParam.DEFAULT;
       a.o(dEFAULT, "DEFAULT");
       obj = i.g().getSimpleEditParam().get(dEFAULT).mSubBiz;
       Object[] objArray = new Object[0];
       a.D().w("SocialSimplePhotoFragmentViewBinderAbs", "isTieTie subbiz:"+obj, objArray);
       return a.g(obj, "SOCIAL_TIETIE_PICTURE");
    }
    public final void G0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SocialSimplePhotoFragmentViewBinderAbs.class, "6")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("SocialSimplePhotoFragmentViewBinderAbs", "reshoot", objArray1);
       SocialSimplePhotoFragmentViewBinderAbs$a j1 = SocialSimplePhotoFragmentViewBinderAbs.J1;
       Objects.requireNonNull(j1);
       if (!PatchProxy.applyVoid(objArray, j1, SocialSimplePhotoFragmentViewBinderAbs$a.class, "4")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLICK_RESHOOT";
          u1.B(new ClickMetaData().setElementPackage(uElementPack).setType(1));
       }
       Intent intent = new Intent();
       SocialSimplePhotoFragmentViewBinderAbs tP = this.P;
       if (tP == null) {
          a.S("mActivity");
       }
       tP.setResult(-1, intent);
       SocialSimplePhotoFragmentViewBinderAbs tP1 = this.P;
       if (tP1 == null) {
          a.S("mActivity");
       }
       tP1.finish();
       return;
    }
    public final void H0(boolean p0,boolean p1){
       t ot;
       z a;
       SocialSimplePhotoFragmentViewBinderAbs socialSimple = SocialSimplePhotoFragmentViewBinderAbs.class;
       if (PatchProxy.isSupport(socialSimple) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, socialSimple, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("SocialSimplePhotoFragmentViewBinderAbs", "saveToAlbum showToast:"+p0, objArray);
       if (this.U != null) {
          Object[] objArray1 = new Object[0];
          a.D().w("SocialSimplePhotoFragmentViewBinderAbs", "saveToAlbum saving return", objArray1);
          return;
       }else {
          this.M0();
          this.U = true;
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          SocialSimplePhotoFragmentViewBinderAbs tN = this.N;
          a.m(tN);
          objectRef.element = Bitmap.createBitmap(tN);
          if (p1) {
             c uoc = this.G();
             Objects.requireNonNull(uoc, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment");
             ot = l.j().Ld(uoc, 0);
          }else {
             ot = t.fromCallable(SocialSimplePhotoFragmentViewBinderAbs$k.b);
          }
          a = d.a;
          ot = ot.map(new SocialSimplePhotoFragmentViewBinderAbs$l(this, objectRef)).subscribeOn(a).observeOn(a);
          t ot1 = ot.doOnTerminate(new SocialSimplePhotoFragmentViewBinderAbs$m(this, p0));
          ot1.subscribe(new SocialSimplePhotoFragmentViewBinderAbs$n(this), SocialSimplePhotoFragmentViewBinderAbs$o.b);
          return;
       }
    }
    public final void J0(float p0){
       SocialSimplePhotoFragmentViewBinderAbs socialSimple = SocialSimplePhotoFragmentViewBinderAbs.class;
       if (PatchProxy.isSupport(socialSimple) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, socialSimple, "3")) {
          return;
       }
       socialSimple = this.H;
       if (socialSimple != null) {
          socialSimple.setAlpha(p0);
       }
       socialSimple = this.I;
       if (socialSimple != null) {
          socialSimple.setAlpha(p0);
       }
       socialSimple = this.D;
       if (socialSimple != null) {
          socialSimple.setAlpha(p0);
       }
       socialSimple = this.G;
       if (socialSimple != null) {
          socialSimple.setAlpha(p0);
       }
       socialSimple = this.E;
       if (socialSimple != null) {
          socialSimple.setAlpha(p0);
       }
       socialSimple = this.K;
       if (socialSimple != null) {
          socialSimple.setAlpha(p0);
       }
       socialSimple = this.F;
       if (socialSimple != null) {
          socialSimple.setAlpha(p0);
       }
       return;
    }
    public final void K0(boolean p0){
       SocialSimplePhotoFragmentViewBinderAbs socialSimple = SocialSimplePhotoFragmentViewBinderAbs.class;
       if (PatchProxy.isSupport(socialSimple) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, socialSimple, "4")) {
          return;
       }
       float f = (p0)? 0x3f800000: 0;
       this.J0(f);
       socialSimple = this.H;
       if (socialSimple != null) {
          socialSimple.setEnabled(p0);
       }
       socialSimple = this.I;
       if (socialSimple != null) {
          socialSimple.setEnabled(p0);
       }
       socialSimple = this.D;
       if (socialSimple != null) {
          socialSimple.setEnabled(p0);
       }
       socialSimple = this.G;
       if (socialSimple != null) {
          socialSimple.setEnabled(p0);
       }
       socialSimple = this.E;
       if (socialSimple != null) {
          socialSimple.setClickable(p0);
       }
       return;
    }
    public final void L0(boolean p0){
       SocialSimplePhotoFragmentViewBinderAbs socialSimple = SocialSimplePhotoFragmentViewBinderAbs.class;
       if (PatchProxy.isSupport(socialSimple) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, socialSimple, "1")) {
          return;
       }
       SocialSimplePhotoFragmentViewBinderAbs tP = this.P;
       if (tP == null) {
          a.S("mActivity");
       }
       this.K = tP.findViewById(0x7f0a0cc0);
       int i = 0;
       int i1 = (p0)? 0: 0x3f800000;
       if (p0) {
          i = 0x3f800000;
       }
       float f = (p0)? 0x3fc00000: 2.50f;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, socialSimple, "2")) {
          socialSimple = this.V0;
          if (socialSimple != null) {
             socialSimple.cancel();
          }
          this.V0 = objArray;
       }
       float[] uofloatArray = new float[]{i1,i};
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray).setDuration(300);
       this.V0 = valueAnimato;
       if (valueAnimato != null) {
          valueAnimato.setInterpolator(new DecelerateInterpolator(f));
          valueAnimato.addUpdateListener(new SocialSimplePhotoFragmentViewBinderAbs$q(this, f, p0));
          valueAnimato.addListener(new SocialSimplePhotoFragmentViewBinderAbs$r(this, f, p0));
          valueAnimato.start();
       }
       return;
    }
    public final void M0(){
       if (PatchProxy.applyVoid(null, this, SocialSimplePhotoFragmentViewBinderAbs.class, "25")) {
          return;
       }
       this.T = true;
       AttrAnimProgressFragment uAttrAnimPro = new AttrAnimProgressFragment();
       this.S = uAttrAnimPro;
       uAttrAnimPro.setCancelable(false);
       SocialSimplePhotoFragmentViewBinderAbs tS = this.S;
       if (tS != null) {
          SocialSimplePhotoFragmentViewBinderAbs tP = this.P;
          if (tP == null) {
             a.S("mActivity");
          }
          tS.show(tP.getSupportFragmentManager(), "SocialSimplePhotoFragmentViewBinderAbs");
       }
       return;
    }
    public void S(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SocialSimplePhotoFragmentViewBinderAbs.class, "14")) {
          return;
       }
       FlexScreenStatusData uFlexScreenS = this.B();
       d uod = this.d0();
       RectF limitRect = this.h0().getLimitRect();
       List list = this.D().w0();
       ArrayList uArrayList = new ArrayList(u.Y(list, 10));
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          Size size = iterator.next();
          float f = (float)size.b * 0x3f800000;
          f = f / (float)size.c;
          uArrayList.add(Float.valueOf(f));
       }
       this.h0().setOriginLayoutRect(uod.b(uFlexScreenS, limitRect, uArrayList, Asset$ShootInfo$Resolution.NONE));
       BaseEditorPreviewContainerLayout.e(this.h0(), false, false, 2, objArray);
       this.D().A0().setValue(this.h0().getOriginLayoutRect());
       return;
    }
    public void U(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialSimplePhotoFragmentViewBinderAbs.class, "12")) {
          return;
       }
       a.p(p0, "editPicturesViewModel");
       super.U(p0);
       p0 = this.C();
       if (p0 != null) {
          p0.S0();
       }
       return;
    }
    public d d0(){
       Object obj = PatchProxy.apply(null, this, SocialSimplePhotoFragmentViewBinderAbs.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SocialSimplePhotoFragmentViewBinderAbs$b(this);
    }
    public void l0(RectF p0,RectF p1,RectF p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, SocialSimplePhotoFragmentViewBinderAbs.class, "13")) {
          return;
       }
       a.p(p0, "limitRect");
       a.p(p1, "originLayoutRect");
       a.p(p2, "customTransformRect");
       super.l0(p0, p1, p2);
       EditDecorationContainerViewV2 uEditDecorat = this.E();
       if (uEditDecorat != null) {
          ViewGroup$LayoutParams layoutParams = this.h0().getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          uEditDecorat.setLayoutParams(layoutParams);
          EditorDelegate uEditorDeleg = this.B0();
          if (uEditorDeleg != null) {
             int i1 = SocialSimplePhotoFragmentViewBinderAbs.I1;
             float f = (float)2;
             float f1 = (float)i1;
             l.j().K0(uEditorDeleg, l.j().Dz(new RectF(f1, (((float)uEditDecorat.getLayoutParams().height - ((float)uEditDecorat.getLayoutParams().width - ((float)i1 * f))) / f), (float)i1, (((float)uEditDecorat.getLayoutParams().height - ((float)uEditDecorat.getLayoutParams().width - ((float)i1 * f))) / f))));
          }
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, SocialSimplePhotoFragmentViewBinderAbs.class, "17")) {
          return;
       }
       super.onDestroy();
       Iterator iterator = this.O.iterator();
       while (iterator.hasNext()) {
          r5.b().d(iterator.next());
       }
       a.b().c("SocialIntimateFriendsSelectionResult", this.a1);
       EditDecorationContainerViewV2 uEditDecorat = this.E();
       if (uEditDecorat != null) {
          List animationSta = uEditDecorat.getAnimationStartCallbacks();
          if (animationSta != null) {
             animationSta.remove(this.b1);
          }
       }
       uEditDecorat = this.E();
       if (uEditDecorat != null) {
          uEditDecorat.M(this.c1);
       }
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialSimplePhotoFragmentViewBinderAbs.class, "16")) {
          return;
       }
       a.p(p0, "owner");
       super.onResume(p0);
       if (!this.y0()) {
          c uoc = this.G();
          Objects.requireNonNull(uoc, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment");
          a uoa = f.h(uoc);
          a.o(uoa, "EditUtils.getBaseEditPre¡­tosEditPreviewV3Fragment\)");
          uoa.s0().a(EditorFragmentBackPressedPriorityEnum.SOCIAL_SIMPLE_PHOTO, this.Z0);
       }
       return;
    }
    public void s(View p0){
       int b2;
       SocialSimplePhotoFragmentViewBinderAbs z;
       RectInfo rectInfo;
       String obj2;
       String obj4;
       String str1;
       String str2;
       SocialSimpleEditorActivityViewBinder$a uoa;
       RectF rectF;
       int obj2;
       int i1;
       String str3;
       Object[] objArray1;
       ViewGroup$MarginLayoutParams marginLayout1;
       TextImageView textImageVie;
       KwaiImageView second;
       boolean b = this;
       String obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SocialSimplePhotoFragmentViewBinderAbs socialSimple = SocialSimplePhotoFragmentViewBinderAbs.class;
       if (PatchProxy.applyVoidOneRefs(obj, b, socialSimple, "5")) {
          return;
       }
       a.p(obj, "rootView");
       super.s(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("SocialSimplePhotoFragmentViewBinderAbs", "bindView", objArray);
       SocialSimplePhotoFragmentViewBinderAbs PressedAlphaLinearLayout obj1 = PatchProxy.apply(null, b, socialSimple, "11");
       boolean b1 = true;
       if (obj1 != patchProxyRe) {
          b2 = obj1.booleanValue();
       }else {
          b.A = b1;
          c uoc = this.G();
          Objects.requireNonNull(uoc, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.BaseEditorFragment");
          FragmentActivity uFragmentAct = uoc.jh();
          Objects.requireNonNull(uFragmentAct, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          b.P = uFragmentAct;
          if (!EditAbilityConfig.photosInMemory(i.g())) {
             objArray = new Object[i];
             a.D().t("SocialSimplePhotoFragmentViewBinderAbs", "bindView no photo in memory", objArray);
          }else {
             obj1 = b.O;
             z = b.P;
             if (z == null) {
                a.S("mActivity");
             }
             String[] stringArrayE = z.getIntent().getStringArrayExtra("PHOTOS");
             if (stringArrayE == null) {
                stringArrayE = new String[i];
             }
             y.s0(obj1, stringArrayE);
             if (b.O.isEmpty()) {
                objArray = new Object[i];
                a.D().t("SocialSimplePhotoFragmentViewBinderAbs", "bindView no photo keys in memory", objArray);
             }else {
                Iterator iterator1 = b.O.iterator();
                while (iterator1.hasNext()) {
                   Bitmap uBitmap = r5.b().a(iterator1.next(), Bitmap.class);
                   if (uBitmap == null) {
                      objArray1 = new Object[i];
                      a.D().t("SocialSimplePhotoFragmentViewBinderAbs", "bindView bitmap is null", objArray1);
                   }else {
                      b.L.add(uBitmap);
                   }
                }
                if (b.L.isEmpty()) {
                   objArray = new Object[i];
                   a.D().t("SocialSimplePhotoFragmentViewBinderAbs", "bindView no bitmap in memory", objArray);
                }else {
                   b.A = i;
                   b2 = true;
                }
             }
          }
          b2 = false;
       }
       if (!b2) {
          obj1 = b.P;
          if (obj1 == null) {
             a.S("mActivity");
          }
          obj1.finish();
          return;
       }else {
          SocialSimpleEditorActivityViewBinder$a k = SocialSimpleEditorActivityViewBinder.K;
          obj1 = b.P;
          if (obj1 == null) {
             a.S("mActivity");
          }
          Triple triple = k.b(obj1);
          if (triple == null) {
             objArray = new Object[i];
             a.D().t("SocialSimplePhotoFragmentViewBinderAbs", "bindView no splash memory", objArray);
             obj1 = b.P;
             if (obj1 == null) {
                a.S("mActivity");
             }
             obj1.finish();
             return;
          }else {
             b.Z = triple.getFirst().getSecond();
             TextView textView = obj.findViewById(R.id.text_tip);
             if (textView != null) {
                textView.setVisibility(8);
             }
             RecyclerView recyclerView = this.s0();
             if (recyclerView != null) {
                recyclerView.setVisibility(4);
             }
             recyclerView = this.s0();
             if (recyclerView != null) {
                recyclerView.setEnabled(i);
             }
             this.h0().setOutlineProvider(new SocialSimplePhotoFragmentViewBinderAbs$d(b));
             ViewGroup$LayoutParams layoutParams = this.h0().getLayoutParams();
             Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
             layoutParams.addRule(13, i);
             this.h0().setClipToOutline(b1);
             z = b.Z;
             a.m(z);
             RectF tarRect = z.getTargetRect();
             String str = "bigImageRectInfo!!.targetRect";
             a.o(tarRect, str);
             this.h0().setOriginLayoutRect(tarRect);
             this.h0().d(i, i);
             b.N = b.L.get(i);
             if (b.L.size() >= 2) {
                SocialSimplePhotoFragmentViewBinderAbs$a j1 = SocialSimplePhotoFragmentViewBinderAbs.J1;
                z = b.P;
                if (z == null) {
                   a.S("mActivity");
                }
                rectInfo = j1.a(z);
                if (rectInfo != null) {
                   b.U0 = rectInfo;
                   obj2 = CollectionsKt___CollectionsKt.Y2(b.L);
                   b.M = obj2;
                   Object obj3 = obj;
                   a.m(obj2);
                   obj4 = obj2;
                   Object obj5 = obj2;
                   RectInfo rectInfo1 = rectInfo;
                   str1 = 2;
                   if (PatchProxy.applyVoidThreeRefs(rectInfo, obj3, obj4, this, SocialSimplePhotoFragmentViewBinderAbs.class, "20")) {
                      str2 = str;
                      uoa = k;
                   }else {
                      Context context = obj3.getContext();
                      a.o(context, "parentView.context");
                      str2 = str;
                      uoa = k;
                      Triple triple1 = k.a(rectInfo1, context, obj3, obj5, k.c());
                      b.B = triple1.getFirst();
                      second = triple1.getSecond();
                      b.C = second;
                      if (second != null) {
                         second.setOnClickListener(new i(b));
                      }
                   }
                }else {
                label_0216 :
                   str2 = str;
                   uoa = k;
                   str1 = 2;
                }
             }else {
                goto label_0216 ;
             }
             EditDecorationContainerViewV2 uEditDecorat = this.E();
             if (uEditDecorat != null) {
                List animationSta = uEditDecorat.getAnimationStartCallbacks();
                if (animationSta != null) {
                   animationSta.add(b.b1);
                }
             }
             uEditDecorat = this.E();
             if (uEditDecorat != null) {
                uEditDecorat.d(b.c1);
             }
             Pair first = triple.getFirst();
             Object obj6 = obj;
             obj4 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
             obj2 = "rectInfo.second.targetRect";
             if (!PatchProxy.applyVoidTwoRefs(first, obj6, b, socialSimple, "21")) {
                ImageView imageView1 = new ImageView(obj6.getContext());
                imageView1.setImageDrawable(a1.f(R.drawable.arg_RES_7f081c3e));
                marginLayout1 = new ViewGroup$MarginLayoutParams(SocialSimplePhotoFragmentViewBinderAbs.H1, SocialSimplePhotoFragmentViewBinderAbs.G1);
                marginLayout1.topMargin = i;
                marginLayout1.rightMargin = i;
                imageView1.setLayoutParams(marginLayout1);
                imageView1.setClickable(i);
                b.F = imageView1;
                imageView1 = new ImageView(obj6.getContext());
                imageView1.setImageDrawable(a1.f(R.drawable.arg_RES_7f081b86));
                imageView1.setPadding(SocialSimplePhotoFragmentViewBinderAbs.C1, SocialSimplePhotoFragmentViewBinderAbs.C1, SocialSimplePhotoFragmentViewBinderAbs.C1, SocialSimplePhotoFragmentViewBinderAbs.C1);
                imageView1.setLayoutParams(new ViewGroup$MarginLayoutParams(SocialSimplePhotoFragmentViewBinderAbs.D1, SocialSimplePhotoFragmentViewBinderAbs.D1));
                if (s6.m()) {
                   textImageVie = new TextImageView(obj6.getContext());
                   textImageVie.setStrokeSize(str1);
                   textImageVie.setStrokeColor(a1.a(R.color.arg_RES_7f0601aa));
                   textImageVie.setTypeface(Typeface.DEFAULT_BOLD);
                }else {
                   textImageVie = new TextView(obj6.getContext());
                   textImageVie.setShadowLayer(0x3f800000, 3.00f, 3.00f, a1.a(R.color.arg_RES_7f061c0f));
                }
                textImageVie.setLayoutParams(new ViewGroup$MarginLayoutParams(SocialSimplePhotoFragmentViewBinderAbs.E1, SocialSimplePhotoFragmentViewBinderAbs.F1));
                textImageVie.setGravity(17);
                textImageVie.setTextColor(a1.a(R.color.arg_RES_7f0620c7));
                textImageVie.setTextSize(i, (float)a1.d(R.dimen.arg_RES_7f070f6d));
                textImageVie.setText(a1.p(R.string.arg_RES_7f104c2a));
                RectF tarRect2 = first.getSecond().getTargetRect();
                a.o(tarRect2, obj2);
                PressedAlphaLinearLayout pressedAlpha = new PressedAlphaLinearLayout(obj6.getContext());
                pressedAlpha.setOrientation(1);
                pressedAlpha.addView(imageView1);
                pressedAlpha.addView(textImageVie);
                i1 = SocialSimplePhotoFragmentViewBinderAbs.z1;
                obj6.addView(pressedAlpha, new ViewGroup$MarginLayoutParams(i1, SocialSimplePhotoFragmentViewBinderAbs.A1));
                ViewGroup$LayoutParams layoutParams2 = pressedAlpha.getLayoutParams();
                Objects.requireNonNull(layoutParams2, obj4);
                float f2 = (float)SocialSimplePhotoFragmentViewBinderAbs.B1;
                layoutParams2.topMargin = (int)(tarRect2.top + f2);
                layoutParams2.leftMargin = (int)((tarRect2.right - f2) - (float)i1);
                pressedAlpha.setLayoutParams(layoutParams2);
                pressedAlpha.setOnClickListener(new l(b));
                b.E = pressedAlpha;
             }
             first = triple.getFirst();
             RelativeLayout$LayoutParams obj7 = PatchProxy.applyTwoRefs(first, obj6, b, socialSimple, "23");
             if (obj7 != patchProxyRe) {
                rectF = obj7;
             }else {
                tarRect = first.getSecond().getTargetRect();
                a.o(tarRect, obj2);
                b2 = first.getFirst().intValue();
                ViewGroup$MarginLayoutParams PressedImageView obj21 = new PressedImageView(obj6.getContext());
                obj21.setId(R.id.editor_tietie_publish_button);
                obj21.setVisibility(i);
                if (this.F0()) {
                   obj21.setImageDrawable(a1.f(R.drawable.arg_RES_7f081c56));
                }else {
                   obj21.setImageDrawable(a1.f(R.drawable.arg_RES_7f081c55));
                }
                int d1 = SocialSimplePhotoFragmentViewBinderAbs.d1;
                obj6.addView(obj21, new ViewGroup$MarginLayoutParams(d1, d1));
                ViewGroup$LayoutParams layoutParams1 = obj21.getLayoutParams();
                Objects.requireNonNull(layoutParams1, obj4);
                if (b2 == 3) {
                   layoutParams1.topMargin = (int)(tarRect.bottom + (float)SocialSimplePhotoFragmentViewBinderAbs.e1);
                }else if(b2 == 2){
                   layoutParams1.topMargin = (int)(tarRect.bottom + (float)SocialSimplePhotoFragmentViewBinderAbs.f1);
                }else {
                   layoutParams1.topMargin = (int)((tarRect.bottom - (float)SocialSimplePhotoFragmentViewBinderAbs.g1) - (float)d1);
                }
                layoutParams1.leftMargin = (int)(tarRect.centerX() - ((float)d1 / 2.00f));
                obj21.setOnClickListener(new j(b));
                b.D = obj21;
                ViewGroup$MarginLayoutParams leftMargin = layoutParams1.leftMargin;
                float f = (float)leftMargin;
                obj21 = layoutParams1.topMargin;
                float f1 = (float)obj21;
                rectF = new RectF(f, f1, (float)(leftMargin + d1), (float)(obj21 + d1));
             }
             str1 = "CommonUtil.string\(R.string.social_simple_reshoot\)";
             if (this.F0()) {
                if (this.y0()) {
                   obj2 = false;
                   i1 = (s6.m())? 0x7f081c3d: 0x7f081cb0;
                   obj = a1.p(R.string.arg_RES_7f1043d4);
                   a.o(obj, "CommonUtil.string\(R.string.save_to_album\)");
                   str3 = str2;
                   str2 = obj;
                   this.u0(rectF, obj6, obj2, i1, str2, new SocialSimplePhotoFragmentViewBinderAbs$e(b));
                   obj2 = true;
                   i1 = (s6.m())? 0x7f081c3c: 0x7f081c57;
                   str2 = a1.p(R.string.arg_RES_7f1049ae);
                   a.o(str2, str1);
                   this.u0(rectF, obj6, obj2, i1, str2, new SocialSimplePhotoFragmentViewBinderAbs$f(b));
                }else {
                   str3 = str2;
                }
                obj1 = b.Z;
                a.m(obj1);
                RectF tarRect1 = obj1.getTargetRect();
                a.o(tarRect1, str3);
                int i2 = triple.getFirst().getFirst().intValue();
                if (!PatchProxy.isSupport(socialSimple) || !PatchProxy.applyVoidThreeRefs(tarRect1, Integer.valueOf(i2), obj6, this, SocialSimplePhotoFragmentViewBinderAbs.class, "30")) {
                   obj1 = new PressedAlphaLinearLayout(obj6.getContext());
                   int w1 = SocialSimplePhotoFragmentViewBinderAbs.w1;
                   obj2 = -2;
                   obj7 = new RelativeLayout$LayoutParams(obj2, w1);
                   obj7.addRule(14);
                   obj7.topMargin = (i2 == uoa.d())? (int)((tarRect1.bottom - (float)SocialSimplePhotoFragmentViewBinderAbs.y1) - (float)w1): (int)((tarRect1.bottom - (float)SocialSimplePhotoFragmentViewBinderAbs.x1) - (float)w1);
                   obj1.setLayoutParams(obj7);
                   obj1.setOrientation(0);
                   obj1.setBackground(a1.f(R.drawable.arg_RES_7f082335));
                   JsGoToPostParam jsGoToPostPa = i.g().getJsGoToPostParam().get();
                   if (jsGoToPostPa != null) {
                      jsGoToPostPa = jsGoToPostPa.mExtraParamList;
                      if (jsGoToPostPa != null) {
                      label_0508 :
                         if (jsGoToPostPa.isEmpty() ^ 1) {
                            Ref$ObjectRef objectRef = new Ref$ObjectRef();
                            objectRef.element = "";
                            Iterator iterator = jsGoToPostPa.iterator();
                            while (iterator.hasNext()) {
                               GoToPostValue goToPostValu = iterator.next();
                               if (a.g(goToPostValu.mKey, "SOCIAL_INTIMATE_FRIENDS_SCHEME")) {
                                  goToPostValu = goToPostValu.mValue;
                                  a.o(goToPostValu, "it.mValue");
                                  objectRef.element = goToPostValu;
                               }
                            }
                            str1 = (!(objectRef.element).length())? 1: 0;
                            if (str1) {
                               objArray = new Object[0];
                               a.D().A("SocialSimplePhotoFragmentViewBinderAbs", "addPublishTag url is empty", objArray);
                            }else {
                               w1 = 0;
                               obj1.setOnClickListener(new k(b, objectRef));
                            }
                         }else {
                            w1 = 0;
                            Object[] objArray2 = new Object[w1];
                            a.D().A("SocialSimplePhotoFragmentViewBinderAbs", "addPublishTag no extra param", objArray2);
                            obj1.setClickable(w1);
                         }
                         TextView textView1 = new TextView(obj6.getContext());
                         ViewGroup$MarginLayoutParams marginLayout = new ViewGroup$MarginLayoutParams(obj2, -1);
                         obj2 = SocialSimplePhotoFragmentViewBinderAbs.t1;
                         textView1.setPadding(obj2, w1, w1, w1);
                         textView1.setGravity(16);
                         textView1.setLayoutParams(marginLayout);
                         textView1.setTextColor(a1.a(R.color.arg_RES_7f0620c7));
                         textView1.setTextSize(w1, (float)a1.d(R.dimen.arg_RES_7f070f6e));
                         textView1.setText(R.string.arg_RES_7f104cdb);
                         b.J = textView1;
                         obj1.addView(textView1, marginLayout);
                         ImageView imageView = new ImageView(obj6.getContext());
                         i2 = SocialSimplePhotoFragmentViewBinderAbs.u1;
                         marginLayout1 = new ViewGroup$MarginLayoutParams(((SocialSimplePhotoFragmentViewBinderAbs.v1 + obj2) + i2), -1);
                         imageView.setPadding(i2, 0, obj2, 0);
                         imageView.setLayoutParams(marginLayout1);
                         imageView.setImageDrawable(a1.f(R.drawable.arg_RES_7f081c9d));
                         obj1.addView(imageView, marginLayout1);
                         obj6.addView(obj1, obj7);
                         b.G = obj1;
                      }
                   }
                   ArrayList uArrayList = new ArrayList();
                   goto label_0508 ;
                }
                a.b().a("SocialIntimateFriendsSelectionResult", b.a1);
                obj1 = b.R;
                z = b.P;
                if (z == null) {
                   a.S("mActivity");
                }
                obj1.c(z.m().subscribe(new SocialSimplePhotoFragmentViewBinderAbs$g(b)));
             }else if(s6.m()){
                i1 = 0x7f081c3c;
             }else {
                i1 = 0x7f081c57;
             }
             str2 = a1.p(R.string.arg_RES_7f1049ae);
             a.o(str2, str1);
             this.u0(rectF, obj6, true, i1, str2, new SocialSimplePhotoFragmentViewBinderAbs$h(b));
             objArray1 = new Object[0];
             a.D().w("SocialSimplePhotoFragmentViewBinderAbs", "bindView pathOrKeyList:"+b.O, objArray1);
             return;
          }
       }
    }
    public final void u0(RectF p0,ViewGroup p1,boolean p2,int p3,String p4,View$OnClickListener p5){
       float f;
       SocialSimplePhotoFragmentViewBinderAbs socialSimple = SocialSimplePhotoFragmentViewBinderAbs.class;
       int i = 1;
       if (PatchProxy.isSupport(socialSimple)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Integer.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, this, socialSimple, "29")) {
             return;
          }
       }
       ImageView imageView = new ImageView(p1.getContext());
       imageView.setImageDrawable(a1.f(p3));
       if (!s6.m()) {
          SocialSimpleEditorActivityViewBinder$a k = SocialSimpleEditorActivityViewBinder.K;
          int i1 = k.e();
          Drawable uDrawable = (i1 == k.d())? a1.f(R.drawable.arg_RES_7f08253c): a1.f(R.drawable.arg_RES_7f08253b);
          imageView.setBackground(uDrawable);
          imageView.setPadding(SocialSimplePhotoFragmentViewBinderAbs.i1, SocialSimplePhotoFragmentViewBinderAbs.i1, SocialSimplePhotoFragmentViewBinderAbs.i1, SocialSimplePhotoFragmentViewBinderAbs.i1);
          imageView.setLayoutParams(new ViewGroup$MarginLayoutParams(SocialSimplePhotoFragmentViewBinderAbs.h1, SocialSimplePhotoFragmentViewBinderAbs.h1));
       }
       TextView textView = new TextView(p1.getContext());
       int h1 = SocialSimplePhotoFragmentViewBinderAbs.h1;
       ViewGroup$MarginLayoutParams marginLayout = new ViewGroup$MarginLayoutParams(h1, SocialSimplePhotoFragmentViewBinderAbs.l1);
       marginLayout.topMargin = SocialSimplePhotoFragmentViewBinderAbs.k1;
       textView.setLayoutParams(marginLayout);
       textView.setGravity(17);
       textView.setTextColor(a1.a(R.color.arg_RES_7f0620c7));
       textView.setTextSize(0, (float)a1.d(R.dimen.arg_RES_7f070f6d));
       textView.setText(p4);
       PressedAlphaLinearLayout pressedAlpha = new PressedAlphaLinearLayout(p1.getContext());
       pressedAlpha.setOrientation(i);
       pressedAlpha.addView(imageView);
       pressedAlpha.addView(textView);
       p1.addView(pressedAlpha, new ViewGroup$MarginLayoutParams(h1, SocialSimplePhotoFragmentViewBinderAbs.j1));
       ViewGroup$LayoutParams layoutParams = pressedAlpha.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       layoutParams.topMargin = (int)(p0.top + (float)SocialSimplePhotoFragmentViewBinderAbs.m1);
       if (p2) {
          f = (float)h1;
          float f1 = (float)2;
          layoutParams.leftMargin = (int)((p0.left - f) - ((((p0.centerX() * f1) - p0.right) - f) / f1));
       }else {
          f = (float)2;
          layoutParams.leftMargin = (int)(p0.right + ((((p0.centerX() * f) - p0.right) - (float)h1) / f));
       }
       pressedAlpha.setLayoutParams(layoutParams);
       pressedAlpha.setOnClickListener(p5);
       this.H = (p2)? pressedAlpha: pressedAlpha;
       return;
    }
    public final void v0(){
       if (PatchProxy.applyVoid(null, this, SocialSimplePhotoFragmentViewBinderAbs.class, "26")) {
          return;
       }
       SocialSimplePhotoFragmentViewBinderAbs tS = this.S;
       if (tS != null) {
          this.T = false;
          if (tS != null) {
             tS.dismiss();
          }
          this.S = null;
       }
       return;
    }
    public final Bitmap x0(Bitmap p0){
       Bitmap first;
       float f;
       float f1;
       Pair obj = PatchProxy.applyOneRefs(p0, this, SocialSimplePhotoFragmentViewBinderAbs.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.E0(false);
       if (obj != null) {
          first = obj.getFirst();
          f = obj.getSecond().getFirst().floatValue();
          f1 = obj.getSecond().getSecond().floatValue();
       }else {
          first = this.W0;
          if (first != null) {
             a.m(first);
             f = this.X0;
             f1 = this.Y0;
          }else {
          label_0075 :
             return p0;
          }
       }
       float f2 = f1;
       float f3 = f;
       j oj = new j(p0);
       h0 oh0 = new h0(f3, f2, 0x3f800000, 0, StickerTextValueType.EditElement, 0x3f800000, 0x3f800000, String.valueOf(System.currentTimeMillis()));
       o6.b(oj, first, p0);
       p0 = oj.getValue();
       a.o(p0, "finalBitmapRef.value");
       goto label_0075 ;
    }
    public final boolean y0(){
       SimpleEditParam obj = PatchProxy.apply(null, this, SocialSimplePhotoFragmentViewBinderAbs.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       SimpleEditParam dEFAULT = SimpleEditParam.DEFAULT;
       a.o(dEFAULT, "DEFAULT");
       obj = i.g().getSimpleEditParam().get(dEFAULT).mSourcePage;
       Object[] objArray = new Object[0];
       a.D().w("SocialSimplePhotoFragmentViewBinderAbs", "fromCamera sourcePage:"+obj, objArray);
       return a.g(obj, "CAMERA_SOURCE");
    }
    public final GoToPostFinishEventResult$FileAndType z0(String p0){
       Bitmap uBitmap;
       String obj = PatchProxy.applyOneRefs(p0, this, SocialSimplePhotoFragmentViewBinderAbs.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(PostUtils.f(), "BIG_IMAGE"+System.currentTimeMillis()).getAbsolutePath();
       if (p0 == null) {
          SocialSimplePhotoFragmentViewBinderAbs tN = this.N;
          a.m(tN);
          uBitmap = Bitmap.createBitmap(tN);
          a.o(uBitmap, "Bitmap.createBitmap\(bigBitmap!!\)");
       }else {
          uBitmap = Bitmap.createBitmap(BitmapUtil.s(p0));
          a.o(uBitmap, "Bitmap.createBitmap\(Bitm¡­il.decodeFile\(draftFile\)\)");
       }
       BitmapUtil.M(this.x0(uBitmap), obj, DraftFileManager.l);
       return new GoToPostFinishEventResult$FileAndType(obj, "BACKGROUND_IMAGE");
    }
}
