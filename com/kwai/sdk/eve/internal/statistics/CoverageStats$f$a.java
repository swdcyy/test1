package com.kwai.sdk.eve.internal.statistics.CoverageStats$f$a;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.statistics.CoverageStats$f;
import java.lang.String;
import com.kwai.sdk.eve.internal.statistics.DownloadState;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.statistics.CoverageStats;
import java.util.Map;
import vn7.i;
import vn7.i$a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.common.EvePreference;
import vn7.a;
import org.json.JSONObject;
import java.lang.Enum;
import com.kwai.sdk.eve.internal.statistics.ExecuteState;

public final class CoverageStats$f$a implements Runnable	// class@0015ad
{
    public final CoverageStats$f b;
    public final String c;
    public final String d;
    public final DownloadState e;

    public void CoverageStats$f$a(CoverageStats$f p0,String p1,String p2,DownloadState p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       String str = "1";
       if (PatchProxy.applyVoid(null, this, CoverageStats$f$a.class, str)) {
          return;
       }
       CoverageStats a = this.b.a.a;
       CoverageStats$f$a tc = this.c;
       i oi = a.get(tc);
       if (oi == null) {
          oi = i.f.a(this.d, this.c);
          a.put(tc, oi);
       }
       if (!oi.a().reachableTo(this.e)) {
          return;
       }else {
          Log.b("Coverage", this.c+" download: "+oi.a()+"->"+this.e);
          CoverageStats$f$a te = this.e;
          if (!PatchProxy.applyVoidOneRefs(te, oi, i.class, str)) {
             a.p(te, "<set-?>");
             oi.c = te;
          }
          CoverageStats$f a1 = this.b.a;
          a1.f.f(a1.a);
          a uoa = new a("EVE_SDK_COVERAGE");
          uoa.b(this.d);
          uoa.c(this.c);
          uoa.put("action", "download");
          uoa.put("download", this.e.name());
          uoa.put("execute", oi.b().name());
          uoa.d();
          return;
       }
    }
}
