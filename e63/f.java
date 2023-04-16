package e63.f;
import i63.a;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.gzone.v2.profile.LiveGzoneAnchorProfileTabFragment;
import androidx.fragment.app.c;
import i63.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fq5.b;
import com.kwai.live.gzone.tab.page.a;
import lnc.a1;
import android.view.View;

public class f extends a	// class@00264d
{

    public void f(){
       super();
    }
    public Fragment C(){
       Object obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveGzoneAnchorProfileTabFragment();
    }
    public c D(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.b().getChildFragmentManager();
    }
    public String E(){
       return "LiveGzoneAnchorProfileTabPage";
    }
    public int m(){
       return 0x7f0d04ac;
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       super.onCreate();
       this.c.setBackgroundColor(a1.a(R.color.arg_RES_7f061403));
       return;
    }
}
