package e63.v;
import u07.u;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;

public final class v implements u	// class@002676
{
    public final e b;

    public void v(e p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       v tb = this.b;
       if (tb.r.getTargetUserAssType() == LiveApiParams$AssistantType.SUPER_ADMIN) {
          tb.G9();
       }else {
          tb.M9();
       }
       return;
    }
}
