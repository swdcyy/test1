package cb5.f;
import z1.a;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.a;
import java.lang.Object;
import java.lang.Integer;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.b5;
import db5.e;
import android.view.View;

public final class f implements a	// class@000449
{
    public final a a;

    public void f(a p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       f ta = this.a;
       if (!b5.a(ta.getActivity())) {
       }else if(e.b(ta.getActivity()) || e.a()){
          ta.V8(ta.r, ta.q);
       }else {
          ta.V8((ta.r + p0.intValue()), ta.q);
       }
       return;
    }
}
