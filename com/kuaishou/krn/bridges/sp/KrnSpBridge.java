package com.kuaishou.krn.bridges.sp.KrnSpBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import vd.d;
import java.lang.Integer;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import com.facebook.react.bridge.Dynamic;
import com.kuaishou.krn.c;
import kj0.j;
import android.content.SharedPreferences;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.Arguments;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.Double;
import java.lang.Boolean;
import java.util.HashSet;
import java.util.Set;
import java.lang.Long;
import java.lang.Float;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class KrnSpBridge extends KrnBridge	// class@000830
{

    public void KrnSpBridge(ReactApplicationContext p0){
       super(p0);
    }
    public Map getConstants(){
       HashMap obj = PatchProxy.apply(null, this, KrnSpBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.b();
       obj.put("PRIVATE", Integer.valueOf(0));
       obj.put("APPEND", Integer.valueOf(0x8000));
       obj.put("MULTI_PROCESS", Integer.valueOf(4));
       return obj;
    }
    public void getData(ReadableMap p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnSpBridge.class, "3")) {
          return;
       }
       if (p0 == null) {
          p1.resolve(new JSApplicationIllegalArgumentException("Invalid params: "+p0));
          return;
       }else {
          HashMap hashMap = new HashMap();
          hashMap.put("data", this.getDefaultValue(c.b().c().getSharedPreferences(p0.getString("spName"), p0.getInt("mode")), p0.getString("type"), p0.getString("key"), p0.getDynamic("defaultValue")));
          p1.resolve(Arguments.makeNativeMap(hashMap));
          return;
       }
    }
    public final Object getDefault(String p0,Dynamic p1){
       HashSet hashSet;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KrnSpBridge.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0xcad56011:
             if (p0.equals("string")) {
                i = 0;
             }
             break;
           case 0xf4b79e91:
             if (p0.equals("stringSet")) {
                i = 1;
             }
             break;
           case 0x197ef:
             if (p0.equals("int")) {
                i = 2;
             }
             break;
           case 0x32c67c:
             if (p0.equals("long")) {
                i = 3;
             }
             break;
           case 0x3db6c28:
             if (p0.equals("boolean")) {
                i = 4;
             }
             break;
           case 0x5d0225c:
             if (p0.equals("float")) {
                i = 5;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             p0 = p1.asString();
             break;
           case 1:
             hashSet = new HashSet();
             break;
           case 2:
           case 3:
             hashSet = Integer.valueOf(p1.asInt());
             break;
           case 4:
             hashSet = Boolean.valueOf(p1.asBoolean());
             break;
           case 5:
             hashSet = Double.valueOf(p1.asDouble());
             break;
           default:
             hashSet = null;
       }
    label_0095 :
       return p0;
    }
    public final Object getDefaultValue(SharedPreferences p0,String p1,String p2,Dynamic p3){
       Set stringSet;
       Set obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, KrnSpBridge.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       long l = -1;
       switch (p1.hashCode()){
           case 0xcad56011:
             if (p1.equals("string")) {
                l = 0;
             }
             break;
           case 0xf4b79e91:
             if (p1.equals("stringSet")) {
                l = 5;
             }
             break;
           case 0x197ef:
             if (p1.equals("int")) {
                l = 3;
             }
             break;
           case 0x32c67c:
             if (p1.equals("long")) {
                l = 4;
             }
             break;
           case 0x3db6c28:
             if (p1.equals("boolean")) {
                l = 1;
             }
             break;
           case 0x5d0225c:
             if (p1.equals("float")) {
                l = 2;
             }
             break;
           default:
       }
    label_005c :
       if (l) {
          if (l != 1) {
             if (l != 2) {
                if (l != 3) {
                   if (l != 4) {
                      if (l != 5) {
                      label_00cb :
                         return obj;
                      }else {
                         stringSet = p0.getStringSet(p2, this.getDefault(p1, p3));
                      }
                   }else {
                      stringSet = Long.valueOf(p0.getLong(p2, this.getDefault(p1, p3).longValue()));
                   }
                }else {
                   stringSet = Integer.valueOf(p0.getInt(p2, this.getDefault(p1, p3).intValue()));
                }
             }else {
                stringSet = Float.valueOf(p0.getFloat(p2, this.getDefault(p1, p3).floatValue()));
             }
          }else {
             stringSet = Boolean.valueOf(p0.getBoolean(p2, this.getDefault(p1, p3).booleanValue()));
          }
       }else {
          stringSet = p0.getString(p2, this.getDefault(p1, p3));
       }
       obj = stringSet;
       goto label_00cb ;
    }
    public String getName(){
       return "KrnSP";
    }
    public void putData(ReadableMap p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnSpBridge.class, "2")) {
          return;
       }
       if (p0 == null) {
          p1.resolve(new JSApplicationIllegalArgumentException("Invalid params: "+p0));
          return;
       }else {
          String str = p0.getString("key");
          String str1 = p0.getString("type");
          Dynamic dynamic = p0.getDynamic("value");
          SharedPreferences$Editor uEditor = c.b().c().getSharedPreferences(p0.getString("spName"), p0.getInt("mode")).edit();
          String str2 = -1;
          switch (str1.hashCode()){
              case 0xcad56011:
                if (str1.equals("string")) {
                   str2 = null;
                }
                break;
              case 0xf4b79e91:
                if (str1.equals("stringSet")) {
                   str2 = 5;
                }
                break;
              case 0x197ef:
                if (str1.equals("int")) {
                   str2 = 3;
                }
                break;
              case 0x32c67c:
                if (str1.equals("long")) {
                   str2 = 4;
                }
                break;
              case 0x3db6c28:
                if (str1.equals("boolean")) {
                   str2 = 1;
                }
                break;
              case 0x5d0225c:
                if (str1.equals("float")) {
                   str2 = 2;
                }
                break;
              default:
          }
       label_009e :
          if (str2) {
             if (str2 != 1) {
                if (str2 != 2) {
                   if (str2 != 3) {
                      if (str2 != 4) {
                         if (str2 != 5) {
                            p1.reject(new JSApplicationIllegalArgumentException("No support data type :"+str1));
                            return;
                         }else {
                            g.a(uEditor.putStringSet(str, this.getDefault(str1, dynamic)));
                         }
                      }else {
                         g.a(uEditor.putLong(str, this.getDefault(str1, dynamic).longValue()));
                      }
                   }else {
                      g.a(uEditor.putInt(str, this.getDefault(str1, dynamic).intValue()));
                   }
                }else {
                   g.a(uEditor.putFloat(str, this.getDefault(str1, dynamic).floatValue()));
                }
             }else {
                g.a(uEditor.putBoolean(str, this.getDefault(str1, dynamic).booleanValue()));
             }
          }else {
             g.a(uEditor.putString(str, this.getDefault(str1, dynamic)));
          }
          p1.resolve(Boolean.TRUE);
          return;
       }
    }
}
