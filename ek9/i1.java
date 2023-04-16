package ek9.i1;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ek9.j1;
import com.yxcorp.gifshow.comment.CommentParams;
import java.lang.Object;

public class i1 extends Accessor	// class@002184
{
    public final CommentParams c;
    public final j1 d;

    public void i1(j1 p0,CommentParams p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c;
    }
}
