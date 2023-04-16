package cl9.k0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cl9.k1;
import cl9.h0;
import java.lang.Object;
import com.yxcorp.gifshow.comment.CommentParams;

public class k0 extends Accessor	// class@00063c
{
    public final h0 c;
    public final k1 d;

    public void k0(k1 p0,h0 p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.D;
    }
    public void set(Object p0){
       this.c.D = p0;
    }
}
