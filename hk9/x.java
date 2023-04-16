package hk9.x;
import java.lang.Runnable;
import com.yxcorp.gifshow.comment.common.c;
import java.lang.Object;
import com.yxcorp.gifshow.comment.common.c$a;
import android.view.View;
import com.yxcorp.gifshow.comment.common.c$a$a;
import com.yxcorp.gifshow.comment.CommentConfig;
import com.yxcorp.gifshow.comment.CommentTipsConfig;

public final class x implements Runnable	// class@0026b4
{
    public final c b;

    public void x(c p0){
       this.b = p0;
    }
    public final void run(){
       x tb = this.b;
       if (tb.l.b.a() != null) {
          tb.l.b.a().setTranslationY(tb.c.mTipsConfig.mEmptyViewTranslationY);
       }
       return;
    }
}
