package ed9.g;
import android.app.Activity;
import java.lang.Object;

public class g	// class@002115
{
    public final boolean a;
    public final boolean b;
    public final int c;

    public void g(boolean p0,Activity p1){
       super(p0, false, p1);
    }
    public void g(boolean p0,boolean p1,Activity p2){
       super();
       this.b = p1;
       this.a = p0;
       int i = (p2 != null)? p2.hashCode(): 0;
       this.c = i;
       return;
    }
}
