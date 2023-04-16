package com.tencent.connect.common.BaseApi$TempRequestListener$1;
import android.os.Handler;
import com.tencent.connect.common.BaseApi$TempRequestListener;
import android.os.Looper;
import com.tencent.connect.common.BaseApi;
import android.os.Message;
import com.tencent.tauth.IUiListener;
import java.lang.Object;
import com.tencent.tauth.UiError;
import java.lang.String;

public class BaseApi$TempRequestListener$1 extends Handler	// class@000e43
{
    public final BaseApi a;
    public final BaseApi$TempRequestListener b;

    public void BaseApi$TempRequestListener$1(BaseApi$TempRequestListener p0,Looper p1,BaseApi p2){
       this.b = p0;
       this.a = p2;
       super(p1);
    }
    public void handleMessage(Message p0){
       if (p0.what == null) {
          BaseApi$TempRequestListener.a(this.b).onComplete(p0.obj);
       }else {
          BaseApi$TempRequestListener.a(this.b).onError(new UiError(p0.what, p0.obj, null));
       }
       return;
    }
}
