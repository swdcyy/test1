package com.tencent.open.TDialog$JsListener;
import com.tencent.open.a$b;
import com.tencent.open.TDialog;
import com.tencent.open.TDialog$1;
import java.lang.String;
import com.tencent.open.log.SLog;
import java.lang.StringBuilder;
import android.os.Handler;
import java.lang.Object;
import android.os.Message;
import android.app.Dialog;

public class TDialog$JsListener extends a$b	// class@000f35
{
    public final TDialog a;

    public void TDialog$JsListener(TDialog p0){
       this.a = p0;
       super();
    }
    public void TDialog$JsListener(TDialog p0,TDialog$1 p1){
       super(p0);
    }
    public void onAddShare(String p0){
       SLog.d("openSDK_LOG.TDialog", "JsListener onAddShare");
       this.onComplete(p0);
    }
    public void onCancel(String p0){
       SLog.e("openSDK_LOG.TDialog", "JsListener onCancel --msg = "+p0);
       TDialog.b(this.a).obtainMessage(2, p0).sendToTarget();
       this.a.dismiss();
    }
    public void onCancelAddShare(String p0){
       SLog.e("openSDK_LOG.TDialog", "JsListener onCancelAddShare"+p0);
       this.onCancel("cancel");
    }
    public void onCancelInvite(){
       SLog.e("openSDK_LOG.TDialog", "JsListener onCancelInvite");
       this.onCancel("");
    }
    public void onCancelLogin(){
       this.onCancel("");
    }
    public void onComplete(String p0){
       TDialog.b(this.a).obtainMessage(1, p0).sendToTarget();
       SLog.e("openSDK_LOG.TDialog", "JsListener onComplete"+p0);
       this.a.dismiss();
    }
    public void onInvite(String p0){
       this.onComplete(p0);
    }
    public void onLoad(String p0){
       TDialog.b(this.a).obtainMessage(4, p0).sendToTarget();
    }
    public void showMsg(String p0){
       TDialog.b(this.a).obtainMessage(3, p0).sendToTarget();
    }
}
