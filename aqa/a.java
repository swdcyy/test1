package aqa.a;
import erd.g;
import aqa.b;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class a implements g	// class@0002b6
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.getActivity().setRequestedOrientation(1);
       }else {
          tb.getActivity().setRequestedOrientation(tb.q);
       }
       return;
    }
}
