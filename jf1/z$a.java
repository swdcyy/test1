package jf1.z$a;
import android.text.style.ClickableSpan;
import jf1.z;
import com.kuaishou.live.common.core.component.comments.model.LiveKtvOrderMusicMessage;
import o81.g;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import if1.b;
import com.kuaishou.live.comments.widget.LiveCommentsNormalItemView;
import java.lang.CharSequence;

public class z$a extends ClickableSpan	// class@002b86
{
    public final LiveKtvOrderMusicMessage b;
    public final g c;
    public final z d;

    public void z$a(z p0,LiveKtvOrderMusicMessage p1,g p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z$a.class, "1")) {
          return;
       }
       z a = this.d.a;
       if (a != null) {
          a.b(this.b);
       }
       if (p0 instanceof LiveCommentsNormalItemView) {
          p0.setText(this.d.b(this.b, this.c));
       }
       return;
    }
}
