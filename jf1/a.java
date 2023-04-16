package jf1.a;
import android.text.style.ClickableSpan;
import jf1.b;
import com.kuaishou.live.common.core.component.comments.model.LiveAdConversionTaskMessage;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o81.f;

public class a extends ClickableSpan	// class@002b61
{
    public final LiveAdConversionTaskMessage b;
    public final b c;

    public void a(b p0,LiveAdConversionTaskMessage p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       b a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a = this.c.a;
       if (a != null) {
          a.b(this.b, p0);
       }
       return;
    }
}
