package androidx.recyclerview.widget.c;
import java.util.concurrent.Executor;
import androidx.recyclerview.widget.h$f;
import java.lang.Object;

public final class c	// class@0008f3
{
    public final Executor a;
    public final Executor b;
    public final h$f c;

    public void c(Executor p0,Executor p1,h$f p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public Executor a(){
       return this.b;
    }
    public h$f b(){
       return this.c;
    }
    public Executor c(){
       return this.a;
    }
}
