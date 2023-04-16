package com.kuaishou.android.security.base.cloudconfig.a;
import android.content.Context;
import java.lang.Object;
import com.kuaishou.android.security.base.util.c;
import com.kuaishou.android.security.base.util.i;
import com.kuaishou.android.security.base.util.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import java.lang.StringBuilder;
import com.kuaishou.android.security.base.log.d;
import java.lang.Throwable;

public class a	// class@000ed4
{
    public final Context a;
    public c b;
    public i c;
    public h d;
    public static a e;

    public void a(Context p0){
       super();
       this.a = p0;
       this.b = new c(p0);
       this.c = new i(p0);
       this.d = new h(p0);
    }
    public static synchronized a a(Context p0){
       _monitor_enter(a.class);
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(a.class);
          return obj;
       }else if(a.e == null){
          a.e = new a(p0);
       }
       _monitor_exit(a.class);
       return a.e;
    }
    public final int a(int p0,int[] p1){
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          p0 = p0 << 1;
          p0 = p0 | p1[i];
       }
       return p0;
    }
    public final void a(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       p0 = p0.optJSONObject("keus");
       boolean b = false;
       this.d.a(b);
       this.d.a(0);
       if (p0 != null) {
          a td = this.d;
          if (p0.optInt("sgmaineusw", b) == 1) {
             b = true;
          }
          td.a(b);
          this.d.a((float)p0.optDouble("sgmaineusam", 0));
       }
       return;
    }
    public final void b(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       p0 = p0.optJSONObject("ksp");
       boolean b = false;
       this.c.b(b);
       if (p0 != null) {
          a tc = this.c;
          boolean b1 = (p0.optInt("spsw", b) == 1)? true: false;
          tc.c(b1);
          tc = this.c;
          b1 = (p0.optInt("ipsw", b) == 1)? true: false;
          tc.b(b1);
          a tc1 = this.c;
          if (p0.optInt("ipr", b) == 1) {
             b = true;
          }
          tc1.a(b);
       }
       return;
    }
    public final void c(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       p0 = p0.optJSONObject("dlp");
       boolean b = false;
       this.b.a(b);
       this.b.d(b);
       this.b.e(b);
       this.b.a(0);
       this.b.c("");
       this.b.b(b);
       int i = 0x1869f;
       this.b.b(i);
       this.b.d(i);
       if (p0 != null) {
          a tb = this.b;
          boolean b1 = (p0.optInt("dsw", b) == 1)? true: false;
          tb.a(b1);
          tb = this.b;
          b1 = (p0.optInt("rsw", b) == 1)? true: false;
          tb.d(b1);
          tb = this.b;
          b1 = (p0.optInt("rsw2", b) == 1)? true: false;
          tb.e(b1);
          this.b.a((float)p0.optDouble("sam", 0));
          this.b.b(p0.optInt("sdt", i));
          this.b.d(p0.optInt("udt", i));
          a tb1 = this.b;
          if (p0.optInt("infs", b) == 1) {
             b = true;
          }
          tb1.b(b);
          this.b.c(p0.optString("srs", ""));
       }
       return;
    }
    public final void d(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       p0 = p0.optJSONObject("secEnv");
       if (p0 != null) {
          int[] ointArray = new int[]{p0.optInt("disable_ROOT"),p0.optInt("disable_MALWARE"),p0.optInt("disable_HOOK"),p0.optInt("disable_EMULATOR"),p0.optInt("disable_ANTIDEBUG"),p0.optInt("disable_REPACK")};
          this.b.c(this.a(p0.optInt("env_sw"), ointArray));
       }
       return;
    }
    public final void e(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       p0 = p0.optJSONObject("sig3");
       if (p0 != null) {
          a tb = this.b;
          boolean b = true;
          if (p0.optInt("s3dgsw_4.5.2") != b) {
             b = false;
          }
          tb.f(b);
       }
       return;
    }
    public void f(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       d.b("conf: "+p0.toString());
       this.e(p0);
       this.c(p0);
       this.b(p0);
       this.a(p0);
       this.d(p0);
       return;
    }
}
