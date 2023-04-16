package d59.m;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a59.a;
import a59.a$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class m implements View$OnClickListener	// class@002053
{
    public final AdMKPageLoadPresenter b;

    public void m(AdMKPageLoadPresenter p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       m tb = this.b;
       AdMKPageLoadPresenter j = tb.J;
       if (j != null) {
          a$a.a(j, null, null, 2, null);
          return;
       }else {
          Activity activity = tb.getActivity();
          if (activity != null) {
             activity.onBackPressed();
          }
          return;
       }
    }
}
