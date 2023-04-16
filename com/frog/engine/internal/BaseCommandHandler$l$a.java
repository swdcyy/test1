package com.frog.engine.internal.BaseCommandHandler$l$a;
import com.frog.engine.network.download.FrogDownloadCallBack;
import com.frog.engine.internal.BaseCommandHandler$l;
import java.lang.String;
import com.frog.engine.network.download.FrogDownloadTask;
import com.frog.engine.FrogCommandResponseListener;
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
import java.lang.CharSequence;
import android.text.TextUtils;

public class BaseCommandHandler$l$a implements FrogDownloadCallBack	// class@00151c
{
    public final String a;
    public final FrogDownloadTask b;
    public final FrogCommandResponseListener c;
    public final int[] d;
    public final String e;
    public final BaseCommandHandler$l f;

    public void BaseCommandHandler$l$a(BaseCommandHandler$l p0,String p1,FrogDownloadTask p2,FrogCommandResponseListener p3,int[] p4,String p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public void onFail(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseCommandHandler$l$a.class, "2")) {
          return;
       }
       if (this.c != null) {
          FrogJSObject uFrogJSObjec = new FrogJSObject();
          FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(-1, p0, null), uFrogJSObjec);
          this.c.onResponse(uFrogJSObjec);
       }
       return;
    }
    public void onProcessUpdate(int p0,long p1,long p2){
       JSONObject jSONObject;
       if (PatchProxy.isSupport(BaseCommandHandler$l$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, BaseCommandHandler$l$a.class, "3")) {
          return;
       }
       if (this.f.a.mSendListener != null) {
          BaseCommandHandler$l$a td = this.d;
          int i = 0;
          if (td[i] != p0 || p0 >= 100) {
             td[i] = p0;
             try{
                jSONObject = new JSONObject();
                jSONObject.put("progress", p0);
                jSONObject.put("totalBytesWritten", p1);
                jSONObject.put("totalBytesExpectedToWrite", p2);
                jSONObject.put("seqNO", this.e);
             }catch(java.lang.Exception e8){
                FrogLog.e("BaseCommandHandler", e8);
             }
             FrogJSObject uFrogJSObjec = new FrogJSObject();
             FrogJSObject.fromJSObject(jSONObject, uFrogJSObjec);
             this.f.a.mSendListener.sendCommandToNativeGame("ks.http.onProgressUpdate", uFrogJSObjec, null);
          }
       }
       return;
    }
    public void onResult(int p0){
       JSONObject jSONObject;
       BaseCommandHandler$l$a ol$a = BaseCommandHandler$l$a.class;
       if (PatchProxy.isSupport(ol$a) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ol$a, "1")) {
          return;
       }
       try{
          jSONObject = new JSONObject();
          if (TextUtils.isEmpty(this.a)) {
             jSONObject.put("tempFilePath", this.b.getKsFilePath());
          }else {
             jSONObject.put("filePath", this.b.getKsFilePath());
          }
          jSONObject.put("statusCode", p0);
       }catch(java.lang.Exception e4){
          FrogLog.e("BaseCommandHandler", e4);
       }
       if (this.c != null) {
          FrogJSObject uFrogJSObjec = new FrogJSObject();
          FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(1, "", jSONObject), uFrogJSObjec);
          this.c.onResponse(uFrogJSObjec);
       }
       return;
    }
}
