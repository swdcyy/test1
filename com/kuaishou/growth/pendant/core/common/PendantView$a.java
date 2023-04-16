package com.kuaishou.growth.pendant.core.common.PendantView$a;
import androidx.lifecycle.Observer;
import com.kuaishou.growth.pendant.core.common.PendantView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.pendant.core.config.PendantCoreConfig;
import java.lang.StringBuilder;
import android.widget.FrameLayout;
import de0.a;
import java.lang.Throwable;
import de0.a$a;

public final class PendantView$a implements Observer	// class@000633
{
    public final PendantView b;

    public void PendantView$a(PendantView p0){
       this.b = p0;
       super();
    }
    public final void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PendantView$a.class, "1")) {
          return;
       }
       if (PendantCoreConfig.i.b()) {
          a$a.b(this.b, this.b.hashCode()+"observed viewEffect : "+p0, null, 2, null);
       }
       this.b.f(p0);
       return;
    }
}
