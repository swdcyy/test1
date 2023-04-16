package com.frog.engine.internal.BaseCommandHandler$l;
import com.frog.engine.FrogAsyncRequestListener;
import com.frog.engine.internal.BaseCommandHandler;
import com.frog.engine.jsobject.FrogJSObject;
import com.frog.engine.FrogCommandResponseListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import org.json.JSONObject;
import com.frog.engine.network.download.FrogDownloadTask;
import com.frog.engine.network.FrogOkHttpManager;
import com.frog.engine.network.FrogExternalInterceptor;
import android.util.Pair;
import java.lang.StringBuilder;
import java.lang.Integer;
import com.frog.engine.internal.FrogLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.frog.engine.internal.CommandExpandFuncListener;
import com.frog.engine.utils.MD5Utils;
import com.frog.engine.internal.BaseCommandHandler$l$a;
import com.frog.engine.network.download.FrogDownloadCallBack;
import java.lang.Exception;

public class BaseCommandHandler$l extends FrogAsyncRequestListener	// class@00151d
{
    public final BaseCommandHandler a;

    public void BaseCommandHandler$l(BaseCommandHandler p0){
       this.a = p0;
       super();
    }
    public void onResponse(FrogJSObject p0,FrogCommandResponseListener p1){
       FrogJSObject uFrogJSObjec;
       long l1;
       long l2;
       Object obj = this;
       FrogJSObject obj1 = p0;
       Object obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, BaseCommandHandler$l.class, "1")) {
          return;
       }
       int i = -10001;
       if (obj1 == null) {
          if (obj2 != null) {
             obj1 = new FrogJSObject();
             FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(i, "", null), obj1);
             obj2.onResponse(obj1);
          }
          return;
       }else {
          try{
             FrogDownloadTask uFrogDownloa = new FrogDownloadTask();
             uFrogDownloa.setUrl(obj1.getString("url"));
             FrogExternalInterceptor interceptor = FrogOkHttpManager.getInstance().getInterceptor();
             int i1 = 0;
             if (interceptor != null) {
                Pair pair = interceptor.interceptUrl(uFrogDownloa.getUrl(), 5);
                String str = "BASE_COMMAND_DOWNLOAD_FILE interDownload ";
                boolean i2 = (pair != null)? pair.first.intValue(): 0;
                FrogLog.d("BaseCommandHandler", str+i2);
                if (pair != null && (pair.first.intValue() && obj2 != null)) {
                   uFrogJSObjec = new FrogJSObject();
                   FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(pair.first.intValue(), pair.second, null), uFrogJSObjec);
                   obj2.onResponse(uFrogJSObjec);
                   return;
                }else {
                label_0098 :
                   uFrogJSObjec = obj1.getJSObject("header");
                   HashMap hashMap = new HashMap();
                   i2 = true;
                   if (uFrogJSObjec != null) {
                      JSONObject jSONObject = new JSONObject();
                      FrogJSObject.toJSONObject(uFrogJSObjec, jSONObject, i2);
                      Iterator iterator = jSONObject.keys();
                      while (iterator.hasNext()) {
                         String str1 = iterator.next();
                         hashMap.put(str1, jSONObject.optString(str1));
                      }
                   }
                   uFrogDownloa.setHeader(hashMap);
                   long l = (long)obj1.getNumber("timeout");
                   BaseCommandHandler$l$a ol$a = null;
                   if (l - ol$a <= 0) {
                      l = 0x3a98;
                   }
                   uFrogDownloa.setTimeout(l);
                   String str2 = "filePath";
                   int i3 = -1;
                   if (obj1.hasKey(str2) && !obj1.isStringType(str2)) {
                      if (obj2 != null) {
                         obj1 = new FrogJSObject();
                         FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(i3, "", null), obj1);
                         obj2.onResponse(obj1);
                      }
                      return;
                   }else {
                      str = obj1.getString(str2);
                      if (!TextUtils.isEmpty(str)) {
                         BaseCommandHandler mSendListene = obj.a.mSendListener;
                         boolean b = (mSendListene != null)? mSendListene.canWrite(str): false;
                         if (!b) {
                            if (obj2 != null) {
                               obj1 = new FrogJSObject();
                               FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(i, "no permission to write", null), obj1);
                               obj2.onResponse(obj1);
                            }
                            return;
                         }
                      }
                      if (obj.a.mSendListener != null) {
                         if (TextUtils.isEmpty(str)) {
                            str2 = obj.a.mSendListener.getTempDir()+"/"+MD5Utils.getMd5Digest(uFrogDownloa.getUrl())+"_"+(uFrogDownloa.getUrl()).substring(((uFrogDownloa.getUrl()).lastIndexOf(47) + i2));
                            uFrogDownloa.setKsFilePath(str2);
                            l1 = obj.a.mSendListener.lastSpace(str2);
                            str2 = obj.a.mSendListener.findAbsPath(str2);
                         }else {
                            uFrogDownloa.setKsFilePath(str);
                            l1 = obj.a.mSendListener.lastSpace(str);
                            str2 = obj.a.mSendListener.findAbsPath(str);
                         }
                         l2 = l1;
                      }else {
                         str2 = "";
                         l2 = ol$a;
                      }
                      uFrogDownloa.setFilePath(str2);
                      String str3 = obj1.getString("seqNO");
                      if (!l2 - ol$a) {
                         if (obj2 != null) {
                            obj1 = new FrogJSObject();
                            FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(i3, "not enough storage space", null), obj1);
                            obj2.onResponse(obj1);
                         }
                         return;
                      }else {
                         int[] ointArray = new int[i2];
                         ointArray[i1] = i3;
                         BaseCommandHandler$l$a ol$a1 = new BaseCommandHandler$l$a(this, str, uFrogDownloa, p1, ointArray, str3);
                         FrogOkHttpManager.getInstance().addDownloadTask(str3, l2, uFrogDownloa, ol$a);
                      }
                   }
                }
             }else {
                goto label_0098 ;
             }
          }catch(java.lang.Exception e0){
             FrogLog.e("BaseCommandHandler", e0.getMessage());
             if (obj2) {
                obj1 = new FrogJSObject();
                FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(-10001, "", null), obj1);
                obj2.onResponse(obj1);
             }
          }
          return;
       }
    }
}
