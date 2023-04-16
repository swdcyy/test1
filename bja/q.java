package bja.q;
import java.lang.Runnable;
import com.yxcorp.gifshow.follow.stagger.post.g;
import r16.f;
import java.lang.Object;
import java.util.Objects;
import r26.e;

public final class q implements Runnable	// class@0003f1
{
    public final g b;
    public final f c;

    public void q(g p0,f p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       q tb = this.b;
       Objects.requireNonNull(tb);
       this.c.V3(tb);
    }
}
