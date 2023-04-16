package com.frog.engine.internal.BaseCommandHandler$m$a;
import com.frog.engine.network.upload.FrogUploadResultCallBack;
import com.frog.engine.internal.BaseCommandHandler$m;
import com.frog.engine.FrogCommandResponseListener;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.frog.engine.jsobject.FrogJSObject;
import org.json.JSONObject;
import com.frog.engine.internal.BaseCommandHandler;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Exception;
import com.frog.engine.internal.FrogLog;
import com.frog.engine.FrogCallGameListener;
import com.frog.engine.internal.CommandExpandFuncListener;

public class BaseCommandHandler$m$a implements FrogUploadResultCallBack	// class@00151e
{
    public final FrogCommandResponseListener a;
    public final int[] b;
    public final String c;
    public final BaseCommandHandler$m d;

    public void BaseCommandHandler$m$a(BaseCommandHandler$m p0,FrogCommandResponseListener p1,int[] p2,String p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onFail(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseCommandHandler$m$a.class, "2")) {
          return;
       }
       if (this.a != null) {
          FrogJSObject uFrogJSObjec = new FrogJSObject();
          FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(-1, p0, null), uFrogJSObjec);
          this.a.onResponse(uFrogJSObjec);
       }
       return;
    }
    public void onProcessUpdate(int p0,long p1,long p2){
       JSONObject jSONObject;
       if (PatchProxy.isSupport(BaseCommandHandler$m$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, BaseCommandHandler$m$a.class, "3")) {
          return;
       }
       if (this.d.a.mSendListener != null) {
          BaseCommandHandler$m$a tb = this.b;
          int i = 0;
          if (tb[i] != p0 || p0 >= 100) {
             tb[i] = p0;
             try{
                jSONObject = new JSONObject();
                jSONObject.put("progress", p0);
                jSONObject.put("totalBytesSent", p1);
                jSONObject.put("totalBytesExpectedToSend", p2);
                jSONObject.put("seqNO", this.c);
             }catch(java.lang.Exception e8){
                FrogLog.e("BaseCommandHandler", e8);
             }
             FrogJSObject uFrogJSObjec = new FrogJSObject();
             FrogJSObject.fromJSObject(jSONObject, uFrogJSObjec);
             this.d.a.mSendListener.sendCommandToNativeGame("ks.http.onProgressUpdate", uFrogJSObjec, null);
          }
       }
       return;
    }
    public void onResult(int p0,String p1){
       JSONObject jSONObject;
       BaseCommandHandler$m$a om$a = BaseCommandHandler$m$a.class;
       if (PatchProxy.isSupport(om$a) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, om$a, "1")) {
          return;
       }
       try{
          jSONObject = new JSONObject();
          jSONObject.put("data", p1);
          jSONObject.put("statusCode", p0);
       }catch(java.lang.Exception e4){
          FrogLog.e("BaseCommandHandler", e4);
       }
       if (this.a != null) {
          FrogJSObject uFrogJSObjec = new FrogJSObject();
          FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(1, "", jSONObject), uFrogJSObjec);
          this.a.onResponse(uFrogJSObjec);
       }
       return;
    }
}
