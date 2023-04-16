package hn1.t;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailPhotoPlayerCardViewController;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hn1.a0$b;
import io.reactivex.subjects.PublishSubject;

public final class t implements Observer	// class@002741
{
    public final LiveHotSpotDetailPhotoPlayerCardViewController b;

    public void t(LiveHotSpotDetailPhotoPlayerCardViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
       }else {
          this.b.o.onNext(a0$b.a);
       }
       return;
    }
}
