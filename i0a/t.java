package i0a.t;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import i0a.v;
import i0a.k;
import java.lang.Object;
import brd.t;

public class t extends Accessor	// class@002759
{
    public final k c;
    public final v d;

    public void t(v p0,k p1){
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
