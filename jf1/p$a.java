package jf1.p$a;
import android.text.style.ClickableSpan;
import jf1.p;
import com.kuaishou.live.common.core.component.follow.FollowAnchorMessage;
import o81.g;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o81.f;
import com.kuaishou.live.comments.widget.LiveCommentsNormalItemView;
import java.lang.CharSequence;

public class p$a extends ClickableSpan	// class@002b79
{
    public final FollowAnchorMessage b;
    public final g c;
    public final p d;

    public void p$a(p p0,FollowAnchorMessage p1,g p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$a.class, "1")) {
          return;
       }
       p$a uoa = null;
       p a = this.d.a;
       if (a != null) {
          uoa = a.b(this.b, p0);
       }
       if (uoa && p0 instanceof LiveCommentsNormalItemView) {
          p0.setText(this.d.b(this.b, this.c));
       }
       return;
    }
}
