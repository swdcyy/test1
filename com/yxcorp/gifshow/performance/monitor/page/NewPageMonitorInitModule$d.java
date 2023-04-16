package com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$d;
import erd.g;
import java.lang.Object;
import retrofit2.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.performance.monitor.page.model.PageConfigResponse;
import java.util.List;
import fg6.a;
import com.google.gson.Gson;
import mwb.b;

public final class NewPageMonitorInitModule$d implements g	// class@000ea3
{
    public static final NewPageMonitorInitModule$d b;

    static {
       NewPageMonitorInitModule$d.b = new NewPageMonitorInitModule$d();
    }
    public void NewPageMonitorInitModule$d(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewPageMonitorInitModule$d.class, "1")) {
       }else {
          p0 = p0.a();
          if (p0 != null) {
             p0 = p0.getData();
             if (p0 != null) {
                b.p(a.a.q(p0));
             }
          }
       }
       return;
    }
}
