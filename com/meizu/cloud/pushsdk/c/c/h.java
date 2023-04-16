package com.meizu.cloud.pushsdk.c.c.h;
import com.meizu.cloud.pushsdk.c.c.j;
import java.lang.String;
import com.meizu.cloud.pushsdk.c.c.g;
import com.meizu.cloud.pushsdk.c.g.e;
import java.util.List;
import java.lang.StringBuilder;
import java.lang.Object;
import com.meizu.cloud.pushsdk.c.c.m;
import com.meizu.cloud.pushsdk.c.g.c;
import com.meizu.cloud.pushsdk.c.g.b;
import com.meizu.cloud.pushsdk.c.c.h$b;
import com.meizu.cloud.pushsdk.c.c.c;

public final class h extends j	// class@0014d6
{
    public final e i;
    public final g j;
    public final g k;
    public final List l;
    public long m;
    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final byte[] f;
    public static final byte[] g;
    public static final byte[] h;

    static {
       h.a = g.a("multipart/mixed");
       h.b = g.a("multipart/alternative");
       h.c = g.a("multipart/digest");
       h.d = g.a("multipart/parallel");
       h.e = g.a("multipart/form-data");
       h.f = new byte[2]{':',0x20};
       h.g = new byte[2]{0x0d,0x0a};
       h.h = new byte[2]{'-','-'};
    }
    public void h(e p0,g p1,List p2){
       super();
       this.m = -1;
       this.i = p0;
       this.j = p1;
       this.k = g.a(p1+"; boundary="+p0.a());
       this.l = m.a(p2);
    }
    public final long a(c p0,boolean p1){
       b uob;
       b uob1;
       byte[] h;
       if (p1) {
          uob = new b();
          uob1 = uob;
       }else {
          uob1 = null;
       }
       int i = this.l.size();
       long l = 0;
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             h$b uob2 = this.l.get(i1);
             c uoc = h$b.a(uob2);
             j oj = h$b.b(uob2);
             uob.c(h.h);
             uob.b(this.i);
             uob.c(h.g);
             if (uoc != null) {
                int i2 = uoc.a();
                for (int i3 = 0; i3 < i2; i3 = i3 + 1) {
                   uob.b(uoc.a(i3)).c(h.f).b(uoc.b(i3)).c(h.g);
                }
             }
             g og = oj.a();
             if (og != null) {
                uob.b("Content-Type: ").b(og.toString()).c(h.g);
             }
             long l1 = oj.b();
             String str = -1;
             if (l1 - str) {
                uob.b("Content-Length: ").e(l1).c(h.g);
             }else if(p1){
                uob1.j();
                return str;
             }
             byte[] g = h.g;
             uob.c(g);
             if (p1) {
                l = l + l1;
             }else {
                oj.a(uob);
             }
             uob.c(g);
             i1 = i1 + 1;
          }else {
             h = h.h;
             uob.c(h);
             uob.b(this.i);
             uob.c(h);
             uob.c(h.g);
             if (p1) {
                l = l + uob1.a();
                uob1.j();
                break ;
             }
             break ;
          }
       }
       return l;
    }
    public g a(){
       return this.k;
    }
    public void a(c p0){
       this.a(p0, false);
    }
    public long b(){
       h tm = this.m;
       if (tm - -1) {
          return tm;
       }
       long l = this.a(null, true);
       this.m = l;
       return l;
    }
}
