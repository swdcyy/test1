package com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder;
import ei0.a;
import androidx.fragment.app.Fragment;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.util.Set;
import tpc.e0;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.widget.PassThroughEventView;
import android.widget.LinearLayout;
import java.util.Objects;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.customizer.preview.BaseEditorPreviewContainerLayout;
import android.widget.RelativeLayout;
import android.widget.ImageView;
import android.app.Activity;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverCropView;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import huc.k1;
import android.content.Context;
import android.content.Intent;
import ekd.j0;
import zf6.k;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$g;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$i;
import android.graphics.RectF;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$e;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$c;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$d;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$h;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.widget.RatioExpandView;
import tpc.v;
import java.lang.Boolean;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import lnc.p6;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.yxcorp.gifshow.widget.adv.model.f;
import android.util.Pair;
import qaa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Cover;
import com.kuaishou.edit.draft.VideoCoverParam;
import com.kuaishou.edit.draft.ImportCoverParamV2;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kotlin.text.StringsKt__StringsKt;
import tpc.v$a;
import com.kuaishou.edit.draft.CropOptions;
import com.kuaishou.edit.draft.Transform;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import tpc.v$b;
import lnc.a1;
import java.util.Iterator;
import di0.b;
import h69.j;
import msd.a;
import android.widget.FrameLayout;
import android.view.ViewPropertyAnimator;
import tyc.x3;
import java.lang.Runnable;
import tyc.y3;
import tpc.u;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$onAttach$3;
import tyc.d0;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$j;
import tyc.x4;
import java.util.Map;
import uv8.x1;
import t36.f;
import uv8.i2;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$k;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.AbsoluteLayout;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$l;
import tyc.u5;
import tyc.z3;
import tyc.a4;
import android.view.ViewTreeObserver;
import tpc.z;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.Float;
import tpc.w;
import androidx.fragment.app.FragmentActivity;
import tpc.p;
import tpc.p$b;
import java.lang.Integer;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import tpc.c0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import lwc.h;
import com.yxcorp.gifshow.v3.f;
import com.google.common.collect.ImmutableList;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import juc.b;
import com.yxcorp.gifshow.v3.editor.text.model.TextChangeParam;
import muc.a;
import android.graphics.Rect;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;
import wba.h0;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcorp.gifshow.edit.previewer.utils.StickerTextValueType;
import tpc.a0;
import erd.r;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$b;
import wba.e0;
import com.yxcorp.gifshow.widget.FlexScreenStatusData;
import lnc.u6;
import android.view.ViewGroup$MarginLayoutParams;
import toc.a;
import tpc.x;
import w46.b;
import qka.a;
import qrd.l1;
import com.kwai.sdk.switchconfig.a;
import io7.f;
import wba.a0;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$m;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.b;

public class VideoCoverProportionViewBinder extends a	// class@000eb2
{
    public final Observer A;
    public final Observer B;
    public final Fragment C;
    public final EditorDelegate D;
    public final Set E;
    public final e0 F;
    public final EditDecorationContainerView G;
    public final List H;
    public final PassThroughEventView c;
    public final LinearLayout d;
    public final VideoSDKPlayerView e;
    public final BaseEditorPreviewContainerLayout f;
    public ImageView g;
    public VideoCoverCropView h;
    public final TextElementViewModel i;
    public boolean j;
    public boolean k;
    public View l;
    public final boolean m;
    public final RelativeLayout n;
    public RatioExpandView o;
    public final File p;
    public final x1 q;
    public final i2 r;
    public RectF s;
    public RectF t;
    public RectF u;
    public boolean v;
    public boolean w;
    public final VideoCoverProportionViewBinder$e x;
    public final VideoCoverProportionViewBinder$c y;
    public final Observer z;

    public void VideoCoverProportionViewBinder(Fragment p0,View p1,EditorDelegate p2,Set p3,e0 p4,EditDecorationContainerView p5,List p6){
       a.p(p0, "mFragment");
       a.p(p1, "mRootView");
       a.p(p2, "mEditorDelegate");
       a.p(p3, "mEditorViewListeners");
       a.p(p4, "mCropViewModel");
       a.p(p6, "mICoverEditorFinishListeners");
       super(p1);
       this.C = p0;
       this.D = p2;
       this.E = p3;
       this.F = p4;
       this.G = p5;
       this.H = p6;
       this.c = p1.findViewById(0x7f0a2f88);
       p1 = p1.findViewById(R.id.fragment_root);
       a.o(p1, "mRootView.findViewById\(R.id.fragment_root\)");
       this.d = p1;
       p1 = p2.z();
       Objects.requireNonNull(p1, "null cannot be cast to non-null type com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView");
       this.e = p1;
       BaseEditorPreviewContainerLayout uBaseEditorP = p2.J();
       this.f = uBaseEditorP;
       uBaseEditorP = uBaseEditorP.findViewById(R.id.import_cover_preview);
       a.o(uBaseEditorP, "mPreviewContainer.findVi¡­   .import_cover_preview\)");
       this.g = uBaseEditorP;
       uBaseEditorP = p2.getContext().findViewById(R.id.cover_crop_select);
       a.o(uBaseEditorP, "mEditorDelegate.context.¡­   .id.cover_crop_select\)");
       this.h = uBaseEditorP;
       boolean b = true;
       TextElementViewModel textElementV = k1.c(p2, b);
       a.o(textElementV, "TextDrawerUtil.getTextEl¡­el\(mEditorDelegate, true\)");
       this.i = textElementV;
       this.l = new View(p0.getContext());
       this.m = a.g("cover_edit", j0.f(p2.getIntent(), "SOURCE"));
       this.n = p2.v();
       File uFile = (k.d())? new File(PostUtils.f(), "dark_cover_ratio_guide.webp"): new File(PostUtils.f(), "light_cover_ratio_guide.webp");
       this.p = uFile;
       this.q = new VideoCoverProportionViewBinder$g(this);
       this.r = new VideoCoverProportionViewBinder$i(this);
       this.s = new RectF();
       this.t = new RectF();
       this.u = new RectF();
       this.w = b;
       this.x = new VideoCoverProportionViewBinder$e(this);
       this.y = new VideoCoverProportionViewBinder$c(this);
       this.z = new VideoCoverProportionViewBinder$d(this);
       p4.w0().observe(p0, new VideoCoverProportionViewBinder$a(this));
       this.A = new VideoCoverProportionViewBinder$h(this);
       this.B = new VideoCoverProportionViewBinder$f(this);
       return;
    }
    public void B(){
       u a;
       e0 i2;
       boolean used;
       RatioExpandView ratioExpandV = this;
       Object[] objArray = null;
       String str = "6";
       if (PatchProxy.applyVoid(objArray, ratioExpandV, VideoCoverProportionViewBinder.class, str)) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       String str1 = "onAttach";
       a.D().w("VideoCoverProportionViewBinder", str1, objArray1);
       if (ratioExpandV.o == null) {
          ratioExpandV.o = this.P();
       }
       if (!ratioExpandV.E.contains(ratioExpandV.x)) {
          ratioExpandV.E.add(ratioExpandV.x);
       }
       if (!ratioExpandV.H.contains(ratioExpandV.y)) {
          ratioExpandV.H.add(ratioExpandV.y);
       }
       VideoCoverProportionViewBinder f = ratioExpandV.F;
       VideoCoverProportionViewBinder w = ratioExpandV.w;
       Objects.requireNonNull(f);
       e0 uoe0 = e0.class;
       v ov = v.class;
       String str2 = "7";
       if (!PatchProxy.isSupport(uoe0) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(w), f, uoe0, str2)) {
          Object[] objArray2 = new Object[i];
          a.D().w("VideoCoverProportionVM", str1, objArray2);
          uoe0 = f.i;
          Objects.requireNonNull(uoe0);
          if (!PatchProxy.applyVoid(objArray, uoe0, ov, str) && (p6.g(uoe0.f) && uoe0.a())) {
             p6.a(uoe0.f, uoe0.g.c(i));
          }
       label_0097 :
          str = "VideoCoverProportionRepo";
          v obj = 2;
          if (w != null) {
             e0 i1 = f.i;
             Objects.requireNonNull(i1);
             if (!PatchProxy.applyVoid(objArray, i1, ov, "4")) {
                objArray2 = new Object[i];
                a.D().w(str, "loadCoverProportionDraft", objArray2);
                a uoa = i1.f.s0();
                if (uoa != null) {
                   Cover uCover = uoa.v();
                   if (uCover != null) {
                      VideoCoverParam videoCoverPa = uCover.getVideoCoverParam();
                      if (videoCoverPa != null) {
                         String videoCoverRa = videoCoverPa.getVideoCoverRatio();
                         a.o(videoCoverRa, "videoCoverParam.videoCoverRatio");
                         i1.c = videoCoverRa;
                         a uoa1 = i1.f.s0();
                         if (uoa1 != null) {
                            Cover uCover1 = uoa1.v();
                            if (uCover1 != null) {
                               ImportCoverParamV2 importCoverP = uCover1.getImportCoverParamV2();
                               if (importCoverP != null) {
                                  used = importCoverP.getUsed();
                               label_00f3 :
                                  i1.e = used;
                                  videoCoverRa = i1.f();
                                  if (!TextUtils.x(i1.c) && !StringsKt__StringsKt.O2(videoCoverRa, i1.c, i, obj, objArray)) {
                                     i1.i(i);
                                  }else {
                                     Size size = i1.g.c(i);
                                     a.o(size, "mTimelineSavedData.getFinalAssetSize\(0\)");
                                     CropOptions cropOptions = videoCoverPa.getCropOptions();
                                     a.o(cropOptions, "videoCoverParam.cropOptions");
                                     CropOptions cropOptions1 = videoCoverPa.getCropOptions();
                                     a.o(cropOptions1, "videoCoverParam.cropOptions");
                                     cropOptions1 = videoCoverPa.getCropOptions();
                                     a.o(cropOptions1, "videoCoverParam.cropOptions");
                                     Transform transform = cropOptions1.getTransform();
                                     a.o(transform, "videoCoverParam.cropOptions.transform");
                                     v$a uoa2 = v15;
                                     v$a uoa3 = v15;
                                     uoa2 = new v$a(i1.c, size, new Size(cropOptions.getWidth(), cropOptions1.getHeight()), transform, true, false);
                                     i1.b.setValue(uoa3);
                                     Object[] objArray4 = new Object[i];
                                     a.D().w(str, "loadCoverProportionDraft, ratio in draft = "+i1.c+", draft proportion info = "+i1.b.getValue(), objArray4);
                                  }
                               }
                            }
                         }
                         used = false;
                         goto label_00f3 ;
                      }
                   }
                }
             }
          }else {
             f.i.h();
          }
          i2 = f.i;
          Objects.requireNonNull(i2);
          obj = PatchProxy.apply(null, i2, ov, str2);
          if (obj != PatchProxyResult.class) {
          }else {
             i2.a.clear();
             str1 = a1.p(R.string.arg_RES_7f10461f);
             a.o(str1, "CommonUtil.string\(R.string.select_ratio_origin\)");
             i2.a.add(new v$b(str1, TextUtils.x(i2.c)));
             String[] stringArray = new String[]{","};
             Iterator iterator1 = StringsKt__StringsKt.H4(i2.f(), stringArray, false, 0, 6, null).iterator();
             while (iterator1.hasNext()) {
                String str4 = iterator1.next();
                i2.a.add(new v$b(str4, a.g(str4, i2.c)));
             }
             i2.c = "";
             Object[] objArray3 = new Object[i];
             a.D().w(str, "getRatioInfoList, ratio list = "+i2.a, objArray3);
             obj = i2.a;
          }
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             v$b uob1 = iterator.next();
             if (uob1.b != null) {
                f.f = obj.indexOf(uob1);
             }
          }
          b.t(f.a, obj, null, 2, null);
       }
       ratioExpandV.k = true;
       ratioExpandV.s = ratioExpandV.f.getLimitRect();
       ratioExpandV.t = ratioExpandV.f.getOriginLayoutRect();
       ratioExpandV.u = ratioExpandV.f.getCustomTransformRect();
       float f1 = 0;
       if (!ratioExpandV.F.o0() || j.j(ratioExpandV.D.N())) {
          f = ratioExpandV.o;
          if (f != null) {
             f.setVisibility(8);
          }
          this.M().setAlpha(f1);
       }else {
          ratioExpandV.o = this.P();
          ratioExpandV.j = p6.g(ratioExpandV.D.N());
          ratioExpandV.Q(ratioExpandV.p, null);
          f = ratioExpandV.o;
          if (f != null) {
             f.setEnableLandscapeVideoCoverRatioGuide(ratioExpandV.j);
          }
          f = ratioExpandV.o;
          if (f != null && (!PatchProxy.applyVoid(null, f, RatioExpandView.class, "10") && !f.isShown())) {
             f.setAlpha(f1);
             f.animate().setDuration(300).alpha(0x3f800000).withStartAction(new x3(f)).withEndAction(new y3(f)).start();
             f.setVisibility(i);
          }
       label_02c9 :
          f = ratioExpandV.n;
          if (f != null) {
             f.setVisibility(i);
          }
          v$b uob = ratioExpandV.F.x0().u(ratioExpandV.F.y0());
          if (uob != null) {
             a = u.a;
             String str3 = uob.a();
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidOneRefs(str3, a, u.class, "2")) {
                a.p(str3, "ratio");
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "COVER_ADJUST_SCALE_EXPAND";
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("detail_name", a.a(str3));
                uElementPack.params = jsonObject.toString();
                u1.u0(6, uElementPack, null);
             }
          }
          ratioExpandV.F.x0().observe(ratioExpandV.C, ratioExpandV.A);
          ratioExpandV.F.t0().observe(ratioExpandV.C, ratioExpandV.B);
       }
       f = ratioExpandV.o;
       if (f != null) {
          f.setOnClickItemListener(new VideoCoverProportionViewBinder$onAttach$3(ratioExpandV));
       }
       f = ratioExpandV.o;
       if (f != null) {
          f.setOnStateChangeListener(new VideoCoverProportionViewBinder$j(ratioExpandV));
       }
       f.o0(ratioExpandV.q, ratioExpandV.D.u(), x1.class);
       f.o0(ratioExpandV.r, ratioExpandV.D.u(), i2.class);
       f = ratioExpandV.c;
       if (f != null) {
          f.setOnClickListener(new VideoCoverProportionViewBinder$k(ratioExpandV));
       }
       f = ratioExpandV.c;
       if (f != null) {
          f.setUndersideView(ratioExpandV.d);
       }
       return;
    }
    public void C(){
       VideoCoverProportionViewBinder tG;
       if (PatchProxy.applyVoid(null, this, VideoCoverProportionViewBinder.class, "14")) {
          return;
       }
       boolean b = false;
       this.v = b;
       this.E.remove(this.x);
       this.H.remove(this.y);
       this.F.s0().removeObservers(this.C);
       this.F.x0().removeObservers(this.C);
       float f = 0;
       if (this.F.o0()) {
          tG = this.G;
          int i = -1;
          if (tG != null) {
             tG.setLayoutParams(new RelativeLayout$LayoutParams(i, i));
          }
          tG = this.G;
          if (tG != null) {
             tG.setTranslationY(f);
          }
          this.e.setLayoutParams(new RelativeLayout$LayoutParams(i, i));
          this.e.setTranslationY(f);
          this.f.setOriginLayoutRect(this.t);
          BaseEditorPreviewContainerLayout.e(this.f, true, b, 2, null);
          this.f.a(this.u, false, null, true, 0);
          f.t0(this.q, this.D.u(), x1.class);
          f.t0(this.r, this.D.u(), i2.class);
       }
       if (this.F.o0()) {
          tG = this.o;
          if (tG != null) {
             tG.setVisibilityStateListener(new VideoCoverProportionViewBinder$l(this));
             if (!PatchProxy.applyVoid(null, tG, RatioExpandView.class, "11") && tG.isShown()) {
                if (tG.c != null) {
                   tG.d(b);
                }
                tG.animate().setDuration(300).alpha(f).withStartAction(new z3(tG)).withEndAction(new a4(tG)).start();
             }
             tG.setVisibilityStateListener(null);
          }
       }
       this.w = true;
       return;
    }
    public final void D(List p0,boolean p1){
       w a;
       Object[] objArray3;
       VideoCoverProportionViewBinder g;
       ViewGroup$LayoutParams layoutParams;
       ViewGroup$LayoutParams layoutParams1;
       float f2;
       int i4;
       RectF rectF1;
       VideoCoverProportionViewBinder g1;
       float f3;
       ViewTreeObserver viewTreeObse;
       h oh;
       Size size;
       float f4;
       VideoCoverProportionViewBinder g2;
       EditTextBaseElement topElement;
       int i5;
       EditDecorationBaseDrawer topElement1;
       EditTextBaseElementData editTextBase;
       h0 oh0;
       Object[] objArray4;
       ImmutableList immutableLis;
       View view = this;
       RectF obj = p0;
       boolean b = p1;
       VideoCoverProportionViewBinder videoCoverPr = VideoCoverProportionViewBinder.class;
       String str = "12";
       if (PatchProxy.isSupport(videoCoverPr) && PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(p1), view, videoCoverPr, str)) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str1 = "VideoCoverProportionViewBinder";
       a.D().w(str1, "adjustDecorationContainerView ratioList = "+obj, objArray);
       ImageView imageView = (view.F.r0())? this.K(): view.e;
       view.l = imageView;
       if (!imageView.getHeight() || !view.l.getWidth()) {
          view.l.getViewTreeObserver().addOnGlobalLayoutListener(new VideoCoverProportionViewBinder$b(view, obj, b));
          return;
       }else if(view.F.r0() && (view.l.getHeight() != view.F.u0() || view.l.getWidth() != view.F.v0())){
          if (!PatchProxy.isSupport(videoCoverPr) || !PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(p1), view, videoCoverPr, "11")) {
             Object[] objArray1 = new Object[i];
             a.D().w(str1, "adjustAfterImportCoverPreviewReady ratioList = "+obj, objArray1);
             this.K().getViewTreeObserver().addOnGlobalLayoutListener(new z(view, obj, b));
          }
          return;
       }else {
          int i1 = 0xbf800000;
          int i2 = 1;
          float f = (p0.isEmpty())? 0xbf800000: Float.parseFloat(obj.get(i)) / Float.parseFloat(obj.get(i2));
          a = w.a;
          FragmentActivity activity = view.C.getActivity();
          Objects.requireNonNull(activity, "null cannot be cast to non-null type android.app.Activity");
          RectF rectF = a.a(activity, (float)p.u.a(view.d), view.u, f);
          float f1 = (float)view.e.getWidth() / (float)view.e.getHeight();
          if (!f - i1) {
             f = f1;
          }
          obj = a.b(rectF, Float.valueOf(f1), f, p0.isEmpty());
          if (obj != null) {
             i1 = (int)obj.width();
             int i3 = (int)obj.height();
             obj = obj.top;
             if (PatchProxy.isSupport(videoCoverPr)) {
                Object[] objArray2 = new Object[]{Integer.valueOf(i1),Integer.valueOf(i3),Float.valueOf(obj),Float.valueOf(f),Boolean.valueOf(p1)};
                if (!PatchProxy.applyVoid(objArray2, view, videoCoverPr, "5")) {
                }
             }else {
             }
          }
       label_0342 :
          return;
       }
    }
    public final void E(boolean p0){
       FragmentActivity activity;
       VideoCoverProportionViewBinder tt;
       RectF top;
       VideoCoverProportionViewBinder tG;
       int i4;
       int i5;
       VideoCoverProportionViewBinder videoCoverPr = VideoCoverProportionViewBinder.class;
       if (PatchProxy.isSupport(videoCoverPr) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, videoCoverPr, "4")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("VideoCoverProportionViewBinder", "adjustRelatedLayout", objArray);
       if (this.C.getActivity() != null) {
          activity = this.C.getActivity();
          float f = Float.MIN_VALUE;
          if (activity == null || activity.isFinishing() != f) {
             RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-1, -1);
             layoutParams.topMargin = i;
             VideoCoverProportionViewBinder tf = this.f;
             a.o(tf, "mPreviewContainer");
             tf.setLayoutParams(layoutParams);
             videoCoverPr = this.f;
             a.o(videoCoverPr, "mPreviewContainer");
             videoCoverPr.setScaleX(0x3f800000);
             videoCoverPr = this.f;
             a.o(videoCoverPr, "mPreviewContainer");
             videoCoverPr.setScaleY(0x3f800000);
             videoCoverPr = this.f;
             a.o(videoCoverPr, "mPreviewContainer");
             float f1 = 0;
             videoCoverPr.setTranslationY(f1);
             this.M().setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
             int b = e0.e(this.D.N());
             RelativeLayout$LayoutParams layoutParams1 = new RelativeLayout$LayoutParams((int)this.t.width(), (int)this.t.height());
             int i1 = 14;
             layoutParams1.addRule(i1);
             int i2 = 10;
             layoutParams1.addRule(i2);
             layoutParams1.topMargin = (int)this.t.top;
             this.e.setLayoutParams(layoutParams1);
             String str = "mFragment.activity!!";
             if (b) {
                FragmentActivity activity1 = this.C.getActivity();
                a.m(activity1);
                a.o(activity1, str);
                a.g(u6.a(activity1, i), this.t, this.s, layoutParams1);
                if (p0 && !this.F.r0()) {
                   this.e.setAlpha(f1);
                }
             }else {
                tG = this.t;
                top = tG.top;
                if ((int)top < 0 || (int)tG.left < 0) {
                   RectF left1 = tG.left;
                   int i6 = (int)left1;
                   layoutParams1.setMargins(i6, (int)top, (int)left1, (int)top);
                }
                tt = this.t;
                this.e.layout((int)tt.left, (int)tt.top, (int)tt.right, (int)tt.bottom);
             }
             this.e.setTranslationY((this.u.centerY() - this.t.centerY()));
             RelativeLayout$LayoutParams layoutParams2 = new RelativeLayout$LayoutParams((int)this.t.width(), (int)this.t.height());
             layoutParams2.addRule(i1);
             layoutParams2.addRule(i2);
             tt = this.t;
             top = tt.top;
             layoutParams2.topMargin = (int)top;
             if (b) {
                activity = this.C.getActivity();
                a.m(activity);
                a.o(activity, str);
                a.g(u6.a(activity, i), this.t, this.s, layoutParams2);
             }else if((int)top < 0 || (int)tt.left < 0){
                RectF left = tt.left;
                i4 = (int)left;
                layoutParams2.setMargins(i4, (int)top, (int)left, (int)top);
             }
             videoCoverPr = this.G;
             if (videoCoverPr != null) {
                tt = this.t;
                videoCoverPr.layout((int)tt.left, (int)tt.top, (int)tt.right, (int)tt.bottom);
             }
             videoCoverPr = this.G;
             if (videoCoverPr != null) {
                videoCoverPr.setLayoutParams(layoutParams2);
             }
             tG = this.G;
             if (tG != null) {
                tG.setTranslationY((this.u.centerY() - this.t.centerY()));
             }
             FragmentActivity activity2 = this.C.getActivity();
             a.m(activity2);
             int i3 = n.k(activity2);
             activity = this.C.getActivity();
             a.m(activity);
             b = n.j(activity);
             FragmentActivity activity3 = this.C.getActivity();
             a.m(activity3);
             i4 = n.A(activity3) + x.a();
             Size size = this.F.q0();
             Size b1 = size.b;
             if (b1 > i3) {
                i5 = (int)((float)i3 / ((float)b1 / (float)size.c));
             }else if(f <= b1 && i3 >= b1){
                i5 = size.c;
                i3 = b1;
             }else {
                i3 = 0;
                i5 = 0;
             }
             if ((i5 + i4) > b) {
                i5 = b - i4;
                i3 = (int)((float)i5 * ((float)b1 / (float)size.c));
             }
             videoCoverPr = this.F;
             videoCoverPr.h = i3;
             videoCoverPr.g = i5;
             layoutParams = new RelativeLayout$LayoutParams(i3, i5);
             layoutParams.addRule(i1);
             layoutParams.addRule(i2);
             layoutParams.topMargin = i4;
             this.K().setLayoutParams(layoutParams);
             this.K().requestLayout();
             Object[] objArray2 = new Object[i];
             a.D().w("VideoCoverProportionViewBinder", "adjustRelatedLayout importCoverOriginSize = "+size+" imageViewWidth = "+i3+' '+"imageViewHeight = "+i5+" topOffset = "+i4, objArray2);
             this.F.s0().observe(this.C, this.z);
             return;
          }
       }
       Object[] objArray1 = new Object[i];
       a.D().t("VideoCoverProportionViewBinder", "adjustRelatedLayout activity is null or activity is finishing, return", objArray1);
       return;
    }
    public final LinearLayout F(){
       return this.d;
    }
    public final e0 G(){
       return this.F;
    }
    public final EditDecorationContainerView H(){
       return this.G;
    }
    public final EditorDelegate I(){
       return this.D;
    }
    public final Fragment J(){
       return this.C;
    }
    public ImageView K(){
       return this.g;
    }
    public final RatioExpandView L(){
       return this.o;
    }
    public VideoCoverCropView M(){
       return this.h;
    }
    public final VideoSDKPlayerView N(){
       return this.e;
    }
    public RatioExpandView P(){
       RelativeLayout$LayoutParams obj = PatchProxy.apply(null, this, VideoCoverProportionViewBinder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.o == null) {
          this.o = new RatioExpandView(this.C.getActivity());
          obj = new RelativeLayout$LayoutParams(-2, -2);
          obj.leftMargin = a1.d(0x7f070d6b);
          obj.topMargin = a1.d(0x7f070d6c);
          if (a.a()) {
             obj.topMargin = obj.topMargin + n.A(this.C.requireContext());
          }
          VideoCoverProportionViewBinder to = this.o;
          if (to != null) {
             to.setVisibility(8);
          }
          to = this.n;
          if (to != null) {
             to.addView(this.o, obj);
          }
       }
       return this.o;
    }
    public final void Q(File p0,a p1){
       Object[] objArray2;
       String str;
       VideoCoverProportionViewBinder videoCoverPr = VideoCoverProportionViewBinder.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, videoCoverPr, "7")) {
          return;
       }
       if (this.j != null) {
          if (p0.exists()) {
             if (p1 != null) {
                p1.invoke();
             }
             return;
          }else {
             Object[] objArray = null;
             DownloadTask$DownloadRequest obj = PatchProxy.apply(objArray, this, videoCoverPr, "15");
             if (obj != PatchProxyResult.class) {
                objArray = obj;
             }else {
                f uof = a.t().f("coverCropGuideUrls");
                if (uof != null) {
                   a.o(uof, "SwitchConfigManager.getI\x20\x02UIDE_URLS\) ?: return null\x00");
                   if (!uof.c() instanceof JsonObject) {
                      objArray2 = new Object[0];
                      a.D().t("VideoCoverProportionViewBinder", "getRatioGuideDownloadUrl: switchConfig.value is not jsonObject:$switchConfig", objArray2);
                   }else {
                      JsonElement jsonElement = uof.c();
                      Objects.requireNonNull(jsonElement, "null cannot be cast to non-null type com.google.gson.JsonObject");
                      jsonElement = jsonElement.e0("android");
                      if (!jsonElement instanceof JsonObject) {
                         objArray2 = new Object[0];
                         a.D().t("VideoCoverProportionViewBinder", "getRatioGuideDownloadUrl: androidConfig is not jsonObject: $androidConfig", objArray2);
                      }else if(k.d()){
                         jsonElement = jsonElement.e0("dark");
                         a.o(jsonElement, "androidConfig[COVER_RATIO_DARK_MODE]");
                         str = jsonElement.w();
                         a.o(str, "androidConfig[COVER_RATIO_DARK_MODE].asString");
                         str = a0.a(str);
                      }else {
                         jsonElement = jsonElement.e0("light");
                         a.o(jsonElement, "androidConfig[COVER_RATIO_LIGHT_MODE]");
                         str = jsonElement.w();
                         a.o(str, "androidConfig[COVER_RATIO_LIGHT_MODE].asString");
                         str = a0.a(str);
                      }
                      objArray = str;
                   }
                }
             }
             if (TextUtils.x(objArray)) {
                objArray = new Object[0];
                a.D().t("VideoCoverProportionViewBinder", "prefetchHelperDialogPicIfNeeded: picture url is empty: "+objArray, objArray);
                if (p1 != null) {
                   p1.invoke();
                }
                return;
             }else {
                Object[] objArray1 = new Object[0];
                a.D().w("VideoCoverProportionViewBinder", "prefetchHelperDialogPicIfNeeded: pictureDownloadUrl = "+objArray, objArray1);
                obj = new DownloadTask$DownloadRequest(objArray);
                obj.setDestinationDir(p0.getParent());
                obj.setDestinationFileName(p0.getName());
                obj.setAllowedNetworkTypes(3);
                obj.setDownloadTaskType(DownloadTask$DownloadTaskType.IMMEDIATE);
                obj.setNeedCDNReport(true);
                b[] uobArray = new b[true];
                uobArray[0] = new VideoCoverProportionViewBinder$m(p1, p0);
                DownloadManager.n().E(obj, uobArray);
             }
          }
       }
       return;
    }
}
