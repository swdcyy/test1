package df2.m;
import u07.u;
import df2.m0;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;

public final class m implements u	// class@0024fe
{
    public final m0 b;

    public void m(m0 p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       m tb = this.b;
       if (tb.x.getTargetUserAssType() == LiveApiParams$AssistantType.ADMIN) {
          tb.H9();
       }else {
          tb.O9();
       }
       return;
    }
}
