package com.yxcorp.gifshow.comment.utils.VideoCommentEggUtils$a;
import xg5.i;
import vg5.c;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yca.a;
import vg5.b;
import com.kwai.component.stargateegg.model.StargateEggConfig;
import com.kwai.component.stargateegg.log.StargateEggIntervalLogger;

public class VideoCommentEggUtils$a extends i	// class@001101
{

    public void VideoCommentEggUtils$a(){
       super();
    }
    public void a(c p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoCommentEggUtils$a.class, "3")) {
          return;
       }
       a.a("star_gate_eggs", "play_error", "");
       return;
    }
    public void d(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoCommentEggUtils$a.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       StargateEggConfig mActivityId = p0.a().a.mActivityId;
       if (mActivityId == null) {
          return;
       }
       StargateEggIntervalLogger.e.e(mActivityId, "COMMENT_POST_KEYWORD_ANIMATION", 1);
       return;
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoCommentEggUtils$a.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       StargateEggIntervalLogger.e.c(p0, "COMMENT_POST_KEYWORD_ANIMATION", 1);
       return;
    }
}
