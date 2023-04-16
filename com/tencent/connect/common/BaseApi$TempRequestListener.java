package com.tencent.connect.common.BaseApi$TempRequestListener;
import com.tencent.tauth.IRequestListener;
import com.tencent.connect.common.BaseApi;
import com.tencent.tauth.IUiListener;
import java.lang.Object;
import com.tencent.connect.common.BaseApi$TempRequestListener$1;
import android.content.Context;
import com.tencent.open.utils.f;
import android.os.Looper;
import org.json.JSONObject;
import android.os.Message;
import android.os.Handler;
import com.tencent.open.utils.HttpUtils$HttpStatusException;
import java.lang.String;
import java.lang.Exception;
import java.io.IOException;
import org.json.JSONException;
import java.net.MalformedURLException;
import com.tencent.open.utils.HttpUtils$NetworkUnavailableException;
import java.net.SocketTimeoutException;

public class BaseApi$TempRequestListener implements IRequestListener	// class@000e44
{
    public final BaseApi a;
    public final IUiListener b;
    public final Handler c;

    public void BaseApi$TempRequestListener(BaseApi p0,IUiListener p1){
       this.a = p0;
       super();
       this.b = p1;
       this.c = new BaseApi$TempRequestListener$1(this, f.a().getMainLooper(), p0);
    }
    public static IUiListener a(BaseApi$TempRequestListener p0){
       return p0.b;
    }
    public void onComplete(JSONObject p0){
       Message message = this.c.obtainMessage();
       message.obj = p0;
       message.what = 0;
       this.c.sendMessage(message);
    }
    public void onHttpStatusException(HttpUtils$HttpStatusException p0){
       Message message = this.c.obtainMessage();
       message.obj = p0.getMessage();
       message.what = -9;
       this.c.sendMessage(message);
    }
    public void onIOException(IOException p0){
       Message message = this.c.obtainMessage();
       message.obj = p0.getMessage();
       message.what = -2;
       this.c.sendMessage(message);
    }
    public void onJSONException(JSONException p0){
       Message message = this.c.obtainMessage();
       message.obj = p0.getMessage();
       message.what = -4;
       this.c.sendMessage(message);
    }
    public void onMalformedURLException(MalformedURLException p0){
       Message message = this.c.obtainMessage();
       message.obj = p0.getMessage();
       message.what = -3;
       this.c.sendMessage(message);
    }
    public void onNetworkUnavailableException(HttpUtils$NetworkUnavailableException p0){
       Message message = this.c.obtainMessage();
       message.obj = p0.getMessage();
       message.what = -10;
       this.c.sendMessage(message);
    }
    public void onSocketTimeoutException(SocketTimeoutException p0){
       Message message = this.c.obtainMessage();
       message.obj = p0.getMessage();
       message.what = -8;
       this.c.sendMessage(message);
    }
    public void onUnknowException(Exception p0){
       Message message = this.c.obtainMessage();
       message.obj = p0.getMessage();
       message.what = -6;
       this.c.sendMessage(message);
    }
}
