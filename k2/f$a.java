package k2.f$a;
import java.lang.Runnable;
import k2.f;
import java.util.ArrayList;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import a2.i0;

public class f$a implements Runnable	// class@002460
{
    public final int b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final f g;

    public void f$a(f p0,int p1,ArrayList p2,ArrayList p3,ArrayList p4,ArrayList p5){
       this.g = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public void run(){
       for (int i = 0; i < this.b; i = i + 1) {
          i0.N0(this.c.get(i), this.d.get(i));
          i0.N0(this.e.get(i), this.f.get(i));
       }
       return;
    }
}
