package com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorPresenter;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorPresenter$a;
import io.reactivex.subjects.PublishSubject;
import lnc.d1;
import ppc.c;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorPresenter$b;
import com.google.common.util.concurrent.AtomicDouble;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorPresenter$c;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorPresenter$d;
import kwc.u;
import com.yxcorp.gifshow.v3.editor.text.ReEditCoverPresenter;
import com.yxcorp.gifshow.v3.editor.cover.s;
import com.yxcorp.gifshow.v3.editor.cover.l2;
import rpc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.s6;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import wba.b;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import huc.k1;
import com.yxcorp.gifshow.widget.EditCoverSeekBar;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import ekd.j;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.EditorManager;
import qba.c;
import xvc.e;
import lq.i;
import xvc.f;
import java.util.Objects;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.Workspace$Type;
import ppc.b;
import h69.j;
import ppc.a;
import java.lang.Float;
import com.yxcorp.gifshow.v3.editor.BaseEditor$EditorShowMode;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import kuaishou.perf.page.impl.d;
import java.util.Set;
import androidx.lifecycle.MutableLiveData;
import ppc.r1;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import com.kuaishou.sk2c.LuaGraphic;
import hba.a;
import qaa.a;
import wba.d0;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import tyc.f2;
import android.app.Activity;
import ppc.p1;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView$g;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView;
import ppc.n1;
import com.yxcorp.gifshow.v3.editor.cover.z1;
import erd.g;
import crd.b;
import brd.t;
import ppc.m1;
import com.yxcorp.gifshow.v3.editor.cover.r1;
import ppc.k1;
import com.yxcorp.gifshow.v3.editor.cover.s1;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorPresenter$f;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.widget.EditCoverSeekBar$c;
import com.kwai.video.editorsdk2.PreviewEventListenerV2;
import com.yxcorp.gifshow.v3.f;
import o56.c;
import com.yxcorp.utility.n;
import lnc.a1;
import java.lang.Math;
import android.view.ViewGroup;
import ppc.n2;
import com.yxcorp.gifshow.v3.editor.k;
import lnc.q4;
import com.yxcorp.gifshow.v3.editor.cover.q1;
import java.lang.Double;
import java.lang.Integer;
import p16.c;
import java.util.List;
import g9c.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import android.util.Pair;
import lnc.v6;
import k2b.u1;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Cover;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.kuaishou.edit.draft.ImportCoverParamV2;
import ekd.k1;
import rwc.j;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import lwc.h;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import voc.l;
import com.kwai.video.editorsdk2.PreviewPlayer;
import aw9.c0;
import pwc.c;
import brd.a0;
import android.content.Intent;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import pb9.m;
import pb9.n;
import okhttp3.MultipartBody$Part;
import com.yxcorp.gifshow.v3.editor.cover.u1;
import com.yxcorp.gifshow.v3.editor.cover.t1;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Cover$b;
import com.yxcorp.gifshow.v3.editor.cover.w1;
import erd.o;
import t45.d;
import brd.z;
import ppc.f1;
import ppc.l1;
import com.kuaishou.edit.draft.Text;
import com.yxcorp.gifshow.v3.editor.cover.x1;
import laa.f;
import com.kuaishou.edit.draft.Cover$Type;
import com.kuaishou.edit.draft.Cover$ParameterCase;
import com.kuaishou.edit.draft.VideoCoverParam;
import android.view.View;
import ekd.m1;
import ppc.a2;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorV3Fragment;
import iba.a;
import im8.f;

public class VideoCoverEditorPresenter extends PresenterV2 implements g	// class@000e32
{
    public f A;
    public q0$f B;
    public c C;
    public PublishSubject D;
    public EditorDelegate E;
    public Boolean F;
    public FontViewModel G;
    public EditDecorationContainerView H;
    public TextElementViewModel I;
    public PictureSelectView$e J;
    public PublishSubject K;
    public PublishSubject L;
    public PublishSubject M;
    public PublishSubject N;
    public PublishSubject O;
    public Boolean P;
    public Boolean Q;
    public float R;
    public double S;
    public double T;
    public VideoSDKPlayerView U;
    public EditorSdk2V2$AudioAsset[] U0;
    public VideoCoverEditorPresenter$f V;
    public String V0;
    public a W;
    public n2 W0;
    public Bitmap X;
    public boolean X0;
    public boolean Y;
    public EditCoverSeekBar$c Y0;
    public d1 Z;
    public final AtomicDouble Z0;
    public final y a1;
    public m b1;
    public f2 c1;
    public ImmutableArray d1;
    public int e1;
    public ExpandFoldHelperView p;
    public RecyclerView q;
    public EditCoverSeekBar r;
    public VideoCoverEditorV3Fragment s;
    public int t;
    public String u;
    public String v;
    public Set w;
    public Set x;
    public a y;
    public a z;

    public void VideoCoverEditorPresenter(boolean p0){
       super();
       Boolean fALSE = Boolean.FALSE;
       this.F = fALSE;
       this.J = new VideoCoverEditorPresenter$a(this);
       this.K = PublishSubject.g();
       this.L = PublishSubject.g();
       this.M = PublishSubject.g();
       this.N = PublishSubject.g();
       this.O = PublishSubject.g();
       this.P = fALSE;
       this.Q = fALSE;
       this.R = 0;
       this.S = 0;
       this.T = 0;
       this.Y = true;
       this.Z = new d1();
       this.W0 = new c();
       this.X0 = false;
       this.Y0 = new VideoCoverEditorPresenter$b(this);
       this.Z0 = new AtomicDouble(0xbff0000000000000);
       this.a1 = new VideoCoverEditorPresenter$c(this);
       this.b1 = new VideoCoverEditorPresenter$d(this);
       this.U7(new u());
       this.U7(new ReEditCoverPresenter());
       this.U7(new s());
       this.U7(new l2());
       if (p0) {
          this.U7(new c());
       }
       return;
    }
    public void E8(){
       boolean b2;
       VideoCoverEditorPresenter videoCoverEd = VideoCoverEditorPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, videoCoverEd, "4")) {
          return;
       }
       boolean b = false;
       if (!PatchProxy.applyVoid(objArray, this, videoCoverEd, "5") && s6.b()) {
          VideoSDKPlayerView videoSDKPlay = this.X8();
          if (videoSDKPlay != null) {
             EditorSdk2V2$VideoEditorProject videoProject = videoSDKPlay.getVideoProject();
             if (videoProject != null) {
                ImmutableArray immutableArr = videoProject.animatedSubAssets();
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = immutableArr.iterator();
                while (iterator.hasNext()) {
                   EditorSdk2V2$AnimatedSubAsset uAnimatedSub = iterator.next();
                   if (b.r(uAnimatedSub.opaque())) {
                      continue ;
                   }
                   uArrayList.add(uAnimatedSub);
                }
                if (immutableArr.size() != uArrayList.size()) {
                   this.d1 = immutableArr;
                   EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub1 = new EditorSdk2V2$AnimatedSubAsset[b];
                   videoProject.setAnimatedSubAssets(uArrayList.toArray(uAnimatedSub1));
                   videoSDKPlay.sendChangeToPlayer();
                }
             }
          }
       }
       boolean b1 = true;
       this.I = k1.c(this.E, b1);
       this.X0 = b;
       Boolean fALSE = Boolean.FALSE;
       this.P = fALSE;
       this.Q = fALSE;
       this.r.d();
       if (this.X8() != null && (!j.h(this.U.getVideoProject().audioAssets().toNormalArray()) && EditorManager.v(this.U.getVideoProject(), this.C))) {
          c uoc = new c();
          uoc.b(b1);
          e uoe = new e();
          uoe.b(uoc);
          if (i.m().o() != null) {
             f uof = i.m().o();
             Objects.requireNonNull(uof);
             uof.g(uoe, b);
          }
       }
       this.y.c0();
       this.a9();
       this.r.f(this.R);
       VideoCoverEditorPresenter obj = PatchProxy.apply(objArray, this, videoCoverEd, "11");
       if (obj != PatchProxyResult.class) {
          b2 = obj.booleanValue();
       }else if(this.C.a1() != Workspace$Type.KTV_MV){
          b2 = false;
       }else {
          b2 = true;
       }
       if (b2) {
          this.W0 = new b();
       }
       if (j.j(this.C)) {
          this.W0 = new a();
       }
       obj = this.R;
       if (!PatchProxy.isSupport(videoCoverEd) || (!PatchProxy.applyVoidTwoRefs(Boolean.TRUE, Float.valueOf(obj), this, videoCoverEd, "25") && (!PatchProxy.isSupport(videoCoverEd) || (PatchProxy.applyVoidThreeRefs(Boolean.TRUE, Float.valueOf(obj), fALSE, this, VideoCoverEditorPresenter.class, "26") || (this.q != null && this.s.nh() != BaseEditor$EditorShowMode.SHOW_BACKGROUND))))) {
          Object[] objArray1 = new Object[b];
          a.D().w("VideoCoverEditorPresenter", "refreshVideoData isInit:"+b1+"currentProgress:"+obj, objArray1);
          this.R = obj;
          String str = "postCoverMonitor";
          d.d(str).h("clickToLoadData");
          d.d(str).g("loadDataToRenderFinish");
          if (this.e1 > null) {
             this.e1 = b;
             d.d(str).k("warm");
          }else {
             d.d(str).k("cold");
          }
          this.P8(b);
          this.R8(obj);
       }
    label_01b4 :
       if (!PatchProxy.applyVoid(objArray, this, videoCoverEd, "17") && this.Y != null) {
          this.Y = b;
          this.w.add(this.a1);
          this.I.A0().observe(this.s, new r1(this));
          this.x.add(this.b1);
          LuaGraphic.init(c.c(a.b().getResources()).density);
       }
       a uoa = this.y.f0();
       this.W = uoa;
       uoa.c0();
       this.I.X0(this.W, b);
       this.F = Boolean.valueOf(d0.q(this.U.getVideoProject()));
       this.G.D0();
       if (this.c1 == null) {
          this.c1 = new f2(this.E.getContext(), this.I.I0());
       }
       this.c1.d();
       if (!PatchProxy.applyVoid(objArray, this, videoCoverEd, "9")) {
          this.p.setPreActionListener(new p1(this));
       }
       this.X7(this.L.subscribe(new n1(this), z1.b));
       this.X7(this.M.subscribe(new m1(this), r1.b));
       this.X7(this.O.subscribe(new k1(this), s1.b));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, VideoCoverEditorPresenter.class, "3")) {
          return;
       }
       this.X = Bitmap.createBitmap(1, 1, Bitmap$Config.ARGB_8888);
       this.q.setLayoutManager(new NpaLinearLayoutManager(this.getContext(), 0, 0));
       this.q.setLayoutFrozen(1);
       VideoCoverEditorPresenter$f uof = new VideoCoverEditorPresenter$f();
       this.V = uof;
       this.q.setAdapter(uof);
       this.r.setOnCoverSeekBarChangeListener(this.Y0);
       return;
    }
    public void H8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoCoverEditorPresenter.class, "19")) {
          return;
       }
       VideoCoverEditorPresenter tX = this.X;
       if (tX != null && !tX.isRecycled()) {
          this.X.recycle();
          this.X = objArray;
       }
       this.r.setOnCoverSeekBarChangeListener(objArray);
       this.w.remove(this.a1);
       this.x.remove(this.b1);
       return;
    }
    public void J8(){
       VideoCoverEditorPresenter videoCoverEd = VideoCoverEditorPresenter.class;
       if (PatchProxy.applyVoid(null, this, videoCoverEd, "18")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, videoCoverEd, "6") && this.d1 != null) {
          VideoSDKPlayerView videoSDKPlay = this.X8();
          if (videoSDKPlay != null) {
             EditorSdk2V2$VideoEditorProject videoProject = videoSDKPlay.getVideoProject();
             if (videoProject != null) {
                videoProject.setAnimatedSubAssets(this.d1);
                videoSDKPlay.sendChangeToPlayer();
             }
          }
       }
       boolean b = false;
       if (this.X8() != null && (!j.h(this.U0) && EditorManager.v(this.U.getVideoProject(), this.C))) {
          c uoc = new c();
          uoc.b(b);
          e uoe = new e();
          uoe.b(uoc);
          if (i.m().o() != null) {
             f uof = i.m().o();
             Objects.requireNonNull(uof);
             if (!PatchProxy.applyVoidOneRefs(uoe, uof, f.class, "13")) {
                f.h(uof, uoe, b, 2, null);
             }
          }
       }
       if (this.X8() != null) {
          this.X8().setVisibility(b);
       }
       videoCoverEd = this.c1;
       if (videoCoverEd != null) {
          videoCoverEd.b();
          this.c1 = null;
       }
       this.p.setPreActionListener(null);
       this.Z.b();
       this.U.setPreviewEventListener("VideoCoverEditorPresenter", null);
       return;
    }
    public final void P8(boolean p0){
       int i3;
       int i4;
       Bitmap uBitmap;
       double d3;
       int i = this;
       VideoCoverEditorPresenter videoCoverEd = VideoCoverEditorPresenter.class;
       if (PatchProxy.isSupport(videoCoverEd) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), i, videoCoverEd, "21")) {
          return;
       }
       int i1 = 0;
       Object[] objArray = new Object[i1];
       a.D().s("post-log", "asyncCreateThumbnails\(\)", objArray);
       if (this.X8() == null || (this.X8().getVideoWidth() && this.X8().getVideoHeight())) {
          int i2 = 2;
          if (f.v(i.C)) {
             i3 = (n.z(a.a().a()) - a1.d(0x7f070313)) - a1.d(0x7f07028d);
             i4 = a1.d(R.dimen.arg_RES_7f0702a4);
          }else {
             i3 = n.z(a.a().a());
             i4 = a1.d(R.dimen.arg_RES_7f071066);
          }
          i4 = c.b(a.a().a().getResources(), R.dimen.arg_RES_7f07017f);
          int i5 = (this.X8().getVideoHeight() * i4) / this.X8().getVideoWidth();
          double d = Math.ceil((double)(((float)(i3 - (i4 * 2)) * 0x3f800000) / (float)i4));
          if (i.q.getMeasuredWidth() > 0) {
             i.r.setThumbWidth((int)((double)i.q.getMeasuredWidth() / d));
          }
          ArrayList uArrayList = new ArrayList();
          int i6 = 0;
          double d1 = (double)i6;
          while (d1 - d < 0) {
             k ok = k.f();
             double d2 = q4.c(3, i.W0.b(d, d1, this.X8()));
             q1 oq1 = new q1(i);
             Objects.requireNonNull(ok);
             k ok1 = k.class;
             if (PatchProxy.isSupport(ok1)) {
                Object[] objArray1 = new Object[5];
                objArray1[i1] = Double.valueOf(d2);
                objArray1[1] = Integer.valueOf(i4);
                objArray1[i2] = Integer.valueOf(i5);
                objArray1[3] = oq1;
                objArray1[4] = Boolean.valueOf(p0);
                uBitmap = PatchProxy.apply(objArray1, ok, ok1, "5");
                if (uBitmap != PatchProxyResult.class) {
                   d3 = d;
                label_013c :
                   if (uBitmap == null) {
                      uBitmap = i.X;
                   }else {
                      int i7 = i.e1 + 1;
                      i.e1 = i7;
                   }
                   uArrayList.add(uBitmap);
                   i6 = i6 + 1;
                   d = d3;
                   i2 = 2;
                }
             }
             d3 = d;
             uBitmap = ok.c(d2, i4, i5, oq1, null, p0);
             goto label_013c ;
          }
          i.V.W0(uArrayList);
          i.V.k0();
          double d4 = d;
          if ((int)d4 <= i.e1) {
             d.d("postCoverMonitor").h("loadDataToRenderFinish");
             d.d("postCoverMonitor").c();
          }
          Object[] objArray2 = new Object[i1];
          a.D().s("post-log", "asyncCreateThumbnails\(\):thumbnailCount="+d4+",mThumbnailLoadedCount="+i.e1, objArray2);
       }
    label_0199 :
       return;
    }
    public void R8(float p0){
       VideoCoverEditorPresenter videoCoverEd = VideoCoverEditorPresenter.class;
       if (PatchProxy.isSupport(videoCoverEd) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, videoCoverEd, "24")) {
          return;
       }
       VideoSDKPlayerView videoSDKPlay = this.X8();
       if (videoSDKPlay != null && p0 - 0x3f800000 <= 0) {
          videoSDKPlay.seekToWithDeletedRange(this.W0.a(p0, videoSDKPlay));
       }
       return;
    }
    public void S8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoCoverEditorPresenter.class, "8")) {
          return;
       }
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       showEvent.elementPackage = uElementPack;
       uElementPack.action2 = "PRODUCE_EDIT_TOAST";
       Pair[] pairArray = new Pair[]{new Pair("toast_content", p0)};
       uElementPack.params = this.a(pairArray);
       u1.g0(showEvent);
       return;
    }
    public Bitmap V8(boolean p0,Bitmap p1){
       EditTextBaseElement obj;
       Bitmap uBitmap1;
       long l;
       VideoCoverEditorPresenter videoCoverEd = VideoCoverEditorPresenter.class;
       if (PatchProxy.isSupport(videoCoverEd)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, videoCoverEd, "29");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Bitmap uBitmap = null;
       if (this.X8() == null) {
          return uBitmap;
       }else {
          Object[] objArray = new Object[0];
          a.D().w("VideoCoverEditorPresenter", "generateCoverBitmap isShown:"+p0+",originalFrame:"+p1, objArray);
          if (this.P.booleanValue()) {
             Cover uCover = this.y.v();
             if (uCover != null) {
                uBitmap1 = DraftFileManager.E().z(uCover.getImportCoverParamV2().getDraftFile(), this.y);
             }else {
                uBitmap1 = uBitmap;
             }
          }else if(p0){
             l = k1.i();
             Bitmap uBitmap2 = this.U.dumpNextFrame();
             a uoa = a.D();
             StringBuilder str = "generateCoverBitmap frame == null? ";
             boolean b = (uBitmap2 == null)? true: false;
             Object[] objArray2 = new Object[0];
             uoa.w("VideoCoverEditorPresenter", str+b+" time: "+(k1.i() - l), objArray2);
             uBitmap1 = uBitmap2;
          }else {
             uBitmap1 = this.U.getFrameAtTimeWithAllEffects(this.S, true, 0x3f50624dd2f1a9fc, p1);
          }
          if (uBitmap1 == null) {
             return uBitmap;
          }else {
             j oj = new j(uBitmap1);
             h oh = f.l(this.E.q());
             obj = this.H.getTopElement();
             if (obj != null && !(obj.getEditTextBaseElementData().B0()).isEmpty()) {
                l.a(obj, oj, oh.q0(0), new Size(this.U.getVideoWidth(), this.U.getVideoHeight()));
             }
             Object[] objArray1 = new Object[0];
             a.D().w("VideoCoverEditorPresenter", "generateCoverBitmap result:"+oj.getValue()+",textElement:"+obj, objArray1);
             return oj.getValue();
          }
       }
    }
    public final Bitmap W8(){
       Object obj = PatchProxy.apply(null, this, VideoCoverEditorPresenter.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.X8() != null && (this.X8().getPlayer() == null || this.P.booleanValue())) {
          return null;
       }
       return this.X8().dumpNextOriginalFrame();
    }
    public final VideoSDKPlayerView X8(){
       VideoCoverEditorPresenter obj = PatchProxy.apply(null, this, VideoCoverEditorPresenter.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.s.isAdded()) {
          return null;
       }
       obj = this.U;
       if (obj != null) {
          return obj;
       }
       if (!this.E.O() instanceof c) {
          return null;
       }
       VideoSDKPlayerView videoSDKPlay = this.E.O().a();
       this.U = videoSDKPlay;
       return videoSDKPlay;
    }
    public EditTextBaseElementData Y8(){
       EditTextBaseElement obj = PatchProxy.apply(null, this, VideoCoverEditorPresenter.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.H.getTopElement();
       if (obj == null) {
          return null;
       }
       return obj.getEditTextBaseElementData();
    }
    public a0 Z8(boolean p0){
       Object[] obj;
       String text;
       VideoCoverEditorPresenter videoCoverEd = VideoCoverEditorPresenter.class;
       if (PatchProxy.isSupport(videoCoverEd)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, videoCoverEd, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = null;
       if (!PatchProxy.applyVoid(obj, this, videoCoverEd, "12")) {
          String stringExtra = this.getActivity().getIntent().getStringExtra("photo_task_id");
          String stringExtra1 = this.getActivity().getIntent().getStringExtra("editSessionId");
          EditTextBaseElement topElement = this.H.getTopElement();
          if (topElement != null) {
             text = topElement.getText();
          }
          Object[] objArray = new Object[0];
          a.D().w("VideoCoverEditorPresenter", "uploadCoverText editSessionId = "+stringExtra1+", taskId = "+stringExtra+", editText = "+text, objArray);
          if (!TextUtils.x(stringExtra1) && (!TextUtils.x(this.V0) || (!TextUtils.x(text) && (TextUtils.x(this.V0) || !(this.V0).equals(text))))) {
             String str = (TextUtils.x(text))? "": text;
             this.X7(n.a().b(null, stringExtra1, 0, "", stringExtra, str, 0, 0).subscribe(u1.b, t1.b));
          }
       }
    label_00c6 :
       this.H.R();
       Cover$b uob = this.y.k();
       return this.I.C1(p0).d0().flatMap(new w1(this, uob)).observeOn(d.a).flatMap(new f1(this, uob, p0)).doOnError(new l1(this)).singleOrError();
    }
    public void a9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoCoverEditorPresenter.class, "31")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.D().w("VideoCoverEditorPresenter", "restoreCover", objArray1);
       this.V0 = (this.y.f0() != null && this.y.f0().v() != null)? this.y.f0().v().getText(): objArray;
       Cover$b uob = this.y.l(x1.a);
       VideoSDKPlayerView videoSDKPlay = this.X8();
       if (uob.getType() == Cover$Type.VIDEO && (uob.getParameterCase() == Cover$ParameterCase.VIDEO_COVER_PARAM && (uob.getVideoCoverParam().getTimePointsCount() <= 0 || videoSDKPlay == null))) {
          objArray = new Object[i];
          a.D().w("VideoCoverEditorPresenter", "restoreCover no cover", objArray);
          return;
       }else {
          double timePoints = uob.getVideoCoverParam().getTimePoints(i);
          this.S = timePoints;
          this.T = timePoints;
          this.R = (float)(timePoints / videoSDKPlay.getVideoLength());
          Object[] objArray2 = new Object[i];
          a.D().w("VideoCoverEditorPresenter", "restoreCover mCoverPosition:"+this.S+",mSavedPosition:"+this.T+",mCurrentProgress:"+this.R, objArray2);
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoCoverEditorPresenter.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3ecf);
       this.r = m1.f(p0, 0x7f0a3805);
       if (this.p == null) {
          this.p = m1.f(p0, 0x7f0a2eff);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoCoverEditorPresenter.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new a2();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, VideoCoverEditorPresenter.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(VideoCoverEditorPresenter.class, new a2());
       }else {
          obj.put(VideoCoverEditorPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, VideoCoverEditorPresenter.class, "1")) {
          return;
       }
       this.s = this.r8("FRAGMENT");
       this.t = this.r8("VIDEO_EDIT_OPERATION_PACKAGE").intValue();
       this.u = this.r8("SUB_TYPE");
       this.v = this.r8("PAGE_TAG");
       this.w = this.r8("EDITOR_VIEW_LISTENERS");
       this.x = this.r8("COVER_INFO_PROVIDERS");
       this.y = this.r8("COVER");
       this.z = this.r8("THEME");
       this.A = this.x8("VideoCoverSeekChangeListener");
       this.C = this.r8("WORKSPACE");
       this.D = this.r8("COVER_OUTFILE_EVENT");
       this.E = this.r8("EDITOR_DELEGATE");
       this.G = this.r8("FONT_VIEW_MODEL");
       this.H = this.r8("DECORATION_CONTAINER_VIEW");
       return;
    }
}
