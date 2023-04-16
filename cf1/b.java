package cf1.b;
import android.text.style.ClickableSpan;
import com.kuaishou.live.common.core.component.comments.fluency.highfluencymessage.handlers.widget.HighFluencyWeakStyleView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View$OnClickListener;

public class b extends ClickableSpan	// class@0004aa
{
    public final HighFluencyWeakStyleView b;

    public void b(HighFluencyWeakStyleView p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       HighFluencyWeakStyleView f = this.b.f;
       if (f != null) {
          f.onClick(p0);
       }
       return;
    }
}
