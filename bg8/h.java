package bg8.h;
import java.lang.Runnable;
import og8.a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.mini.packagemanager.module.config.model.PackageAccurateManageSwitch;
import zi8.g1;
import java.util.concurrent.TimeUnit;
import cg8.f;
import zi8.t0;
import java.util.List;
import qg8.k;
import java.util.Collection;
import zi8.m;
import org.json.JSONObject;
import org.json.JSONArray;
import java.util.Iterator;
import com.mini.packagemanager.model.PackageLifecycleItem;
import com.google.gson.Gson;
import zi8.d0;
import n88.a;
import oi8.l;
import n88.b;
import java.lang.System;
import org.json.JSONException;

public final class h implements Runnable	// class@000353
{
    public final a b;

    public void h(a p0){
       this.b = p0;
    }
    public final void run(){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, a.class, "2")) {
       }else if(tb.b().enable != null){
          tb.c.b((g1.a() - TimeUnit.SECONDS.toMillis((long)tb.b().trackingRecordMaxLifeTimeIntervalInSeconds)));
          if (tb.b().enableReportTrackingRecord != null) {
             try{
                a b = tb.b;
                List list = tb.c.d(t0.c("package_record_upload_time", 0), tb.b().reportTrackingRecordMaxCount);
                Objects.requireNonNull(b);
                if (!PatchProxy.applyVoidOneRefs(list, b, k.class, "32") && !m.f(list)) {
                   JSONObject jSONObject = new JSONObject();
                   JSONArray jSONArray = new JSONArray();
                   Iterator iterator = list.iterator();
                   while (iterator.hasNext()) {
                      jSONArray.put(new JSONObject(d0.c().q(iterator.next())));
                   }
                   jSONObject.put("data", jSONArray);
                   b.mCF.n0().technologyEventLog(null, "resource_tracking_records", jSONObject, System.currentTimeMillis());
                }
             }catch(org.json.JSONException e0){
                e0.printStackTrace();
             }
             t0.i("package_record_upload_time", g1.a());
          }
       }
       return;
    }
}
