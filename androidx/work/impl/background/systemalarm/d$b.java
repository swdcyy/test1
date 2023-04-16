package androidx.work.impl.background.systemalarm.d$b;
import java.lang.Runnable;
import androidx.work.impl.background.systemalarm.d;
import android.content.Intent;
import java.lang.Object;

public class d$b implements Runnable	// class@000a7f
{
    public final d b;
    public final Intent c;
    public final int d;

    public void d$b(d p0,Intent p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void run(){
       this.b.a(this.c, this.d);
    }
}
