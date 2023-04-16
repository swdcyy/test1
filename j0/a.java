package j0.a;
import aegon.chrome.net.f$a;
import java.lang.String;
import aegon.chrome.net.b$b;
import java.util.concurrent.Executor;
import j0.b;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Objects;
import aegon.chrome.net.b$a;
import aegon.chrome.net.b;
import aegon.chrome.net.f;
import java.util.List;
import java.util.Collection;
import java.util.AbstractMap$SimpleImmutableEntry;

public class a extends f$a	// class@002205
{
    public final b a;
    public final String b;
    public final b$b c;
    public final Executor d;
    public final ArrayList e;
    public String f;
    public int g;
    public boolean h;
    public Collection i;
    public boolean j;
    public int k;
    public boolean l;
    public int m;

    public void a(String p0,b$b p1,Executor p2,b p3){
       super();
       this.e = new ArrayList();
       this.f = "POST";
       this.g = 3;
       Objects.requireNonNull(p0, "URL is required.");
       Objects.requireNonNull(p1, "Callback is required.");
       Objects.requireNonNull(p2, "Executor is required.");
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.a = p3;
    }
    public b$a a(String p0,String p1){
       this.k(p0, p1);
       return this;
    }
    public b b(){
       return this.g();
    }
    public b$a c(boolean p0){
       this.l(p0);
       return this;
    }
    public b$a d(String p0){
       this.m(p0);
       return this;
    }
    public b$a e(int p0){
       this.n(p0);
       return this;
    }
    public f$a f(String p0,String p1){
       this.k(p0, p1);
       return this;
    }
    public f g(){
       return this.a.l(this.b, this.c, this.d, this.f, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }
    public f$a h(boolean p0){
       this.l(p0);
       return this;
    }
    public f$a i(String p0){
       this.m(p0);
       return this;
    }
    public f$a j(int p0){
       this.n(p0);
       return this;
    }
    public a k(String p0,String p1){
       Objects.requireNonNull(p0, "Invalid header name.");
       Objects.requireNonNull(p1, "Invalid header value.");
       this.e.add(new AbstractMap$SimpleImmutableEntry(p0, p1));
       return this;
    }
    public a l(boolean p0){
       this.h = p0;
       return this;
    }
    public a m(String p0){
       Objects.requireNonNull(p0, "Method is required.");
       this.f = p0;
       return this;
    }
    public a n(int p0){
       this.g = p0;
       return this;
    }
}
