package djc.h1;
import android.content.DialogInterface$OnDismissListener;
import com.yxcorp.gifshow.share.widget.KwaiUploadShareDialog;
import java.lang.Object;
import android.content.DialogInterface;
import djc.e0;

public final class h1 implements DialogInterface$OnDismissListener	// class@0021f8
{
    public final KwaiUploadShareDialog b;

    public void h1(KwaiUploadShareDialog p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       h1 tb = this.b;
       if (tb.u == null) {
          KwaiUploadShareDialog t = tb.t;
          if (t != null) {
             t.b();
          }
       }
       return;
    }
}
