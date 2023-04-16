package c24.x$a;
import vq5.b;
import c24.x;
import java.lang.Object;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.HashMap;
import ks3.f0;
import fq5.b;
import tkd.b;
import tkd.d;
import vs3.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.FragmentActivity;
import java.util.Map;
import androidx.fragment.app.KwaiDialogFragment;

public class x$a implements b	// class@00049f
{
    public final x a;

    public void x$a(x p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return true;
    }
    public void b(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x$a.class, "1")) {
          return;
       }
       x$a ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, x.class, "4") || (p0 != null && !TextUtils.isEmpty(p0.getQuery()))) {
          HashMap hashMap = new HashMap();
          hashMap.put("liveId", ta.q.J4());
          hashMap.put("pageId", ta.q.I4());
          hashMap.put("routerToken", ta.r.s5());
          d.a(0x7074b578).nl(ta.getActivity(), p0.toString(), hashMap);
       }
    label_0064 :
       return;
    }
}
