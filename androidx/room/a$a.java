package androidx.room.a$a;
import java.lang.Runnable;
import androidx.room.a;
import java.lang.Object;
import java.util.concurrent.Executor;

public class a$a implements Runnable	// class@00094b
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       a$a tb = this.b;
       tb.f.execute(tb.l);
    }
}
