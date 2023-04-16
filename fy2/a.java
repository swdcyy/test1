package fy2.a;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$b;
import com.kuaishou.live.deepaec.LiveDeepAecHelper;
import java.lang.Object;
import com.yxcorp.download.DownloadTask;
import ia1.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Throwable;

public final class a implements LiveResourceFileUtil$b	// class@002a0d
{
    public final LiveDeepAecHelper a;

    public void a(LiveDeepAecHelper p0){
       this.a = p0;
       super();
    }
    public void a(DownloadTask p0,long p1,long p2){
       i.b(this, p0, p1, p2);
    }
    public final void onComplete(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       b.P(LiveLogTag.LIVE_ARYA.appendTag("LiveDeepAecHelper"), "load deep aec model success");
       this.a.f();
       return;
    }
    public void onError(Throwable p0){
       i.a(this, p0);
    }
    public void onStart(){
       i.c(this);
    }
}
