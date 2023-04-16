package a1d.u0;
import hka.b;
import a1d.b1;
import java.lang.Object;
import android.content.res.Configuration;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.b5;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import a1d.y0;
import lnc.c3$a;
import lnc.c3;

public final class u0 implements b	// class@000057
{
    public final b1 a;

    public void u0(b1 p0){
       this.a = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       u0 ta = this.a;
       if (b5.a(ta.getActivity())) {
       }else if(p0.orientation == ta.C){
          c3.c(ta.x.getAdapter(), y0.a);
       }
       return;
    }
}
