package bt3.g;
import uxc.b;
import com.kuaishou.merchant.basic.MerchantYodaWebViewFragment;
import java.lang.Object;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;

public final class g implements b	// class@000440
{
    public final MerchantYodaWebViewFragment a;

    public void g(MerchantYodaWebViewFragment p0){
       this.a = p0;
    }
    public final boolean a(){
       g ta = this.a;
       if (ta.getFragmentManager() != null) {
          ta.getFragmentManager().popBackStack();
       }
       return true;
    }
}
