package jn1.b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainDataBinding;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.CharSequence;
import android.widget.TextView;

public final class b implements Observer	// class@002bce
{
    public final LiveHotSpotDetailExplainDataBinding b;

    public void b(LiveHotSpotDetailExplainDataBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          LiveHotSpotDetailExplainDataBinding g = this.b.g;
          a.o(p0, "it");
          int i = 0;
          String str = (p0.length() > 0)? 1: null;
          if (!str) {
             i = 8;
          }
          g.setVisibility(i);
          g = this.b.b;
          a.o(g, "contentTextView");
          g.setText(p0);
       }
       return;
    }
}
