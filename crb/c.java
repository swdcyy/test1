package crb.c;
import hka.b;
import crb.d;
import java.lang.Object;
import android.content.res.Configuration;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.b5;
import wq6.f;

public final class c implements b	// class@00239d
{
    public final d a;

    public void c(d p0){
       this.a = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       boolean b;
       c ta = this.a;
       if (b5.a(ta.getActivity())) {
       }else if(p0.orientation == 2){
          b = true;
       }else {
          b = false;
       }
       ta.q.E0(b);
       return;
    }
}
