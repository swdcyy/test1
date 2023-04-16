package fja.a;
import java.lang.Runnable;
import y0b.j;
import java.util.List;
import java.lang.Object;
import qvb.n0;
import qvb.a;

public final class a implements Runnable	// class@002948
{
    public final j b;
    public final List c;

    public void a(j p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.j().d(this.c);
    }
}
