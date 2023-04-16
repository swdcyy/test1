package a1d.a;
import android.view.View$OnClickListener;
import a1d.k;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;

public final class a implements View$OnClickListener	// class@000015
{
    public final k b;

    public void a(k p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, k.class, "4")) {
       }else {
          n.C(tb.getActivity());
       }
       return;
    }
}
