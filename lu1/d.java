package lu1.d;
import androidx.lifecycle.Observer;
import lu1.q;
import java.lang.Object;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.basic.widget.LiveMultiVideoSceneAudioWidget;

public final class d implements Observer	// class@00303c
{
    public final q b;

    public void d(q p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          q z = this.b.z;
          if (z != null && !z.getVisibility()) {
             z = this.b.z;
             a.m(z);
             z.b(p0);
          }
       }
       return;
    }
}
