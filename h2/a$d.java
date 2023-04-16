package h2.a$d;
import h2.a$c;
import h2.a$a;
import android.view.Choreographer;
import h2.a$d$a;
import android.view.Choreographer$FrameCallback;

public class a$d extends a$c	// class@0020ce
{
    public final Choreographer b;
    public final Choreographer$FrameCallback c;

    public void a$d(a$a p0){
       super(p0);
       this.b = Choreographer.getInstance();
       this.c = new a$d$a(this);
    }
    public void a(){
       this.b.postFrameCallback(this.c);
    }
}
