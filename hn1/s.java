package hn1.s;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailPhotoPlayerCardViewController;
import java.lang.Object;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotPhotoViewData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hn1.b$a;
import kotlin.jvm.internal.a;
import android.view.View;
import com.kuaishou.live.viewcontroller.ViewController;
import ln1.b;
import io.reactivex.subjects.PublishSubject;

public final class s implements Observer	// class@002740
{
    public final LiveHotSpotDetailPhotoPlayerCardViewController b;

    public void s(LiveHotSpotDetailPhotoPlayerCardViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.p.onNext(new b$a(p0, this.b.P2()));
       }
       return;
    }
}
