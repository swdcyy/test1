package fia.y$a;
import androidx.viewpager.widget.ViewPager$l;
import fia.y;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import cia.w;
import gia.a;
import android.view.View;

public class y$a extends ViewPager$l	// class@00293b
{
    public final y b;

    public void y$a(y p0){
       this.b = p0;
       super();
    }
    public void onPageScrolled(int p0,float p1,int p2){
       y$a tb;
       if (PatchProxy.isSupport(y$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, y$a.class, "1")) {
          return;
       }
       y s = this.b.s;
       if (s != null && s.O() != null) {
          boolean b = a.a(this.b.s.O(), p0);
          p0++;
          if (b != a.a(this.b.s.O(), p0)) {
             if (!b) {
                tb = this.b;
                tb.p.setTranslationY(((0x3f800000 - p1) * (float)tb.q));
             }else {
                tb = this.b;
                tb.p.setTranslationY((p1 * (float)tb.q));
             }
          }
       }
       return;
    }
    public void onPageSelected(int p0){
       y$a uoa = y$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       y s = this.b.s;
       if (s != null && s.O() != null) {
          if (!a.a(this.b.s.O(), p0)) {
             y$a tb = this.b;
             tb.p.setTranslationY((float)tb.q);
          }else if(!this.b.s.O().b1()){
             this.b.p.setTranslationY(0);
          }
       }
       return;
    }
}
