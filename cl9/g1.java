package cl9.g1;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cl9.k1;
import cl9.h0;
import java.lang.Object;
import com.yxcorp.gifshow.comment.log.a;

public class g1 extends Accessor	// class@000624
{
    public final h0 c;
    public final k1 d;

    public void g1(k1 p0,h0 p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.m;
    }
    public void set(Object p0){
       this.c.m = p0;
    }
}