package ms1.b$d;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.view.icontext.LiveMultiLineIconTextView;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class b$d implements Observer	// class@003205
{
    public final LiveMultiLineIconTextView b;

    public void b$d(LiveMultiLineIconTextView p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "1")) {
       }else {
          this.b.setTextInIcon(p0);
       }
       return;
    }
}
