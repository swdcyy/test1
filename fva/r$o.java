package fva.r$o;
import erd.g;
import vm5.h$a;
import java.util.List;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment;
import android.app.Activity;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import fva.r;
import com.smile.gifshow.annotation.provider.v2.a;
import vl8.c;
import tkd.b;
import tkd.d;
import vm5.h;
import android.view.View;

public final class r$o implements g	// class@002a28
{
    public final h$a b;
    public final int c;
    public final List d;
    public final HotSpotFragment e;
    public final Activity f;

    public void r$o(h$a p0,int p1,List p2,HotSpotFragment p3,Activity p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void accept(Object p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, r$o.class, "1")) {
       }else {
          a.p(obj, "photo");
          Object[] objArray = new Object[]{r.a.a(this.c, this.d, obj, this.e)};
          this.b.u(objArray);
          d.a(-2112484039).C4(this.f, obj, null, null, this.b);
       }
       return;
    }
}
