package c1a.a;
import yw6.j;
import java.util.List;
import qvb.i;
import ok.o;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import yw6.g;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.entity.QPhoto;
import fw6.b;

public class a extends j	// class@000539
{
    public final String m;
    public final SlidePlayViewModel n;

    public void a(List p0,i p1,o p2,SlidePlayViewModel p3){
       super(p0, p1, p2);
       this.m = "KwaiGrootPoiDataSource";
       this.n = p3;
    }
    public void G0(boolean p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p0 && this.n != null) {
          g tg = this.g;
          if (tg != null && !q.f(tg.getItems())) {
             this.n.x(this.g.getItems(), this.n.getCurrentPhoto(), false, "KwaiGrootPoiDataSource");
          label_0049 :
             return;
          }
       }
       this.b(this.H0());
       goto label_0049 ;
    }
}
