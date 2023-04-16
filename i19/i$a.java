package i19.i$a;
import d6a.a;
import i19.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zz5.f;
import com.yxcorp.gifshow.entity.QPhoto;
import n49.s;
import com.kwai.component.photo.detail.slide.degrade.SlidePlayDegradeApi;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import androidx.fragment.app.Fragment;
import zz5.d;

public class i$a extends a	// class@00260d
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public void k1(){
       if (PatchProxy.applyVoid(null, this, i$a.class, "1")) {
          return;
       }
       f uof = new f(this.b.p);
       if (!s.t(this.b.p)) {
          uof.a(true);
       }
       i$a tb = this.b;
       i p = tb.p;
       i q = tb.q;
       RequestTiming oN_HOME_PAGE = (SlidePlayDegradeApi.PHOTO_START_UP.shouldDegrade())? RequestTiming.ON_HOME_PAGE_CREATED: RequestTiming.DEFAULT;
       d.h(p, q, null, uof, oN_HOME_PAGE);
       return;
    }
}
