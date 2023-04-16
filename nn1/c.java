package nn1.c;
import androidx.lifecycle.Observer;
import nn1.g;
import java.lang.Object;
import com.kuaishou.android.live.model.LiveCoverWidgetModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.LiveCoverIconView;

public final class c implements Observer	// class@00337e
{
    public final g b;

    public void c(g p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          this.b.b.N(p0);
       }
       return;
    }
}
