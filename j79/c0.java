package j79.c0;
import androidx.viewpager.widget.ViewPager$i;
import j79.x;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Float;
import u79.a;
import u79.o;

public final class c0 implements ViewPager$i	// class@00276c
{
    public final x b;

    public void c0(x p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       if (PatchProxy.isSupport(c0.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, c0.class, "3")) {
          return;
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(c0.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, c0.class, "1")) {
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
       if (PatchProxy.isSupport(c0.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, c0.class, "2")) {
          return;
       }
       return;
    }
}
