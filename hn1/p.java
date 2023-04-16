package hn1.p;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailPhotoPlayerCardViewController;
import java.lang.Object;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotPhotoViewData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hn1.b$b;
import kotlin.jvm.internal.a;
import ln1.b;
import io.reactivex.subjects.PublishSubject;

public final class p implements Observer	// class@00273d
{
    public final LiveHotSpotDetailPhotoPlayerCardViewController b;

    public void p(LiveHotSpotDetailPhotoPlayerCardViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.p.onNext(new b$b(p0));
       }
       return;
    }
}
