package etb.f;
import android.view.View$OnClickListener;
import etb.n;
import java.lang.Object;
import android.view.View;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class f implements View$OnClickListener	// class@0027f3
{
    public final n b;

    public void f(n p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       f tb = this.b;
       if (tb.getActivity() != null) {
          tb.getActivity().onBackPressed();
       }
       return;
    }
}
