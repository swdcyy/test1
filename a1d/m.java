package a1d.m;
import android.view.View$OnClickListener;
import a1d.r;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class m implements View$OnClickListener	// class@00003f
{
    public final r b;

    public void m(r p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, r.class, "3")) {
       }else {
          tb.getActivity().finish();
       }
       return;
    }
}
