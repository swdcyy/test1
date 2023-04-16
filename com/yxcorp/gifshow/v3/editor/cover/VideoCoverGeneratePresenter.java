package com.yxcorp.gifshow.v3.editor.cover.VideoCoverGeneratePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import lnc.d1;
import java.util.concurrent.atomic.AtomicBoolean;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverGeneratePresenter$a;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverGeneratePresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import t36.f;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import java.io.Serializable;
import ekd.j0;
import com.kwai.feature.post.api.core.model.EditCoverConfiguration;
import java.lang.StringBuilder;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Cover;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Runnable;
import ekd.k1;
import android.graphics.Bitmap;
import java.lang.Boolean;
import ppc.h2;
import io.reactivex.i;
import brd.a0;
import ppc.i2;
import java.util.Objects;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.single.e;
import brd.e0;
import erd.b;
import ird.a;
import com.yxcorp.gifshow.v3.editor.cover.h2;
import ppc.c2;
import erd.g;
import crd.b;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverGeneratePresenter$c;
import com.kwai.video.editorsdk2.PreviewEventListenerV2;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import qaa.a;
import wba.m;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.v3.editor.cover.f2;
import t36.f$a;
import com.kuaishou.edit.draft.ImportCoverParamV2;
import lnc.p6;
import com.yxcorp.gifshow.v3.editor.cover.e2;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import lnc.d1$a;
import com.yxcorp.gifshow.v3.editor.cover.d2;
import android.view.View;
import ekd.m1;
import voc.o;
import java.util.Map;
import nwc.c;

public class VideoCoverGeneratePresenter extends PresenterV2	// class@000e39
{
    public final AtomicBoolean A;
    public Runnable B;
    public final AtomicBoolean C;
    public double D;
    public c E;
    public Map p;
    public VideoSDKPlayerView q;
    public d1 r;
    public c s;
    public a t;
    public o u;
    public Fragment v;
    public f w;
    public PublishSubject x;
    public boolean y;
    public EditCoverConfiguration z;

    public void VideoCoverGeneratePresenter(){
       super();
       this.p = new HashMap();
       this.r = new d1();
       this.A = new AtomicBoolean(false);
       this.B = new VideoCoverGeneratePresenter$a(this);
       this.C = new AtomicBoolean(false);
       this.D = 0xbff0000000000000;
       this.E = new VideoCoverGeneratePresenter$b(this);
    }
    public void E8(){
       Object[] objArray1;
       Object[] objArray2;
       if (PatchProxy.applyVoid(null, this, VideoCoverGeneratePresenter.class, "3")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("VideoCoverGeneratePresenter", "onBind", objArray);
       this.w.d(this.E);
       if (this.v.getActivity() != null && this.v.getActivity().getIntent() != null) {
          this.z = j0.e(this.v.getActivity().getIntent(), "INTENT_DATA_COVER_CONFIGURATION");
          objArray1 = new Object[i];
          a.D().w("VideoCoverGeneratePresenter", "onBind mCoverConfiguration:"+this.z, objArray1);
       }
       Cover uCover = this.t.v();
       if (this.s.a1() == Workspace$Type.KTV_SONG) {
          objArray1 = new Object[i];
          a.D().w("VideoCoverGeneratePresenter", "onBind ktv song", objArray1);
          if (uCover != null && TextUtils.x(uCover.getOriginalFrameFile())) {
             objArray2 = new Object[i];
             a.D().w("VideoCoverGeneratePresenter", "onBind ktv song cover", objArray2);
             this.R8();
          }
       }else if(uCover == null || TextUtils.x(uCover.getOriginalFrameFile())){
          objArray2 = new Object[i];
          a.D().w("VideoCoverGeneratePresenter", "onBind not ktv song cover", objArray2);
          this.R8();
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, VideoCoverGeneratePresenter.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("VideoCoverGeneratePresenter", "onDestroy", objArray);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoCoverGeneratePresenter.class, "4")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("VideoCoverGeneratePresenter", "onUnbind mGenerateCoverAction:"+this.B+",mGenerateCoverRequested:"+this.A.get()+",mPlayerAttached:"+this.y, objArray1);
       if (this.B != null && this.A.get()) {
          k1.m(this.B);
          this.B = objArray;
       }
       if (this.y != null) {
          this.S8();
       }
       this.w.c(this.E);
       return;
    }
    public final void P8(Bitmap p0,boolean p1){
       VideoCoverGeneratePresenter videoCoverGe = VideoCoverGeneratePresenter.class;
       if (PatchProxy.isSupport(videoCoverGe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, videoCoverGe, "12")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("VideoCoverGeneratePresenter", "addTextToCover crop:"+p1+",frameBitmap:"+p0, objArray);
       a0 uoa0 = a0.k(new h2(this, p1, p0));
       i2 oi2 = new i2(this);
       Objects.requireNonNull(uoa0);
       a.c(oi2, "onEvent is null");
       this.X7(a.i(new e(uoa0, oi2)).R(new h2(this), new c2(this)));
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, VideoCoverGeneratePresenter.class, "6")) {
          return;
       }
       int i = 0;
       if (this.s.a1() != Workspace$Type.KUAISHAN && (this.s.T0() != Workspace$Source.KUAI_SHAN && (f.D(this.s) || this.s.a1() == Workspace$Type.AI_CUT))) {
          Object[] objArray = new Object[i];
          a.D().w("VideoCoverGeneratePresenter", "attachPlayer need not dump", objArray);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          a.D().w("VideoCoverGeneratePresenter", "attachPlayer mPlayerAttached:"+this.y, objArray1);
          this.y = true;
          this.q.setPreviewEventListener("VideoCoverGeneratePresenter", new VideoCoverGeneratePresenter$c(this));
          return;
       }
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, VideoCoverGeneratePresenter.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("VideoCoverGeneratePresenter", "detachPlayer", objArray);
       this.y = false;
       this.q.setPreviewEventListener("VideoCoverGeneratePresenter", null);
       return;
    }
    public void V8(){
       Object[] objArray3;
       Bitmap uBitmap;
       Object[] objArray4;
       Size size;
       VideoCoverGeneratePresenter videoCoverGe = VideoCoverGeneratePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, videoCoverGe, "10")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.D().w("VideoCoverGeneratePresenter", "generateCover mGenerating:"+this.C.get(), objArray1);
       boolean b = true;
       if (this.z != null) {
          Object[] objArray2 = new Object[i];
          a.D().w("VideoCoverGeneratePresenter", "generateCover mCoverConfiguration:"+this.z, objArray2);
          if (this.B != null) {
             objArray = new Object[i];
             a.D().w("VideoCoverGeneratePresenter", "generateCover mGenerateCoverAction not null", objArray);
             this.A.set(b);
             k1.r(this.B, 5000);
             return;
          }
       }
       if (this.C.getAndSet(b)) {
          objArray = new Object[i];
          a.D().w("VideoCoverGeneratePresenter", "generateCover mGenerating", objArray);
          return;
       }else {
          boolean b1 = m.e(this.t);
          if (b1) {
             objArray1 = new Object[i];
             a.D().w("VideoCoverGeneratePresenter", "generateCover isImportCoverUsed", objArray1);
             if (DraftFileManager.E().z(this.t.v().getOutputFile(), this.t) != null) {
                objArray3 = new Object[i];
                a.D().w("VideoCoverGeneratePresenter", "generateCover skipRegenerateCover", objArray3);
                if (!PatchProxy.applyVoid(objArray, this, videoCoverGe, "11")) {
                   objArray = new Object[i];
                   a.D().w("VideoCoverGeneratePresenter", "skipRegenerateCover", objArray);
                   this.C.set(i);
                   this.x.onNext(Boolean.TRUE);
                   this.w.s0(f2.a);
                }
                return;
             }else {
                uBitmap = DraftFileManager.E().z(this.t.v().getImportCoverParamV2().getDraftFile(), this.t);
                if (uBitmap == null) {
                   objArray = new Object[i];
                   a.D().w("VideoCoverGeneratePresenter", "generateCover frameBitmap use origin", objArray);
                   uBitmap = DraftFileManager.E().z(this.t.v().getImportCoverParamV2().getOriginalFile(), this.t);
                }
             }
          }else {
             objArray = new Object[i];
             a.D().w("VideoCoverGeneratePresenter", "generateCover not isImportCoverUsed", objArray);
             uBitmap = p6.b(this.t, this.q);
          }
          if (uBitmap == null) {
             objArray = new Object[i];
             a.D().w("VideoCoverGeneratePresenter", "generateCover is null", objArray);
             this.x.onNext(Boolean.FALSE);
             this.w.s0(e2.a);
             this.C.set(i);
             return;
          }else if(!p6.f(this.t) && !b1){
             objArray4 = new Object[i];
             a.D().w("VideoCoverGeneratePresenter", "generateCover addTextToCover one", objArray4);
             this.P8(uBitmap, i);
             return;
          }else if(b1){
             size = new Size(uBitmap.getWidth(), uBitmap.getHeight());
          }else {
             size = new Size(this.q.getVideoWidth(), this.q.getVideoHeight());
          }
          d1$a uoa = p6.c(this.t, size);
          if (uoa == null) {
             objArray4 = new Object[i];
             a.D().w("VideoCoverGeneratePresenter", "generateCover addTextToCover two", objArray4);
             this.P8(uBitmap, i);
             return;
          }else {
             uoa.e(uBitmap);
             objArray3 = new Object[i];
             a.D().w("VideoCoverGeneratePresenter", "generateCover run task", objArray3);
             k1.o(new d2(this, uoa, uBitmap));
             return;
          }
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoCoverGeneratePresenter.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a30f6);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, VideoCoverGeneratePresenter.class, "1")) {
          return;
       }
       this.s = this.r8("WORKSPACE");
       this.t = this.r8("COVER");
       this.u = this.r8("EDITOR_CONTEXT");
       this.v = this.r8("FRAGMENT");
       Map map = this.r8("LISTENERS_MAP");
       this.p = map;
       this.w = f.p0(map, c.class);
       this.x = this.r8("GENERATE_COVER_RESPONSE");
       return;
    }
}
