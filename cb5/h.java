package cb5.h;
import qvb.f$b;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.e;
import java.lang.Object;
import java.util.List;
import java.util.Iterator;
import java.util.Set;

public final class h implements f$b	// class@00044b
{
    public final e a;

    public void h(e p0){
       this.a = p0;
    }
    public final void a(List p0){
       Iterator iterator = this.a.s.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
}
