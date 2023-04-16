package f09.h;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.ThanosPlayEndView;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.AdPlayEndBaseView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import gz8.a;

public final class h implements View$OnClickListener	// class@002277
{
    public final ThanosPlayEndView b;

    public void h(ThanosPlayEndView p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(AdPlayEndBaseView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(26), tb, AdPlayEndBaseView.class, "4")) {
          AdPlayEndBaseView c = tb.c;
          if (c != null) {
             c.x1(26);
          }
       }
       return;
    }
}
