package d59.n;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class n implements View$OnClickListener	// class@002054
{
    public final AdMKPageLoadPresenter b;

    public void n(AdMKPageLoadPresenter p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       this.b.V8();
       return;
    }
}
