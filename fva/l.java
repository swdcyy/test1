package fva.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList;
import jva.g;
import k2b.e0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.written.view.IWrittenLayout;
import android.widget.LinearLayout;
import fva.l$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.util.rx.RxBus;
import dva.b;
import brd.t;
import t45.d;
import brd.z;
import fva.l$b;
import erd.g;
import crd.b;

public final class l extends PresenterV2	// class@002a10
{
    public final HotSpotFeedPageList p;
    public final g q;
    public final e0 r;

    public void l(HotSpotFeedPageList p0,g p1,e0 p2){
       a.p(p0, "cardList");
       a.p(p1, "binding");
       a.p(p2, "page");
       super();
       this.p = p0;
       this.q = p1;
       this.r = p2;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.q.l1().setVisibility(8);
       this.q.n1().setOnClickListener(new l$a(this));
       this.X7(RxBus.f.f(b.class).observeOn(d.a).subscribe(new l$b(this)));
       return;
    }
}
