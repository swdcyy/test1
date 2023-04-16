package djc.p;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.widget.DownloadForwardDialog;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import vu5.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.User;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import djc.e0;

public final class p implements View$OnClickListener	// class@002218
{
    public final DownloadForwardDialog b;

    public void p(DownloadForwardDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, DownloadForwardDialog.class, "11")) {
       }else {
          ProfileStartParam profileStart = ProfileStartParam.l(tb.x);
          profileStart.r(p0);
          d.a(-1718536792).Y7(tb.getActivity(), profileStart);
          DownloadForwardDialog y = tb.y;
          if (y != null) {
             y.a();
          }
          tb.z = true;
          tb.dismiss();
       }
       return;
    }
}
