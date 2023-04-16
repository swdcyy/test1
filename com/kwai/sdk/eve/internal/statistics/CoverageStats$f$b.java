package com.kwai.sdk.eve.internal.statistics.CoverageStats$f$b;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.statistics.CoverageStats$f;
import java.lang.String;
import com.kwai.sdk.eve.internal.statistics.ExecuteState;
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
import com.kwai.sdk.eve.internal.statistics.DownloadState;

public final class CoverageStats$f$b implements Runnable	// class@0015ae
{
    public final CoverageStats$f b;
    public final String c;
    public final String d;
    public final ExecuteState e;

    public void CoverageStats$f$b(CoverageStats$f p0,String p1,String p2,ExecuteState p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, CoverageStats$f$b.class, "1")) {
          return;
       }
       CoverageStats a = this.b.a.a;
       CoverageStats$f$b tc = this.c;
       i oi = a.get(tc);
       if (oi == null) {
          oi = i.f.a(this.d, this.c);
          a.put(tc, oi);
       }
       if (!oi.b().reachableTo(this.e)) {
          return;
       }else {
          Log.b("Coverage", this.c+" execute: "+oi.b()+"->"+this.e);
          CoverageStats$f$b te = this.e;
          if (!PatchProxy.applyVoidOneRefs(te, oi, i.class, "2")) {
             a.p(te, "<set-?>");
             oi.d = te;
          }
          CoverageStats$f a1 = this.b.a;
          a1.f.f(a1.a);
          a uoa = new a("EVE_SDK_COVERAGE");
          uoa.b(this.d);
          uoa.c(this.c);
          uoa.put("action", "execute");
          uoa.put("execute", this.e.name());
          uoa.put("download", oi.a().name());
          uoa.d();
          return;
       }
    }
}
