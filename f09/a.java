package f09.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.ThanosPlayEndView;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.AdPlayEndBaseView;

public final class a implements View$OnClickListener	// class@002270
{
    public final ThanosPlayEndView b;

    public void a(ThanosPlayEndView p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       this.b.d(15);
    }
}
