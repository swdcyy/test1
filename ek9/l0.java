package ek9.l0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ek9.s0;
import ek9.f;
import java.lang.Object;
import com.yxcorp.gifshow.comment.CommentConfig;

public class l0 extends Accessor	// class@00218c
{
    public final f c;
    public final s0 d;

    public void l0(s0 p0,f p1){
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
