package k59.k2;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.ad.webview.RiskTipPresenter;
import com.yxcorp.gifshow.ad.detail.view.RiskTipView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class k2 implements View$OnClickListener	// class@002aef
{
    public final RiskTipPresenter b;
    public final RiskTipView c;

    public void k2(RiskTipPresenter p0,RiskTipView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k2.class, "1")) {
          return;
       }
       this.c.a();
       this.b.S8(1);
       return;
    }
}
