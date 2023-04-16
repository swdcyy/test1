package androidx.appcompat.app.AlertController$a;
import android.view.View$OnClickListener;
import androidx.appcompat.app.AlertController;
import java.lang.Object;
import android.view.View;
import android.os.Message;
import android.os.Handler;

public class AlertController$a implements View$OnClickListener	// class@00055b
{
    public final AlertController b;

    public void AlertController$a(AlertController p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       Message message;
       AlertController$a tb = this.b;
       if (p0 == tb.o) {
          AlertController q = tb.q;
          if (q != null) {
             message = Message.obtain(q);
          }else if(p0 == tb.s){
             q = tb.u;
             if (q != null) {
                message = Message.obtain(q);
             }
          }
          if (p0 == tb.w) {
             AlertController y = tb.y;
             if (y != null) {
                message = Message.obtain(y);
             }
          }
          message = null;
       }else {
          goto label_000f ;
       }
       if (message != null) {
          message.sendToTarget();
       }
       AlertController$a tb1 = this.b;
       tb1.R.obtainMessage(1, tb1.b).sendToTarget();
       return;
    }
}
