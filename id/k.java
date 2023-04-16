package id.k;
import id.b;
import id.i;
import java.lang.Throwable;

public abstract class k extends b	// class@0021b6
{
    public final i b;

    public void k(i p0){
       super();
       this.b = p0;
    }
    public void g(){
       this.b.b();
    }
    public void h(Throwable p0){
       this.b.onFailure(p0);
    }
    public void j(float p0){
       this.b.a(p0);
    }
    public i n(){
       return this.b;
    }
}
