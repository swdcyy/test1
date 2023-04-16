package kf1.e;
import android.text.style.ClickableSpan;
import com.kuaishou.live.common.core.component.comments.item.voicecomment.a;
import com.kuaishou.live.common.core.component.comments.model.VoiceCommentMessage;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kf1.f;
import o81.f;

public class e extends ClickableSpan	// class@002d24
{
    public final VoiceCommentMessage b;
    public final a c;

    public void e(a p0,VoiceCommentMessage p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       a a = this.c.a;
       if (a != null && a.b()) {
          return;
       }
       a = this.c.b;
       if (a != null) {
          a.b(this.b, p0);
       }
       return;
    }
}
