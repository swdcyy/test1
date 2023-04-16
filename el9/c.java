package el9.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.comment.presenter.global.a;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Object;

public final class c implements Runnable	// class@0021de
{
    public final a b;
    public final QComment c;

    public void c(a p0,QComment p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.c9(this.c);
    }
}
