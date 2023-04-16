package f51.d;
import b51.b;
import hw6.a;
import com.kuaishou.live.basic.liveslide.view.LiveSlideViewPager;
import com.kuaishou.live.basic.liveslide.a;
import c51.d;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import cw6.b;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import f51.b;
import b51.a;

public class d implements b, a	// class@0022bb
{
    public final LiveSlideViewPager b;
    public final a c;
    public final d d;
    public boolean e;
    public String f;
    public b g;

    public void d(LiveSlideViewPager p0,a p1,d p2){
       super();
       this.f = "";
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void N(List p0,int p1,int p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, d.class, "8")) {
          return;
       }
       this.a();
       return;
    }
    public void P(List p0,int p1,int p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, d.class, "7")) {
          return;
       }
       this.a();
       return;
    }
    public void R(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "6")) {
          return;
       }
       this.a();
       return;
    }
    public void Y(List p0,int p1,int p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, d.class, "9")) {
          return;
       }
       this.a();
       return;
    }
    public final void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "5")) {
          return;
       }
       d tg = this.g;
       if (tg == null) {
          return;
       }
       d tc = this.c;
       Objects.requireNonNull(tc);
       Object obj = PatchProxy.apply(objArray, tc, a.class, "11");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): tc.l0(tc.n.getCurrentItem());
       int i1 = 1;
       if (i != (this.d.size() - i1) || (!this.d.j0() || this.e == null)) {
          i1 = false;
       }
       tg.setEnableLoadMore(i1);
       return;
    }
    public void d(int p0){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, d.class, "4")) {
          return;
       }
       this.a();
       return;
    }
    public void onPageScrollStateChanged(int p0){
       a.a(this, p0);
    }
    public void onPageScrolled(int p0,float p1,int p2){
       a.b(this, p0, p1, p2);
    }
    public void onPageSelected(int p0){
       a.c(this, p0);
    }
}
