package df2.n;
import u07.u;
import df2.m0;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;

public final class n implements u	// class@002500
{
    public final m0 b;

    public void n(m0 p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       n tb = this.b;
       if (tb.x.getTargetUserAssType() == LiveApiParams$AssistantType.SUPER_ADMIN) {
          tb.I9();
       }else {
          tb.Q9();
       }
       return;
    }
}
