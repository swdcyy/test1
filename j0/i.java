package j0.i;
import aegon.chrome.net.impl.b;
import android.content.Context;
import java.lang.String;
import java.util.Set;
import java.util.Date;
import aegon.chrome.net.i;
import aegon.chrome.net.g;
import j0.o;
import aegon.chrome.net.impl.CronetUrlRequestContext;
import aegon.chrome.net.d$a$a;

public class i extends b	// class@001998
{

    public void i(Context p0){
       super(p0);
    }
    public i a(String p0,Set p1,boolean p2,Date p3){
       this.n(p0, p1, p2, p3);
       return this;
    }
    public i b(String p0,int p1,int p2){
       this.o(p0, p1, p2);
       return this;
    }
    public g c(){
       if (this.t() == null) {
          this.A(o.b(this.a));
       }
       this.n = 0;
       return new CronetUrlRequestContext(this);
    }
    public i d(boolean p0){
       this.p(p0);
       return this;
    }
    public i e(int p0,long p1){
       this.q(p0, p1);
       return this;
    }
    public i f(boolean p0){
       this.r(p0);
       return this;
    }
    public i g(boolean p0){
       this.s(p0);
       return this;
    }
    public i h(boolean p0){
       return this;
    }
    public i j(String p0){
       this.x(p0);
       return this;
    }
    public i k(d$a$a p0){
       return this;
    }
    public i l(String p0){
       this.z(p0);
       return this;
    }
    public i m(String p0){
       this.A(p0);
       return this;
    }
}
