package au6.f;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import au6.c;

public abstract class f	// class@0003b6
{
    public c a;
    public final Activity b;
    public final int c;
    public final int d;

    public void f(Activity p0,int p1,int p2){
       a.p(p0, "activity");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public Activity a(){
       return this.b;
    }
    public c b(){
       return this.a;
    }
    public int c(){
       return this.c;
    }
    public int d(){
       return this.d;
    }
    public void e(c p0){
       this.a = p0;
    }
}
