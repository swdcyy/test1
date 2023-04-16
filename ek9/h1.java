package ek9.h1;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ek9.j1;
import com.yxcorp.gifshow.comment.CommentParams;
import java.lang.Object;
import com.kuaishou.android.model.mix.QComment;

public class h1 extends Accessor	// class@002181
{
    public final CommentParams c;
    public final j1 d;

    public void h1(j1 p0,CommentParams p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mComment;
    }
    public void set(Object p0){
       this.c.mComment = p0;
    }
}
