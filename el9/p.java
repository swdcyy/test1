package el9.p;
import java.lang.Runnable;
import com.yxcorp.gifshow.comment.presenter.global.a$b;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Object;
import al9.a;
import com.yxcorp.gifshow.comment.presenter.global.a;
import qvb.i;

public final class p implements Runnable	// class@0021fd
{
    public final a$b b;
    public final QComment c;

    public void p(a$b p0,QComment p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.b.X8().remove(this.c);
    }
}
