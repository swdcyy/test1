package ms1.b$b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.view.icontext.LiveMultiLineIconTextView;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class b$b implements Observer	// class@003203
{
    public final LiveMultiLineIconTextView b;

    public void b$b(LiveMultiLineIconTextView p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
       }else {
          this.b.setText(p0);
       }
       return;
    }
}
