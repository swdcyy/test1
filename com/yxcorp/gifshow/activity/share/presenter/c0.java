package com.yxcorp.gifshow.activity.share.presenter.c0;
import xw8.p0$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.activity.share.presenter.PublishResourceDownloadManager;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.encode.EncodeRequest;
import com.kwai.feature.post.api.feature.encode.model.VideoEncodeSDKInfo;
import im8.f;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.io.File;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.entity.QPhoto;
import ow8.c;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.activity.share.presenter.c0$b;
import java.lang.Enum;
import lq.i;
import lq.a;
import com.kwai.video.editorsdk2.PreviewPlayer;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import android.content.Context;
import com.kwai.video.editorsdk2.VideoEditorSession;
import ok.n;
import com.yxcorp.gifshow.activity.share.ShareActivity;
import zf6.k;
import lnc.a1;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import laa.e;
import com.yxcorp.gifshow.edit.draft.model.c;
import mba.m0;
import java.util.Objects;
import android.content.Intent;
import android.app.Activity;
import zw8.v;
import com.yxcorp.gifshow.activity.share.presenter.x;
import erd.g;
import crd.b;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.yxcorp.gifshow.activity.share.presenter.p1;
import zw8.j0;
import com.kwai.video.editorsdk2.PreviewEventListenerV2;
import zw8.u;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.activity.share.player.b;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Source;
import wba.p0;
import com.yxcorp.utility.n;
import android.view.ViewTreeObserver;
import zw8.k0;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.ViewGroup;
import i2b.a;
import com.yxcorp.gifshow.widget.PicturesContainer;
import xw8.p0;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.x;
import zw8.e0;
import com.yxcorp.gifshow.activity.share.presenter.p;
import zw8.g0;
import com.yxcorp.gifshow.activity.share.presenter.q;
import zw8.f0;
import com.yxcorp.gifshow.activity.share.presenter.r;
import com.yxcorp.gifshow.activity.share.player.PreviewPlayer;
import android.widget.EditText;
import zw8.c3;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import java.util.Set;
import com.kwai.feature.post.api.feature.cover.PhotoEditInfo;
import lnc.k9;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import x59.g;
import java.util.Iterator;
import java.util.List;
import ei0.a;
import crd.a;
import android.graphics.Bitmap;
import c26.c;
import com.yxcorp.gifshow.util.AdvEditUtil;
import android.animation.ValueAnimator;
import android.widget.ImageView;
import com.yxcorp.gifshow.activity.share.presenter.q1;
import android.animation.Animator$AnimatorListener;
import java.lang.Exception;
import vw8.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import tkd.b;
import tkd.d;
import pca.d0;
import zw8.b0;
import java.util.concurrent.Callable;
import brd.a0;
import t45.d;
import brd.z;
import zw8.i0;
import com.yxcorp.gifshow.activity.share.presenter.u;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CoverMetaExt;
import java.lang.NullPointerException;
import java.lang.Throwable;
import lnc.i1;
import com.kuaishou.edit.draft.Workspace$From;
import a26.a;
import voc.m;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.FragmentActivity;
import java.lang.RuntimeException;
import com.yxcorp.gifshow.widget.l;
import tyc.p3;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import android.view.WindowManager;
import android.graphics.Point;
import android.view.Display;
import gq.a;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Workspace;
import x59.f;
import java.lang.Runnable;
import t45.c;
import orc.e;
import zw8.w;
import com.yxcorp.gifshow.activity.share.presenter.c0$a;
import com.yxcorp.gifshow.widget.PicturesContainer$b;
import com.yxcorp.gifshow.activity.share.player.a$a;
import com.yxcorp.gifshow.activity.share.player.a;
import di0.b;
import zw8.c0;
import zw8.d0;
import com.kwai.feature.post.api.feature.cover.PhotoEditInfo$EditCoverInfo;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import ekd.m1;
import com.yxcorp.gifshow.activity.share.widget.CatchedEmojiEditText;
import com.yxcorp.gifshow.activity.share.widget.DragPreviewContainer;
import android.widget.TextView;
import android.view.Window;
import com.yxcorp.gifshow.util.PostUtils;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import wba.b;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import java.util.Collection;
import ekd.q;
import bx8.k;
import com.yxcorp.gifshow.activity.share.presenter.z;
import erd.o;
import zw8.h0;
import com.yxcorp.gifshow.activity.share.presenter.w;
import java.lang.IllegalStateException;
import zw8.x;
import com.yxcorp.gifshow.activity.share.presenter.b0;
import com.yxcorp.gifshow.activity.share.presenter.v;
import zw8.a0;
import qaa.a;
import wba.z;
import f0c.t;
import com.yxcorp.gifshow.postwork.a;
import r26.a;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import dnc.c2;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.activity.share.presenter.t;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import mrd.a;
import com.yxcorp.gifshow.activity.share.presenter.y;
import com.yxcorp.gifshow.activity.share.presenter.s;

public abstract class c0 extends PresenterV2 implements p0$a	// class@0013c8
{
    public f A;
    public f B;
    public EncodeRequest C;
    public InteractStickerInfo D;
    public String E;
    public String F;
    public QPhoto G;
    public String H;
    public k I;
    public a J;
    public b K;
    public EditorSdk2V2$VideoEditorProject L;
    public boolean M;
    public g N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public p1 R;
    public Workspace$Type S;
    public b T;
    public PublishResourceDownloadManager U;
    public List V;
    public boolean W;
    public PicturesContainer X;
    public float Y;
    public KtvInfo p;
    public PreviewPlayer q;
    public long r;
    public DragPreviewContainer s;
    public CatchedEmojiEditText t;
    public TextView u;
    public View v;
    public p0 w;
    public ShareActivity x;
    public c y;
    public f z;

    public void c0(){
       super();
       this.O = true;
       this.P = false;
       this.Q = false;
       this.S = Workspace$Type.VIDEO;
       this.U = new PublishResourceDownloadManager();
       this.V = new ArrayList();
       this.W = true;
       this.X = null;
    }
    public void E8(){
       c0 x;
       c0 q;
       int b2;
       EditorSdk2V2$VideoEditorProject videoEditorP = this;
       c0 uoc0 = c0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, videoEditorP, uoc0, "4")) {
          return;
       }
       c0 c = videoEditorP.C;
       if (c != null) {
          EncodeRequest mVideoEncode = c.mVideoEncodeSDKInfo;
          if (mVideoEncode != null) {
             VideoEncodeSDKInfo mOriginProje = mVideoEncode.mOriginProject;
             videoEditorP.L = (mOriginProje != null)? mOriginProje: mVideoEncode.mProject;
          }
       }
       if (!PatchProxy.applyVoid(objArray, videoEditorP, uoc0, "5") && (videoEditorP.z.get() == null && videoEditorP.y != null)) {
          videoEditorP.z.set(DraftFileManager.E().u(videoEditorP.y));
       }
    label_0045 :
       if (!PatchProxy.applyVoid(objArray, videoEditorP, uoc0, "6")) {
          String str = "ShareBasePreviewPresenter";
          if (!PatchProxy.applyVoid(objArray, videoEditorP, uoc0, "11")) {
             videoEditorP.s.removeAllViews();
             Workspace$Type type = c.i(videoEditorP.y, videoEditorP.G);
             Object[] objArray1 = new Object[0];
             a.b().w(str, "initPlayers: mType="+type, objArray1);
             videoEditorP.S = type;
             switch (c0$b.a[type.ordinal()]){
                 case 1:
                 case 3:
                 case 4:
                 case 5:
                 case 6:
                 case 7:
                 case 8:
                 case 2:
                   videoEditorP.M = true;
                   break;
                 default:
                   videoEditorP.M = false;
             }
             if (videoEditorP.M != null) {
                a uoa = i.m().p();
                if (uoa.s() != null && uoa.s().mProject != null) {
                   videoEditorP.L = uoa.s().mProject;
                }
                VideoSDKPlayerView videoSDKPlay = new VideoSDKPlayerView(videoEditorP.x);
                VideoEditorSession videoEditorS = uoa.q();
                n.k(videoEditorS, "EditSession should be initialized first");
                videoSDKPlay.initialize(videoEditorS, uoa.s());
                videoSDKPlay.setTaskId(videoEditorP.E);
                videoSDKPlay.setPage(videoEditorP.x.getPage());
                if (videoEditorP.z.get() != null) {
                   videoSDKPlay.setCoverPath(videoEditorP.z.get().getAbsolutePath());
                }
                videoSDKPlay.setCoverVisibility(0);
                float f = 0;
                if (k.d()) {
                   float f1 = 0x41f00000;
                   videoSDKPlay.setCoverMaskColor(a1.n(25.00f, 25.00f, f1, f));
                   videoSDKPlay.setBackgroundColor(a1.n(25.00f, 25.00f, f1, f));
                }else {
                   videoSDKPlay.setCoverMaskColor(a1.n(f, f, f, f));
                   videoSDKPlay.setBackgroundColor(a1.n(f, f, f, f));
                }
                videoSDKPlay.setLoop(true);
                if (!DraftUtils.W(videoEditorP.G, videoEditorP.y)) {
                   objArray1 = new Object[0];
                   a.b().w(str, "initPlayers baseFeed is null", objArray1);
                   if (videoEditorP.L == null && videoEditorP.y != null) {
                      objArray1 = new Object[0];
                      a.b().w(str, "initPlayers: mVideoProject is null ,editSession load", objArray1);
                      m0 om0 = videoEditorP.y.u();
                      Objects.requireNonNull(om0);
                      om0.q(true);
                      i.m().p().x(videoEditorP.x.getIntent());
                      videoEditorP.X7(uoa.e(new v(videoEditorP, videoSDKPlay), x.b));
                   }
                   videoSDKPlay.setVideoProject(videoEditorP.L);
                   videoSDKPlay.seekToPlaybackStart();
                }
                if (!PatchProxy.applyVoid(objArray, videoEditorP, uoc0, "19")) {
                   c = videoEditorP.L;
                   if (c != null && EditorSdk2UtilsV2.getComputedHeight(c)) {
                      videoEditorP.Y = (float)EditorSdk2UtilsV2.getComputedWidth(videoEditorP.L) / (float)EditorSdk2UtilsV2.getComputedHeight(videoEditorP.L);
                   }else {
                      c = videoEditorP.G;
                      if (c != null) {
                         b2 = c.getWidth();
                         int height = videoEditorP.G.getHeight();
                         if (height) {
                            videoEditorP.Y = ((float)b2 * 0x3f800000) / (float)height;
                         }
                         Object[] objArray2 = new Object[0];
                         a.b().w(str, "calculateVideoRatio using feed data, width: "+b2+", height: "+height+"videoRatio: "+videoEditorP.Y, objArray2);
                      }
                   }
                   c = videoEditorP.R;
                   if (c != null) {
                      c.w(videoEditorP.Y);
                   }
                }
                videoSDKPlay.setPreviewEventListener("preview", new j0(videoEditorP, videoSDKPlay));
                videoSDKPlay.setOnClickListener(new u(videoEditorP));
                videoEditorP.q = new b(videoEditorP.x, videoSDKPlay);
                videoEditorP.s.addView(videoSDKPlay, -1, -1);
                if (!PatchProxy.applyVoid(objArray, videoEditorP, uoc0, "12")) {
                   Object obj = PatchProxy.apply(objArray, videoEditorP, uoc0, "13");
                   if (obj != PatchProxyResult.class) {
                      b2 = obj.booleanValue();
                   }else {
                      c = videoEditorP.y;
                      b2 = (c != null && (videoEditorP.L != null && (c.a1() != Workspace$Type.KUAISHAN && (DraftUtils.M(videoEditorP.y) || (p0.a(videoEditorP.y.T0()) && videoEditorP.L.projectOutputHeight() > n.j(videoEditorP.x))))))? true: false;
                   }
                   if (b2) {
                      videoEditorP.s.getViewTreeObserver().addOnGlobalLayoutListener(new k0(videoEditorP));
                   }
                }
             }else {
                videoEditorP.Z8(type, a.i(this.m8(), R.layout.pictures_layout));
             }
          }
          if (videoEditorP.q != null) {
             this.a9();
             if (!PatchProxy.applyVoid(objArray, videoEditorP, uoc0, "8")) {
                ActivityEvent dESTROY = ActivityEvent.DESTROY;
                videoEditorP.X7(videoEditorP.w.d.compose(c.c(videoEditorP.x.m(), dESTROY)).subscribe(new e0(videoEditorP), p.b));
                videoEditorP.X7(videoEditorP.x.m().subscribe(new g0(videoEditorP), q.b));
                videoEditorP.X7(videoEditorP.w.h.compose(c.c(videoEditorP.x.m(), dESTROY)).subscribe(new f0(videoEditorP), r.b));
             }
             if (!PatchProxy.applyVoid(objArray, videoEditorP, uoc0, "7")) {
                c0 y = videoEditorP.y;
                x = videoEditorP.x;
                c0 s = videoEditorP.s;
                q = videoEditorP.q;
                c0 w = videoEditorP.w;
                c0 t = videoEditorP.t;
                c0 m = videoEditorP.M;
                c0 s1 = videoEditorP.S;
                boolean b = (s1 == Workspace$Type.LONG_PICTURE)? true: false;
                boolean b1 = (s1 == Workspace$Type.SINGLE_PICTURE)? true: false;
                p1 op1 = new p1(y, x, s, q, w, t, m, b, b1);
                videoEditorP.R = uoc0;
                uoc0.w(videoEditorP.Y);
                uoc0 = videoEditorP.R;
                s1 = videoEditorP.T;
                Objects.requireNonNull(uoc0);
                if (!PatchProxy.applyVoidOneRefs(s1, uoc0, p1.class, "2") && s1 != null) {
                   s1.observeForever(new c3(uoc0));
                }
                videoEditorP.w.s.add(videoEditorP);
             }
          }else {
             objArray = new Object[0];
             a.b().t(str, "onBind previewPlayer is null", objArray);
          }
       }
       PhotoEditInfo photoEditInf = k9.a(videoEditorP.G);
       if (videoEditorP.b9(photoEditInf)) {
          videoEditorP.D = photoEditInf.getInteractStickerInfo();
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "3")) {
          return;
       }
       if (i.h() && (i.m().p() == null || i.m().p().d() == null)) {
          this.N = new g();
          this.O = false;
       }else {
          this.N = i.m().p().d();
          this.O = true;
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "10")) {
          return;
       }
       this.c9();
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c0.class, "37")) {
          return;
       }
       Iterator iterator = this.V.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       c0 tR = this.R;
       if (tR != null) {
          Objects.requireNonNull(tR);
          if (!PatchProxy.applyVoid(objArray, tR, p1.class, "36")) {
             Object[] objArray1 = new Object[0];
             a.b().w("SharePreviewAnimation", "onDetach", objArray1);
             tR.F.dispose();
          }
       }
       return;
    }
    public void P8(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "21")) {
          return;
       }
       c0 tR = this.R;
       Objects.requireNonNull(tR);
       if (!PatchProxy.applyVoidOneRefs(p0, tR, p1.class, "5") && tR.s != null) {
          int i = 0;
          tR.t.p(i);
          tR.u.clearFocus();
          tR.s.g(tR.v);
          p1 s = tR.s;
          String str = "SharePreviewAnimation";
          if (s != null && s.b() instanceof VideoSDKPlayerView) {
             if (tR.s.b().getPlayer() == null) {
                Object[] objArray = new Object[i];
                a.b().t(str, "animShowPreview\(\): VideoSDKPlayerView PreviewPlayer is null", objArray);
             }else {
                AdvEditUtil.l(tR.s.b(), i.m().p().getResult());
                tR.s.b().setCoverVisibility(i);
             }
          }
          try{
             if (tR.C != null) {
                if (p0 != null && !p0.isRecycled()) {
                   tR.j(p0);
                }
                tR.c();
                tR.d.removeAllListeners();
                tR.n();
                tR.o.setVisibility(i);
                tR.d.addListener(new q1(tR));
                tR.e(0xff000000, i);
                tR.r.setVisibility(i);
                tR.d.start();
             }else {
                tR.f();
             }
          }catch(java.lang.Exception e9){
             Object[] objArray1 = new Object[i];
             a.b().t(str, "enter animation has exception : "+e9.getMessage(), objArray1);
             tR.C = i;
             tR.f();
          }
          if (tR.s.i()) {
             p1 t = tR.t;
             s = tR.r;
             p1 s1 = tR.s;
             Object obj = PatchProxy.applyThreeRefs(t, s, s1, tR, p1.class, "13");
             if (obj != PatchProxyResult.class) {
                obj.booleanValue();
             }else if(t.x != null || (!s.getVisibility() && s1 != null)){
                s1.h();
             }
          }
          if (!PatchProxy.applyVoid(null, null, a.class, "38")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action = 805;
             u1.u(1, uElementPack, new ClientContent$ContentPackage());
          }
          d.a(0x66204fb9).XN();
       }
       return;
    }
    public abstract void R8();
    public void S8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "27")) {
          return;
       }
       if (this.z.get() != null) {
          Object[] objArray = new Object[0];
          a.b().w("ShareBasePreviewPresenter", "calculateCover\(\) ", objArray);
          this.X7(a0.y(new b0(this, this.z.get())).T(d.c).G(d.a).R(new i0(this), u.b));
       }else {
          c0 tG = this.G;
          if (tG != null) {
             float f = 0x3f800000;
             if (tG.getCoverMeta() != null) {
                f = f / CoverMetaExt.getCoverAspectRatio(this.G.getCoverMeta());
             }
             tG = this.R;
             if (tG != null) {
                tG.s(f);
             }else {
                i1.c(new NullPointerException("mSharePreviewAnimation is null"));
             }
             this.d9(f);
          }
       }
       return;
    }
    public boolean V8(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c0.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0.a1() == Workspace$Type.ATLAS) {
          if (p0.T0() == Workspace$Source.IMPORT || p0.T0() == Workspace$Source.CAPTURE) {
             b = true;
          }
          return b;
       }else if(p0.T0() == Workspace$Source.MEDIA_SCENE){
          if (p0.B0() == Workspace$From.PROFILE_AVATAR || p0.B0() == Workspace$From.MEDIA_SENCE_COMMON) {
             b = true;
          }
          return b;
       }else if(p0.a1() != Workspace$Type.KTV_SONG && (p0.a1() != Workspace$Type.SINGLE_PICTURE && (p0.T0() != Workspace$Source.JUXING && !p0.a(p0.T0())))){
          b = true;
       }
    label_006f :
       return b;
    }
    public String W8(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c0.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z.get() != null) {
          objArray = this.z.get().getAbsolutePath();
       }
       return objArray;
    }
    public final void X8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "31")) {
          return;
       }
       c0 tq = this.q;
       if (tq instanceof b) {
          tq.b().sharePlayer();
       }
       d.a(0x27ab2faf).NK(this.x, p0);
       return;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "17")) {
          return;
       }
       this.R.o();
       return;
    }
    public void Z8(Workspace$Type p0,PicturesContainer p1){
       e uoe;
       Object[] obj;
       a uoa;
       c0 uoc0 = c0.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoc0, "15")) {
          return;
       }
       Activity uActivity = this.getActivity();
       if (uActivity == null) {
          i1.c(new RuntimeException("initPicturesPlayer activity is null"));
          return;
       }else {
          l ol = new l();
          Size size = PatchProxy.applyOneRefs(uActivity, this, uoc0, "14");
          if (size != PatchProxyResult.class) {
          }else {
             Point point = new Point();
             uActivity.getWindowManager().getDefaultDisplay().getSize(point);
             size = new Size(point.x, point.y);
          }
          int i = 0;
          boolean b = (this.S == Workspace$Type.SINGLE_PICTURE)? true: false;
          p3 op3 = new p3(size, b);
          uoc0 = this.y;
          if (uoc0 != null) {
             c0 tN = this.N;
             Objects.requireNonNull(tN);
             if (!PatchProxy.applyVoidOneRefs(uoc0, tN, g.class, "2")) {
                Object[] objArray = new Object[i];
                String str = "BitmapFilterRendererManager";
                a.D().w(str, "init", objArray);
                if (uoc0 == null) {
                   obj = new Object[i];
                   a.D().w(str, "init workspace is null 1", obj);
                }else if(uoc0.v() == null){
                   obj = new Object[i];
                   a.D().w(str, "init workspace is null 2", obj);
                }else if(tN.a == null){
                   c.a(new f(tN));
                }
             }
             uoe = new e(uActivity, this.y, p0, p1, op3, this.N);
             obj = d.a(0x27ab2faf).Zc(uoc0);
             uoa = d.a(0x27ab2faf).au(obj, uoc0);
             if (uoa != null) {
                this.V.add(uoa);
             }
             ol.e(this.y);
          }else {
             uoe = new e(uActivity, null, p0, p1, op3, null);
             obj = d.a(0x27ab2faf).Zc(uoc0);
             uoa = d.a(0x27ab2faf).au(obj, uoc0);
             if (uoa != null) {
                this.V.add(uoa);
             }
          }
          Iterator iterator = this.V.iterator();
          while (iterator.hasNext()) {
             iterator.next().B();
          }
          if (p0 == Workspace$Type.LONG_PICTURE || p0 == Workspace$Type.SINGLE_PICTURE) {
             p1.a("ShareBasePreviewPresenter", new c0$a(this));
             this.X = p1;
          }else {
             p1.setOnClickListener(new w(this));
          }
          if (obj instanceof a$a) {
             this.q = new a(this.x, p1, ol, obj);
             this.T = obj.l0();
          }
          this.s.addView(p1, -1, -1);
          return;
       }
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, c0.class, "16")) {
          return;
       }
       c0 tq = this.q;
       if (tq instanceof b) {
          this.s.setOnClickListener(new c0(this));
       }else if(!tq instanceof a){
          tq.b().setOnClickListener(new d0(this));
       }
       return;
    }
    public final boolean b9(PhotoEditInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c0.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.getInteractStickerInfo() == null && (p0.getClientEditCoverInfo() != null || p0.getCustomUploadCoverUrls() != null)))? true: false;
       return b;
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, c0.class, "9")) {
          return;
       }
       c0 tq = this.q;
       if (tq != null) {
          if (tq instanceof a) {
             tq = this.X;
             if (tq != null) {
                tq.a("ShareBasePreviewPresenter", null);
             }
          }
          this.h9((PostExperimentUtils.A(this.y) ^ 0x01));
          Object[] objArray = new Object[0];
          a.b().w("ShareBasePreviewPresenter", "releasePlayer\(\) mPreviewPlayer release", objArray);
          this.q.e(0);
          this.q = null;
       }
       if (this.O == null) {
          this.N.e();
       }
       return;
    }
    public abstract void d9(float p0);
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a0ca8);
       this.s = m1.f(p0, 0x7f0a31e0);
       this.v = m1.f(p0, 0x7f0a4172);
       this.u = m1.f(p0, 0x7f0a4171);
       return;
    }
    public void e9(View p0,Bitmap p1,Callable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c0.class, "20")) {
          return;
       }
       ViewGroup viewGroup = this.x.getWindow().getDecorView().findViewById(0x1020002);
       try{
          this.R.t(p0, viewGroup, p1, p2);
       }catch(java.lang.Exception e7){
          PostUtils.D("ShareBasePreviewPresenter", "setCurrentThumbnailView error: ", e7);
       }
       return;
    }
    public void h9(boolean p0){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc0, "18")) {
          return;
       }
       if (PostExperimentUtils.A(this.y)) {
          uoc0 = this.q;
          if (uoc0 != null && uoc0.b() instanceof VideoSDKPlayerView) {
             VideoSDKPlayerView videoSDKPlay = this.q.b();
             EditorSdk2V2$VideoEditorProject videoProject = videoSDKPlay.getVideoProject();
             int i = 0;
             int i1 = (p0)? 0: 3;
             Iterator iterator = videoProject.animatedSubAssets().iterator();
             while (iterator.hasNext()) {
                EditorSdk2V2$AnimatedSubAsset uAnimatedSub = iterator.next();
                if (b.v(uAnimatedSub.opaque()) && uAnimatedSub.renderType() != i1) {
                   uAnimatedSub.setRenderType(i1);
                   i = 1;
                }
                if (PostExperimentUtils.w() && (b.p(uAnimatedSub.opaque()) && uAnimatedSub.renderType() != i1)) {
                   uAnimatedSub.setRenderType(i1);
                   i = 1;
                }
             }
             if (i) {
                videoSDKPlay.sendChangeToPlayer();
             }
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "1")) {
          return;
       }
       this.p = this.t8("SHARE_KTV_INFO");
       this.w = this.r8("SHARE_PAGE_PRESENTER_MODEL");
       this.x = this.r8("SHARE_ACTIVITY");
       this.y = this.t8("WORKSPACE");
       this.z = this.x8("SHARE_COVER_FILE");
       this.A = this.x8("SHARE_ORIGIN_COVER_FILE");
       this.C = this.t8("SHARE_ENCODE_REQUEST");
       List list = this.t8("INTERACT_STICKER_INFO");
       if (!q.f(list)) {
          this.D = list.get(0);
       }
       this.E = this.r8("PHOTO_TASK_ID");
       this.G = this.t8("SHARE_QPHOTO");
       this.I = this.t8("RE_EDIT_REPO");
       this.B = this.x8("SHARE_COVER_NEED_UPLOAD");
       this.F = this.t8("EDIT_SESSION_ID");
       this.H = this.t8("SHARE_FROM_PAGE");
       return;
    }
    public void j9(){
       if (PatchProxy.applyVoid(null, this, c0.class, "36")) {
          return;
       }
       String str = "ShareBasePreviewPresenter";
       if (!i.h()) {
          i1.a(str, "PostSession is null ");
          return;
       }else if(this.x.isFinishing()){
          Object[] objArray = new Object[0];
          a.b().w(str, "startCoverEdit mActivity is finishing ,return", objArray);
          return;
       }else {
          c0 tq = this.q;
          if (tq instanceof b) {
             tq.b().sharePlayer();
             this.h9(true);
          }
          d.a(0x66204fb9).XN();
          d.a(0x27ab2faf).Qv(this.x, this.F, 0x2713);
          return;
       }
    }
    public void k9(){
       boolean b;
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c0.class, "30")) {
          return;
       }
       String str = "ShareBasePreviewPresenter";
       int i = 0;
       if (this.q == null) {
          objArray = new Object[i];
          a.b().t(str, "startEdit: mPreviewPlayer is null,qPhoto can`t edit", objArray);
          return;
       }else if(this.G == null){
          objArray = new Object[i];
          a.b().t(str, "startEdit qPhoto is null", objArray);
          return;
       }else {
          c0 tR = this.R;
          Objects.requireNonNull(tR);
          t obj = PatchProxy.apply(objArray, tR, p1.class, "16");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(!tR.r.getVisibility()){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             objArray = new Object[i];
             a.b().t(str, "startEdit: is previewing", objArray);
             return;
          }else if(this.J != null){
             objArray = new Object[i];
             a.b().w(str, "startEdit: mReEditParams is not null,skip download and api", objArray);
             this.X8(this.J);
             return;
          }else {
             PhotoEditInfo photoEditInf = k9.a(this.G);
             if (this.b9(photoEditInf)) {
                obj = t.just(photoEditInf);
                this.D = photoEditInf.getInteractStickerInfo();
                objArray1 = new Object[i];
                a.b().w(str, "startEdit: use mock PhotoEditInfo", objArray1);
             }else if(this.I != null){
                objArray1 = new Object[i];
                a.b().w(str, "startEdit: use api PhotoEditInfo", objArray1);
                obj = this.I.b();
             }else {
                i1.c(new IllegalStateException("get reEditInfo error"));
                return;
             }
             this.X7(obj.flatMap(new z(this, photoEditInf)).subscribe(new h0(this), w.b));
             return;
          }
       }
    }
    public void l9(View p0,Bitmap p1){
       Object[] objArray2;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c0.class, "29")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "ShareBasePreviewPresenter";
       a.b().w(str, "startPreview", objArray);
       if (this.q == null) {
          Object[] objArray1 = new Object[i];
          a.b().t(str, "startPreview: mPreviewPlayer is null,qPhoto can`t preview", objArray1);
          return;
       }else if(DraftUtils.W(this.G, this.y)){
          objArray2 = new Object[i];
          a.b().w(str, "startPreview qPhoto is not null", objArray2);
          this.X7(this.U.a(this.G, this.W8(), this.x, null).flatMap(new x(this)).observeOn(d.a).subscribe(new b0(this, p0, p1), v.b));
       }else {
          objArray2 = new Object[i];
          a.b().w(str, "startPreview qPhoto is null", objArray2);
          this.e9(p0, p1, new a0(this, p1));
       }
       return;
    }
    public abstract void m9();
    public final boolean n9(c p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c0 uoc0 = c0.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoc0, "25");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          Object[] objArray = new Object[0];
          a.b().t("ShareBasePreviewPresenter", "onActivityResult draft is null", objArray);
          return 0;
       }else {
          File uFile = DraftFileManager.E().v(p0.s0());
          File uFile1 = DraftFileManager.E().G(p0.s0());
          Object[] obj1 = PatchProxy.applyOneRefs(uFile, this, uoc0, "26");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(this.z.get() != null && (uFile != null && (uFile.getAbsolutePath()).equals(this.z.get().getAbsolutePath()))){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             return 0;
          }else {
             this.z.set(uFile);
             if (uFile != null) {
                this.x.getIntent().putExtra("cover_path", uFile.getPath());
             }
             this.A.set(uFile1);
             this.B.set(Boolean.TRUE);
             if (this.z.get() != null) {
                obj1 = new Object[0];
                a.b().w("ShareBasePreviewPresenter", "updateCoverWhenChanged cover file path: "+this.z.get().getAbsolutePath()+", filePath: "+this.z.get().getAbsolutePath(), obj1);
                this.S8();
                return true;
             }else {
                return 0;
             }
          }
       }
    }
    public void o9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c0.class, "24")) {
          return;
       }
       boolean b = this.n9(this.y);
       c0 ty = this.y;
       int i = 0;
       if (ty == null) {
          objArray = new Object[i];
          a.b().t("ShareBasePreviewPresenter", "uploadEditCover mWorkspaceDraft is null", objArray);
          return;
       }else if(!b || z.u(ty.a1())){
          c0 tK = this.K;
          if (tK != null) {
             tK.dispose();
             this.K = objArray;
          }
          a uoa = d.a(-273232199).a20().e4(this.y.D0());
          if (uoa != null && uoa.getUploadInfo() != null) {
             Object[] objArray1 = new Object[i];
             a.b().w("ShareBasePreviewPresenter", "uploadEditCover: updateCoverFile : "+this.z.get().getAbsolutePath(), objArray1);
             this.K = d.a(0x3f7e4959).KD(uoa.getUploadInfo(), this.z.get(), this.A.get()).subscribe(Functions.d(), t.b);
          }
       }
    label_00ae :
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       Object[] objArray;
       Object[] objArray1;
       k d;
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, c0.class, "22")) {
          return;
       }
       boolean b = true;
       int i = -1;
       if (p0 == 0x2712 && p1 == i) {
          objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, uoc0, "23")) {
             if (this.G == null) {
                objArray1 = new Object[0];
                a.b().t("ShareBasePreviewPresenter", "onActivityResult qphoto is null", objArray1);
             }else if(i.m().y().isEmpty()){
                objArray1 = objArray;
             }else {
                c uoc = i.m().y().get(0);
             }
             this.n9(objArray1);
             PreviewPlayer previewPlaye = i.m().p().s();
             Objects.requireNonNull(previewPlaye);
             previewPlaye = previewPlaye.mProject;
             c0 tq = this.q;
             if (tq instanceof b) {
                tq.b().updateFakeVideoProject(previewPlaye);
             }
             tq = this.I;
             if (tq != null) {
                k ok = k.class;
                if (!PatchProxy.applyVoidOneRefs(previewPlaye, tq, ok, "1")) {
                   if (a.g(previewPlaye, tq.e) ^ b) {
                      Object[] objArray2 = new Object[0];
                      a.b().w("ShareReEditRepo", "change videoProject", objArray2);
                      tq.e = previewPlaye;
                      if (!PatchProxy.applyVoid(objArray, tq, ok, "5")) {
                         Object[] ok1 = new Object[0];
                         a.b().w("ShareReEditRepo", "cancelEncode", ok1);
                         tq.c.onNext("");
                         d = tq.d;
                         if (d != null) {
                            d.dispose();
                         }
                         tq.d = objArray;
                      }
                   }else {
                      tq.e = previewPlaye;
                   }
                }
                this.X7(this.I.c().subscribe(y.b, s.b));
             }
          }
       }else if(p0 == 0x2713){
          d.a(0x66204fb9).resumeAll();
          if (p1 == i) {
             this.o9();
          }
       }
       if (p0 == 0x2712 && this.M != null) {
          this.Q = b;
          objArray = new Object[0];
          a.b().w("ShareBasePreviewPresenter", "updateRedEditInfo mHasGoEdit become true", objArray);
       }
       return;
    }
}
