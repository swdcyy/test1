package androidx.appcompat.app.AlertController$g;
import android.os.Handler;
import android.content.DialogInterface;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.os.Message;
import android.content.DialogInterface$OnClickListener;

public final class AlertController$g extends Handler	// class@000566
{
    public WeakReference a;

    public void AlertController$g(DialogInterface p0){
       super();
       this.a = new WeakReference(p0);
    }
    public void handleMessage(Message p0){
       Message what = p0.what;
       if (what != -3 && (what != -2 && what != -1)) {
          if (what == 1) {
             p0.obj.dismiss();
          }
       }else {
          p0.obj.onClick(this.a.get(), p0.what);
       }
       return;
    }
}
