package aq4.a;
import android.view.View$OnClickListener;
import aq4.b;
import java.lang.Object;
import android.view.View;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import rp4.b;

public final class a implements View$OnClickListener	// class@0002bf
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       tb.getActivity().onBackPressed();
       if (tb.r == 2) {
          b.g("MOOD_EDIT_BACK", "EDIT_MOOD_PHOTO", "");
       }
       return;
    }
}
