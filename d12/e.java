package d12.e;
import im8.b;
import java.lang.Object;
import d12.d;
import java.lang.String;
import im8.e;
import g12.a;
import java.lang.IllegalArgumentException;
import g12.b;
import java.util.Set;
import java.util.HashSet;

public final class e implements b	// class@002419
{
    public Set a;
    public Set b;

    public void e(){
       super();
    }
    public void a(Object p0,Object p1){
       String str = "live_root_view_swipe_service";
       if (e.e(p1, str)) {
          a uoa = e.c(p1, str);
          if (uoa != null) {
             p0.d = uoa;
          }else {
             throw new IllegalArgumentException("mLiveRootViewSwipeService 不能为空");
          }
       }
       if (e.e(p1, "live_square_side_bar_layout_service")) {
          p1 = e.c(p1, "live_square_side_bar_layout_service");
          if (p1 != null) {
             p0.e = p1;
          }else {
             throw new IllegalArgumentException("mLiveSquareSideBarLayoutService 不能为空");
          }
       }
       return;
    }
    public final Set b(){
       if (this.a == null) {
          HashSet hashSet = new HashSet();
          this.a = hashSet;
          hashSet.add("live_root_view_swipe_service");
          this.a.add("live_square_side_bar_layout_service");
       }
       return this.a;
    }
    public void c(Object p0){
       p0.d = null;
       p0.e = null;
    }
    public final Set d(){
       if (this.b == null) {
          this.b = new HashSet();
       }
       return this.b;
    }
}
