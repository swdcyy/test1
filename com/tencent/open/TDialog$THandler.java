package com.tencent.open.TDialog$THandler;
import android.os.Handler;
import com.tencent.open.TDialog;
import com.tencent.open.TDialog$OnTimeListener;
import android.os.Looper;
import android.os.Message;
import java.lang.StringBuilder;
import java.lang.String;
import com.tencent.open.log.SLog;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.content.Context;

public class TDialog$THandler extends Handler	// class@000f37
{
    public final TDialog a;
    public TDialog$OnTimeListener b;

    public void TDialog$THandler(TDialog p0,TDialog$OnTimeListener p1,Looper p2){
       this.a = p0;
       super(p2);
       this.b = p1;
    }
    public void handleMessage(Message p0){
       SLog.d("openSDK_LOG.TDialog", "--handleMessage--msg.WHAT = "+p0.what);
       Message what = p0.what;
       if (what != 1) {
          if (what != 2) {
             if (what != 3) {
                if (what == 5 && (TDialog.a(this.a) != null && TDialog.a(this.a).get() != null)) {
                   TDialog.b(TDialog.a(this.a).get(), p0.obj);
                }
             }else if(TDialog.a(this.a) != null && TDialog.a(this.a).get() != null){
                TDialog.a(TDialog.a(this.a).get(), p0.obj);
             }
          }else {
             this.b.onCancel();
          }
       }else {
          TDialog$OnTimeListener.a(this.b, p0.obj);
       }
       return;
    }
}
