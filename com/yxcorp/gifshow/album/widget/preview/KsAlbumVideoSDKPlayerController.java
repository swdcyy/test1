package com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoSDKPlayerController;
import com.yxcorp.gifshow.album.widget.preview.a;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoPlayerView;
import java.util.concurrent.CountDownLatch;
import com.kwai.robust.PatchProxyResult;
import bc7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.editorsdk2.EditorSdk2Utils$PreviewSizeLimitation;
import java.util.Objects;
import java.lang.Boolean;
import g79.a;
import w69.y0;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoSDKPlayerController$a;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.editorsdk2.PreviewPlayer;
import com.yxcorp.utility.Log;
import java.lang.IllegalStateException;
import java.lang.Exception;
import java.io.IOException;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.util.Locale;
import java.lang.Number;
import com.kwai.video.editorsdk2.VideoEditorSession;
import r79.e;
import java.lang.Runnable;
import erd.g;
import crd.b;
import u79.l;
import io.reactivex.i;
import brd.a0;
import w69.p0;
import brd.z;
import u79.m;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.video.editorsdk2.PreviewTextureView;
import android.content.Context;
import java.lang.StringBuilder;
import com.kwai.video.editorsdk2.PreviewEventListener;
import com.kwai.video.editorsdk2.PreviewPlayerDetailedStats;
import java.util.List;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import w69.x;
import com.kwai.video.editorsdk2.ThumbnailGenerator;
import java.lang.Double;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkPreviewPlayerStats;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.yxcorp.utility.TextUtils;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import com.yxcorp.utility.SystemUtil;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.editorsdk2.ThumbnailStatsInfo;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoSDKPlayerController$b;
import com.kwai.moved.utility.AlbumEnv;
import qrd.p;
import com.google.gson.Gson;
import com.kwai.video.editorsdk2.PreviewPlayerInitParamsBuilder;
import android.widget.RelativeLayout;
import com.kwai.video.editorsdk2.PreviewPlayerInitParams;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import ekd.j;
import com.yxcorp.gifshow.album.widget.preview.d;
import com.kwai.video.editorsdk2.PerfEntryConsumer;
import com.yxcorp.gifshow.album.widget.preview.e;
import com.kwai.video.editorsdk2.PreviewPlayer$RealtimeStatsListener;
import com.kwai.video.editorsdk2.ProjectThumbnailOptionsBuilder;
import com.kwai.video.editorsdk2.ProjectThumbnailOptions;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.util.Arrays;
import w69.l;

public class KsAlbumVideoSDKPlayerController extends a	// class@001b28
{
    public VideoEditorSession d;
    public PreviewPlayer e;
    public ThumbnailGenerator f;
    public PreviewTextureView g;
    public EditorSdk2V2$VideoEditorProject h;
    public byte[] i;
    public boolean j;
    public boolean k;
    public CountDownLatch l;
    public int m;
    public String n;
    public double o;
    public boolean p;
    public PreviewPlayer q;
    public KsAlbumVideoSDKPlayerController$b r;
    public EditorSdk2Utils$PreviewSizeLimitation s;
    public final PreviewEventListenerV2 t;
    public static final String u = "KsAlbumVideoSDKPlayerController";

    public void KsAlbumVideoSDKPlayerController(KsAlbumVideoPlayerView p0){
       a a;
       super(p0);
       boolean b = true;
       this.j = b;
       this.k = b;
       this.l = new CountDownLatch(b);
       this.n = "";
       this.o = 0xbff0000000000000;
       this.p = b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       EditorSdk2Utils$PreviewSizeLimitation previewSizeL = PatchProxy.apply(null, null, uoa, "5");
       if (previewSizeL != patchProxyRe) {
       }else {
          a = a.a;
          Objects.requireNonNull(a);
          Object obj = PatchProxy.apply(null, a, uoa, "9");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(a.c.d().a() == 1080){
             b = false;
          }
          EditorSdk2Utils$PreviewSizeLimitation pREVIEW_SIZE = (b)? EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_1080P: EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_720P;
          previewSizeL = pREVIEW_SIZE;
       }
       this.s = previewSizeL;
       this.t = new KsAlbumVideoSDKPlayerController$a(this);
       return;
    }
    public KsAlbumVideoSDKPlayerController A(EditorSdk2V2$VideoEditorProject p0,boolean p1){
       KsAlbumVideoSDKPlayerController obj;
       if (PatchProxy.isSupport(KsAlbumVideoSDKPlayerController.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, KsAlbumVideoSDKPlayerController.class, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null) {
          obj = this.e;
          if (obj != null) {
             try{
                obj.mProject = p0;
                Log.b(KsAlbumVideoSDKPlayerController.u, "set project in setVideoProject.");
                this.h = p0;
                if (p1) {
                   double d = 0xbff0000000000000;
                   this.o = d;
                   this.e.updateProjectAndMagicData();
                }else if(PatchProxy.applyVoid(null, this, KsAlbumVideoSDKPlayerController.class, "21")){
                   this.z(true);
                }
             }catch(java.io.IOException e4){
                e4.printStackTrace();
             }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e4){
                e4.printStackTrace();
             }catch(java.lang.IllegalStateException e4){
                e4.printStackTrace();
             }
          }
       }
    }
    public String b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KsAlbumVideoSDKPlayerController ksAlbumVideo = KsAlbumVideoSDKPlayerController.class;
       Object[] objArray = null;
       KsAlbumVideoSDKPlayerController obj = PatchProxy.apply(objArray, this, ksAlbumVideo, "20");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.e;
       Object obj1 = PatchProxy.applyOneRefs(obj, objArray, ksAlbumVideo, "37");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else if(obj == null){
          EditorSdk2V2$TrackAsset currentTrack = EditorSdk2UtilsV2.getCurrentTrackAsset(obj.mProject, obj.getCurrentTime());
          String str = (currentTrack != null)? currentTrack.assetPath(): "";
          objArray = new Object[]{obj.getDebugInfo(),str};
          objArray = String.format(Locale.US, "%s\n%s", objArray);
       }
       return objArray;
    }
    public double c(){
       Object obj = PatchProxy.apply(null, this, KsAlbumVideoSDKPlayerController.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       double computedDura = (this.v() != null)? EditorSdk2UtilsV2.getComputedDuration(this.v()): 0x3ee4f8b588e368f1;
       return computedDura;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, KsAlbumVideoSDKPlayerController.class, "2")) {
          return;
       }
       this.x(null, null);
       return;
    }
    public boolean e(){
       KsAlbumVideoSDKPlayerController obj = PatchProxy.apply(null, this, KsAlbumVideoSDKPlayerController.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.e;
       boolean b = (obj != null && obj.isPlaying())? true: false;
       return b;
    }
    public boolean f(){
       boolean b = (this.e == null)? true: false;
       return b;
    }
    public b g(e p0,Runnable p1,g p2){
       a obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, KsAlbumVideoSDKPlayerController.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.c;
       return a0.k(new l(p0)).T(obj.i().a()).G(obj.i().b()).R(new m(this, p1), p2);
    }
    public View h(ViewGroup p0){
       PreviewTextureView obj = PatchProxy.applyOneRefs(p0, this, KsAlbumVideoSDKPlayerController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PreviewTextureView(p0.getContext());
       this.g = obj;
       return obj;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, KsAlbumVideoSDKPlayerController.class, "14")) {
          return;
       }
       Log.b(KsAlbumVideoSDKPlayerController.u, "onPause TextureView "+this);
       this.g.onPause();
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, KsAlbumVideoSDKPlayerController.class, "13")) {
          return;
       }
       Log.b(KsAlbumVideoSDKPlayerController.u, "onResume TextureView "+this);
       this.g.onResume();
       KsAlbumVideoSDKPlayerController te = this.e;
       if (te != null) {
          te.setPreviewEventListener(this.t);
       }
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, KsAlbumVideoSDKPlayerController.class, "12")) {
          return;
       }
       KsAlbumVideoSDKPlayerController te = this.e;
       if (te != null && te.isPlaying()) {
          Log.b(KsAlbumVideoSDKPlayerController.u, "player pause "+this.e);
          this.e.pause();
       }
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, KsAlbumVideoSDKPlayerController.class, "11")) {
          return;
       }
       String u = KsAlbumVideoSDKPlayerController.u;
       Log.b(u, "call play "+this);
       KsAlbumVideoSDKPlayerController te = this.e;
       if (te != null && !te.isPlaying()) {
          Log.b(u, "player play "+this.e);
          this.e.play();
       }
       return;
    }
    public void m(){
       boolean b;
       KsAlbumVideoSDKPlayerController ksAlbumVideo = KsAlbumVideoSDKPlayerController.class;
       if (PatchProxy.applyVoid(null, this, ksAlbumVideo, "8")) {
          return;
       }
       String u = KsAlbumVideoSDKPlayerController.u;
       Log.b(u, "call release "+this);
       if (this.p != null && this.q != null) {
          Log.b(u, "restore sharing player before release "+this.q);
          this.e = this.q;
          this.q = null;
       }
       _monitor_enter(this);
       if (PatchProxy.applyVoid(null, this, ksAlbumVideo, "7")) {
          _monitor_exit(this);
       }else {
          Log.b(u, "call stop "+this);
          if (this.e != null) {
             Log.b(u, "do stop "+this);
             KsAlbumVideoSDKPlayerController obj = PatchProxy.apply(null, this, ksAlbumVideo, "29");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                obj = this.e;
                if (obj != null) {
                   PreviewPlayerDetailedStats detailedStat = obj.getDetailedStats();
                   if (detailedStat != null && (!detailedStat.getRenderStats().isEmpty() && !detailedStat.getDecoderStats().isEmpty())) {
                      b = true;
                   }
                }
                b = false;
             }
             if (b) {
                a.c.f().j(this.q());
             }
             this.i();
             this.g.setPreviewPlayer(null);
             this.h = this.e.mProject;
             if (this.p != null) {
                Log.b(u, "release own player "+this.e);
                this.e.setPreviewEventListener(null);
                this.s();
                this.e.release();
             }else {
                Log.b(u, "pause shared player "+this.e);
                this.e.setPreviewEventListener(null);
                this.s();
             }
             this.e = null;
          }
          _monitor_exit(this);
       }
       if (!PatchProxy.applyVoid(null, this, ksAlbumVideo, "9") && this.f != null) {
          Log.b(u, "call releaseThumbnailGenerator "+this);
          this.f.release();
          this.f = null;
       }
       this.r = null;
       ksAlbumVideo = this.d;
       if (ksAlbumVideo != null) {
          ksAlbumVideo.release();
       }
       return;
    }
    public void n(double p0){
       KsAlbumVideoSDKPlayerController ksAlbumVideo = KsAlbumVideoSDKPlayerController.class;
       if (PatchProxy.isSupport(ksAlbumVideo) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, ksAlbumVideo, "27")) {
          return;
       }
       if (this.e == null) {
          return;
       }
       Log.b(KsAlbumVideoSDKPlayerController.u, "seekTo :"+p0);
       this.e.seek(p0);
       return;
    }
    public void o(boolean p0){
       KsAlbumVideoSDKPlayerController ksAlbumVideo = KsAlbumVideoSDKPlayerController.class;
       if (PatchProxy.isSupport(ksAlbumVideo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksAlbumVideo, "15")) {
          return;
       }
       super.o(p0);
       ksAlbumVideo = this.e;
       if (ksAlbumVideo != null) {
          ksAlbumVideo.setLoop(p0);
       }
       return;
    }
    public final ClientStat$StatPackage q(){
       ClientStat$StatPackage obj = PatchProxy.apply(null, this, KsAlbumVideoSDKPlayerController.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientStat$StatPackage();
       ClientStat$EditorSdkStatEvent uEditorSdkSt = new ClientStat$EditorSdkStatEvent();
       obj.editorSdkStatEvent = uEditorSdkSt;
       uEditorSdkSt.previewPlayerStats = this.r();
       obj.editorSdkStatEvent.urlPackage = new ClientEvent$UrlPackage();
       obj.editorSdkStatEvent.urlPackage.page = this.t();
       obj.editorSdkStatEvent.statsSessionId = TextUtils.k(this.n);
       return obj;
    }
    public final ClientStat$EditorSdkPreviewPlayerStats r(){
       KsAlbumVideoSDKPlayerController ksAlbumVideo = KsAlbumVideoSDKPlayerController.class;
       ClientStat$EditorSdkPreviewPlayerStats obj = PatchProxy.apply(null, this, ksAlbumVideo, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientStat$EditorSdkPreviewPlayerStats();
       HashMap hashMap = new HashMap();
       ArrayList uArrayList = new ArrayList();
       KsAlbumVideoSDKPlayerController te = this.e;
       if (te != null) {
          PreviewPlayerDetailedStats previewPlaye = te.consumeDetailedStats();
          if (previewPlaye != null) {
             Map map = previewPlaye.serializeToMap();
             EditorSdk2Utils.insertBoardPlatformIntoPreviewStatsMap(map, SystemUtil.g());
             uArrayList.add(map);
          }
       }
       ThumbnailStatsInfo thumbnailSta = PatchProxy.apply(null, this, ksAlbumVideo, "31");
       if (thumbnailSta != PatchProxyResult.class) {
       }else if(this.f != null){
          Log.b(KsAlbumVideoSDKPlayerController.u, "buildThumbnailStatsInfo: using mThumbnailGenerator");
          thumbnailSta = this.f.getThumbnailDetailedStats();
       }else if(this.r != null){
          Log.b(KsAlbumVideoSDKPlayerController.u, "buildThumbnailStatsInfo: using mCustomThumbnailStatsProvider");
          thumbnailSta = this.r.a();
       }else {
          thumbnailSta = null;
       }
       if (thumbnailSta != null) {
          uArrayList.add(thumbnailSta.serializeToMap());
       }
       hashMap.put("preview_stats", uArrayList);
       Gson gson = PatchProxy.apply(null, null, AlbumEnv.class, "11");
       if (gson == PatchProxyResult.class) {
          gson = AlbumEnv.p.getValue();
       }
       obj.editorMeta = gson.q(hashMap);
       return obj;
    }
    public final void s(){
       if (PatchProxy.applyVoid(null, this, KsAlbumVideoSDKPlayerController.class, "6")) {
          return;
       }
       this.e.removePerfConsumer("preview");
       this.e.stopRealtimeQos();
       return;
    }
    public int t(){
       return this.m;
    }
    public int u(){
       Object obj = PatchProxy.apply(null, this, KsAlbumVideoSDKPlayerController.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.v() != null)? a.a(this.v()): 1;
       return i;
    }
    public EditorSdk2V2$VideoEditorProject v(){
       PreviewPlayer mProject;
       KsAlbumVideoSDKPlayerController obj = PatchProxy.apply(null, this, KsAlbumVideoSDKPlayerController.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj != null) {
          mProject = obj.mProject;
          if (mProject == null) {
          label_0019 :
             mProject = this.h;
             if (mProject == null) {
                mProject = new EditorSdk2V2$VideoEditorProject();
                this.h = mProject;
             }
          }
       }else {
          goto label_0019 ;
       }
       return mProject;
    }
    public int w(){
       Object obj = PatchProxy.apply(null, this, KsAlbumVideoSDKPlayerController.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.v() != null)? a.b(this.v()): 1;
       return i;
    }
    public void x(VideoEditorSession p0,PreviewPlayer p1){
       KsAlbumVideoSDKPlayerController ksAlbumVideo = KsAlbumVideoSDKPlayerController.class;
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, obj, this, ksAlbumVideo, "3")) {
          return;
       }
       String u = KsAlbumVideoSDKPlayerController.u;
       Log.b(u, "initialize "+this+", sharedPlayer "+obj);
       this.d = (p0 == null)? new VideoEditorSession(): p0;
       boolean b = false;
       PreviewPlayerInitParamsBuilder previewPlaye = new PreviewPlayerInitParamsBuilder();
       previewPlaye.setContext(this.a.getContext());
       PreviewPlayer previewPlaye1 = this.d.createPreviewPlayer(previewPlaye.build());
       this.e = previewPlaye1;
       previewPlaye1.setAVSync(this.j);
       this.e.setLoop(this.b);
       this.p = true;
       this.g.setPreviewPlayer(this.e);
       KsAlbumVideoSDKPlayerController th = this.h;
       if (th != null) {
          this.e.mProject = th;
          if (!j.h(th.trackAssets().toNormalArray())) {
             Log.b(u, "set project in initialize "+this);
             this.z(b);
          }
       }
       this.e.setPreviewEventListener(this.t);
       if (!PatchProxy.applyVoid(obj, this, ksAlbumVideo, "5")) {
          this.e.addPerfConsumer("preview", d.a);
          this.e.startRealtimeQosWithListener(e.a);
       }
       this.h = new EditorSdk2V2$VideoEditorProject();
       return;
    }
    public void y(boolean p0){
       KsAlbumVideoSDKPlayerController ksAlbumVideo = KsAlbumVideoSDKPlayerController.class;
       if (PatchProxy.isSupport(ksAlbumVideo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksAlbumVideo, "36")) {
          return;
       }
       ksAlbumVideo = this.f;
       if (ksAlbumVideo != null) {
          EditorSdk2V2$VideoEditorProject videoEditorP = this.v();
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(ksAlbumVideo, videoEditorP, Boolean.valueOf(p0), null, a.class, "6")) {
             if (ksAlbumVideo == null || videoEditorP == null) {
                a.a.c(new RuntimeException("setThumbnailProject videoEditorProject or thumbnailGenerator is null"));
             }else {
                videoEditorP.setProjectOutputWidth(a.b(videoEditorP));
                videoEditorP.setProjectOutputHeight(a.a(videoEditorP));
                ksAlbumVideo.setProject(videoEditorP, ThumbnailGenerator.newProjectThumbnailOptionsBuilder().setIgnoreAEEffects(p0).build());
                videoEditorP.setProjectOutputWidth(videoEditorP.projectOutputWidth());
                videoEditorP.setProjectOutputHeight(videoEditorP.projectOutputHeight());
             }
          }
       }
       return;
    }
    public void z(boolean p0){
       KsAlbumVideoSDKPlayerController ksAlbumVideo = KsAlbumVideoSDKPlayerController.class;
       if (PatchProxy.isSupport(ksAlbumVideo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ksAlbumVideo, "22")) {
          return;
       }
       if (!PatchProxy.isSupport(ksAlbumVideo) || (!PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Double.valueOf(0xbff0000000000000), this, ksAlbumVideo, "23") && this.e != null)) {
          String u = KsAlbumVideoSDKPlayerController.u;
          String str = "sendChangeToPlayer "+this;
          try{
             Log.b(u, str);
             this.o = 0xbff0000000000000;
             this.e.updateProject();
             if (p0) {
                if (this.f != null && this.v() != null) {
                   a.d(this.f, this.v(), Boolean.FALSE);
                }
                byte[] uobyteArray = this.v().toByteArray();
                if (!Arrays.equals(uobyteArray, this.i)) {
                   this.i = uobyteArray;
                }
             }
          }catch(java.lang.Exception e7){
             e7.printStackTrace();
             a.c.c().b("KsAlbumVideoSDKPlayerController", "advSdkV2Error", e7);
          }
       }
    }
}
