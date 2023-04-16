package hk9.u;
import java.lang.Runnable;
import com.yxcorp.gifshow.comment.common.c;
import java.lang.Object;
import com.yxcorp.gifshow.comment.common.c$b;
import android.view.View;
import com.yxcorp.gifshow.comment.common.c$a$a;
import android.widget.TextView;
import com.yxcorp.gifshow.comment.CommentConfig;
import com.yxcorp.gifshow.comment.CommentTipsConfig;

public final class u implements Runnable	// class@0026b1
{
    public final c b;

    public void u(c p0){
       this.b = p0;
    }
    public final void run(){
       u tb = this.b;
       if (tb.l.e.a() != null) {
          tb.l.e.a().setText(tb.c.mTipsConfig.mEmptyTextResId);
       }
       return;
    }
}
