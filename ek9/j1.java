package ek9.j1;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.comment.CommentParams;
import com.kuaishou.android.model.mix.QComment;
import ek9.h1;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ek9.i1;
import mm8.a;

public final class j1 implements b	// class@002187
{

    public void j1(){
       super();
    }
    public void a(a p0,Object p1){
       QComment qComment = QComment.class;
       h1 oh1 = new h1(this, p1);
       try{
          p0.h(qComment, oh1);
          p0.h(CommentParams.class, new i1(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
