package e8a.q$a;
import androidx.viewpager.widget.ViewPager$i;
import e8a.q;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import h3.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import cw6.b;

public class q$a implements ViewPager$i	// class@0020ce
{
    public final q b;

    public void q$a(q p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       boolean b;
       q$a uoa = q$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       Objects.requireNonNull(uoa);
       q oq = q.class;
       if (PatchProxy.isSupport(oq)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), uoa, oq, "6");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
          label_0037 :
             a uoa1 = uoa.s.C0();
             b = (uoa1 != null && uoa1.E(p0) == 4)? true: false;
          }
       }else {
          goto label_0037 ;
       }
       if (b) {
          this.b.R8();
          this.b.P8(p0);
       }
       return;
    }
}
