package bn3.b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketPopupPrepareSharePolicyAreaView;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.redpacket.core.ui.view.lottery.preparepage.RedPacketPopupPrepareSharePolicyAreaView$c;
import java.util.Collection;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.ViewGroup;

public final class b implements Observer	// class@0003fc
{
    public final RedPacketPopupPrepareSharePolicyAreaView b;

    public void b(RedPacketPopupPrepareSharePolicyAreaView p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, RedPacketPopupPrepareSharePolicyAreaView.class, "3")) {
       }else {
          RedPacketPopupPrepareSharePolicyAreaView h = tb.h;
          Objects.requireNonNull(h);
          if (!PatchProxy.applyVoidOneRefs(p0, h, RedPacketPopupPrepareSharePolicyAreaView$c.class, "1")) {
             h.e.clear();
             h.e.addAll(p0);
             h.k0();
          }
          if (p0.isEmpty()) {
             tb.f.setVisibility(8);
          }else {
             tb.f.setVisibility(0);
          }
       }
       return;
    }
}
