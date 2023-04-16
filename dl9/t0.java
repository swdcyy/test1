package dl9.t0;
import java.lang.Runnable;
import dl9.x0;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Object;

public final class t0 implements Runnable	// class@001fa7
{
    public final x0 b;
    public final QComment c;

    public void t0(x0 p0,QComment p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.Y8(this.c);
    }
}
