package fva.n;
import android.view.View$OnClickListener;
import fva.m$b$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import dva.c;
import fva.m$b;
import fva.m;
import com.yxcorp.gifshow.model.hotspot.HotSpotItem;

public final class n implements View$OnClickListener	// class@002a15
{
    public final m$b$a b;

    public void n(m$b$a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       RxBus.f.b(new c(m.P8(this.b.b.b)));
       return;
    }
}
