package b5a.d;
import erd.g;
import b5a.h;
import java.lang.Object;
import java.lang.Long;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class d implements g	// class@000368
{
    public final h b;

    public void d(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       if (tb.getActivity() != null) {
          tb.getActivity().finish();
       }
       return;
    }
}
