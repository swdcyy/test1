package hp1.b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController;
import java.lang.Object;
import fe3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yp1.g;

public final class b implements Observer	// class@002762
{
    public final LiveAudienceMultiChatController b;

    public void b(LiveAudienceMultiChatController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          this.b.o.f(new a(p0.d(), p0.c()));
          this.b.o.d();
       }
       return;
    }
}
