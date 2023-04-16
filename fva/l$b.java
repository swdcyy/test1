package fva.l$b;
import erd.g;
import fva.l;
import java.lang.Object;
import dva.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.written.view.IWrittenLayout;
import com.yxcorp.gifshow.model.hotspot.HotSpotModel;
import com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList;
import kotlin.jvm.internal.a;
import fva.k;
import k2b.e0;

public final class l$b implements g	// class@002a0f
{
    public final l b;

    public void l$b(l p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$b.class, "1")) {
       }else {
          View view = this.b.q.l1();
          int i = (p0.a())? 0: 8;
          view.setVisibility(i);
          if (p0.a()) {
             p0 = this.b.p.Z2();
             a.m(p0);
             if (p0.isFoldButtonShowed == null) {
                k.a.b("FOLD", this.b.r);
                p0 = this.b.p.Z2();
                a.m(p0);
                p0.isFoldButtonShowed = true;
             }
          }
       }
       return;
    }
}
