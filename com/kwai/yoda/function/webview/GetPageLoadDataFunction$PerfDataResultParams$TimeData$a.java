package com.kwai.yoda.function.webview.GetPageLoadDataFunction$PerfDataResultParams$TimeData$a;
import java.lang.Object;
import nsd.u;
import java.util.Map;
import com.kwai.yoda.function.webview.GetPageLoadDataFunction$PerfDataResultParams$TimeData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Long;

public final class GetPageLoadDataFunction$PerfDataResultParams$TimeData$a	// class@00124f
{

    public void GetPageLoadDataFunction$PerfDataResultParams$TimeData$a(){
       super();
    }
    public void GetPageLoadDataFunction$PerfDataResultParams$TimeData$a(u p0){
       super();
    }
    public final GetPageLoadDataFunction$PerfDataResultParams$TimeData a(Map p0){
       GetPageLoadDataFunction$PerfDataResultParams$TimeData obj = PatchProxy.applyOneRefs(p0, this, GetPageLoadDataFunction$PerfDataResultParams$TimeData$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "timeStampMap");
       obj = new GetPageLoadDataFunction$PerfDataResultParams$TimeData();
       Long longx = p0.get("user_click_time");
       long l = 0;
       long l1 = (longx != null)? longx.longValue(): l;
       obj.setMUserStart(l1);
       longx = p0.get("page_start_time");
       l1 = (longx != null)? longx.longValue(): l;
       obj.setMPageStart(l1);
       longx = p0.get("page_show_time");
       l1 = (longx != null)? longx.longValue(): l;
       obj.setMPageShow(l1);
       longx = p0.get("pre_create_time");
       l1 = (longx != null)? longx.longValue(): l;
       obj.setMPreCreate(l1);
       longx = p0.get("created_time");
       l1 = (longx != null)? longx.longValue(): l;
       obj.setMCreated(l1);
       longx = p0.get("start_load_time");
       l1 = (longx != null)? longx.longValue(): l;
       obj.setMStartLoad(l1);
       longx = p0.get("did_start_load_time");
       l1 = (longx != null)? longx.longValue(): l;
       obj.setMDidStartLoad(l1);
       Long longx1 = p0.get("did_end_load_time");
       if (longx1 != null) {
          l = longx1.longValue();
       }
       obj.setMDidEndLoad(l);
       return obj;
    }
}
