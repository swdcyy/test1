package j79.v;
import androidx.viewpager.widget.ViewPager$i;
import j79.q;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Float;
import u79.a;
import u79.o;

public final class v implements ViewPager$i	// class@002796
{
    public final q b;

    public void v(q p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       if (PatchProxy.isSupport(v.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, v.class, "3")) {
          return;
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(v.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, v.class, "1")) {
          return;
       }
       if (p1 - (float)0 > 0) {
          float f = 0x3f800000;
          if (p1 - f < 0) {
             int i = p0 + 1;
             int i1 = this.b.e.j();
             if (p0 < 0 || (p0 >= i1 || (i >= 0 && i < i1))) {
                this.b.e.D(i).e(p1);
                this.b.e.D(p0).e((f - p1));
             }
          }
       }
       return;
    }
    public void onPageSelected(int p0){
       if (PatchProxy.isSupport(v.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, v.class, "2")) {
          return;
       }
       return;
    }
}
