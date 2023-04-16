package a2.u0$b;
import java.lang.Object;
import android.os.Build$VERSION;
import a2.u0$e;
import a2.u0$d;
import a2.u0$c;
import a2.u0;
import a2.u0$f;
import p1.b;

public final class u0$b	// class@0000ac
{
    public final u0$f a;

    public void u0$b(){
       super();
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 30) {
          this.a = new u0$e();
       }else if(sDK_INT >= 29){
          this.a = new u0$d();
       }else {
          this.a = new u0$c();
       }
       return;
    }
    public void u0$b(u0 p0){
       super();
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 30) {
          this.a = new u0$e(p0);
       }else if(sDK_INT >= 29){
          this.a = new u0$d(p0);
       }else {
          this.a = new u0$c(p0);
       }
       return;
    }
    public u0 a(){
       return this.a.b();
    }
    public u0$b b(int p0,b p1){
       this.a.c(p0, p1);
       return this;
    }
    public u0$b c(b p0){
       this.a.e(p0);
       return this;
    }
    public u0$b d(b p0){
       this.a.g(p0);
       return this;
    }
}
