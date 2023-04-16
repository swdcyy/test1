package k59.s1;
import uxc.a;
import com.yxcorp.gifshow.ad.webview.AdYodaActivity2;
import java.lang.Object;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public final class s1 implements a	// class@002b11
{
    public final AdYodaActivity2 a;

    public void s1(AdYodaActivity2 p0){
       this.a = p0;
    }
    public final boolean a(){
       s1 ta = this.a;
       if (ta.y.getActivity() != null) {
          ta.y.getActivity().finish();
       }
       return true;
    }
}
