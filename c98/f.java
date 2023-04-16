package c98.f;
import java.lang.Runnable;
import com.mini.guide.GuideMiniManagerImpl;
import c98.i;
import java.lang.Object;
import java.util.Objects;
import java.util.List;

public final class f implements Runnable	// class@0003c9
{
    public final GuideMiniManagerImpl b;
    public final i c;

    public void f(GuideMiniManagerImpl p0,i p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       f tb = this.b;
       f tc = this.c;
       Objects.requireNonNull(tb);
       if (tc != null) {
          tb.c.remove(tc);
       }
       return;
    }
}
