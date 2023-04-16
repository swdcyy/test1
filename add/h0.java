package add.h0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import androidx.viewpager.widget.ViewPager$i;
import androidx.viewpager.widget.ViewPager;

public class h0	// class@0000e7
{
    public ViewPager a;
    public List b;

    public void h0(){
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, h0.class, "4")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       for (int i = 0; i < this.b.size(); i = i + 1) {
          this.a.removeOnPageChangeListener(this.b.get(i));
       }
       this.b.clear();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, h0.class, "2")) {
          return;
       }
       this.a = null;
       this.a();
       return;
    }
}
