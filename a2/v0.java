package a2.v0;
import android.view.Window;
import android.view.View;
import java.lang.Object;
import android.os.Build$VERSION;
import a2.v0$d;
import a2.v0$c;
import a2.v0$b;
import a2.v0$a;
import android.view.WindowInsetsController;
import a2.v0$e;

public final class v0	// class@0000c1
{
    public final v0$e a;

    public void v0(Window p0,View p1){
       super();
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 30) {
          this.a = new v0$d(p0, this);
       }else if(sDK_INT >= 26){
          this.a = new v0$c(p0, p1);
       }else if(sDK_INT >= 23){
          this.a = new v0$b(p0, p1);
       }else {
          this.a = new v0$a(p0, p1);
       }
       return;
    }
    public void v0(WindowInsetsController p0){
       super();
       int sDK_INT = Build$VERSION.SDK_INT;
       this.a = (sDK_INT >= 30)? new v0$d(p0, this): new v0$e();
       return;
    }
    public static v0 c(WindowInsetsController p0){
       return new v0(p0);
    }
    public int a(){
       return this.a.a();
    }
    public void b(int p0){
       this.a.b(p0);
    }
}
