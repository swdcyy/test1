package a2.r0$a;
import android.view.WindowInsetsAnimation$Bounds;
import java.lang.Object;
import p1.b;
import a2.r0$d;
import java.lang.String;
import java.lang.StringBuilder;

public final class r0$a	// class@000099
{
    public final b a;
    public final b b;

    public void r0$a(WindowInsetsAnimation$Bounds p0){
       super();
       this.a = r0$d.g(p0);
       this.b = r0$d.f(p0);
    }
    public void r0$a(b p0,b p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static r0$a d(WindowInsetsAnimation$Bounds p0){
       return new r0$a(p0);
    }
    public b a(){
       return this.a;
    }
    public b b(){
       return this.b;
    }
    public WindowInsetsAnimation$Bounds c(){
       return r0$d.e(this);
    }
    public String toString(){
       return "Bounds{lower="+this.a+" upper="+this.b+"}";
    }
}
