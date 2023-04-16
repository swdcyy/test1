package ly9.e;
import java.lang.Runnable;
import ly9.f;
import java.lang.Object;
import java.util.List;
import qvb.n0;
import com.yxcorp.gifshow.detail.common.information.marquee.model.e;
import qvb.a;

public final class e implements Runnable	// class@002eb7
{
    public final f b;

    public void e(f p0){
       this.b = p0;
    }
    public final void run(){
       e tb = this.b;
       tb.h = 0;
       List list = tb.c.d1();
       f j = tb.j;
       if (list.size() || j.size()) {
          tb.c.l0(e.c(list, j));
       }
       return;
    }
}
