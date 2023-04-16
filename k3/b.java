package k3.b;
import k3.b$a;
import java.lang.Object;
import androidx.work.NetworkType;
import k3.c;
import android.os.Build$VERSION;
import java.lang.Class;
import java.lang.Enum;

public final class b	// class@00246c
{
    public NetworkType a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public c h;
    public static final b i;

    static {
       b.i = new b$a().a();
    }
    public void b(){
       super();
       this.a = NetworkType.NOT_REQUIRED;
       this.f = -1;
       this.g = -1;
       this.h = new c();
    }
    public void b(b$a p0){
       super();
       this.a = NetworkType.NOT_REQUIRED;
       this.f = -1;
       this.g = -1;
       this.h = new c();
       this.b = p0.a;
       int sDK_INT = Build$VERSION.SDK_INT;
       boolean b = (sDK_INT >= 23 && p0.b != null)? true: false;
       this.c = b;
       this.a = p0.c;
       this.d = p0.d;
       this.e = p0.e;
       if (sDK_INT >= 24) {
          this.h = p0.h;
          this.f = p0.f;
          this.g = p0.g;
       }
       return;
    }
    public void b(b p0){
       super();
       this.a = NetworkType.NOT_REQUIRED;
       this.f = -1;
       this.g = -1;
       this.h = new c();
       this.b = p0.b;
       this.c = p0.c;
       this.a = p0.a;
       this.d = p0.d;
       this.e = p0.e;
       this.h = p0.h;
    }
    public c a(){
       return this.h;
    }
    public NetworkType b(){
       return this.a;
    }
    public long c(){
       return this.f;
    }
    public long d(){
       return this.g;
    }
    public boolean e(){
       boolean b = (this.h.c() > 0)? true: false;
       return b;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       boolean b = false;
       if (p0 == null || b.class != p0.getClass()) {
          return b;
       }
       if (this.b != p0.b) {
          return b;
       }
       if (this.c != p0.c) {
          return b;
       }
       if (this.d != p0.d) {
          return b;
       }
       if (this.e != p0.e) {
          return b;
       }
       if (this.f - p0.f) {
          return b;
       }
       if (this.g - p0.g) {
          return b;
       }
       if (this.a != p0.a) {
          return b;
       }
       return this.h.equals(p0.h);
    }
    public boolean f(){
       return this.d;
    }
    public boolean g(){
       return this.b;
    }
    public boolean h(){
       return this.c;
    }
    public int hashCode(){
       b tf = this.f;
       tf = this.g;
       return ((((((((((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + (int)(tf ^ (tf >> 32))) * 31) + (int)(tf ^ (tf >> 32))) * 31) + this.h.hashCode());
    }
    public boolean i(){
       return this.e;
    }
    public void j(c p0){
       this.h = p0;
    }
    public void k(NetworkType p0){
       this.a = p0;
    }
    public void l(boolean p0){
       this.d = p0;
    }
    public void m(boolean p0){
       this.b = p0;
    }
    public void n(boolean p0){
       this.c = p0;
    }
    public void o(boolean p0){
       this.e = p0;
    }
    public void p(long p0){
       this.f = p0;
    }
    public void q(long p0){
       this.g = p0;
    }
}
