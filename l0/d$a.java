package l0.d$a;
import aegon.chrome.net.q$b;
import l0.d;
import aegon.chrome.net.q;
import aegon.chrome.net.r;
import java.io.IOException;
import java.lang.String;
import aegon.chrome.net.CronetException;
import java.lang.IllegalStateException;
import java.nio.ByteBuffer;
import l0.i;
import java.net.URL;
import java.lang.Object;
import l0.f;
import l0.g;

public class d$a extends q$b	// class@0024e3
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(q p0,r p1){
       p0.k = p1;
       this.g(new IOException("disconnect\(\) called"));
    }
    public void b(q p0,r p1,CronetException p2){
       if (p2 == null) {
          throw new IllegalStateException("Exception cannot be null in onFailed.");
       }
       p0.k = p1;
       this.g(p2);
       return;
    }
    public void c(q p0,r p1,ByteBuffer p2){
       d$a ta = this.a;
       ta.k = p1;
       ta.b.l();
    }
    public void d(q p0,r p1,String p2){
       p0.m = true;
       try{
          URL uRL = new URL(p2);
          boolean b = (uRL.getProtocol()).equals(d.a(this.a).getProtocol());
          if (d.b(this.a)) {
             d.c(this.a, uRL);
          }
          if (d.d(this.a) && b) {
             this.a.c.b();
             return;
          }else {
             d$a ta = this.a;
             ta.k = p1;
             ta.c.a();
             this.g(null);
             return;
          }
       }catch(java.net.MalformedURLException e0){
       }
    }
    public void e(q p0,r p1){
       d$a ta = this.a;
       ta.k = p1;
       ta.n = true;
       ta.b.l();
    }
    public void f(q p0,r p1){
       p0.k = p1;
       this.g(null);
    }
    public final void g(IOException p0){
       d$a ta = this.a;
       ta.l = p0;
       d i = ta.i;
       if (i != null) {
          i.e = p0;
          i.c = true;
          i.d = null;
       }
       i = ta.j;
       if (i != null) {
          i.b = p0;
          i.d = true;
       }
       ta.n = true;
       ta.b.l();
       return;
    }
}
