package ge2.b;
import android.os.Handler;
import com.kuaishou.live.core.show.pk.widget.autoflipwidget.LivePkAvatarsBanner;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import h3.a;
import androidx.viewpager.widget.ViewPager;

public class b extends Handler	// class@002b06
{
    public final LivePkAvatarsBanner a;

    public void b(LivePkAvatarsBanner p0){
       this.a = p0;
       super();
    }
    public void handleMessage(Message p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       if (p0.what == null) {
          b ta = this.a;
          Objects.requireNonNull(ta);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, ta, LivePkAvatarsBanner.class, "9")) {
             LivePkAvatarsBanner obj = PatchProxy.apply(objArray, ta, LivePkAvatarsBanner.class, "10");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                obj = ta.c;
                b = (obj != null && (obj.getAdapter() != null && ta.c.getAdapter().j() >= 3))? true: false;
             }
             if (b) {
                ta.c.setCurrentItem(((ta.c.getCurrentItem() + 1) % ta.c.getAdapter().j()), 1);
             }
          }
          this.a.f();
       }
       return;
    }
}
