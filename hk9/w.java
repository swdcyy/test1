package hk9.w;
import java.lang.Runnable;
import com.yxcorp.gifshow.comment.common.c;
import java.lang.Object;
import com.yxcorp.gifshow.comment.common.c$b;
import android.view.View;
import com.yxcorp.gifshow.comment.common.c$a$a;
import android.widget.ImageView;
import com.yxcorp.gifshow.comment.CommentConfig;
import com.yxcorp.gifshow.comment.CommentTipsConfig;

public final class w implements Runnable	// class@0026b3
{
    public final c b;

    public void w(c p0){
       this.b = p0;
    }
    public final void run(){
       w tb = this.b;
       if (tb.l.g.a() != null) {
          tb.l.g.a().setImageResource(tb.c.mTipsConfig.mEmptyRes);
       }
       return;
    }
}
