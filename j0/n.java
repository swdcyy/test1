package j0.n;
import aegon.chrome.net.h$a;
import java.lang.String;
import aegon.chrome.net.q$b;
import java.util.concurrent.Executor;
import j0.b;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Objects;
import aegon.chrome.net.q$a;
import aegon.chrome.net.q;
import j0.m;
import aegon.chrome.net.o;
import aegon.chrome.net.h;
import aegon.chrome.net.n$a;
import java.lang.Exception;
import android.util.Pair;
import java.util.Collection;
import java.util.Iterator;

public class n extends h$a	// class@00199d
{
    public final b a;
    public final String b;
    public final q$b c;
    public final Executor d;
    public String e;
    public final ArrayList f;
    public boolean g;
    public boolean h;
    public int i;
    public Collection j;
    public o k;
    public Executor l;
    public boolean m;
    public boolean n;
    public int o;
    public boolean p;
    public int q;
    public n$a r;
    public int s;
    public static final String t = "n";

    public void n(String p0,q$b p1,Executor p2,b p3){
       super();
       this.f = new ArrayList();
       this.i = 3;
       this.s = 0;
       Objects.requireNonNull(p0, "URL is required.");
       Objects.requireNonNull(p1, "Callback is required.");
       Objects.requireNonNull(p2, "Executor is required.");
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.a = p3;
    }
    public q$a a(String p0,String p1){
       this.r(p0, p1);
       return this;
    }
    public q$a b(){
       this.s();
       return this;
    }
    public q c(){
       return this.t();
    }
    public q$a d(){
       this.u();
       return this;
    }
    public q$a e(String p0){
       this.l(p0);
       return this;
    }
    public q$a f(int p0){
       this.v(p0);
       return this;
    }
    public q$a g(o p0,Executor p1){
       this.w(p0, p1);
       return this;
    }
    public h$a h(String p0,String p1){
       this.r(p0, p1);
       return this;
    }
    public h$a i(){
       this.s();
       return this;
    }
    public h j(){
       return this.t();
    }
    public h$a k(){
       this.u();
       return this;
    }
    public h$a l(String p0){
       Objects.requireNonNull(p0, "Method is required.");
       this.e = p0;
       return this;
    }
    public h$a m(int p0){
       this.v(p0);
       return this;
    }
    public h$a n(n$a p0){
       this.r = p0;
       return this;
    }
    public h$a o(int p0){
       this.n = true;
       this.o = p0;
       return this;
    }
    public h$a p(int p0){
       this.p = true;
       this.q = p0;
       return this;
    }
    public h$a q(o p0,Executor p1){
       this.w(p0, p1);
       return this;
    }
    public n r(String p0,String p1){
       Objects.requireNonNull(p0, "Invalid header name.");
       Objects.requireNonNull(p1, "Invalid header value.");
       if (("Accept-Encoding").equalsIgnoreCase(p0)) {
          Exception uException = new Exception();
          return this;
       }else {
          this.f.add(Pair.create(p0, p1));
          return this;
       }
    }
    public n s(){
       this.m = true;
       return this;
    }
    public m t(){
       m om = this.a.m(this.b, this.c, this.d, this.i, this.j, this.g, this.h, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
       n te = this.e;
       if (te != null) {
          om.h(te);
       }
       Iterator iterator = this.f.iterator();
       while (iterator.hasNext()) {
          Pair pair = iterator.next();
          om.g(pair.first, pair.second);
       }
       te = this.k;
       if (te != null) {
          om.i(te, this.l);
       }
       return om;
    }
    public n u(){
       this.g = true;
       return this;
    }
    public n v(int p0){
       this.i = p0;
       return this;
    }
    public n w(o p0,Executor p1){
       Objects.requireNonNull(p0, "Invalid UploadDataProvider.");
       Objects.requireNonNull(p1, "Invalid UploadDataProvider Executor.");
       if (this.e == null) {
          this.e = "POST";
       }
       this.k = p0;
       this.l = p1;
       return this;
    }
}
