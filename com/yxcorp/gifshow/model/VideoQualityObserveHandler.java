package com.yxcorp.gifshow.model.VideoQualityObserveHandler;
import com.yxcorp.gifshow.model.VideoQualityObserveHandler$a;
import nsd.u;
import java.lang.String;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.Runnable;
import java.lang.Object;
import kotlin.jvm.internal.a;
import crd.a;
import com.yxcorp.gifshow.model.VideoQualityObserveHandler$mService$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.model.VideoQualityObserveHandler$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.video.clipkit.videoevaluate.ClipVideoQualityEvaluateTaskHandler;
import java.util.Objects;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import android.content.SharedPreferences;
import q46.l;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.yxcorp.gifshow.model.VideoQualityObserveHandler$b;
import t45.c;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import elb.b0;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import com.kwai.video.clipkit.videoevaluate.ClipVideoQualityEvaluateTaskHandler$VideoUploadRequestInfo;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$VideoEvaluateTaskOptions;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.kwai.video.clipkit.videoevaluate.ClipVideoQualityEvaluateTaskListener;

public final class VideoQualityObserveHandler	// class@001ea3
{
    public ClipVideoQualityEvaluateTaskHandler a;
    public String b;
    public String c;
    public a d;
    public final p e;
    public final VideoQualityObserveHandler$c f;
    public final boolean g;
    public final String h;
    public final String i;
    public int j;
    public final int k;
    public EditorSdk2V2$VideoEditorProject l;
    public final Runnable m;
    public static final VideoQualityObserveHandler$a n;

    static {
       VideoQualityObserveHandler.n = new VideoQualityObserveHandler$a(null);
    }
    public void VideoQualityObserveHandler(boolean p0,String p1,String p2,int p3,int p4,EditorSdk2V2$VideoEditorProject p5,Runnable p6){
       a.p(p1, "sessionId");
       super();
       this.g = p0;
       this.h = p1;
       this.i = p2;
       this.j = p3;
       this.k = p4;
       this.l = p5;
       this.m = p6;
       this.b = "";
       this.c = "";
       this.d = new a();
       this.e = s.c(VideoQualityObserveHandler$mService$2.INSTANCE);
       this.f = new VideoQualityObserveHandler$c(this);
    }
    public static void b(VideoQualityObserveHandler p0,boolean p1,int p2,Object p3){
       if (p2 & 1) {
          p1 = true;
       }
       p0.a(p1);
       return;
    }
    public final void a(boolean p0){
       VideoQualityObserveHandler ta;
       VideoQualityObserveHandler videoQuality = VideoQualityObserveHandler.class;
       if (PatchProxy.isSupport(videoQuality) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, videoQuality, "7")) {
          return;
       }
       if (!this.d.isDisposed()) {
          this.d.dispose();
       }
       if (p0) {
          ta = this.a;
          if (ta != null) {
             ta.cancel();
          }
          this.a = null;
       }
       ta = this.m;
       if (ta != null) {
          ta.run();
       }
       VideoQualityObserveHandler$a n = VideoQualityObserveHandler.n;
       videoQuality = this.h;
       Objects.requireNonNull(n);
       if (!PatchProxy.applyVoidOneRefs(videoQuality, n, VideoQualityObserveHandler$a.class, "3")) {
          a.p(videoQuality, "sessionId");
          Object[] objArray = new Object[0];
          a.D().w("VideoQualityObserveHandler", "clearRecord : "+videoQuality, objArray);
          g.a(l.g().edit().remove("VIDEO_QUALITY_PREFIX"+videoQuality));
       }
       c.a(new VideoQualityObserveHandler$b(this));
       return;
    }
    public final t c(){
       t obj = PatchProxy.apply(null, this, VideoQualityObserveHandler.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e().a().map(new e()).subscribeOn(d.c);
       a.o(obj, "mService\n      .fetchVid¡­eOn\(KwaiSchedulers.ASYNC\)");
       return obj;
    }
    public final String d(){
       return this.b;
    }
    public final b0 e(){
       Object obj = PatchProxy.apply(null, this, VideoQualityObserveHandler.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final String f(){
       return this.i;
    }
    public final ClipVideoQualityEvaluateTaskHandler g(){
       return this.a;
    }
    public final int h(){
       return this.k;
    }
    public final EditorSdk2V2$VideoEditorProject i(){
       return this.l;
    }
    public final int j(){
       return this.j;
    }
    public final void k(ClipVideoQualityEvaluateTaskHandler$VideoUploadRequestInfo p0,EditorSdk2$VideoEvaluateTaskOptions p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoQualityObserveHandler.class, "6")) {
          return;
       }
       File uFile = PostUtils.p("VideoQualityDir_"+this.h);
       a.o(uFile, "PostUtils.getSubCacheDir\(CACHE_DIR + sessionId\)");
       String absolutePath = uFile.getAbsolutePath();
       a.o(absolutePath, "dirFile.absolutePath");
       this.b = absolutePath;
       File uFile1 = new File(uFile, "VideoQualityOutput.mp4");
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "VideoQualityObserveHandler";
       a.D().w(str, "realStartTask: response = "+p0+", exportFilePath = "+uFile1.getAbsolutePath(), objArray);
       if (uFile1.exists() || uFile1.createNewFile()) {
          String absolutePath1 = uFile1.getAbsolutePath();
          a.o(absolutePath1, "exportFile.absolutePath");
          this.c = absolutePath1;
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          ClipVideoQualityEvaluateTaskHandler uClipVideoQu = new ClipVideoQualityEvaluateTaskHandler(uoc.a(), this.l, this.c, this.h, p1);
          this.a = absolutePath1;
          a.m(absolutePath1);
          absolutePath1.setClipVideoQualityEvaluateTaskListener(this.f);
          VideoQualityObserveHandler ta = this.a;
          a.m(ta);
          ta.setVideoType(this.j);
          ta = this.a;
          a.m(ta);
          ta.setVideoUploadRequestInfo(p0);
          VideoQualityObserveHandler ta1 = this.a;
          a.m(ta1);
          ta1.start();
       }else {
          Object[] objArray1 = new Object[i];
          a.D().w(str, "realStartTask: exportFile unavailable", objArray1);
          VideoQualityObserveHandler.b(this, i, 1, null);
       }
       return;
    }
}
