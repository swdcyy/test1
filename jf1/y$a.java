package jf1.y$a;
import android.text.style.ClickableSpan;
import jf1.y;
import com.kuaishou.live.common.core.component.comments.model.LiveKtvOrderGuideMessage;
import o81.g;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import if1.a;
import com.kuaishou.live.comments.widget.LiveCommentsNormalItemView;
import java.lang.CharSequence;

public class y$a extends ClickableSpan	// class@002b84
{
    public final LiveKtvOrderGuideMessage b;
    public final g c;
    public final y d;

    public void y$a(y p0,LiveKtvOrderGuideMessage p1,g p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y$a.class, "1")) {
          return;
       }
       y a = this.d.a;
       if (a != null) {
          a.a(this.b);
       }
       if (p0 instanceof LiveCommentsNormalItemView) {
          p0.setText(this.d.b(this.b, this.c));
       }
       return;
    }
}
