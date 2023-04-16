package bm5.c;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c	// class@0004e4
{
    public Object a;
    public boolean b;
    public boolean c;
    public boolean d;
    public long e;

    public void c(){
       super(null, false, false, false, 0, 31, null);
    }
    public void c(Object p0,boolean p1,boolean p2,boolean p3,long p4,int p5,u p6){
       if (p5 & 0x02) {
          p1 = false;
       }
       if (p5 & 0x04) {
          p2 = false;
       }
       if (p5 & 0x08) {
          p3 = false;
       }
       if (p5 & 0x10) {
          p4 = 0;
       }
       super();
       this.a = null;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       return;
    }
    public final Object a(){
       return this.a;
    }
    public final long b(){
       return this.e;
    }
    public final boolean c(){
       return this.b;
    }
    public final boolean d(){
       return this.d;
    }
    public final boolean e(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c && (a.g(this.a, p0.a) && (this.b == p0.b && (this.c == p0.c && (this.d == p0.d && !this.e - p0.e)))))) {
          return true;
       }
       return false;
    }
    public final void f(boolean p0){
       this.b = p0;
    }
    public final void g(boolean p0){
       this.d = p0;
    }
    public final void h(Object p0){
       this.a = p0;
    }
    public int hashCode(){
       int i2;
       c obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       i = i * 31;
       c tb = this.b;
       int i1 = 1;
       if (tb != null) {
          tb = 1;
       }
       i = (i + tb) * 31;
       tb = this.c;
       if (tb != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       tb = this.d;
       if (tb == null) {
          i1 = tb;
       }
       tb = this.e;
       return (((i + i1) * 31) + (int)(tb ^ (tb >> 32)));
    }
    public final void i(long p0){
       this.e = p0;
    }
    public final void j(boolean p0){
       this.c = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CoronaInstreamAdState\(instreamAdControl="+this.a+", isAdShowEnd="+this.b+", isVipPayDialogShowing="+this.c+", isAdShowing="+this.d+", startProgress="+this.e+"\)";
    }
}
