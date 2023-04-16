package kn1.c;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorDataBinding;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorViewModel;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import un1.k;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorViewModel$a$a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import d61.l0;
import java.lang.Boolean;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorViewModel$b;
import androidx.lifecycle.MutableLiveData;
import yh3.a;

public final class c implements View$OnClickListener	// class@002d6f
{
    public final LiveHotSpotDetailBottomNavigatorDataBinding b;
    public final LiveHotSpotDetailBottomNavigatorViewModel c;

    public void c(LiveHotSpotDetailBottomNavigatorDataBinding p0,LiveHotSpotDetailBottomNavigatorViewModel p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.b.j.O();
       c tc = this.c;
       LiveHotSpotDetailBottomNavigatorViewModel$a$a a = LiveHotSpotDetailBottomNavigatorViewModel$a$a.a;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(a, tc, LiveHotSpotDetailBottomNavigatorViewModel.class, "4")) {
          a.p(a, "intent");
          if (a.g(a, a)) {
             tc.x0().i(Boolean.TRUE);
             LiveHotSpotDetailBottomNavigatorViewModel$b value = tc.e.getValue();
             if (value != null && !value.a()) {
                tc.r0(tc.e).setValue(new LiveHotSpotDetailBottomNavigatorViewModel$b(true, true));
             }
          }
       }
       this.b.c("NEXT");
       return;
    }
}
