package cd1.g;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeView$b;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeWidget;
import java.lang.Object;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeWidget$b;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;

public final class g implements LiveIncreaseFansNoticeView$b	// class@00049a
{
    public final LiveIncreaseFansNoticeWidget a;

    public void g(LiveIncreaseFansNoticeWidget p0){
       this.a = p0;
    }
    public final void a(){
       g ta = this.a;
       ta.c.T4(ta.h.getValue());
       if (ta.t() == 27) {
          ta.j.setValue(Boolean.TRUE);
       }
       return;
    }
}
