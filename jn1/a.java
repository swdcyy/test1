package jn1.a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainDataBinding;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;

public final class a implements Observer	// class@002bcd
{
    public final LiveHotSpotDetailExplainDataBinding b;

    public void a(LiveHotSpotDetailExplainDataBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       LiveHotSpotDetailExplainDataBinding a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          a = this.b.a;
          a.o(a, "titleView");
          a.setText(p0);
       }
       return;
    }
}
