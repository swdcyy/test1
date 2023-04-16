package cb5.m;
import erd.g;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.e;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Iterator;
import java.util.Set;
import gka.o;

public final class m implements g	// class@000450
{
    public final e b;

    public void m(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          p0 = tb.u.iterator();
          while (p0.hasNext()) {
             p0.next().u();
          }
       }else {
          p0 = tb.u.iterator();
          while (p0.hasNext()) {
             p0.next().c0();
          }
       }
       return;
    }
}
