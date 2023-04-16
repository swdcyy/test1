package com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.a;
import ae.e;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cb.a;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableType;
import java.io.StringWriter;
import android.util.JsonWriter;
import java.io.Writer;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JsonWriterHelper;
import if.b;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import yd.e;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.CatalystInstance;
import jn.b;
import java.util.Set;
import java.util.Iterator;
import jn.a;
import com.facebook.react.common.JavascriptException;
import java.lang.Integer;
import com.facebook.react.bridge.JavaOnlyMap;

public class ExceptionsManagerModule extends ReactContextBaseJavaModule	// class@00128d
{
    public final e mDevSupportManager;
    public final WeakReference mReactInstanceManagerWeakReference;

    public void ExceptionsManagerModule(ReactApplicationContext p0,a p1){
       super(p0);
       this.mDevSupportManager = p1.o();
       this.mReactInstanceManagerWeakReference = new WeakReference(p1);
    }
    public void dismissRedbox(){
       if (PatchProxy.applyVoid(null, this, ExceptionsManagerModule.class, "6")) {
          return;
       }
       if (this.mDevSupportManager.t()) {
          this.mDevSupportManager.l();
       }
       return;
    }
    public String getName(){
       return "ExceptionsManager";
    }
    public final void logException(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ExceptionsManagerModule.class, "4")) {
          return;
       }
       a.g("ReactNative", p0);
       if (p1 != null) {
          a.b("ReactNative", "extraData: %s", p1);
       }
       return;
    }
    public void reportException(ReadableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExceptionsManagerModule.class, "3")) {
          return;
       }
       String str = "message";
       String str1 = "";
       str = (p0.hasKey(str))? p0.getString(str): str1;
       String str2 = "stack";
       ReadableArray array = (p0.hasKey(str2))? p0.getArray(str2): Arguments.createArray();
       String str3 = "id";
       int intx = (p0.hasKey(str3))? p0.getInt(str3): -1;
       String str4 = "isFatal";
       boolean b = false;
       boolean booleanx = (p0.hasKey(str4))? p0.getBoolean(str4): null;
       String str5 = "extraData";
       if (this.mDevSupportManager.t()) {
          if (p0.getMap(str5) != null && p0.getMap(str5).hasKey("suppressRedBox")) {
             b = p0.getMap(str5).getBoolean("suppressRedBox");
          }
          if (!b) {
             this.mDevSupportManager.D(str, array, intx);
          }
       }else {
          try{
             str3 = null;
             if (p0.getType(str5) != ReadableType.Null) {
                StringWriter stringWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter(stringWriter);
                JsonWriterHelper.value(jsonWriter, p0.getDynamic(str5));
                jsonWriter.close();
                stringWriter.close();
                str3 = stringWriter.toString();
             }
             String str6 = str+", stack:\n";
             for (; b < array.size(); b = b + 1) {
                ReadableMap map = array.getMap(b);
                str6 = str6+map.getString("methodName")+"@";
                String str7 = "file";
                if (map.hasKey(str7) && (!map.isNull(str7) && map.getType(str7) == ReadableType.String)) {
                   str7 = map.getString(str7);
                   if (str7 != null) {
                      Matcher matcher = b.a.matcher(str7);
                      str7 = (matcher.find())? matcher.group(1)+":": str7+":";
                   }else {
                   label_010f :
                      str7 = str1;
                   }
                }else {
                   goto label_010f ;
                }
                str6 = str6+str7;
                str7 = "lineNumber";
                str6 = (map.hasKey(str7) && (!map.isNull(str7) && map.getType(str7) == ReadableType.Number))? str6+map.getInt(str7): str6+-1;
                str7 = "column";
                if (map.hasKey(str7) && (!map.isNull(str7) && map.getType(str7) == ReadableType.Number)) {
                   str6 = str6+":"+map.getInt(str7);
                }
             label_0154 :
                str6 = str6+"\n";
             }
             str6 = str6;
             a uoa = this.mReactInstanceManagerWeakReference.get();
             if (e.S && (uoa != null && (uoa.n() == null || !uoa.n().hasActiveCatalystInstance()))) {
                this.logException(str6, str3);
                return;
             }else if(!this.getReactApplicationContext().hasActiveCatalystInstance()){
                this.logException(str6, str3);
                return;
             }else {
                a.g("ReactNative", "ExceptionsManagerModule.reportException  "+this.getReactApplicationContext()+"  "+this.getReactApplicationContext().getCatalystInstance());
                b uob = b.a();
                ReactApplicationContext reactApplica = this.getReactApplicationContext();
                if (uob.a.size() > 0) {
                   Iterator iterator = uob.a.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().c(reactApplica, booleanx, str6, str3);
                   }
                }
                if (booleanx == null) {
                   this.logException(str6, str3);
                }else {
                   throw new JavascriptException(str6).setExtraDataAsJson(str3);
                }
             }
          }catch(java.io.IOException e0){
          }
       }
       return;
    }
    public void reportFatalException(String p0,ReadableArray p1,int p2){
       if (PatchProxy.isSupport(ExceptionsManagerModule.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, ExceptionsManagerModule.class, "1")) {
          return;
       }
       JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
       javaOnlyMap.putString("message", p0);
       javaOnlyMap.putArray("stack", p1);
       javaOnlyMap.putInt("id", p2);
       javaOnlyMap.putBoolean("isFatal", true);
       this.reportException(javaOnlyMap);
       return;
    }
    public void reportSoftException(String p0,ReadableArray p1,int p2){
       if (PatchProxy.isSupport(ExceptionsManagerModule.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, ExceptionsManagerModule.class, "2")) {
          return;
       }
       JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
       javaOnlyMap.putString("message", p0);
       javaOnlyMap.putArray("stack", p1);
       javaOnlyMap.putInt("id", p2);
       javaOnlyMap.putBoolean("isFatal", false);
       this.reportException(javaOnlyMap);
       return;
    }
    public void updateExceptionMessage(String p0,ReadableArray p1,int p2){
       if (PatchProxy.isSupport(ExceptionsManagerModule.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, ExceptionsManagerModule.class, "5")) {
          return;
       }
       if (this.mDevSupportManager.t()) {
          this.mDevSupportManager.g(p0, p1, p2);
       }
       return;
    }
}
