package e12.f$a;
import c51.b;
import e12.f;
import java.lang.Object;
import c51.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.os.SystemClock;
import java.lang.Throwable;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.live.core.basic.utils.e;
import android.app.Application;
import o56.a;
import android.content.Context;
import d61.m;
import java.util.List;

public class f$a implements b	// class@0025f9
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void S(boolean p0){
       a.e(this, p0);
    }
    public void U(boolean p0){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       p0.j = SystemClock.elapsedRealtime();
       return;
    }
    public void X(boolean p0,Throwable p1){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "3")) {
          return;
       }
       f$a tb = this.b;
       e.t(tb.j, 8, tb.h.mLiveStreamId, null);
       m.c(a.b(), p1);
       return;
    }
    public void c0(){
       a.a(this);
    }
    public void w(boolean p0,List p1){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       LiveStreamFeed liveStreamFe = null;
       if (p1.size() > 0) {
          liveStreamFe = p1.get(0);
       }
       f$a tb = this.b;
       e.t(tb.j, 7, tb.h.mLiveStreamId, liveStreamFe);
       return;
    }
}
