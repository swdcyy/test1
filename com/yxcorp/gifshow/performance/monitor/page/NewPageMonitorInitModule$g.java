package com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$g;
import erd.g;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule;
import java.lang.Object;
import retrofit2.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.performance.monitor.page.model.PageConfigResponse;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import gf7.c;
import kotlin.jvm.internal.a;
import fg6.a;
import com.google.gson.Gson;
import mwb.b;

public final class NewPageMonitorInitModule$g implements g	// class@000ea6
{
    public final NewPageMonitorInitModule b;

    public void NewPageMonitorInitModule$g(NewPageMonitorInitModule p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, NewPageMonitorInitModule$g.class, "1")) {
       }else {
          p0 = p0.a();
          if (p0 != null) {
             p0 = p0.getData();
             if (p0 != null) {
                p0 = p0.iterator();
                while (p0.hasNext()) {
                   c uoc = p0.next();
                   Iterator iterator = this.b.r.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         obj = iterator.next();
                         if (!a.g(obj.a(), uoc.a())) {
                            continue ;
                         }
                      }else {
                         obj = null;
                      }
                      if (obj != null) {
                         this.b.r.remove(obj);
                      }
                      uoc.samplingRate = 0x3f800000;
                      this.b.r.add(uoc);
                   }
                }
             }
          }
          b.q(a.a.q(this.b.r));
       }
       return;
    }
}
