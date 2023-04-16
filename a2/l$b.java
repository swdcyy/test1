package a2.l$b;
import java.lang.Object;
import android.os.Build$VERSION;
import a2.l$e;
import a2.l$d;
import a2.l$c;
import a2.l;
import a2.l$f;
import p1.b;

public final class l$b	// class@00007b
{
    public final l$f a;

    public void l$b(){
       super();
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 30) {
          this.a = new l$e();
       }else if(sDK_INT >= 29){
          this.a = new l$d();
       }else {
          this.a = new l$c();
       }
       return;
    }
    public void l$b(l p0){
       super();
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 30) {
          this.a = new l$e(p0);
       }else if(sDK_INT >= 29){
          this.a = new l$d(p0);
       }else {
          this.a = new l$c(p0);
       }
       return;
    }
    public l a(){
       return this.a.b();
    }
    public l$b b(b p0){
       this.a.d(p0);
       return this;
    }
    public l$b c(b p0){
       this.a.f(p0);
       return this;
    }
}
