package fva.r$n;
import erd.g;
import vm5.h$a;
import java.util.List;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment;
import android.app.Activity;
import java.lang.Object;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import fva.r;
import com.smile.gifshow.annotation.provider.v2.a;
import vl8.c;
import tkd.b;
import tkd.d;
import vm5.h;
import android.view.View;

public final class r$n implements g	// class@002a27
{
    public final h$a b;
    public final int c;
    public final List d;
    public final HotSpotFragment e;
    public final Activity f;

    public void r$n(h$a p0,int p1,List p2,HotSpotFragment p3,Activity p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$n.class, "1")) {
       }else {
          a.p(p0, "response");
          QPhoto qPhoto = new QPhoto(p0);
          Object[] objArray = new Object[]{r.a.a(this.c, this.d, qPhoto, this.e)};
          this.b.u(objArray);
          d.a(-2112484039).C4(this.f, qPhoto, null, null, this.b);
       }
       return;
    }
}
