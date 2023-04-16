package e63.u;
import u07.u;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;

public final class u implements u	// class@002674
{
    public final e b;

    public void u(e p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       u tb = this.b;
       if (tb.r.getTargetUserAssType() == LiveApiParams$AssistantType.ADMIN) {
          tb.F9();
       }else {
          tb.L9();
       }
       return;
    }
}
