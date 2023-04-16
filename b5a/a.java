package b5a.a;
import android.view.View$OnClickListener;
import b5a.b;
import java.lang.Object;
import android.view.View;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class a implements View$OnClickListener	// class@000365
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       this.b.getActivity().onBackPressed();
    }
}
