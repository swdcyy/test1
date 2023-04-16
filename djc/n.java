package djc.n;
import android.content.DialogInterface$OnDismissListener;
import com.yxcorp.gifshow.share.widget.DownloadForwardDialog;
import java.lang.Object;
import android.content.DialogInterface;
import djc.e0;

public final class n implements DialogInterface$OnDismissListener	// class@00220c
{
    public final DownloadForwardDialog b;

    public void n(DownloadForwardDialog p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       n tb = this.b;
       if (tb.z == null) {
          DownloadForwardDialog y = tb.y;
          if (y != null) {
             y.b();
          }
       }
       return;
    }
}
