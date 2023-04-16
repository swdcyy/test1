package kf1.c;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.comments.item.voicecomment.a;
import com.kuaishou.live.common.core.component.comments.model.VoiceCommentMessage;
import java.lang.Object;
import android.view.View;
import kf1.f;
import o81.f;

public final class c implements View$OnClickListener	// class@002d22
{
    public final a b;
    public final VoiceCommentMessage c;

    public void c(a p0,VoiceCommentMessage p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       c tb = this.b;
       c tc = this.c;
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
