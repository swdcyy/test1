package com.tencent.open.utils.HttpUtils$1;
import java.lang.Runnable;
import com.tencent.connect.auth.QQToken;
import android.content.Context;
import java.lang.String;
import android.os.Bundle;
import com.tencent.tauth.IRequestListener;
import java.lang.Object;
import org.json.JSONObject;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.log.SLog;
import java.lang.Exception;
import java.lang.StringBuilder;
import org.json.JSONException;
import java.io.IOException;
import com.tencent.open.utils.HttpUtils$HttpStatusException;
import com.tencent.open.utils.HttpUtils$NetworkUnavailableException;
import java.net.SocketTimeoutException;
import java.net.MalformedURLException;

public final class HttpUtils$1 implements Runnable	// class@000f6d
{
    public final QQToken a;
    public final Context b;
    public final String c;
    public final Bundle d;
    public final String e;
    public final IRequestListener f;

    public void HttpUtils$1(QQToken p0,Context p1,String p2,Bundle p3,String p4,IRequestListener p5){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public void run(){
       HttpUtils$1 tf;
       String str = "openSDK_LOG.HttpUtils";
       try{
          JSONObject jSONObject = HttpUtils.request(this.a, this.b, this.c, this.d, this.e);
          tf = this.f;
          if (tf != null) {
             tf.onComplete(jSONObject);
             SLog.i(str, "OpenApi onComplete");
          }
       }catch(java.net.MalformedURLException e1){
          tf = this.f;
          if (tf != null) {
             tf.onMalformedURLException(e1);
             SLog.e(str, "OpenApi requestAsync MalformedURLException"+e1.toString());
          }
       }catch(java.net.SocketTimeoutException e1){
          tf = this.f;
          if (tf != null) {
             tf.onSocketTimeoutException(e1);
             SLog.e(str, "OpenApi requestAsync onSocketTimeoutException"+e1.toString());
          }
       }catch(com.tencent.open.utils.HttpUtils$NetworkUnavailableException e1){
          tf = this.f;
          if (tf != null) {
             tf.onNetworkUnavailableException(e1);
             SLog.e(str, "OpenApi requestAsync onNetworkUnavailableException"+e1.toString());
          }
       }catch(com.tencent.open.utils.HttpUtils$HttpStatusException e1){
          tf = this.f;
          if (tf != null) {
             tf.onHttpStatusException(e1);
             SLog.e(str, "OpenApi requestAsync onHttpStatusException"+e1.toString());
          }
       }catch(java.io.IOException e1){
          tf = this.f;
          if (tf != null) {
             tf.onIOException(e1);
             SLog.e(str, "OpenApi requestAsync IOException"+e1.toString());
          }
       }catch(org.json.JSONException e1){
          tf = this.f;
          if (tf != null) {
             tf.onJSONException(e1);
             SLog.e(str, "OpenApi requestAsync JSONException"+e1.toString());
          }
       }catch(java.lang.Exception e1){
          tf = this.f;
          if (tf != null) {
             tf.onUnknowException(e1);
             SLog.e(str, "OpenApi requestAsync onUnknowException"+e1.toString());
          }
       }
       return;
    }
}
