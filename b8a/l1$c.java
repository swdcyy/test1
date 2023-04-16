package b8a.l1$c;
import erd.g;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import um6.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import nm6.d;

public final class l1$c implements g	// class@0003c0
{
    public final Activity b;
    public final QPhoto c;

    public void l1$c(Activity p0,QPhoto p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l1$c.class, "1")) {
       }else {
          a.p(p0, "plugin");
          d uod = new d();
          uod.p(true);
          uod.m(true);
          uod.q(true);
          p0.xE(this.b, this.c, uod);
       }
       return;
    }
}
