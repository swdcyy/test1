package androidx.recyclerview.widget.d$a;
import java.lang.Runnable;
import androidx.recyclerview.widget.d;
import java.util.List;
import java.lang.Object;
import androidx.recyclerview.widget.d$a$a;
import androidx.recyclerview.widget.h$b;
import androidx.recyclerview.widget.h$e;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.d$a$b;
import java.util.concurrent.Executor;

public class d$a implements Runnable	// class@0008f6
{
    public final List b;
    public final List c;
    public final int d;
    public final Runnable e;
    public final d f;

    public void d$a(d p0,List p1,List p2,int p3,Runnable p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void run(){
       this.f.c.execute(new d$a$b(this, h.b(new d$a$a(this))));
    }
}
