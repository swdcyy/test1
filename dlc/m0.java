package dlc.m0;
import erd.g;
import dlc.o0;
import java.lang.Object;
import xkc.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.photo.detail.slide.widget.SlidePlayTrendingTopLayout$a;
import com.kwai.component.photo.detail.slide.widget.SlidePlayTrendingTopLayout;
import java.lang.Integer;

public final class m0 implements g	// class@00225b
{
    public final o0 b;

    public void m0(o0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, o0.class, "5")) {
       }else if(p0 != null){
          b a = p0.a;
          if (a >= null && a < p0.b) {
             tb.q.getAdapter().m(Integer.valueOf((p0.a + 1)), Integer.valueOf(p0.b));
          }
       }
       tb.q.getAdapter().m(null, null);
       return;
    }
}
