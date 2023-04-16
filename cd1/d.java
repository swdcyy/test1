package cd1.d;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeWidget;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeView;

public final class d implements Observer	// class@000497
{
    public final LiveIncreaseFansNoticeWidget b;

    public void d(LiveIncreaseFansNoticeWidget p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       d tb = this.b;
       boolean b = p0.booleanValue();
       Objects.requireNonNull(tb);
       LiveIncreaseFansNoticeWidget liveIncrease = LiveIncreaseFansNoticeWidget.class;
       if (PatchProxy.isSupport(liveIncrease) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, liveIncrease, "12") && tb.b != null)) {
          int i = 0;
          b = (tb.k.getValue().booleanValue() && !tb.j.getValue().booleanValue())? 1: 0;
          LiveIncreaseFansNoticeWidget b1 = tb.b;
          if (!b) {
             i = 8;
          }
          b1.setButtonVisibility(i);
       }
       return;
    }
}
