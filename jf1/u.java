package jf1.u;
import android.text.style.ClickableSpan;
import jf1.v;
import com.kuaishou.live.common.core.component.comments.model.LiveGzoneCommonMessage;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o81.f;

public class u extends ClickableSpan	// class@002b80
{
    public final LiveGzoneCommonMessage b;
    public final v c;

    public void u(v p0,LiveGzoneCommonMessage p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "1")) {
          return;
       }
       v a = this.c.a;
       if (a != null) {
          a.b(this.b, p0);
       }
       return;
    }
}
