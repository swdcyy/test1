package com.kuaishou.live.deepaec.LiveDeepAecHelper$a;
import com.kwai.plugin.dva.work.c$c;
import com.kuaishou.live.deepaec.LiveDeepAecHelper;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import sj7.d;

public final class LiveDeepAecHelper$a implements c$c	// class@001ae8
{
    public final LiveDeepAecHelper a;

    public void LiveDeepAecHelper$a(LiveDeepAecHelper p0){
       this.a = p0;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDeepAecHelper$a.class, "2")) {
          return;
       }
       b.y(LiveLogTag.LIVE_ARYA.appendTag("LiveDeepAecHelper"), "load deep aec lib failed", p0);
       return;
    }
    public void onProgress(float p0){
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDeepAecHelper$a.class, "1")) {
       }else {
          b.P(LiveLogTag.LIVE_ARYA.appendTag("LiveDeepAecHelper"), "load deep aec lib success");
          this.a.f();
       }
       return;
    }
}
