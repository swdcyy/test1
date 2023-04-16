package com.kuaishou.webkit.extension.jscore.JsV8Object;
import org.json.JSONObject;
import com.kuaishou.webkit.extension.jscore.IJsContext;
import java.lang.String;
import java.util.Map;
import org.json.JSONTokener;
import java.lang.Object;
import org.json.JSONException;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.webkit.extension.jscore.JsV8Object$MethodObject;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;

public class JsV8Object extends JSONObject	// class@001304
{
    public IJsContext mJsContext;

    public void JsV8Object(){
       super();
    }
    public void JsV8Object(IJsContext p0){
       super();
       this.mJsContext = p0;
    }
    public void JsV8Object(IJsContext p0,String p1){
       super(p1);
       this.mJsContext = p0;
    }
    public void JsV8Object(IJsContext p0,Map p1){
       super(p1);
       this.mJsContext = p0;
    }
    public void JsV8Object(IJsContext p0,JSONObject p1,String[] p2){
       super(p1, p2);
       this.mJsContext = p0;
    }
    public void JsV8Object(IJsContext p0,JSONTokener p1){
       super(p1);
       this.mJsContext = p0;
    }
    public void JsV8Object(String p0){
       super(p0);
    }
    public void JsV8Object(Map p0){
       super(p0);
    }
    public void JsV8Object(JSONObject p0,String[] p1){
       super(p0, p1);
    }
    public void JsV8Object(JSONTokener p0){
       super(p0);
    }
    public static JsV8Object create(Object p0){
       if (p0 instanceof IJsContext) {
          return new JsV8Object(p0);
       }
       return null;
    }
    public static JsV8Object create(Object p0,String p1){
       try{
          return new JsV8Object(p0, p1);
       }catch(org.json.JSONException e0){
          String str = -1;
          if (p1.indexOf(":,") > str || p1.indexOf(":}") > str) {
             return new JsV8Object(p0, (p1.replaceAll(":\\,", ":\'\',")).replaceAll(":\\}", ":\'\'}"));
          }
       }
    }
    public boolean closeAllJsCallback(){
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = this.keys();
       while (iterator.hasNext()) {
          String str = iterator.next();
          JsV8Object$MethodObject v8MethodObje = this.getV8MethodObject(str);
          if (v8MethodObje != null) {
             uArrayList.add(v8MethodObje.Id());
             uArrayList1.add(str);
          }
       }
       boolean b = false;
       if (!uArrayList.size()) {
          return b;
       }
       String[] stringArray = new String[b];
       this.mJsContext.setData("__jscallback|close_id|"+TextUtils.join("|", uArrayList.toArray(stringArray)), "");
       Iterator iterator1 = uArrayList1.iterator();
       while (iterator1.hasNext()) {
          this.remove(iterator1.next());
       }
       return true;
    }
    public boolean executeDefalutV8CallbackFunction(){
       return this.runV8Function(this.getV8MethodObject("__only_one_callback"), null);
    }
    public boolean executeDefalutV8CallbackFunction(JsV8Object p0){
       return this.runV8Function(this.getV8MethodObject("__only_one_callback"), p0);
    }
    public boolean executeV8CallbackFunction(String p0){
       return this.runV8Function(this.getV8MethodObject(p0), null);
    }
    public boolean executeV8CallbackFunction(String p0,JsV8Object p1){
       return this.runV8Function(this.getV8MethodObject(p0), p1);
    }
    public boolean executeV8CallbackFunctionAndClose(String p0){
       this.remove(p0);
       return this.runV8FunctionAndClose(this.getV8MethodObject(p0), null);
    }
    public boolean executeV8CallbackFunctionAndClose(String p0,JsV8Object p1){
       this.remove(p0);
       return this.runV8FunctionAndClose(this.getV8MethodObject(p0), p1);
    }
    public JsV8Object getFunctionObject(String p0){
       if (this.getV8MethodObject(p0) == null) {
          return null;
       }
       try{
          JsV8Object jsV8Object = new JsV8Object(this.mJsContext);
          jsV8Object.put("__only_one_callback", this.optString(p0, ""));
          return jsV8Object;
       }catch(java.lang.Exception e0){
       }
    }
    public final JsV8Object$MethodObject getV8MethodObject(String p0){
       JsV8Object$MethodObject methodObject = null;
       if (this.mJsContext == null) {
          return methodObject;
       }
       p0 = this.optString(p0, "");
       if (!TextUtils.isEmpty(p0) && p0.startsWith("_cb_20512_")) {
          String str = p0.substring(10);
          int i = str.indexOf("_");
          if (i < 1) {
             return methodObject;
          }else {
             methodObject = new JsV8Object$MethodObject(p0, str.substring(0, i));
          }
       }
       return methodObject;
    }
    public boolean isNonFinite(){
       return false;
    }
    public boolean isUndefined(){
       return false;
    }
    public final boolean runV8Function(JsV8Object$MethodObject p0,JsV8Object p1){
       if (p0 != null) {
          JsV8Object tmJsContext = this.mJsContext;
          if (tmJsContext != null) {
             if (p1 == null) {
                tmJsContext.setData("__jscallback|exec_id|void|"+p0.Id(), "");
             }else {
                tmJsContext.setData("__jscallback|exec_id|object|"+p0.Id(), p1.toString());
             }
             return true;
          }
       }
       return false;
    }
    public final boolean runV8FunctionAndClose(JsV8Object$MethodObject p0,JsV8Object p1){
       if (p0 != null) {
          JsV8Object tmJsContext = this.mJsContext;
          if (tmJsContext != null) {
             if (p1 == null) {
                tmJsContext.setData("__jscallback|exec_id_close|void|"+p0.Id(), "");
             }else {
                tmJsContext.setData("__jscallback|exec_id_close|object|"+p0.Id(), p1.toString());
             }
             return true;
          }
       }
       return false;
    }
}
