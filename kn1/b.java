package kn1.b;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorDataBinding;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import un1.k;

public final class b implements View$OnClickListener	// class@002d6e
{
    public final LiveHotSpotDetailBottomNavigatorDataBinding b;

    public void b(LiveHotSpotDetailBottomNavigatorDataBinding p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       b tb = this.b;
       LiveHotSpotDetailBottomNavigatorDataBinding f = tb.f;
       if (f == null) {
          f = "";
       }
       tb.j.d0(f, 11);
       this.b.c("HOT_NAME");
       return;
    }
}
