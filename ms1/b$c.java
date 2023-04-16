package ms1.b$c;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.view.icontext.LiveMultiLineIconTextView;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class b$c implements Observer	// class@003204
{
    public final LiveMultiLineIconTextView b;

    public void b$c(LiveMultiLineIconTextView p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.setIcon(p0.intValue());
       }
       return;
    }
}
