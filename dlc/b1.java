package dlc.b1;
import android.view.View$OnClickListener;
import dlc.d1;
import java.lang.Object;
import android.view.View;
import k2b.u1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class b1 implements View$OnClickListener	// class@002238
{
    public final d1 b;

    public void b1(d1 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b1 tb = this.b;
       if (!tb.p.getAlpha() - 0x3f800000) {
          u1.K0(10);
          tb.getActivity().onBackPressed();
       }
       return;
    }
}
