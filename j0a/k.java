package j0a.k;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import j0a.n;
import j0a.f;
import java.lang.Object;
import brd.t;

public class k extends Accessor	// class@0028e8
{
    public final f c;
    public final n d;

    public void k(n p0,f p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
