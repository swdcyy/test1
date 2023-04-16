package bt3.f;
import uxc.a;
import com.kuaishou.merchant.basic.MerchantYodaWebViewFragment;
import java.lang.Object;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;

public final class f implements a	// class@00043f
{
    public final MerchantYodaWebViewFragment a;

    public void f(MerchantYodaWebViewFragment p0){
       this.a = p0;
    }
    public final boolean a(){
       f ta = this.a;
       if (ta.getFragmentManager() != null) {
          ta.getFragmentManager().popBackStack();
       }
       return true;
    }
}
