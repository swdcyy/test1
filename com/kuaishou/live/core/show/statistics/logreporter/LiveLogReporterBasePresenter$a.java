package com.kuaishou.live.core.show.statistics.logreporter.LiveLogReporterBasePresenter$a;
import com.kwai.video.waynelive.listeners.LivePlayerErrorListener;
import com.kuaishou.live.core.show.statistics.logreporter.LiveLogReporterBasePresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import k2b.j0;

public class LiveLogReporterBasePresenter$a implements LivePlayerErrorListener	// class@00109d
{
    public final LiveLogReporterBasePresenter a;

    public void LiveLogReporterBasePresenter$a(LiveLogReporterBasePresenter p0){
       this.a = p0;
       super();
    }
    public boolean onError(int p0,int p1){
       if (PatchProxy.isSupport(LiveLogReporterBasePresenter$a.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveLogReporterBasePresenter$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.a.q.b2(2);
       return false;
    }
}
