package ek9.b1;
import java.lang.Runnable;
import com.yxcorp.gifshow.comment.e;
import com.yxcorp.gifshow.comment.e$b;
import java.lang.Object;
import java.util.Set;

public final class b1 implements Runnable	// class@00216f
{
    public final e b;
    public final e$b c;

    public void b1(e p0,e$b p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.b.remove(this.c);
    }
}
