package com.frog.engine.internal.BaseCommandHandler$m;
import com.frog.engine.FrogAsyncRequestListener;
import com.frog.engine.internal.BaseCommandHandler;
import com.frog.engine.jsobject.FrogJSObject;
import com.frog.engine.FrogCommandResponseListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.frog.engine.network.FrogOkHttpManager;
import com.frog.engine.network.FrogExternalInterceptor;
import android.util.Pair;
import java.lang.StringBuilder;
import java.lang.Integer;
import com.frog.engine.internal.FrogLog;
import org.json.JSONObject;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.frog.engine.internal.CommandExpandFuncListener;
import com.frog.engine.network.upload.FrogUploadTask;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import com.frog.engine.internal.BaseCommandHandler$m$a;
import com.frog.engine.network.upload.FrogUploadResultCallBack;
import java.lang.Exception;

public class BaseCommandHandler$m extends FrogAsyncRequestListener	// class@00151f
{
    public final BaseCommandHandler a;

    public void BaseCommandHandler$m(BaseCommandHandler p0){
       this.a = p0;
       super();
    }
    public void onResponse(FrogJSObject p0,FrogCommandResponseListener p1){
       FrogJSObject uFrogJSObjec;
       int len;
       HashMap hashMap1;
       Object obj = this;
       FrogJSObject obj1 = p0;
       Object obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, BaseCommandHandler$m.class, "1")) {
          return;
       }
       if (obj.a.checkParamInvalid(obj1, obj2)) {
          return;
       }
       int i = -10001;
       JSONObject jSONObject = null;
       try{
          String str = obj1.getString("url");
          FrogExternalInterceptor interceptor = FrogOkHttpManager.getInstance().getInterceptor();
          if (interceptor != null) {
             Pair pair = interceptor.interceptUrl(str, 4);
             String str1 = "BASE_COMMAND_UPLOAD_FILE interUpload ";
             int i1 = (pair != null)? pair.first.intValue(): 0;
             FrogLog.d("BaseCommandHandler", str1+i1);
             if (pair != null && (pair.first.intValue() && obj2 != null)) {
                uFrogJSObjec = new FrogJSObject();
                FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(pair.first.intValue(), pair.second, jSONObject), uFrogJSObjec);
                obj2.onResponse(uFrogJSObjec);
                return;
             }else {
             label_0081 :
                String str2 = obj1.getString("filePath");
                str1 = obj1.getString("name");
                if (TextUtils.isEmpty(str1)) {
                   if (obj2 != null) {
                      uFrogJSObjec = new FrogJSObject();
                      FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(i, "", jSONObject), uFrogJSObjec);
                      obj2.onResponse(uFrogJSObjec);
                   }
                   return;
                }else {
                   FrogJSObject jSObject = obj1.getJSObject("header");
                   FrogJSObject jSObject1 = obj1.getJSObject("formData");
                   long l = (long)obj1.getNumber("timeout");
                   if (l - null <= 0) {
                      l = 0x3a98;
                   }
                   String str3 = obj1.getString("seqNO");
                   BaseCommandHandler mSendListene = obj.a.mSendListener;
                   boolean b = (mSendListene != null)? mSendListene.canRead(str2): false;
                   if (!b) {
                      if (obj2 != null) {
                         obj1 = new FrogJSObject();
                         FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(i, "no permission to read", jSONObject), obj1);
                         obj2.onResponse(obj1);
                      }
                      return;
                   }else {
                      FrogUploadTask uFrogUploadT = new FrogUploadTask();
                      uFrogUploadT.setUrl(str);
                      BaseCommandHandler mSendListene1 = obj.a.mSendListener;
                      if (mSendListene1 != null) {
                         uFrogUploadT.setFilePath(mSendListene1.findAbsPath(str2));
                      }
                      if (TextUtils.isEmpty(uFrogUploadT.getFilePath()) || !new File(uFrogUploadT.getFilePath()).exists()) {
                         if (obj2 != null) {
                            obj1 = new FrogJSObject();
                            FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(-10001, "file not exists", jSONObject), obj1);
                            obj2.onResponse(obj1);
                         }
                         return;
                      }else {
                         uFrogUploadT.setName(str1);
                         uFrogUploadT.setTimeout(l);
                         HashMap hashMap = new HashMap();
                         if (jSObject != null) {
                            String[] allKeys = jSObject.getAllKeys();
                            if (allKeys != null) {
                               len = allKeys.length;
                               int i2 = 0;
                               while (i2 < len) {
                                  object oobject = allKeys[i2];
                                  hashMap.put(oobject, jSObject.getObjectForce(oobject));
                                  i2 = i2 + 1;
                                  hashMap1 = -10001;
                               }
                            }
                         }
                         uFrogUploadT.setHeader(hashMap);
                         hashMap1 = new HashMap();
                         if (jSObject1 != null) {
                            String[] allKeys1 = jSObject1.getAllKeys();
                            if (allKeys1 != null) {
                               int len1 = allKeys1.length;
                               for (len = 0; len < len1; len = len + 1) {
                                  object oobject1 = allKeys1[len];
                                  hashMap1.put(oobject1, jSObject1.getObjectForce(oobject1));
                               }
                            }
                         }
                         uFrogUploadT.setFormData(hashMap1);
                         int[] ointArray = new int[]{-1};
                         FrogOkHttpManager.getInstance().addUploadTask(str3, uFrogUploadT, new BaseCommandHandler$m$a(obj, obj2, ointArray, str3));
                      }
                   }
                }
             }
          }else {
             goto label_0081 ;
          }
       }catch(java.lang.Exception e0){
          FrogLog.e("BaseCommandHandler", e0.getMessage());
          if (obj2) {
             obj1 = new FrogJSObject();
             FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(-10001, "", jSONObject), obj1);
             obj2.onResponse(obj1);
          }
       }
       return;
    }
}
