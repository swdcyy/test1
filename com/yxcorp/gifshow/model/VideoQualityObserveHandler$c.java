package com.yxcorp.gifshow.model.VideoQualityObserveHandler$c;
import com.kwai.video.clipkit.videoevaluate.ClipVideoQualityEvaluateTaskListener;
import com.yxcorp.gifshow.model.VideoQualityObserveHandler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gq.a;
import q87.c;
import com.kwai.video.clipkit.ClipExportException;
import java.lang.StringBuilder;
import java.lang.Double;
import com.kwai.video.clipkit.videoevaluate.ClipVideoQualityEvaluateTaskHandler;
import kotlin.jvm.internal.a;
import com.kwai.video.clipkit.videoevaluate.ClipVideoQualityEvaluateTaskHandler$VideoQualityEvaluateRequestInfo;
import w46.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.MediaType;
import com.google.gson.Gson;
import okhttp3.RequestBody;
import elb.b0;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.model.VideoQualityObserveHandler$c$a;
import erd.a;
import com.yxcorp.gifshow.model.VideoQualityObserveHandler$c$b;
import com.yxcorp.gifshow.model.VideoQualityObserveHandler$c$c;
import erd.g;
import crd.b;
import crd.a;

public final class VideoQualityObserveHandler$c implements ClipVideoQualityEvaluateTaskListener	// class@001ea1
{
    public final VideoQualityObserveHandler a;

    public void VideoQualityObserveHandler$c(VideoQualityObserveHandler p0){
       this.a = p0;
       super();
    }
    public void onCancel(){
       if (PatchProxy.applyVoid(null, this, VideoQualityObserveHandler$c.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("VideoQualityObserveHandler", "clipVideoQualityTask: onCancel", objArray);
       this.a.a(0);
       return;
    }
    public void onError(ClipExportException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoQualityObserveHandler$c.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("VideoQualityObserveHandler", "clipVideoQualityTask: onError "+p0, objArray);
       this.a.a(0);
       return;
    }
    public void onProgress(double p0){
       VideoQualityObserveHandler$c uoc = VideoQualityObserveHandler$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uoc, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("VideoQualityObserveHandler", "clipVideoQualityTask: onProgress is "+p0, objArray);
       return;
    }
    public void onSuccess(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoQualityObserveHandler$c.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       String str = "VideoQualityObserveHandler";
       a.D().w(str, "clipVideoQualityTask: onCancel", objArray1);
       ClipVideoQualityEvaluateTaskHandler uClipVideoQu = this.a.g();
       a.m(uClipVideoQu);
       ClipVideoQualityEvaluateTaskHandler$VideoQualityEvaluateRequestInfo taskRequestI = uClipVideoQu.getTaskRequestInfo();
       if (taskRequestI == null) {
          objArray1 = new Object[i];
          a.D().t(str, "clipVideoQualityTask taskResult is null", objArray1);
          VideoQualityObserveHandler.b(this.a, i, 1, objArray);
          return;
       }else {
          VideoQualityObserveHandler$c ta = this.a;
          VideoQualityObserveHandler d = ta.d;
          ClipVideoQualityEvaluateTaskHandler$VideoQualityEvaluateRequestInfo mToken = taskRequestI.mToken;
          a.o(mToken, "taskResult.mToken");
          ClipVideoQualityEvaluateTaskHandler$VideoQualityEvaluateRequestInfo mSessionId = taskRequestI.mSessionId;
          a.o(mSessionId, "taskResult.mSessionId");
          ClipVideoQualityEvaluateTaskHandler$VideoQualityEvaluateRequestInfo mBusiness = taskRequestI.mBusiness;
          a.o(mBusiness, "taskResult.mBusiness");
          taskRequestI = taskRequestI.mProjectId;
          a.o(taskRequestI, "taskResult.mProjectId");
          Objects.requireNonNull(ta);
          t ot = PatchProxy.applyFourRefs(mToken, mSessionId, mBusiness, taskRequestI, ta, VideoQualityObserveHandler.class, "9");
          if (ot != PatchProxyResult.class) {
          }else {
             LinkedHashMap linkedHashMa = new LinkedHashMap();
             linkedHashMa.put("token", mToken);
             linkedHashMa.put("session_id", mSessionId);
             linkedHashMa.put("business", mBusiness);
             linkedHashMa.put("source_file_info_md5", taskRequestI);
             RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), new Gson().q(linkedHashMa));
             a.o(requestBody, "RequestBody.create\(\n    ¡­on\(\).toJson\(params\)\n    \)");
             ot = ta.e().b(requestBody).map(new e()).subscribeOn(d.c);
             a.o(ot, "mService\n      .uploadVi¡­eOn\(KwaiSchedulers.ASYNC\)");
          }
          d.c(ot.observeOn(d.c).doAfterTerminate(new VideoQualityObserveHandler$c$a(this)).subscribe(new VideoQualityObserveHandler$c$b(this), new VideoQualityObserveHandler$c$c(this)));
          return;
       }
    }
}
