package jn1.c;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainDataBinding;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import com.kuaishou.live.common.core.basic.widget.ExpandEmojiTextView;
import com.kuaishou.live.common.core.basic.widget.ExpandEmojiTextView$b;

public final class c implements Observer	// class@002bcf
{
    public final LiveHotSpotDetailExplainDataBinding b;

    public void c(LiveHotSpotDetailExplainDataBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          this.b.b.v(p0.component1(), p0.component2().intValue());
          p0 = this.b;
          p0.b.setSpanClickListener(p0.f);
       }
       return;
    }
}
