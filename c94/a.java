package c94.a;
import java.lang.Runnable;
import com.kuaishou.merchant.marketing.shop.auction.setting.AuctionSettingFragment;
import java.lang.Object;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class a implements Runnable	// class@0004cf
{
    public final AuctionSettingFragment b;

    public void a(AuctionSettingFragment p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       tb.p.setText(R.string.arg_RES_7f10027e);
       if (!tb.isAdded() || (tb.getActivity() != null && tb.getChildFragmentManager() != null)) {
          tb.getChildFragmentManager().beginTransaction().u(tb.r).l();
          Object[] objArray = new Object[]{tb.q};
          tb.o.i(objArray);
       }
    label_003b :
       return;
    }
}
