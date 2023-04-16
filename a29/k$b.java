package a29.k$b;
import androidx.viewpager.widget.ViewPager$i;
import a29.k;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import qp7.t0;
import qp7.b;
import w19.e;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;

public class k$b implements ViewPager$i	// class@000038
{
    public final k b;

    public void k$b(k p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       k$b uob = k$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (this.b.H().l()) {
          if (!p0) {
             if (this.b.K()) {
                k w = this.b.w;
                if (w != null && (w.getPlayer() != null && this.b.w.getPlayer().isPlaying())) {
                   this.b.s0();
                }
             }
          }else {
             this.b.q0();
          }
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
    }
}
