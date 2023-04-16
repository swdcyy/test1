package com.yxcorp.gifshow.webview.bridge.a$i;
import vxc.z;
import com.yxcorp.gifshow.webview.bridge.a;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.jsmodel.JsCallbackParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import org.json.JSONObject;
import org.json.JSONArray;
import txc.c;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.framework.abtest.f;
import java.lang.reflect.Type;
import java.lang.Throwable;

public class a$i extends z	// class@001715
{
    public final String k;
    public final a l;

    public void a$i(a p0,Activity p1,WebView p2,String p3){
       this.l = p0;
       this.k = p3;
       super(p1, p2);
    }
    public void i(Serializable p0){
       StringBuilder str2;
       JSONObject jSONObject2;
       try{
          Object obj = this;
          Object obj1 = p0;
          if (PatchProxy.applyVoidOneRefs(obj1, obj, a$i.class, "1")) {
          }else {
             JSONArray jSONArray = new JSONObject(obj.k).getJSONArray("ab");
             if (jSONArray != null) {
                JSONObject jSONObject = new JSONObject();
                int i = 0;
                while (i < jSONArray.length()) {
                   JSONObject jSONObject1 = jSONArray.getJSONObject(i);
                   if (jSONObject1 != null && (jSONObject1.has("type") && jSONObject1.has("key"))) {
                      String str = jSONObject1.getString("key");
                      String str1 = (jSONObject1.getString("type")).toLowerCase();
                      str2 = 4;
                      c uoc = 1;
                      switch (str1.hashCode()){
                          case 0xcad56011:
                            if (str1.equals("string")) {
                               str1 = null;
                            }else {
                            label_008f :
                               str1 = -1;
                            }
                            break;
                          case 0x197ef:
                            if (str1.equals("int")) {
                               str1 = 1;
                            }else {
                               goto label_008f ;
                            }
                            break;
                          case 0x2e3aea:
                            if (str1.equals("bool")) {
                               str1 = 3;
                            }else {
                               goto label_008f ;
                            }
                            break;
                          case 0x3db6c28:
                            if (str1.equals("boolean")) {
                               str1 = 4;
                            }else {
                               goto label_008f ;
                            }
                            break;
                          case 0x74b5813e:
                            if (str1.equals("integer")) {
                               str1 = 2;
                            }else {
                               goto label_008f ;
                            }
                            break;
                          default:
                            goto label_008f ;
                      }
                      if (str1) {
                         if (str1 != uoc && str1 != 2) {
                            if (str1 != 3 && str1 != str2) {
                               Object[] objArray1 = new Object[0];
                               c.C().t("JsInjectKwai", "getAbTest type not support -- "+jSONObject1.getString("type"), objArray1);
                            }else {
                               jSONObject.put(str, f.a(str));
                            }
                         }else {
                            jSONObject.put(str, f.e(str));
                         }
                      }else {
                         jSONObject.put(str, f.b(str, String.class, null));
                      label_00d6 :
                         i = i + 1;
                      }
                   }
                   str2 = null;
                   goto label_00d6 ;
                }
                jSONObject2 = jSONObject;
             }else {
                jSONObject2 = null;
             }
             if (jSONObject2 != null) {
                obj.d(obj1.mCallback, jSONObject2);
             }
          }
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[0];
          c.C().u("JsInjectKwai", e0, objArray);
       }
       return;
    }
}
