package ab0.l;
import android.view.View$OnClickListener;
import com.kuaishou.gifshow.smartalbum.ui.grid.b;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.String;
import fb0.l;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class l implements View$OnClickListener	// class@000042
{
    public final b b;

    public void l(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       l.f("CLICK_BACK_BUTTON");
       tb.P8();
       tb.getActivity().finish();
    }
}
