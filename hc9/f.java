package hc9.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class f	// class@002588
{
    public Object a;
    public String b;
    public String c;
    public Object d;
    public boolean e;
    public long f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public String q;
    public long r;

    public void f(){
       super();
       this.p = -1;
       this.r = -1;
       this.j = true;
       this.i = true;
       this.k = true;
       this.l = false;
       this.o = true;
    }
    public f A(boolean p0){
       this.j = p0;
       return this;
    }
    public f B(boolean p0){
       this.i = p0;
       return this;
    }
    public void a(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "1")) {
          return;
       }
       if (p0) {
          if (p0 != 1) {
             if (p0 == 2) {
                this.B(1);
                this.A(false);
             }
          }else {
             this.B(false);
             this.A(false);
          }
       }else {
          this.B(1);
          this.A(1);
       }
       return;
    }
    public long b(){
       return this.f;
    }
    public Object c(){
       return this.a;
    }
    public String d(){
       return this.b;
    }
    public Object e(){
       return this.d;
    }
    public long f(){
       return this.r;
    }
    public String g(){
       return this.q;
    }
    public Object h(){
       f ta = this.a;
       if (ta != null) {
       }else {
          ta = this.d;
       }
       return ta;
    }
    public int i(){
       f tp = this.p;
       if (tp == -1) {
          tp = 0x7f0d00e7;
       }
       return tp;
    }
    public boolean j(){
       return this.g;
    }
    public boolean k(){
       return this.l;
    }
    public boolean l(){
       return this.m;
    }
    public boolean m(){
       return this.o;
    }
    public boolean n(){
       return this.n;
    }
    public boolean o(){
       return this.h;
    }
    public boolean p(){
       return this.j;
    }
    public boolean q(){
       return this.i;
    }
    public boolean r(){
       return this.k;
    }
    public boolean s(){
       return this.e;
    }
    public void t(boolean p0){
       this.g = p0;
    }
    public f u(boolean p0){
       this.l = p0;
       return this;
    }
    public f v(int p0){
       this.f = (long)p0;
       return this;
    }
    public f w(Object p0,boolean p1){
       this.a = p0;
       this.e = p1;
       return this;
    }
    public f x(String p0,Object p1){
       this.b = p0;
       this.d = p1;
       return this;
    }
    public void y(long p0){
       this.r = p0;
    }
    public void z(boolean p0){
       this.n = p0;
    }
}
