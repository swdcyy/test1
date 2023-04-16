package mn1.b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.LiveHotSpotDetailNormalMediaAreaDataBinding;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;

public final class b implements Observer	// class@0031ce
{
    public final LiveHotSpotDetailNormalMediaAreaDataBinding b;

    public void b(LiveHotSpotDetailNormalMediaAreaDataBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          LiveHotSpotDetailNormalMediaAreaDataBinding a = this.b.a;
          a.o(a, "titleView");
          a.setText(p0);
       }
       return;
    }
}
