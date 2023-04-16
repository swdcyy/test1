package kj9.a;
import erd.g;
import kj9.b;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;

public final class a implements g	// class@002ca3
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, b.class, "4")) {
       }else if(tb.getActivity() == null){
          p0 = tb.s.getLayoutParams();
          p0.height = tb.P8();
          tb.s.setLayoutParams(p0);
       }
       return;
    }
}
