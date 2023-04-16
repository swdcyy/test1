package k59.o1;
import uxc.a;
import com.yxcorp.gifshow.ad.webview.AdYodaActivity;
import java.lang.Object;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public final class o1 implements a	// class@002afe
{
    public final AdYodaActivity a;

    public void o1(AdYodaActivity p0){
       this.a = p0;
    }
    public final boolean a(){
       o1 ta = this.a;
       if (ta.y.getActivity() != null) {
          ta.y.getActivity().finish();
       }
       return true;
    }
}
