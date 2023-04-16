package cd1.e;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeWidget;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeView;

public final class e implements Observer	// class@000498
{
    public final LiveIncreaseFansNoticeWidget b;

    public void e(LiveIncreaseFansNoticeWidget p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       e tb = this.b;
       int b = p0.booleanValue();
       Objects.requireNonNull(tb);
       LiveIncreaseFansNoticeWidget liveIncrease = LiveIncreaseFansNoticeWidget.class;
       if (!PatchProxy.isSupport(liveIncrease) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, liveIncrease, "13")) {
          LiveIncreaseFansNoticeWidget b1 = tb.b;
          if (b1 != null) {
             b = (b)? 0: 8;
             b1.setContentIconVisibility(b);
          }
       }
       return;
    }
}
