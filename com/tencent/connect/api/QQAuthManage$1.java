package com.tencent.connect.api.QQAuthManage$1;
import com.tencent.tauth.IUiListener;
import com.tencent.connect.api.QQAuthManage;
import android.app.Activity;
import com.tencent.open.apireq.IApiCallback;
import com.tencent.connect.api.QQAuthManage$Resp;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.String;
import com.tencent.open.log.SLog;
import com.tencent.open.apireq.BaseResp;
import com.tencent.tauth.UiError;
import java.lang.StringBuilder;

public class QQAuthManage$1 implements IUiListener	// class@000e13
{
    public final Activity a;
    public final IApiCallback b;
    public final QQAuthManage$Resp c;
    public final QQAuthManage d;

    public void QQAuthManage$1(QQAuthManage p0,Activity p1,IApiCallback p2,QQAuthManage$Resp p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onCancel(){
    }
    public void onComplete(Object p0){
       if (p0 instanceof JSONObject) {
          if (!p0.optInt("ret", -1)) {
             QQAuthManage.a(this.d, this.a, this.b);
          }else {
             this.c.setCode(-2001);
             this.b.onResp(this.c);
          }
       }
       return;
    }
    public void onError(UiError p0){
       this.c.setCode(p0.errorCode);
       this.c.setErrorMsg(p0.errorMessage);
       this.b.onResp(this.c);
    }
    public void onWarning(int p0){
    }
}
