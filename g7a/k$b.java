package g7a.k$b;
import androidx.viewpager.widget.ViewPager$l;
import g7a.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import java.lang.Float;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;

public final class k$b extends ViewPager$l	// class@0023e1
{
    public final k b;

    public void k$b(k p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       k$b uob = k$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "2")) {
          return;
       }
       boolean b = (!p0)? true: false;
       k.R8(this.b).N.onNext(Boolean.valueOf(b));
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(k$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, k$b.class, "1")) {
          return;
       }
       p0 = (k.W8(this.b).M(k.V8(this.b)) != p0)? 1: 0;
       float f = 0;
       float f1 = 0x3f000000;
       if (p0) {
          if (p1 - f1 > 0) {
             f = (float)2 * (p1 - f1);
          }
       }else if(p1 - f1 < 0){
          f = (float)2 * (f1 - p1);
       }
       k.R8(this.b).O.onNext(Float.valueOf(f));
       return;
    }
}
