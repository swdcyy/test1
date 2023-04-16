package al5.d;
import erd.g;
import al5.e;
import java.lang.Object;
import java.lang.Integer;
import com.kwai.emotionsdk.panel.EmotionPanelConfig;
import androidx.recyclerview.widget.LinearLayoutManager;
import vk5.d;
import androidx.recyclerview.widget.RecyclerView;

public final class d implements g	// class@0000cd
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       int i = p0.intValue();
       if (tb.p.isEnableGIFSearchTAB()) {
          i++;
       }
       if (tb.y != i) {
          tb.y = i;
          i = (tb.w.h() > tb.y || tb.w.E() < tb.y)? 1: null;
          tb.x.K0(tb.y);
          if (i) {
             tb.u.smoothScrollToPosition(tb.y);
          }
       }
       return;
    }
}
