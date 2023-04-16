package fgd.b;
import android.view.View$OnClickListener;
import fgd.k;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class b implements View$OnClickListener	// class@000e21
{
    public final k b;

    public void b(k p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, k.class, "9")) {
       }else if(tb.getActivity() == null){
          tb.getActivity().finish();
       }
       return;
    }
}
