package kn1.a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorDataBinding;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;

public final class a implements Observer	// class@002d6d
{
    public final LiveHotSpotDetailBottomNavigatorDataBinding b;

    public void a(LiveHotSpotDetailBottomNavigatorDataBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          LiveHotSpotDetailBottomNavigatorDataBinding h = this.b.h;
          a.o(p0, "it");
          int i = (p0.booleanValue())? 0: 8;
          h.setVisibility(i);
       }
       return;
    }
}
