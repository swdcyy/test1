package ck3.n;
import im8.b;
import java.lang.Object;
import ck3.b;
import java.lang.String;
import im8.e;
import com.kuaishou.live.preview.item.presenter.n$h;
import java.util.Set;
import java.util.HashSet;

public final class n implements b	// class@000584
{
    public Set a;
    public Set b;

    public void n(){
       super();
    }
    public void a(Object p0,Object p1){
       if (e.e(p1, "LIVE_SIMPLE_PLAY_GZONE_CAMERA_SERVICE")) {
          p0.g = e.c(p1, "LIVE_SIMPLE_PLAY_GZONE_CAMERA_SERVICE");
       }
       return;
    }
    public final Set b(){
       if (this.a == null) {
          this.a = new HashSet();
       }
       return this.a;
    }
    public void c(Object p0){
       p0.g = null;
    }
    public final Set d(){
       if (this.b == null) {
          this.b = new HashSet();
       }
       return this.b;
    }
}
