package hk9.v;
import java.lang.Runnable;
import com.yxcorp.gifshow.comment.common.c;
import java.lang.Object;
import com.yxcorp.gifshow.comment.common.c$b;
import android.view.View;
import com.yxcorp.gifshow.comment.common.c$a$a;
import android.widget.TextView;
import com.yxcorp.gifshow.comment.CommentConfig;
import com.yxcorp.gifshow.comment.CommentTipsConfig;

public final class v implements Runnable	// class@0026b2
{
    public final c b;

    public void v(c p0){
       this.b = p0;
    }
    public final void run(){
       v tb = this.b;
       if (tb.l.h.a() != null) {
          tb.l.h.a().setText(tb.c.mTipsConfig.mEmptySubTextResId);
       }
       return;
    }
}
