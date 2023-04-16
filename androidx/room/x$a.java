package androidx.room.x$a;
import androidx.room.u$a;
import androidx.room.x;
import java.lang.String;
import androidx.room.x$a$a;
import java.lang.Runnable;
import java.util.concurrent.Executor;

public class x$a extends u$a	// class@00097c
{
    public final x a;

    public void x$a(x p0){
       this.a = p0;
       super();
    }
    public void I0(String[] p0){
       this.a.g.execute(new x$a$a(this, p0));
    }
}
