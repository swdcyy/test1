package androidx.recyclerview.widget.a$b;
import java.lang.Object;
import java.lang.String;
import java.lang.Math;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Integer;

public final class a$b	// class@0008de
{
    public int a;
    public int b;
    public Object c;
    public int d;

    public void a$b(int p0,int p1,int p2,Object p3){
       super();
       this.a = p0;
       this.b = p1;
       this.d = p2;
       this.c = p3;
    }
    public String a(){
       a$b ta = this.a;
       if (ta == 1) {
          return "add";
       }
       if (ta == 2) {
          return "rm";
       }
       if (ta == 4) {
          return "up";
       }
       if (ta != 8) {
          return "??";
       }
       return "mv";
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof a$b) {
          return false;
       }
       a$b ta = this.a;
       if (ta != p0.a) {
          return false;
       }
       if (ta == 8 && (Math.abs((this.d - this.b)) == 1 && (this.d == p0.b && this.b == p0.d))) {
          return true;
       }
       if (this.d != p0.d) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       ta = this.c;
       if (ta != null) {
          if (!ta.equals(p0.c)) {
             return false;
          }
       }else if(p0.c != null){
          return false;
       }
       return true;
    }
    public int hashCode(){
       return ((((this.a * 31) + this.b) * 31) + this.d);
    }
    public String toString(){
       return Integer.toHexString(System.identityHashCode(this))+"["+this.a()+",s:"+this.b+"c:"+this.d+",p:"+this.c+"]";
    }
}
