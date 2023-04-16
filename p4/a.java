package p4.a;
import java.lang.Runnable;
import p4.b;
import android.content.Context;
import java.util.List;
import java.lang.Object;

public class a implements Runnable	// class@0028b1
{
    public final Context b;
    public final List c;
    public final b d;

    public void a(b p0,Context p1,List p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       this.d.b(this.b, this.c, true);
    }
}
