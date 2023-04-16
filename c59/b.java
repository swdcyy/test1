package c59.b;
import c59.b$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Long;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import p49.d;
import com.google.gson.JsonObject;
import java.lang.Number;
import java.lang.Math;
import x49.h;

public final class b	// class@0004e2
{
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public final String f;
    public final int g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public static final b$a l;

    static {
       b.l = new b$a(null);
    }
    public void b(String p0,int p1,String p2,String p3,String p4,int p5){
       a.p(p0, "templateId");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.i = p3;
       this.j = p4;
       this.k = p5;
    }
    public static void b(b p0,int p1,Long p2,String p3,int p4,Object p5){
       p5 = null;
       if (p4 & 0x02) {
          p2 = p5;
       }
       if (p4 & 0x04) {
          p5 = "";
       }
       p0.a(p1, p2, p5);
       return;
    }
    public final void a(int p0,Long p1,String p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, b.class, "10")) {
          return;
       }
       float f = d.d.a("ks_mk_page_event", 0x3f800000);
       super();
       this.c0("template_id", this.f);
       this.a0("version_code", Integer.valueOf(this.g));
       this.c0("page_id", this.i);
       this.a0("event_type", Integer.valueOf(p0));
       this.c0("mid_page_template_id", this.j);
       if (p1 != null) {
          this.a0("duration_ms", Long.valueOf(Math.max(0, p1.longValue())));
       }
       this.a0("page_conversion_type", Integer.valueOf(this.k));
       h.c("ks_mk_page_event", this, null, null, f, p2, 12, null);
       return;
    }
}
