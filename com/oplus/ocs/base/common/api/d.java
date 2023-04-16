package com.oplus.ocs.base.common.api.d;
import com.oplus.ocs.base.common.a;
import android.os.Looper;
import com.oplus.ocs.base.common.api.c;
import android.os.Message;
import java.lang.String;
import com.oplus.ocs.base.utils.a;
import com.oplus.ocs.base.common.ConnectionResult;
import com.oplus.ocs.base.common.api.OnConnectionFailedListener;
import android.os.Handler;
import com.oplus.ocs.base.common.api.OnConnectionSucceedListener;

public class d extends a	// class@000adf
{
    public OnConnectionSucceedListener a;
    public OnConnectionFailedListener b;
    public final String c;
    public c d;

    public void d(Looper p0,c p1){
       super(p0);
       this.c = "d";
       this.d = p1;
    }
    public void handleMessage(Message p0){
       Message what = p0.what;
       a.a(this.c, ("business handler what ").concat(String.valueOf(what)));
       if (what != 100) {
          if (what == 101) {
             p0 = p0.arg1;
             d tb = this.b;
             if (tb != null) {
                tb.onConnectionFailed(new ConnectionResult(p0));
                return;
             }else {
                p0 = Message.obtain();
                p0.what = 5;
                this.d.sendMessage(p0);
             }
          }
          return;
       }else {
          d ta = this.a;
          if (ta != null) {
             ta.onConnectionSucceed();
          }
          ta = Message.obtain();
          ta.what = 5;
          this.d.sendMessage(ta);
          return;
       }
    }
}
