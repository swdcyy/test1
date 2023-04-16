package djc.q;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.widget.DownloadForwardDialog;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import djc.e0;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.yxcorp.gifshow.util.rx.RxBus;
import mhc.j;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Throwable;

public final class q implements View$OnClickListener	// class@00221b
{
    public final DownloadForwardDialog b;

    public void q(DownloadForwardDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       DownloadForwardDialog y1;
       String str;
       q tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, DownloadForwardDialog.class, "10")) {
       }else {
          DownloadForwardDialog y = tb.y;
          if (y != null) {
             y.e();
          }
          try{
             if (tb.B != null) {
                Context context = tb.getContext();
                if (context != null) {
                   Intent intent = PatchProxy.apply(objArray, tb, DownloadForwardDialog.class, "14");
                   if (intent != PatchProxyResult.class) {
                   }else {
                      y1 = tb.v;
                      if (y1 != 3) {
                         str = (y1 != 5)? "com.tencent.mm": "com.sina.weibo";
                      }else {
                         str = "com.tencent.mobileqq";
                      }
                      intent = tb.getContext().getPackageManager().getLaunchIntentForPackage(str);
                      if (intent != null) {
                         intent.addFlags(0x10000000);
                      }
                   }
                   if (intent != null) {
                      context.startActivity(intent);
                   }
                   RxBus.f.b(new j(tb.B));
                }
             }
          }catch(java.lang.Exception e0){
             y1 = tb.y;
             if (y1 != null) {
                y1.onError(e0);
             }
          }
          tb.z = true;
          tb.dismiss();
       }
       return;
    }
}
