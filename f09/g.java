package f09.g;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.ThanosPlayEndView;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.AdPlayEndBaseView;

public final class g implements View$OnClickListener	// class@002276
{
    public final ThanosPlayEndView b;

    public void g(ThanosPlayEndView p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       this.b.e(1);
    }
}
