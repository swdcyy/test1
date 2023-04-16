package kf1.b;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.comments.item.voicecomment.a;
import com.kuaishou.live.common.core.component.comments.model.VoiceCommentMessage;
import java.lang.Object;
import android.view.View;
import kf1.f;
import o81.f;

public final class b implements View$OnClickListener	// class@002d21
{
    public final a b;
    public final VoiceCommentMessage c;

    public void b(a p0,VoiceCommentMessage p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       b tb = this.b;
       b tc = this.c;
       a a = tb.a;
       if (a == null || !a.b()) {
          a b = tb.b;
          if (b != null) {
             b.b(tc, p0);
          }
       }
       return;
    }
}
