package ek9.a1;
import java.lang.Runnable;
import com.yxcorp.gifshow.comment.e;
import com.yxcorp.gifshow.comment.e$b;
import java.lang.Object;
import java.util.Set;

public final class a1 implements Runnable	// class@00216c
{
    public final e b;
    public final e$b c;

    public void a1(e p0,e$b p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.b.add(this.c);
    }
}
