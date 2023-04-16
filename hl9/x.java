package hl9.x;
import java.lang.Runnable;
import com.yxcorp.gifshow.comment.utils.Labels.CommentLabelsView;
import java.lang.Object;
import com.yxcorp.gifshow.comment.utils.Labels.CommentLabelsView$a;

public final class x implements Runnable	// class@0026e2
{
    public final CommentLabelsView b;

    public void x(CommentLabelsView p0){
       this.b = p0;
    }
    public final void run(){
       this.b.setOnLabelClickListener(null);
    }
}
