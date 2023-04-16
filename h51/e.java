package h51.e;
import c51.b;
import b51.b;
import com.kuaishou.live.basic.liveslide.view.LiveSlideViewPager;
import c51.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import h51.a;
import c51.a;
import java.lang.Throwable;
import com.kwai.library.groot.framework.viewpager.GrootTouchViewPager;
import java.lang.Integer;
import com.kwai.library.groot.framework.viewpager.GrootViewPager;
import b51.a;
import java.util.List;

public class e implements b, b	// class@002625
{
    public final LiveSlideViewPager b;
    public final d c;
    public boolean d;
    public a e;

    public void e(LiveSlideViewPager p0,d p1){
       super();
       this.d = true;
       this.b = p0;
       this.c = p1;
    }
    public void S(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "5")) {
          return;
       }
       if (!p0) {
          this.e.setRefreshing(false);
       }
       return;
    }
    public void U(boolean p0){
       a.d(this, p0);
    }
    public void X(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, e.class, "7")) {
          return;
       }
       if (!p0) {
          this.e.setRefreshing(false);
       }
       return;
    }
    public final void a(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "3")) {
          return;
       }
       uoe = this.b;
       p0 = (!p0 && this.d != null)? true: false;
       uoe.setEnablePullToRefresh(p0);
       return;
    }
    public void c0(){
       a.a(this);
    }
    public void d(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "4")) {
          return;
       }
       uoe = this.e;
       boolean b = (p0 == this.b.getFirstValidItemPosition())? true: false;
       uoe.setEnabled(b);
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
    public void w(boolean p0,List p1){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, e.class, "6")) {
          return;
       }
       this.a(p1.isEmpty());
       return;
    }
}
