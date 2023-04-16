package a48.f;
import android.view.View$OnClickListener;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import com.mini.about.ui.AboutMainInfoFragment;
import n88.b;
import com.mini.host.HostJumpToPageManager;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import android.net.Uri$Builder;
import com.mini.host.HostJumpPageParam;

public final class f implements View$OnClickListener	// class@00002a
{
    public final String b;
    public final int c;

    public void f(String p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       f tb = this.b;
       f tc = this.c;
       HostJumpToPageManager hostJumpToPa = b.w0().w();
       if (hostJumpToPa != null) {
          String miniPrivacyB = hostJumpToPa.getMiniPrivacyBaseScheme();
          if (!TextUtils.isEmpty(miniPrivacyB)) {
             hostJumpToPa.jumpToPageInMainProc(new HostJumpPageParam(Uri.parse(miniPrivacyB).buildUpon().appendQueryParameter("appId", tb).build().toString(), tb, tc));
          }
       }
       return;
    }
}
