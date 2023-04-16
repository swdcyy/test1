package com.facebook.react.modules.network.NetworkingModule$a;
import okhttp3.Callback;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import java.lang.String;
import java.lang.Object;
import okhttp3.Call;
import java.io.IOException;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Throwable;
import qe.j;
import okhttp3.Response;
import okhttp3.Headers;
import com.facebook.react.bridge.WritableMap;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.lang.Integer;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import okhttp3.ResponseBody;
import okio.j;
import okio.d;
import okio.n;
import okhttp3.MediaType;
import okio.l;
import java.util.Iterator;
import java.util.List;
import com.facebook.react.modules.network.NetworkingModule$f;
import android.util.Base64;

public class NetworkingModule$a implements Callback	// class@0012c5
{
    public final int a;
    public final DeviceEventManagerModule$RCTDeviceEventEmitter b;
    public final String c;
    public final boolean d;
    public final NetworkingModule e;

    public void NetworkingModule$a(NetworkingModule p0,int p1,DeviceEventManagerModule$RCTDeviceEventEmitter p2,String p3,boolean p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void onFailure(Call p0,IOException p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NetworkingModule$a.class, "1")) {
          return;
       }
       NetworkingModule$a te = this.e;
       if (te.mShuttingDown != null) {
          return;
       }
       te.removeRequest(this.a);
       String message = (p1.getMessage() != null)? p1.getMessage(): "Error while executing request: "+p1.getClass().getSimpleName();
       j.c(this.b, this.a, message, p1);
       return;
    }
    public void onResponse(Call p0,Response p1){
       NetworkingModule$a tb;
       NetworkingModule$a ta1;
       WritableArray writableArra;
       j oj = j.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NetworkingModule$a.class, "2")) {
          return;
       }
       NetworkingModule$a te = this.e;
       if (te.mShuttingDown != null) {
          return;
       }
       te.removeRequest(this.a);
       te = this.b;
       NetworkingModule$a ta = this.a;
       int i = p1.code();
       WritableMap writableMap = NetworkingModule.translateHeaders(p1.headers());
       String str = p1.request().url().toString();
       MediaType mediaType = null;
       if (PatchProxy.isSupport(oj)) {
          Object[] objArray = new Object[]{te,Integer.valueOf(ta),Integer.valueOf(i),writableMap,str};
          if (!PatchProxy.applyVoid(objArray, mediaType, oj, "8")) {
          label_005f :
             WritableArray writableArra1 = Arguments.createArray();
             writableArra1.pushInt(ta);
             writableArra1.pushInt(i);
             writableArra1.pushMap(writableMap);
             writableArra1.pushString(str);
             if (te != null) {
                te.emit("didReceiveNetworkResponse", writableArra1);
             }
          }
       }else {
          goto label_005f ;
       }
       try{
          ResponseBody responseBody = p1.body();
          if (("gzip").equalsIgnoreCase(p1.header("Content-Encoding")) && responseBody != null) {
             j oj1 = new j(responseBody.source());
             String str1 = p1.header("Content-Type");
             if (str1 != null) {
                mediaType = MediaType.parse(str1);
             }
             responseBody = ResponseBody.create(mediaType, -1, l.d(oj1));
          }
          Iterator iterator = this.e.mResponseHandlers.iterator();
          while (true) {
             if (iterator.hasNext()) {
                NetworkingModule$f uof = iterator.next();
                if (uof.b(this.c)) {
                   j.a(this.b, this.a, uof.a(responseBody));
                   j.d(this.b, this.a);
                   return;
                }
             }else {
                String str2 = "text";
                if (this.d != null && (this.c).equals(str2)) {
                   this.e.readWithProgress(this.b, this.a, responseBody);
                   j.d(this.b, this.a);
                   return;
                }else {
                   String str3 = "";
                   if ((this.c).equals(str2)) {
                      try{
                         str3 = responseBody.string();
                      }catch(java.io.IOException e11){
                         if (!(p1.request().method()).equalsIgnoreCase("HEAD")) {
                            j.c(this.b, this.a, e11.getMessage(), e11);
                         }
                      }
                   }else if((this.c).equals("base64")){
                      str3 = Base64.encodeToString(responseBody.bytes(), 2);
                   }
                }
             }
          }
       }catch(java.io.IOException e11){
          j.c(this.b, this.a, e11.getMessage(), e11);
       }
       return;
    }
}
