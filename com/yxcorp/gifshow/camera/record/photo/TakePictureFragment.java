package com.yxcorp.gifshow.camera.record.photo.TakePictureFragment;
import c35.c;
import zg9.c;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import com.yxcorp.gifshow.camera.record.sidebar.j;
import qi9.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.camerasdk.models.Business;
import com.kwai.camerasdk.models.Page;
import com.yxcorp.gifshow.camera.bubble.c;
import java.util.List;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister;
import java.util.ArrayList;
import com.yxcorp.gifshow.camera.record.sidebar.n;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.video.gauss.b;
import com.yxcorp.gifshow.camera.record.photo.f;
import rf9.f;
import hg9.g0;
import z1.a;
import com.yxcorp.gifshow.camera.record.photo.m;
import cg9.d;
import wc9.q;
import ig9.b;
import hg9.p0;
import erd.g;
import crd.b;
import hg9.i0;
import tkd.b;
import tkd.d;
import t5b.a;
import lnc.s;
import ixc.c;
import hg9.j0;
import hg9.k0;
import xg9.i;
import hg9.l0;
import com.yxcorp.gifshow.camera.record.lensdirty.DirtyLensController;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.kwai.feature.post.api.util.g;
import dh9.a;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import com.yxcorp.gifshow.camera.record.photo.TakePictureActivity;
import com.yxcorp.gifshow.camera.record.frame.c;
import com.kwai.gifshow.post.api.core.model.CameraFramePageType;
import android.os.Bundle;
import pi9.c;
import com.yxcorp.gifshow.camera.record.wide.a;
import com.yxcorp.gifshow.camera.record.wide.UltraWideAndSuperStabilityStateHelper;
import com.yxcorp.gifshow.media.model.CameraConfig;
import uh9.c;
import hg9.m0;
import com.yxcorp.gifshow.camera.record.screen.b;
import gi9.b;
import hg9.h0;
import pi9.e;
import uc9.f;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import fn6.a;
import com.yxcorp.gifshow.media.model.CameraPageConfig;
import com.yxcorp.gifshow.video.api.camera.CameraResolutionParameters;
import oe6.e;
import com.yxcorp.gifshow.camerasdk.j;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import java.lang.Math;
import j8c.a;
import java.lang.StringBuilder;
import java.lang.Enum;
import q87.c;
import java.lang.Boolean;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import ed9.f;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import hg9.o0;
import com.trello.rxlifecycle3.components.support.RxFragment;
import eoc.f;
import wc9.r;
import hg9.n0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kuaishou.ax2c.PreLoader;
import android.content.Context;
import i2b.a;
import android.view.ViewStub;
import com.yxcorp.gifshow.util.rx.RxBus;
import lm6.g;
import java.util.Iterator;
import oc9.t;
import oc9.b0;
import android.widget.FrameLayout;
import m65.f;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.camera.record.photo.TakePictureFragment$a;
import com.kwai.feature.post.api.fragment.FlyWheelBaseFragment;

public class TakePictureFragment extends CameraBaseFragment implements c, c	// class@000ea2
{
    public f B;
    public boolean C;
    public c D;
    public boolean E;
    public TakePictureType F;
    public CameraResolutionParameters G;
    public c H;
    public a I;
    public DirtyLensController J;
    public j K;
    public static final int L;

    public void TakePictureFragment(){
       super();
       this.F = TakePictureType.SHOOT_IMAGE;
    }
    public j E6(){
       return this.K;
    }
    public c E9(){
       c obj = PatchProxy.apply(null, this, TakePictureFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.E9();
       TakePictureFragment tF = this.F;
       if (tF == TakePictureType.LIVE_ENTRY || tF == TakePictureType.LIVE_PLAY) {
          obj.l0 = Business.kLiveCover;
          obj.m0 = 0;
       }else {
          obj.l0 = Business.kVideoRecord;
          obj.m0 = 6;
       }
       return obj;
    }
    public Page Nb(){
       TakePictureFragment tF = this.F;
       if (tF == TakePictureType.LIVE_ENTRY || tF == TakePictureType.LIVE_AVATAR) {
          return Page.kLivePreviewPage;
       }
       return Page.kPhotoPage;
    }
    public c V7(){
       return this.D;
    }
    public List ch(){
       TakePictureFragment tF;
       ArrayList obj = PatchProxy.apply(null, this, TakePictureFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       RecordPModuleRegister.f().a();
       obj = new ArrayList();
       this.K = (this.rh())? new n(this.lh(), this.y): new j(this.lh(), this.y);
       TakePictureType lIVE_AVATAR = TakePictureType.LIVE_AVATAR;
       if (this.F == lIVE_AVATAR) {
          obj.add(new b(this.lh(), this.y));
          obj.add(new f(this.lh(), this.y));
          obj.add(new f(this.lh(), this.y));
       }
       RecordPModuleRegister.f().c("PRETTIFY", new g0(this));
       obj.add(new m(this.lh(), this.y));
       obj.add(this.K);
       obj.add(new d(this.lh(), this.y));
       q oq = new q(this.lh(), this.y);
       obj.add(oq);
       this.ih().l(b.class, new p0(this, oq));
       RecordPModuleRegister.f().c("PRETTIFY", new i0(this, obj));
       int i = 0x3bf0d115;
       if (d.a(i).isAvailable() && (d.a(i).XQ() && this.F != lIVE_AVATAR)) {
          String str = "MAGIC_EMOJI";
          RecordPModuleRegister.f().c(str, new j0(this, obj));
          tF = this.F;
          if (tF == TakePictureType.SHARE || tF == TakePictureType.STATE_IMAGE) {
             RecordPModuleRegister.f().c(str, new k0(this, obj));
          }
       }
       tF = this.F;
       lIVE_AVATAR = TakePictureType.LIVE_ENTRY;
       if (tF != lIVE_AVATAR && tF != TakePictureType.LIVE_PLAY) {
          obj.add(new i(this.lh(), this.y));
       }
       RecordPModuleRegister.f().c("ALBUM", new l0(this, obj));
       DirtyLensController uDirtyLensCo = new DirtyLensController(this.lh(), this.y);
       this.J = uDirtyLensCo;
       obj.add(uDirtyLensCo);
       this.getActivity();
       if (this.F == TakePictureType.STATE_IMAGE) {
          obj.add(new a(this.lh(), this.y));
       }else if(!this.getActivity() instanceof CameraActivity && (this.getActivity() instanceof TakePictureActivity || TakePictureType.LIVE_PLAY == this.F)){
          c uoc = new c(this.lh(), this.y, this.qh());
          this.H = uoc;
          uoc.H2(this.F);
          obj.add(this.H);
       }
       TakePictureType sHARE = TakePictureType.SHARE;
       if (this.F == sHARE && c.c(this.getArguments())) {
          a uoa = new a(this.lh(), this.y, new UltraWideAndSuperStabilityStateHelper(true, false, this.Ve()));
          this.I = uoa;
          obj.add(uoa);
       }
       tF = this.F;
       if (tF != sHARE && (tF != lIVE_AVATAR && (tF == TakePictureType.LIVE_PLAY || tF == TakePictureType.SEND_IMAGE))) {
          obj.add(new c(this.lh(), this.y));
       }
       RecordPModuleRegister.f().c("KWAI", new m0(this, obj));
       obj.add(new b(this.lh(), this.y));
       obj.add(new b(this.lh(), this.y));
       RecordPModuleRegister.f().c("PRETTIFY", new h0(this));
       if (e.e()) {
          obj.add(new f(this.lh(), this.y));
       }
       return obj;
    }
    public int getPage(){
       TakePictureFragment tF = this.F;
       if (tF == TakePictureType.LIVE_AVATAR || tF == TakePictureType.STATE_IMAGE) {
          return 0;
       }
       if (tF == TakePictureType.LIVE_ENTRY) {
          return 14;
       }
       return 96;
    }
    public String getPageParams(){
       Object[] obj = PatchProxy.apply(null, this, TakePictureFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[]{TextUtils.k(this.z),a.b(this.getActivity())};
       return String.format("task_id=%s&launch_type=%s", obj);
    }
    public String getTaskId(){
       return this.z;
    }
    public CameraPageConfig jh(){
       Object obj = PatchProxy.apply(null, this, TakePictureFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Ve().getPhotoPageConfig();
    }
    public CameraResolutionParameters kh(){
       CameraResolutionParameters mPreviewWidt;
       CameraPageConfig obj = PatchProxy.apply(null, this, TakePictureFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.jh().mPreviewWidth;
       CameraPageConfig mPreviewHeig = this.jh().mPreviewHeight;
       boolean b = e.a();
       TakePictureFragment tF = this.F;
       int i = 1;
       if (tF == TakePictureType.LIVE_PLAY) {
          TakePictureFragment tG = this.G;
          if (tG != null) {
             mPreviewWidt = tG.mPreviewWidth;
             mPreviewHeig = tG.mPreviewHeight;
             this.H.C2(i);
          }else if(tF == TakePictureType.LIVE_ENTRY){
             CameraBaseFragment tq = this.q;
             if (tq != null && tq.n() != null) {
                mPreviewWidt = this.q.n().j();
                mPreviewHeig = this.q.n().h();
                b = this.q.isFrontCamera();
             }
          }
          tF = this.F;
          if (tF != TakePictureType.SHARE && (tF != TakePictureType.SHOOT_IMAGE && (tF != TakePictureType.SEND_IMAGE && (tF == TakePictureType.MOMENT || tF == TakePictureType.PROFILE)))) {
             tF = this.H;
             if (tF != null) {
                if (tF.u2() > 0) {
                   mPreviewWidt = this.H.u2();
                }
                if (this.H.s2() > 0) {
                   mPreviewHeig = this.H.s2();
                }
             }else {
                this.n.getCameraView().setIsFullScreen(i);
             }
          }else if(tF == TakePictureType.LIVE_AVATAR){
             if (this.H.u2() > 0) {
                mPreviewWidt = this.H.u2();
             }
             if (this.H.s2() > 0) {
                mPreviewHeig = this.H.s2();
             }
          }
       }else {
          goto label_0036 ;
       }
       tF = this.F;
       if (tF != TakePictureType.LIVE_AUTHENTICATE && tF != TakePictureType.LIVE_AVATAR) {
          i = b;
       }
       CameraResolutionParameters uCameraResol = new CameraResolutionParameters();
       uCameraResol.mPreviewWidth = mPreviewWidt;
       uCameraResol.mPreviewHeight = mPreviewHeig;
       uCameraResol.mPreviewMaxSize = Math.max(mPreviewWidt, mPreviewHeig);
       uCameraResol.mIsFront = i;
       uCameraResol.mTaskId = this.z;
       a uoa = a.D();
       StringBuilder str = "";
       TakePictureFragment tF1 = this.F;
       String str1 = (tF1 == null)? "UNKNOWN": tF1.name();
       Object[] objArray = new Object[0];
       uoa.w("TakePictureFragment", str+str1+" preview size:"+mPreviewWidt+" "+mPreviewHeig, objArray);
       return uCameraResol;
    }
    public CameraPageType lh(){
       TakePictureFragment tF = this.F;
       if (tF == TakePictureType.LIVE_ENTRY) {
          return CameraPageType.LIVE_COVER;
       }
       if (tF == TakePictureType.LIVE_AVATAR) {
          return CameraPageType.LIVE_AVATAR;
       }
       return CameraPageType.PHOTO;
    }
    public String o(){
       TakePictureFragment tF = this.F;
       if (tF == TakePictureType.LIVE_AVATAR) {
          return "STATUS_PICTURE_TAKE";
       }
       if (tF == TakePictureType.STATE_IMAGE) {
          return "STATUS_EDIT_RECORD";
       }
       if (tF == TakePictureType.LIVE_ENTRY) {
          return "LIVE_TAKE_COVER";
       }
       return "PICTURE_TAKE";
    }
    public boolean onBackPressed(){
       TakePictureFragment obj = PatchProxy.apply(null, this, TakePictureFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.F;
       if (obj != TakePictureType.LIVE_ENTRY && obj != TakePictureType.LIVE_PLAY) {
          return super.onBackPressed();
       }
       if (!this.isVisible()) {
          return false;
       }
       if (!super.onBackPressed()) {
          this.C = true;
          this.ph();
       }
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TakePictureFragment.class, "1")) {
          return;
       }
       Bundle arguments = this.getArguments();
       if (arguments != null) {
          this.F = SerializableHook.getSerializable(arguments, "TakePictureType");
          this.G = SerializableHook.getSerializable(arguments, "TakePictureParameters");
       }
       this.B = new f(this.lh());
       c uoc = new c(this);
       this.D = uoc;
       uoc.p(1);
       super.onCreate(p0);
       this.C = false;
       f.b(PanelShowEvent.class, new o0(this), this);
       this.y.l(r.class, new n0(this));
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TakePictureFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       TakePictureFragment tF = this.F;
       int i = 0x7f0d15b3;
       if (tF != TakePictureType.LIVE_AUTHENTICATE) {
          if (tF == TakePictureType.LIVE_AVATAR) {
             i = 0x7f0d15b2;
          }else if(tF != TakePictureType.SEND_IMAGE && (tF != TakePictureType.MOMENT && (tF != TakePictureType.PROFILE && (tF == TakePictureType.LIVE_PLAY || tF == TakePictureType.LIVE_ENTRY)))){
             i = 0x7f0d0f5a;
          }else if(tF == TakePictureType.SHOOT_IMAGE || tF == TakePictureType.STATE_IMAGE){
             i = 0x7f0d15b5;
          }
       }
       View orWait = (PostExperimentUtils.H0())? PreLoader.getInstance().getOrWait(this.getActivity(), i, p1, false): a.g(p0, i, p1, false);
       if (!PatchProxy.applyVoidOneRefs(orWait, this, TakePictureFragment.class, "3") && orWait != null) {
          ViewStub viewStub = orWait.findViewById(R.id.camera_flash_bar_root_stub);
          if (viewStub != null) {
             if (this.rh()) {
                viewStub.setLayoutResource(R.layout.arg_RES_7f0d019d);
             }
             viewStub.inflate();
          }
       }
       return orWait;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, TakePictureFragment.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TakePictureFragment", "onDestroy", objArray);
       super.onDestroy();
       if (this.C != null) {
          RxBus.f.b(new g(this.F));
       }
       RecordPModuleRegister.f().d();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, TakePictureFragment.class, "5")) {
          return;
       }
       super.onResume();
       this.E = false;
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TakePictureFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Iterator iterator = this.za().iterator();
       while (iterator.hasNext()) {
          t ot = iterator.next();
          if (ot instanceof b0) {
             ot.d5(5);
          }
       }
       this.n.requestLayout();
       return;
    }
    public void ph(){
       if (PatchProxy.applyVoid(null, this, TakePictureFragment.class, "15")) {
          return;
       }
       this.E = true;
       if (this.x != null) {
          Object[] objArray = new Object[0];
          a.D().w("TakePictureFragment", "finish resume SurfaceView", objArray);
          this.n.getCameraView().getSurfaceView().resume();
       }
       if (this.getFragmentManager() != null) {
          this.getFragmentManager().beginTransaction().u(this).m();
       }
       return;
    }
    public final CameraFramePageType qh(){
       Object obj = PatchProxy.apply(null, this, TakePictureFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = TakePictureFragment$a.a[this.F.ordinal()];
       if (i == 1) {
          return CameraFramePageType.LIVE_AVATAR;
       }
       if (i != 2) {
          return CameraFramePageType.PHOTO;
       }
       return CameraFramePageType.LIVE_COVER;
    }
    public final boolean rh(){
       TakePictureFragment tF = this.F;
       boolean b = (tF == TakePictureType.LIVE_AVATAR || tF == TakePictureType.STATE_IMAGE)? true: false;
       return b;
    }
    public boolean x2(){
       TakePictureFragment obj = PatchProxy.apply(null, this, TakePictureFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.B;
       boolean b = (obj == null || !obj.a())? true: false;
       return b;
    }
    public String z4(){
       Object obj = PatchProxy.apply(null, this, TakePictureFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.qh() != CameraFramePageType.LIVE_COVER) {
          return super.z4();
       }
       if (this.k == null) {
          this.j = "LiveTakeCover";
          this.k = true;
       }
       return this.j;
    }
    public AnimCameraView z7(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, TakePictureFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getView() != null) {
          objArray = this.getView().findViewById(0x7f0a0631);
       }
       if (objArray == null && this.getActivity() != null) {
          objArray = this.getActivity().findViewById(0x7f0a0631);
       }
       return objArray;
    }
}
