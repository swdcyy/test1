package ms1.b$e;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.view.icontext.LiveMultiLineIconTextView;
import java.lang.Object;
import com.kuaishou.live.common.core.component.multiline.view.icontext.LiveMultiLineIconTextView$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class b$e implements Observer	// class@003206
{
    public final LiveMultiLineIconTextView b;

    public void b$e(LiveMultiLineIconTextView p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$e.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.setLayoutConfig(p0);
       }
       return;
    }
}
