package com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import com.yxcorp.gifshow.v3.EditorActivity$h;
import c35.i;
import c35.c;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import com.yxcorp.gifshow.widget.l;
import k2b.w;
import voc.o;
import java.util.HashMap;
import crd.a;
import t36.f;
import io.reactivex.subjects.PublishSubject;
import mrd.a;
import wwc.n0;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import java.lang.Object;
import lwc.d;
import rwc.j;
import ooc.l0;
import java.lang.String;
import lnc.a1;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import lq.i;
import lnc.pb;
import com.yxcorp.gifshow.v3.previewer.f;
import t36.f$a;
import ooc.j0;
import lwc.j;
import lq.l$a;
import k2b.u1;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.EditorActivity;
import android.content.Intent;
import android.os.SystemClock;
import android.app.Activity;
import ekd.j0;
import tkd.b;
import tkd.d;
import om6.c;
import android.content.Context;
import om6.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import brd.t;
import lwc.a0;
import erd.o;
import t45.d;
import brd.z;
import lwc.b0;
import io.reactivex.android.schedulers.a;
import lwc.p;
import erd.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.v3.previewer.m;
import crd.b;
import com.kuaishou.edit.draft.Workspace$Type;
import ooc.g1;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment$d;
import java.lang.Enum;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsPhotoFragmentV3ViewBinder;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import java.util.ArrayList;
import elb.x;
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.x$c;
import lwc.g0;
import java.lang.Runnable;
import lwc.l0;
import com.yxcorp.gifshow.v3.AbsEditorActivityViewBinder;
import com.yxcorp.gifshow.v3.previewer.v;
import android.view.View;
import java.util.List;
import lnc.x;
import lwc.f0;
import com.kuaishou.edit.draft.Workspace$From;
import lwc.h0;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import lnc.e7;
import uwc.b;
import java.util.Objects;
import kuaishou.perf.page.impl.d;
import ooc.j;
import com.yxcorp.gifshow.v3.previewer.d0;
import com.kuaishou.android.post.session.previewtasks.GraphTaskExecuteManager$b;
import r1c.h;
import com.yxcorp.gifshow.v3.EditorManager;
import com.yxcorp.gifshow.v3.y;
import qaa.a;
import pwc.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Cover;
import com.yxcorp.gifshow.v3.previewer.l;
import kotlin.jvm.internal.a;
import swc.f;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import swc.c;
import wba.z;
import com.yxcorp.gifshow.v3.customizer.preview.EditorPreviewContainerLayout;
import lwc.e0;
import android.widget.RelativeLayout;
import vwc.a;
import java.util.Map;
import lwc.q0;
import uv8.o;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import com.yxcorp.gifshow.v3.previewer.i;
import io.reactivex.g;
import com.kuaishou.viewbinder.IViewBinder;
import lwc.h;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment$c;
import com.yxcorp.gifshow.v3.previewer.g;
import com.kwai.feature.post.funnel.PostCommonFunnel;
import maa.a;
import e17.i;
import w26.a;
import w26.c;
import com.kwai.gifshow.post.api.core.model.VideoProduceTime;
import k2b.n3;
import com.yxcorp.gifshow.v3.previewer.u;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.f;
import lwc.n0;
import lwc.k0;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import lwc.v0;
import com.kuaishou.android.post.PostArguments;
import com.kuaishou.android.post.EditAbilityConfig;
import q46.t;
import qxc.c;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsDisableNormalPublishPhotoFragmentViewBinder;
import lwc.a2;
import lnc.k5;
import android.os.Bundle;
import lq.a;
import xvc.f;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import tc.v;
import com.yxcorp.gifshow.v3.previewer.o;
import ab.f;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import w46.b;
import android.view.ViewParent;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.lifecycle.ViewModelStore;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment$b;
import androidx.lifecycle.ViewModelProvider$Factory;
import uwc.c;
import lwc.i;
import z1.a;
import hka.a;
import lq.l;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import com.yxcorp.gifshow.widget.FlexScreenStatusData;
import lnc.u6;
import java.io.Serializable;
import x59.g;
import com.yxcorp.gifshow.v3.previewer.c;
import lwc.s;
import com.yxcorp.gifshow.v3.previewer.r;
import com.yxcorp.gifshow.v3.previewer.p;
import lwc.o;
import lwc.w;
import lwc.v;
import com.yxcorp.gifshow.v3.previewer.e0;
import com.yxcorp.gifshow.v3.previewer.k;
import lwc.q;
import pb9.p;
import pb9.o;
import lwc.l;
import com.kuaishou.viewbinder.BaseViewBinder;
import com.kwai.horae.lifecycle.a;
import xwc.c;
import lwc.u0;
import lnc.b9;
import com.yxcorp.gifshow.v3.constructor.WorkspaceConstructor;
import com.yxcorp.gifshow.util.PictureMemoryUtils;
import lwc.n;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.edit.draft.model.workspace.Phase;
import laa.e;
import mba.m0;
import com.kwai.feature.post.api.fragment.FlyWheelBaseFragment;
import android.graphics.drawable.Drawable;
import lwc.t;
import lwc.m;
import lwc.r0;
import msd.l;
import a2.c0;
import androidx.core.view.ViewKt;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.v3.previewer.h;
import nwc.e;
import uwc.a;
import com.yxcorp.gifshow.v3.previewer.listener.EditorFragmentBackPressedResult;
import com.yxcorp.gifshow.v3.previewer.t;
import lwc.j0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoEditFeaturesStatusPackage;
import k2b.s;
import java.util.Collection;
import java.util.Iterator;
import k2b.s$b;

public class PhotosEditPreviewV3Fragment extends EditorBasePreviewFragment implements EditorActivity$h, i, c	// class@001580
{
    public b A1;
    public boolean B1;
    public c C1;
    public final l D1;
    public EditorItemFunc E1;
    public c F1;
    public long G;
    public final l H;
    public boolean I;
    public String J;
    public b K;
    public VideoProduceTime L;
    public final w M;
    public o N;
    public final Map O;
    public String P;
    public final a Q;
    public b R;
    public b S;
    public g T;
    public boolean U;
    public f U0;
    public FlexScreenStatusData V;
    public Workspace$Type V0;
    public PresenterV2 W;
    public WorkspaceConstructor W0;
    public y X;
    public Map X0;
    public c Y;
    public PublishSubject Y0;
    public Fragment Z;
    public f Z0;
    public a a1;
    public a b1;
    public a c1;
    public f d1;
    public BaseEditPreviewFragmentViewBinder e1;
    public f f1;
    public n0 g1;
    public MutableLiveData h1;
    public PublishSubject i1;
    public a j1;
    public d k1;
    public boolean l1;
    public boolean m1;
    public j n1;
    public j o1;
    public b p1;
    public h q1;
    public Workspace$Type r1;
    public Size s1;
    public j0 t1;
    public c u1;
    public AttrAnimProgressFragment v1;
    public h w1;
    public j x1;
    public final j y1;
    public f z1;
    public static final String G1 = "PHOTOS_EDIT_TYPE";

    public void PhotosEditPreviewV3Fragment(){
       super();
       this.H = new l();
       this.I = true;
       this.M = new w();
       this.N = new o(true);
       this.O = new HashMap();
       this.Q = new a();
       this.S = null;
       this.T = null;
       this.U = false;
       this.Z = this;
       this.U0 = new f();
       this.X0 = new HashMap();
       this.Y0 = PublishSubject.g();
       this.Z0 = new f();
       this.a1 = a.g();
       this.b1 = a.g();
       this.c1 = a.g();
       this.d1 = new f();
       this.f1 = new f();
       this.g1 = new n0();
       Boolean fALSE = Boolean.FALSE;
       this.h1 = new MutableLiveData(fALSE);
       this.i1 = PublishSubject.g();
       this.j1 = a.g();
       this.k1 = new d();
       this.l1 = false;
       this.m1 = false;
       this.n1 = new j(new l0(a1.p(0x7f100c60), a1.p(0x7f100c5e), a1.p(0x7f100c5f)));
       this.o1 = new j(fALSE);
       this.r1 = null;
       this.x1 = new j(fALSE);
       this.y1 = new j(this.t);
       this.B1 = false;
       this.C1 = null;
       this.D1 = new PhotosEditPreviewV3Fragment$a(this);
       this.E1 = null;
       this.F1 = a.g();
    }
    public void Ah(){
       if (PatchProxy.applyVoid(null, this, PhotosEditPreviewV3Fragment.class, "43")) {
          return;
       }
       PhotosEditPreviewV3Fragment tv1 = this.v1;
       if (tv1 != null) {
          tv1.dismiss();
          this.v1 = null;
       }
       return;
    }
    public final void Bh(){
       if (PatchProxy.applyVoid(null, this, PhotosEditPreviewV3Fragment.class, "15")) {
          return;
       }
       boolean b = (this.H.h() || pb.c(i.m()))? true: false;
       this.I = b;
       this.H.l();
       this.M.b();
       this.d1.s0(f.a);
       return;
    }
    public final void Ch(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PhotosEditPreviewV3Fragment.class, "38")) {
          return;
       }
       this.t1.o0().s0(new j(this));
       this.Dh(2, objArray);
       objArray = new Object[0];
       u1.onEvent(this.getUrl(), "cancel", objArray);
       return;
    }
    public boolean Dh(int p0,l$a p1){
       EditorActivity obj;
       if (PatchProxy.isSupport(PhotosEditPreviewV3Fragment.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, PhotosEditPreviewV3Fragment.class, "39");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w(this.getUrl(), "finishDraft action:"+p0, objArray);
       obj = this.getActivity();
       if (obj == null) {
          return i;
       }else if(p0 == 2){
          this.yh();
          Intent intent = new Intent();
          intent.putExtra("back_to_activity_time", SystemClock.uptimeMillis());
          obj.setResult(i, intent);
          obj.finish();
          if (j0.a(this.Fh(), "from_click_draft_remind_bubble", i)) {
             d.a(-1139054219).Ev(obj);
          }
          return true;
       }else {
          this.Kh("PhotoEditBack", obj);
          PhotosEditPreviewV3Fragment tQ = this.Q;
          t ot = (DraftUtils.b0(this.Y))? this.Nh(): t.just(Boolean.TRUE);
          tQ.c(ot.map(new a0(this)).subscribeOn(d.c).observeOn(d.a).flatMap(new b0(this)).observeOn(a.c()).doAfterTerminate(new p(this, obj, p1)).subscribe(Functions.d(), m.b));
          return true;
       }
    }
    public String E7(){
       PhotosEditPreviewV3Fragment tV0 = this.V0;
       if (tV0 == Workspace$Type.ATLAS || tV0 == Workspace$Type.LONG_PICTURE) {
          return "MultiPicture";
       }
       if (tV0 == Workspace$Type.SINGLE_PICTURE) {
          return "SinglePicture";
       }
       return null;
    }
    public final void Eh(){
       if (PatchProxy.applyVoid(null, this, PhotosEditPreviewV3Fragment.class, "36")) {
          return;
       }
       g1.l("continue_edit_continue", 1457);
       this.Dh(1, null);
       return;
    }
    public Intent Fh(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, PhotosEditPreviewV3Fragment.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getActivity() != null) {
          objArray = this.getActivity().getIntent();
       }
       return objArray;
    }
    public Workspace$Type Gh(){
       return this.V0;
    }
    public String Hh(){
       Object obj = PatchProxy.apply(null, this, PhotosEditPreviewV3Fragment.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = PhotosEditPreviewV3Fragment$d.b[this.Gh().ordinal()];
       if (i == 1) {
          return "longpicture";
       }
       if (i == 2) {
          return "atlas";
       }
       if (i != 3) {
          return "unknown";
       }
       return "singlepicture";
    }
    public AbsPhotoFragmentV3ViewBinder Ih(){
       return this.n;
    }
    public final void Jh(boolean p0,String p1,String p2){
       if (PatchProxy.isSupport(PhotosEditPreviewV3Fragment.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, PhotosEditPreviewV3Fragment.class, "35")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       int i = 0x7f081b66;
       if (p0) {
          String str = a1.p(R.string.arg_RES_7f100c5e);
          String str1 = a1.p(R.string.arg_RES_7f103d65);
          if (!x.f() || (TextUtils.isEmpty(p1) || TextUtils.isEmpty(p2))) {
             p1 = str;
             p2 = str1;
          }
          uArrayList.add(new x$c(i, p1, new g0(this), true));
          uArrayList.add(new x$c(R.drawable.arg_RES_7f081b6b, p2, new l0(this), false));
          x.g(this.getActivity(), this.getActivity().N3().e, uArrayList, false, v.b);
       }else {
          uArrayList.add(new x$c(R.drawable.arg_RES_7f081b7f, a1.p(R.string.arg_RES_7f100c50), super(this), true));
          if (this.Y.B0() != Workspace$From.IM_SEND_MESSAGE) {
             uArrayList.add(new x$c(i, a1.p(R.string.arg_RES_7f1047a2), new h0(this), false));
          }
          x.g(this.getActivity(), this.getActivity().N3().e, uArrayList, false, null);
       }
       return;
    }
    public final void Kh(String p0,GifshowActivity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotosEditPreviewV3Fragment.class, "53")) {
          return;
       }
       AttrAnimProgressFragment uAttrAnimPro = new AttrAnimProgressFragment();
       this.v1 = uAttrAnimPro;
       uAttrAnimPro.setCancelable(false);
       this.v1.show(p1.getSupportFragmentManager(), p0);
       return;
    }
    public final void Lh(boolean p0){
       EditorActivity activity;
       if (PatchProxy.isSupport(PhotosEditPreviewV3Fragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotosEditPreviewV3Fragment.class, "27")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("PhotosEditPreviewV3Fragment", "startShare\(\) called", objArray);
       PageMonitor.INSTANCE.onInit("com.yxcorp.gifshow.activity.share.ShareActivity");
       if (p0) {
          if (!PostExperimentUtils.t0()) {
             e7.c("post_directly");
          }else {
             e7.c("visibility_expiration");
          }
          this.g1.c();
       }
       if (PostExperimentUtils.A(this.Y)) {
          PhotosEditPreviewV3Fragment tp1 = this.p1;
          if (tp1 != null) {
             tp1.W0(i);
          }
       }
       activity = this.getActivity();
       if (activity == null) {
          return;
       }else {
          PhotosEditPreviewV3Fragment tg1 = this.g1;
          Objects.requireNonNull(tg1);
          if (!PatchProxy.applyVoid(null, tg1, n0.class, "9")) {
             d.d("postEditNextMonitor").h("clickToCover");
             d.d("postEditNextMonitor").g("coverToDraft");
          }
          this.Kh("Build", activity);
          j.a(this.Y);
          if (!PatchProxy.isSupport(PhotosEditPreviewV3Fragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotosEditPreviewV3Fragment.class, "42")) {
             Object[] objArray1 = new Object[i];
             a.D().w("PhotosEditPreviewV3Fragment", "nextstep cost nextOnTaskGraph start isDirectlyPublish:"+p0, objArray1);
             this.w1.a(new d0(this, p0));
             this.w1.d();
             if (i.m().M() && !p0) {
                this.w1.g("PhotosShareParamRequestBuildMTNSTask");
             }
             this.w1.i();
          }
          return;
       }
    }
    public void Mh(Workspace$Type p0,boolean p1){
       PhotosEditPreviewV3Fragment tQ;
       boolean b;
       if (PatchProxy.isSupport(PhotosEditPreviewV3Fragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, PhotosEditPreviewV3Fragment.class, "10")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("PhotosEditPreviewV3Fragment", "switchTo workspaceType:"+p0+",switchDelay:"+p1+",mWorkspaceType:"+this.V0, objArray);
       if (p1 || this.p1 == null) {
          this.r1 = p0;
          return;
       }else {
          BaseEditorFragment tB = this.B;
          if (tB != null) {
             Objects.requireNonNull(tB);
             if (!PatchProxy.applyVoidOneRefs(p0, tB, EditorManager.class, "55")) {
                tB.i = p0;
                tB.c = p0;
             }
          }
          if (p0 != this.V0) {
             if (a.f(this.Y).v() != null) {
                tQ = this.Q;
                t ot = (DraftUtils.b0(this.Y))? this.Nh(): t.just(Boolean.TRUE);
                tQ.c(ot.observeOn(d.a).subscribe(Functions.d(), l.b));
             }
             this.V0 = p0;
             tQ = this.p1;
             Objects.requireNonNull(tQ);
             if (!PatchProxy.applyVoidOneRefs(p0, tQ, b.class, "7")) {
                a.p(p0, "workspaceType");
                tQ.x0().v(p0);
                tQ.x0().w(p0, i);
                b m = tQ.m;
                b = (p0 == Workspace$Type.ATLAS)? true: false;
                m.setValue(Boolean.valueOf(b));
                Object[] objArray1 = new Object[i];
                a.D().w("EditPicturesViewModel", "changeWorkspaceType workspaceType:"+p0, objArray1);
             }
          }
          z.C(this.Y, this.p1.w0());
          this.Oh();
          this.r1 = null;
          if (this.Ih().h0() != null) {
             this.Ih().h0().post(new e0(this));
          }
          this.b1.onNext(new Object());
          f.p0(this.X0, a.class).s0(new q0(p0));
          return;
       }
    }
    public final t Nh(){
       Object obj = PatchProxy.apply(null, this, PhotosEditPreviewV3Fragment.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.t1.p0().e(EditorItemFunc.COVER_PHOTO)) {
          return t.just(Boolean.TRUE);
       }
       return t.create(new i(this)).subscribeOn(d.a);
    }
    public IViewBinder O1(){
       return this.Ih();
    }
    public final void Oh(){
       if (PatchProxy.applyVoid(null, this, PhotosEditPreviewV3Fragment.class, "58")) {
          return;
       }
       PhotosEditPreviewV3Fragment tp1 = this.p1;
       if (tp1 == null) {
          return;
       }
       this.q1.O0(this.getActivity(), this.V0, tp1.r0(), this.p1.w0());
       return;
    }
    public void Qd(boolean p0){
       boolean b;
       Object[] objArray;
       if (PatchProxy.isSupport(PhotosEditPreviewV3Fragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotosEditPreviewV3Fragment.class, "26")) {
          return;
       }
       this.o1.setValue(Boolean.valueOf(p0));
       this.t1.o0().s0(new PhotosEditPreviewV3Fragment$c(this, p0));
       PhotosEditPreviewV3Fragment tg1 = this.g1;
       Workspace$Type type = this.Gh();
       Objects.requireNonNull(tg1);
       if (!PatchProxy.applyVoidOneRefs(type, tg1, n0.class, "7") && (type != null && !TextUtils.isEmpty(n0.b(type)))) {
          d.d("postEditNextMonitor").n();
          d.d("postEditNextMonitor").l(n0.b(type));
          d.d("postEditNextMonitor").g("clickToCover");
       }
    label_006b :
       this.d1.s0(g.a);
       PostCommonFunnel.b.b(null, "photo_preview_next_press");
       u obj = PatchProxy.apply(null, this, PhotosEditPreviewV3Fragment.class, "65");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(this.Gh() != Workspace$Type.LONG_PICTURE){
          objArray = new Object[false];
          a.D().w("PhotosEditPreviewV3Fragment", "showLongPictureMaxCountToastIfNeeded not long picture", objArray);
       }else if(this.Y.o0() == null){
          objArray = new Object[false];
          a.D().w("PhotosEditPreviewV3Fragment", "showLongPictureMaxCountToastIfNeeded assetDraft is null", objArray);
       }else {
          List list = this.Y.o0().z();
          Object[] objArray1 = new Object[false];
          a.D().w("PhotosEditPreviewV3Fragment", "longPictureDataList size: "+list.size(), objArray1);
          if (list.size() > 110) {
             i.d(R.style.arg_RES_7f11066a, this.getString(R.string.arg_RES_7f100b87));
             b = true;
          }
       }
       b = false;
       if (b) {
          return;
       }else if(!this.isAdded() || this.U != null){
          this.U = true;
          if (p0 && !d.a(0x27e26f6e).uu()) {
             this.U = false;
             return;
          }else {
             this.yh();
             n3.a(this.L, this.M);
             if (this.V0 == Workspace$Type.SINGLE_PICTURE) {
                obj = new u(this, p0);
                if (PostExperimentUtils.A(this.Y)) {
                   this.Q.c(f.R(obj, this.y1.getValue()));
                }else {
                   obj.run();
                }
             }else if(PostExperimentUtils.A(this.Y)){
                this.Q.c(f.R(new n0(this, p0), this.y1.getValue()));
             }else {
                this.Lh(p0);
             }
          }
       }
       return;
    }
    public boolean T0(){
       return true;
    }
    public boolean T4(boolean p0){
       PhotosEditPreviewV3Fragment obj;
       boolean b2;
       Object[] objArray1;
       if (PatchProxy.isSupport(PhotosEditPreviewV3Fragment.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, PhotosEditPreviewV3Fragment.class, "34");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.Y;
       boolean b = false;
       if (obj != null && (!obj.E() && (this.getActivity() != null && (!this.getActivity().isFinishing() && (!this.getActivity() instanceof EditorActivity || this.getActivity().N3() == null))))) {
          return b;
       }else {
          Intent intent = this.getActivity().getIntent();
          l$a uoa = null;
          String str = (intent != null)? j0.f(intent, "SOURCE"): uoa;
          boolean b1 = true;
          if (TextUtils.equals(str, "share_photos")) {
             f.O(this.getActivity(), new k0(this));
             return b1;
          }else if(!this.isAdded()){
             return b;
          }else if(this.getActivity() != null && (this.getActivity().getIntent() != null && j0.a(this.getActivity().getIntent(), "IS_RECOVER", b))){
             b2 = true;
          }else {
             b2 = false;
          }
          boolean b3 = DraftFileManager.E().H(this.Y).exists();
          Object[] objArray = new Object[b];
          a.D().w(this.getUrl(), "cancelPrompt recovered: "+b2+", has origin: "+b3, objArray);
          if (DraftUtils.e0(this.Y) && (b2 || (!DraftUtils.N(this.Y) || this.Y.B0() == Workspace$From.PROFILE_BACKGROUND))) {
             objArray1 = new Object[b];
             a.D().w(this.getUrl(), "Workspace unmodified. Finish.", objArray1);
             return this.Dh(2, uoa);
          }else {
             this.B1 = b;
             if (!b3 && (TextUtils.equals(this.J, "post_share_photo") || b2)) {
                g1.m("edit_edit_dialog", 1580);
                l0 b4 = this.n1.getValue().b;
                l0 c = this.n1.getValue().c;
                if (b2) {
                   this.B1 = b1;
                }
                this.Jh(b1, b4, c);
                objArray1 = new Object[b];
                a.D().w(this.getUrl(), "Workspace modified or recovered. Ask user.", objArray1);
             }else if(p0){
                this.B1 = b1;
                this.Jh(b, uoa, uoa);
                x.f();
             }else {
                this.t1.o0().s0(new v0(this));
                this.Dh(2, uoa);
                Object[] objArray2 = new Object[b];
                u1.onEvent(this.getUrl(), "cancel", objArray2);
             }
             objArray1 = new Object[b];
             a.D().w(this.getUrl(), "New workspace modified. Ask user.", objArray1);
             return b1;
          }
       }
    }
    public IViewBinder V5(int p0){
       AbsPhotoFragmentV3ViewBinder uAbsPhotoFra;
       if (PatchProxy.isSupport(PhotosEditPreviewV3Fragment.class)) {
          uAbsPhotoFra = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PhotosEditPreviewV3Fragment.class, "63");
          if (uAbsPhotoFra != PatchProxyResult.class) {
          }else {
          label_001b :
             String str = EditAbilityConfig.fragmentScenario(i.g());
             if (str.isEmpty()) {
                str = t.c(this.Fh());
             }
             if (TextUtils.isEmpty(str) && !EditAbilityConfig.enableNormalPublish(i.g())) {
                str = "DISABLE_NORMAL_PUBLISH_SCENARIO";
             }
             if (EditAbilityConfig.enableNormalPublish(i.g())) {
                uAbsPhotoFra = c.a(str, AbsPhotoFragmentV3ViewBinder.class, this);
             }else {
                uAbsPhotoFra = c.a(str, AbsDisableNormalPublishPhotoFragmentViewBinder.class, this);
             }
          }
       }else {
          goto label_001b ;
       }
       return uAbsPhotoFra;
    }
    public boolean Zg(){
       return false;
    }
    public void fh(){
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotosEditPreviewV3Fragment.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new a2();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, PhotosEditPreviewV3Fragment.class, "71");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(PhotosEditPreviewV3Fragment.class, new a2());
       }else {
          obj.put(PhotosEditPreviewV3Fragment.class, null);
       }
       return obj;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, PhotosEditPreviewV3Fragment.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "task_id="+this.P;
    }
    public String getUrl(){
       Object obj = PatchProxy.apply(null, this, PhotosEditPreviewV3Fragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ks://preview/"+this.Hh();
    }
    public void gh(){
    }
    public void onActivityPause(){
       if (PatchProxy.applyVoid(null, this, PhotosEditPreviewV3Fragment.class, "30")) {
          return;
       }
       BaseEditorFragment tB = this.B;
       if (tB != null) {
          tB.y();
       }
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(PhotosEditPreviewV3Fragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, PhotosEditPreviewV3Fragment.class, "8")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (!this.isAdded()) {
          return;
       }
       if (p0 == 529) {
          this.G = j0.c(p2, "back_to_activity_time", 0);
       }else {
          k5.a(this.getChildFragmentManager(), p0, p1, p2);
       }
       return;
    }
    public void onActivityResume(){
       if (PatchProxy.applyVoid(null, this, PhotosEditPreviewV3Fragment.class, "31")) {
          return;
       }
       BaseEditorFragment tB = this.B;
       if (tB != null) {
          tB.z();
       }
       return;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, PhotosEditPreviewV3Fragment.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.ra(false);
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotosEditPreviewV3Fragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       PhotosEditPreviewV3Fragment tg1 = this.g1;
       Objects.requireNonNull(tg1);
       if (!PatchProxy.applyVoid(null, tg1, n0.class, "14")) {
          d.d("postLoadToEditorMonitor").h("pauseToCreate");
          d.d("postLoadToEditorMonitor").g("createToPreview");
       }
       this.e1 = this.n;
       this.vh(false);
       this.z1 = i.m().p().f();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       boolean b1;
       z a;
       Object[] objArray2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j0 obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PhotosEditPreviewV3Fragment.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = ViewModelProviders.of(this.jh()).get(j0.class);
       this.t1 = obj;
       boolean b = true;
       this.w1 = new h(obj.o0(), b);
       Object[] objArray = new Object[0];
       String str = "PhotosEditPreviewV3Fragment";
       a.D().w(str, "onCreateView mEditorActivityViewModel:"+this.t1, objArray);
       Object[] objArray1 = null;
       String obj1 = PatchProxy.apply(objArray1, this, PhotosEditPreviewV3Fragment.class, "19");
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else if(this.getActivity() != null && this.getActivity().isFinishing()){
          FragmentActivity activity1 = this.getActivity();
          Intent intent = this.Fh();
          Bundle arguments = this.getArguments();
          if (activity1 != null && (intent != null && arguments != null)) {
             obj1 = "PHOTOS_EDIT_TYPE";
             if (arguments.containsKey(obj1)) {
                try{
                   Fresco.getImagePipeline().getBitmapMemoryCache().p(o.a);
                }catch(java.lang.Exception e7){
                   PostUtils.D(str, "checkInit", e7);
                }
                int intx = arguments.getInt(obj1);
                Workspace$Type type = Workspace$Type.forNumber(intx);
                this.V0 = type;
                if (type == null) {
                   objArray2 = new Object[0];
                   a.D().t(str, "Unknown type "+intx, objArray2);
                   activity1.finish();
                }else {
                   Workspace$Type[] typeArray = new Workspace$Type[]{Workspace$Type.ATLAS,Workspace$Type.LONG_PICTURE,Workspace$Type.SINGLE_PICTURE};
                   c uoc = i.m().x(typeArray);
                   this.Y = uoc;
                   if (uoc == null) {
                      objArray2 = new Object[0];
                      a.D().t(this.getUrl(), "Workspace not found. Finish.", objArray2);
                      activity1.finish();
                   }else {
                      b1 = true;
                   }
                }
             }
          }
       }
       b1 = false;
       if (!b1) {
          return objArray1;
       }else {
          BaseEditorFragment tq = this.q;
          if (tq == null) {
             this.q = super.onCreateView(p0, p1, p2);
          }else if(tq.getParent() instanceof ViewGroup){
             this.q.getParent().removeView(this.q);
          }
          this.W = new PresenterV2();
          this.getViewModelStore().clear();
          this.u1 = ViewModelProviders.of(this, new PhotosEditPreviewV3Fragment$b(this)).get(c.class);
          this.t1.p0().c(new i(this));
          if (this.getActivity() instanceof GifshowActivity) {
             this.getActivity().F2(this);
          }
          if (!PatchProxy.applyVoid(objArray1, this, PhotosEditPreviewV3Fragment.class, "20")) {
             i.m().f(this.D1);
             h oh = f.l(this);
             this.q1 = oh;
             oh.M0(this.Y);
             this.q1.H0(this.z1);
             this.Ih().V(this.q1);
             this.Ih().P(this.U0);
             this.Ih().O(this.f1);
             if (this.getActivity() != null) {
                this.V = u6.a(this.getActivity(), 0);
             }
             try{
                Fresco.getImagePipeline().getBitmapMemoryCache().p(o.a);
             }catch(java.lang.Exception e0){
                PostUtils.D(str, "init", e0);
             }
             this.J = j0.f(this.Fh(), "SOURCE");
             obj1 = "photo_task_id";
             String str1 = j0.f(this.Fh(), obj1);
             this.P = str1;
             if (TextUtils.isEmpty(str1)) {
                this.P = u1.f();
                this.Fh().putExtra(obj1, this.P);
             }
             obj1 = "video_produce_time";
             this.L = (j0.g(this.Fh(), obj1))? j0.e(this.Fh(), obj1): new VideoProduceTime();
             this.T = i.m().p().d();
             this.getActivity().N3().G(this.q1, this);
             this.f1.s0(c.a);
             GifshowActivity activity = this.getActivity();
             if (!PatchProxy.applyVoidOneRefs(activity, this, PhotosEditPreviewV3Fragment.class, "52")) {
                if (j0.e(this.getActivity().getIntent(), "INTENT_EDITOR_SPLASH_IMAGE_INFO") == null) {
                   b = false;
                }
                if (!b) {
                   this.Kh("InitLoad", activity);
                }
                t ot = (!this.Y.D())? DraftFileManager.E().m0(this.Y).observeOn(d.a).doOnNext(new s(this)): t.just(this.Y);
                if (PostExperimentUtils.Y()) {
                   ot = ot.flatMap(r.b);
                }
                ArrayList uArrayList = new ArrayList();
                ArrayList uArrayList1 = new ArrayList();
                a = d.a;
                this.K = ot.flatMap(new p(this, uArrayList, uArrayList1)).doAfterTerminate(new o(this)).observeOn(a).doOnNext(new w(this, uArrayList, uArrayList1)).observeOn(d.c).doOnNext(new v(this, activity)).observeOn(a).doOnNext(new e0(this)).subscribe(new k(this), new q(activity));
             }
             o.b(p.g(0), this.P);
          }
          this.t1.o0().s0(new l(this, p0, p1, p2));
          return this.dh(this.q);
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, PhotosEditPreviewV3Fragment.class, "18")) {
          return;
       }
       super.onDestroy();
       this.Ih().onDestroy();
       this.o.f();
       BaseEditorFragment tB = this.B;
       if (tB != null) {
          tB.E();
       }
       this.Ah();
       PhotosEditPreviewV3Fragment tw1 = this.w1;
       if (tw1 != null) {
          tw1.f();
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, PhotosEditPreviewV3Fragment.class, "17")) {
          return;
       }
       super.onDestroyView();
       if (this.C1 != null) {
          this.C1.a();
       }
       if (i.h()) {
          i.m().U(this.D1);
       }
       this.t1.o0().s0(new u0(this));
       boolean b = false;
       this.H.q(b);
       this.H.m();
       PhotosEditPreviewV3Fragment tK = this.K;
       if (tK != null) {
          b9.a(tK);
       }
       tK = this.S;
       if (tK != null) {
          b9.a(tK);
       }
       b9.a(this.R);
       b9.a(this.A1);
       this.K = null;
       BaseEditorFragment tB = this.B;
       if (tB != null) {
          tB.E();
       }
       Object[] objArray = new Object[b];
       PostUtils.onEvent("preview_finish", "preview_finish", objArray);
       b9.a(this.Q);
       tK = this.W;
       if (tK != null) {
          try{
             tK.unbind();
             this.W.destroy();
          }catch(java.lang.Exception e0){
             PostUtils.D("PhotosEditPreviewV3Fragment", "onDestroyView", e0);
          }
          this.W = null;
       }
       tK = this.X;
       if (tK != null) {
          tK.unbind();
          this.X.destroy();
          this.X = null;
       }
       tK = this.W0;
       if (tK != null) {
          tK.e();
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().l3(this);
       }
       PictureMemoryUtils.d.d().clear();
       super.onDestroyView();
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(PhotosEditPreviewV3Fragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PhotosEditPreviewV3Fragment.class, "9")) {
          return;
       }
       super.onHiddenChanged(p0);
       if (!p0) {
          this.zh();
          this.t1.p0().c(new n(this));
          this.M.c();
          BaseEditorFragment tB = this.B;
          if (tB != null && tB.w()) {
             this.H.p();
             this.H.v();
          }
          PhotosEditPreviewV3Fragment tr1 = this.r1;
          if (tr1 != null) {
             this.Mh(tr1, false);
          }
          this.q1.L0();
       }else {
          this.Bh();
          this.q1.K0();
       }
       return;
    }
    public void onPause(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PhotosEditPreviewV3Fragment.class, "13")) {
          return;
       }
       this.Bh();
       this.N.h(true);
       super.onPause();
       PhotosEditPreviewV3Fragment tg1 = this.g1;
       Objects.requireNonNull(tg1);
       if (!PatchProxy.applyVoid(objArray, tg1, n0.class, "4")) {
          d.d("postEditNextMonitor").h("finishToPause");
          d.d("postEditNextMonitor").g("pauseToCreate");
       }
       return;
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PhotosEditPreviewV3Fragment.class, "12")) {
          return;
       }
       super.onResume();
       this.zh();
       boolean b = false;
       this.U = b;
       if (!PatchProxy.applyVoid(objArray, this, PhotosEditPreviewV3Fragment.class, "16") && !this.isHidden()) {
          this.M.c();
          BaseEditorFragment tB = this.B;
          if (tB != null && (tB.w() && this.I != null)) {
             this.H.v();
          }
       }
    label_003f :
       PhotosEditPreviewV3Fragment tY = this.Y;
       if (tY != null) {
          if (tY.D()) {
             this.Y.j1(Phase.EDIT);
          }
          this.Y.u().q(true);
       }
       long l = 0;
       if (this.G - l) {
          SystemClock.uptimeMillis();
          this.G = l;
       }
       this.N.h(b);
       Object[] objArray1 = new Object[b];
       a.D().w("EditCost", "进入图集和长图的预览页面", objArray1);
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, PhotosEditPreviewV3Fragment.class, "11")) {
          return;
       }
       super.onStart();
       BaseEditorFragment tq = this.q;
       if (tq != null && tq.getBackground() != null) {
          this.q.getBackground().setAlpha(255);
       }
       this.isHidden();
       return;
    }
    public void onStop(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PhotosEditPreviewV3Fragment.class, "14")) {
          return;
       }
       if (this.K == null) {
          this.H.l();
       }
       PhotosEditPreviewV3Fragment tg1 = this.g1;
       Objects.requireNonNull(tg1);
       if (!PatchProxy.applyVoid(objArray, tg1, n0.class, "15")) {
          d.d("postLoadToEditorMonitor").f();
          d.d("postPhotoToEditorMonitor").f();
       }
       super.onStop();
       this.x1.setValue(Boolean.TRUE);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotosEditPreviewV3Fragment.class, "5")) {
          return;
       }
       if (this.getActivity() != null && !this.getActivity().isFinishing()) {
          super.onViewCreated(p0, p1);
          this.A1 = this.z1.d.subscribe(new t(this));
          this.t1.o0().s0(new m(this, p0, p1));
          this.b1.onNext(new Object());
          n0.f();
          if (!PatchProxy.applyVoid(null, this, PhotosEditPreviewV3Fragment.class, "6")) {
             p0 = this.q.findViewById(R.id.action_recycler_view);
             if (p0 == null) {
                Object[] objArray = new Object[0];
                a.D().t("PhotosEditPreviewV3Fragment", "actionRecyclerView == null", objArray);
             }else {
                ViewKt.c(p0, new r0(this));
             }
          }
          this.s1 = new Size(n.k(this.getActivity()), n.j(this.getActivity()));
       }
       return;
    }
    public boolean ra(boolean p0){
       BaseEditorFragment obj;
       if (PatchProxy.isSupport(PhotosEditPreviewV3Fragment.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, PhotosEditPreviewV3Fragment.class, "29");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (this.getActivity() != null && !this.getActivity().V3(this)) {
          return b;
       }else {
          PostCommonFunnel.b.b(null, "photo_preview_back_press");
          this.d1.s0(h.a);
          obj = this.B;
          if (obj != null && obj.A()) {
             return true;
          }else if(this.u1.s0().d() == EditorFragmentBackPressedResult.INTERCEPT_EVENT){
             return true;
          }else if(this.V0 == Workspace$Type.SINGLE_PICTURE){
             if (EditAbilityConfig.enableBackDialog(i.g())) {
                t ot = new t(this);
                if (PostExperimentUtils.A(this.Y)) {
                   this.Q.c(f.R(ot, this.y1.getValue()));
                }else {
                   ot.run();
                }
             }else if(p0){
                this.Ch();
             }
             return b;
          }else if(PostExperimentUtils.A(this.Y)){
             if (EditAbilityConfig.enableBackDialog(i.g())) {
                this.Q.c(f.R(new j0(this), this.y1.getValue()));
             }else if(p0){
                this.Ch();
             }
             return b;
          }else if(EditAbilityConfig.enableBackDialog(i.g())){
             return this.T4(true);
          }else if(p0){
             this.Ch();
          }
          return b;
          return true;
       }
    }
    public void v9(ClientContent$VideoEditFeaturesStatusPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotosEditPreviewV3Fragment.class, "32")) {
          return;
       }
       if (this.B != null) {
          s.b(p0, this.y1.getValue());
       }
       return;
    }
    public final void yh(){
       if (PatchProxy.applyVoid(null, this, PhotosEditPreviewV3Fragment.class, "33")) {
          return;
       }
       if (!this.O.isEmpty()) {
          Iterator iterator = this.O.values().iterator();
          while (iterator.hasNext()) {
             s$b uob = iterator.next();
             if (uob.e()) {
                uob.a();
             }
          }
       }
       return;
    }
    public final void zh(){
       if (PatchProxy.applyVoid(null, this, PhotosEditPreviewV3Fragment.class, "69")) {
          return;
       }
       PhotosEditPreviewV3Fragment tY = this.Y;
       if (tY != null && !tY.L0().isEmpty()) {
          tY = this.Y;
          DraftFileManager.d(tY, tY.L0());
       }
       return;
    }
}
