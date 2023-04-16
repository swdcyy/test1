package hx9.g;
import yg5.a;
import com.kwai.component.tabs.panel.h;
import hx9.g$b;
import nsd.u;
import java.lang.Class;
import android.os.Bundle;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import kotlin.jvm.internal.a;
import hx9.g$a;
import com.kwai.component.tabs.panel.h$d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.robust.PatchProxy;
import android.os.Parcelable;
import org.parceler.b;
import qrd.l1;
import androidx.fragment.app.Fragment;

public final class g extends h implements a	// class@002731
{
    public BaseFragment k;
    public final QPhoto l;
    public static final g$b m;

    static {
       g.m = new g$b(null);
    }
    public void g(Class p0,Bundle p1,String p2,QPhoto p3){
       a.p(p3, "mPhoto");
       super(p0, p1, p2, 7001);
       this.l = p3;
       this.k(new g$a(this));
       this.h(this);
    }
    public void a(BaseFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       a.p(p0, "fragment");
       this.k = p0;
       Bundle uBundle = new Bundle();
       uBundle.putParcelable("qphoto", b.c(this.l));
       uBundle.putBoolean("dynamic", true);
       p0.setArguments(uBundle);
       return;
    }
}
