package com.kwai.video.wayne.player.main.WaynePlayer$mOnPlayerReleaseListener$1;
import ai7.e;
import com.kwai.video.wayne.player.main.WaynePlayer;
import java.lang.Object;
import com.kwai.player.qos.KwaiPlayerResultQos;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.wayne.player.logreport.KPMidTrace;
import com.kwai.video.wayne.player.main._1_AbstractMediaPlayerApiDelegate;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.util.DebugLog;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.video.wayne.player.logreport.DataReporter;

public final class WaynePlayer$mOnPlayerReleaseListener$1 implements e	// class@000d9e
{
    public final WaynePlayer this$0;

    public void WaynePlayer$mOnPlayerReleaseListener$1(WaynePlayer p0){
       this.this$0 = p0;
       super();
    }
    public final void onRelease(KwaiPlayerResultQos p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayer$mOnPlayerReleaseListener$1.class, "1")) {
          return;
       }
       this.this$0.getMKPMidTrace().addStamp("release");
       this.this$0.getMKPMidTrace().addVseKV("deprecatedMethod", String.valueOf(this.this$0.getMUseDeprecatedMethod()));
       WaynePlayer$mOnPlayerReleaseListener$1 tthis$0 = this.this$0;
       WaynePlayer mStartToFirs = tthis$0.mStartToFirstScreenVideoFirstFrameCT;
       if (mStartToFirs <= 0) {
          mStartToFirs = tthis$0.mStartToFirstScreenAudioFirstFrameCT;
       }
       tthis$0.getMKPMidTrace().addVseKV("start_to_first_screen", String.valueOf(mStartToFirs));
       if (p0 != null) {
          KwaiPlayerResultQos videoStatJso = p0.videoStatJson;
          a.o(videoStatJso, "qos.videoStatJson");
          p0.videoStatJson = this.this$0.getMKPMidTrace().appendAfterJsonStr(videoStatJso);
          videoStatJso = p0.briefVideoStatJson;
          a.o(videoStatJso, "qos.briefVideoStatJson");
          p0.briefVideoStatJson = this.this$0.getMKPMidTrace().appendAfterJsonStr(videoStatJso);
          DebugLog.i(this.this$0.getLogTag(), "release qos "+p0.videoStatJson);
       }else {
          DebugLog.i(this.this$0.getLogTag(), "release qos null");
       }
       Iterator iterator = this.this$0.mQosDataReporters.iterator();
       while (iterator.hasNext()) {
          iterator.next().report(p0);
       }
       DebugLog.i(this.this$0.getLogTag(), "mIsActiveRelease "+this.this$0.mIsActiveRelease);
       tthis$0 = this.this$0;
       if (tthis$0.mIsActiveRelease != null) {
          iterator = tthis$0.mVseDataReporters.iterator();
          while (iterator.hasNext()) {
             iterator.next().report(p0);
          }
       }
       this.this$0.getMKPMidTrace().initTrace();
       return;
    }
}
