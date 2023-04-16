package mg.y;
import android.content.DialogInterface$OnDismissListener;
import mg.z;
import java.lang.Object;
import android.content.DialogInterface;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;
import f55.g;

public final class y implements DialogInterface$OnDismissListener	// class@002681
{
    public final z b;

    public void y(z p0){
       this.b = p0;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       z d = this.b.d;
       if (d != null) {
          d.onSuccess(new JsSuccessResult());
       }
       return;
    }
}
