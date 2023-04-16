package cb5.y;
import erd.g;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.g;
import java.lang.Object;
import eda.f;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.res.Configuration;
import lnc.d2;
import androidx.constraintlayout.widget.Group;

public final class y implements g	// class@000461
{
    public final g b;

    public void y(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       y tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, g.class, "15")) {
       }else if(tb.F == null){
          if (d2.m(p0.a())) {
             tb.F.setVisibility(0);
          }else {
             tb.F.setVisibility(8);
          }
       }
       return;
    }
}
