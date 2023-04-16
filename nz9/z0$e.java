package nz9.z0$e;
import androidx.viewpager.widget.ViewPager$i;
import nz9.z0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import qp7.x0;
import os7.a;
import java.lang.Boolean;

public class z0$e implements ViewPager$i	// class@00325c
{
    public final z0 b;

    public void z0$e(z0 p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       z0$e uoe = z0$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "1")) {
          return;
       }
       if (this.b.H().l()) {
          if (!p0) {
             if (this.b.K()) {
                this.b.E().u(Boolean.TRUE);
             }
          }else {
             this.b.E().u(Boolean.FALSE);
          }
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
    }
}
