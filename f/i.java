package f.i;
import java.lang.Object;
import java.util.HashSet;
import android.os.ConditionVariable;
import a.a.a.a.b.a.c$a;
import java.lang.String;

public class i	// class@001f96
{
    public String a;
    public int b;
    public int c;
    public int d;
    public String e;
    public Set f;
    public String g;
    public String h;
    public boolean i;
    public boolean j;
    public ConditionVariable k;
    public boolean l;
    public c$a m;

    public void i(){
       super();
       this.b = 0;
       this.c = 0;
       this.d = 32;
       this.e = "";
       this.f = new HashSet();
       this.g = "";
       this.h = "";
       this.i = false;
       this.j = false;
       this.k = new ConditionVariable(0);
       this.l = false;
    }
    public void a(int p0){
       this.d = p0;
    }
    public void b(c$a p0){
       this.m = p0;
    }
    public void c(String p0){
       this.e = p0;
    }
    public void d(int p0){
       this.c = p0;
    }
    public void e(String p0){
       this.g = p0;
    }
    public void f(int p0){
       this.b = p0;
    }
    public void g(String p0){
       this.h = p0;
    }
    public void h(String p0){
       this.a = p0;
    }
    public c$a i(){
       return this.m;
    }
    public String j(){
       return this.h;
    }
    public String k(){
       return this.a;
    }
}
