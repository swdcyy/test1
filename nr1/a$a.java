package nr1.a$a;
import androidx.lifecycle.Observer;
import nr1.a;
import android.view.ViewGroup;
import java.lang.Object;
import com.kuaishou.live.common.core.component.multiline.model.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.multiinteract.view.LiveInteractWidgetContainer$a;
import pq1.b;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import msd.p;

public final class a$a implements Observer	// class@0033ac
{
    public final a b;
    public final ViewGroup c;

    public void a$a(a p0,ViewGroup p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          LiveInteractWidgetContainer$a uoa = new LiveInteractWidgetContainer$a(p0.b, p0.a, p0.c, p0.d, String.valueOf(p0.h.userId));
          this.b.b.invoke(String.valueOf(this.c.hashCode()), v0);
       }
       return;
    }
}
