package bc5.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.lang.String;
import lnc.i3;
import java.lang.Number;
import k2b.u1;
import java.lang.System;

public class a	// class@0002d4
{
    public int a;
    public boolean b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final Object g;
    public static final a h;

    static {
       a.h = new a();
    }
    public void a(){
       super();
       this.a = 1;
       this.g = new Object();
    }
    public static a a(){
       return a.h;
    }
    public static void b(long p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Integer.valueOf(p1), null, uoa, "6")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.c("tokenCostMS", Long.valueOf(p0));
       oi3.c("errorCode", Integer.valueOf(p1));
       u1.R("ks_im_link_token_statistics", oi3.e(), 13);
       return;
    }
    public void c(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.g;
       _monitor_enter(uoa);
       this.a = p0;
       this.b = true;
       this.c = System.currentTimeMillis();
       this.d = 0;
       this.e = 0;
       this.f = 0;
       _monitor_exit(uoa);
       return;
    }
}
