package y25.a;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.content.ContentResolver;
import com.kwai.framework.deviceid.a;
import y25.b;
import android.bluetooth.BluetoothAdapter;
import android.os.Build$VERSION;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.Exception;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import zsd.u;
import nsd.r0;
import java.lang.Byte;
import java.util.Arrays;
import java.util.Locale;
import msd.l;
import java.net.InetAddress;
import java.util.Enumeration;
import java.net.NetworkInterface;
import java.util.Objects;
import java.lang.Boolean;
import com.kuaishou.ug.deviceinfo.DeviceInfoManager;
import org.json.JSONObject;
import android.os.Build;
import java.lang.System;
import v25.b;

public final class a	// class@002837
{

    public static final String a(Context p0){
       String str = null;
       String obj = PatchProxy.applyOneRefs(p0, str, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       obj = a.g(p0.getContentResolver(), "bluetooth_address");
       String[] stringArray = new String[]{"android.permission.BLUETOOTH"};
       boolean b = b.a(p0, stringArray);
       if (a.h(obj) && b) {
          BluetoothAdapter defaultAdapt = BluetoothAdapter.getDefaultAdapter();
          if (Build$VERSION.SDK_INT >= 23) {
             try{
                Field declaredFiel = BluetoothAdapter.class.getDeclaredField("mService");
                a.o(declaredFiel, "BluetoothAdapter::class.¡­DeclaredField\(\"mService\"\)");
                declaredFiel.setAccessible(true);
                Object obj1 = declaredFiel.get(defaultAdapt);
                if (obj1 != null) {
                   Class[] uClassArray = new Class[0];
                   Method method = obj1.getClass().getMethod("getAddress", uClassArray);
                   a.o(method, "bluetoothManagerService.¡­s.getMethod\(\"getAddress\"\)");
                   Object[] objArray = new Object[0];
                   obj1 = method.invoke(obj1, objArray);
                   if (obj1 != null) {
                      str = obj1.toString();
                   }
                   obj = str;
                }
             }catch(java.lang.Exception e1){
                e1.printStackTrace();
             }
          }
       }
    label_0088 :
       if (a.h(obj)) {
          obj = "UG_GET_FIELD_EMPTY";
       }
       return obj;
    }
    public static final String b(byte[] p0,CharSequence p1){
       Object obj = null;
       StringBuilder obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, a.class, "14");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 != null) {
          int i = (!p0.length)? 1: 0;
          if (1 == (i ^ 1)) {
             obj1 = "";
             int len = p0.length;
             for (int i1 = 0; i1 < len; i1 = i1 + 1) {
                if (i1) {
                   r0 or0 = (u.S1(p1))? 1: null;
                   if (!or0) {
                      obj1 = obj1+p1;
                   }
                }
                Object[] objArray = new Object[]{Byte.valueOf(p0[i1])};
                String str = String.format("%02x", Arrays.copyOf(objArray, 1));
                a.o(str, "java.lang.String.format\(format, *args\)");
                obj1 = obj1+str;
             }
             return obj1;
          }
       }
       return obj;
    }
    public static final String c(){
       Object[] objArray = null;
       Class obj = PatchProxy.apply(objArray, objArray, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Class.forName("com.huawei.system.BuildEx");
       a.o(obj, "Class.forName\(\"com.huawei.system.BuildEx\"\)");
       int i = 0;
       Class[] uClassArray = new Class[i];
       Method declaredMeth = obj.getDeclaredMethod("getOsBrand", uClassArray);
       a.o(declaredMeth, "clz.getDeclaredMethod\(\"getOsBrand\"\)");
       Object[] objArray1 = new Object[i];
       String obj1 = declaredMeth.invoke(objArray, objArray1);
       if (obj1 != null) {
          obj1 = obj1.toString();
          if (obj1 != null) {
             Locale default = Locale.getDefault();
             a.o(default, "Locale.getDefault\(\)");
             obj1 = obj1.toLowerCase(default);
             a.o(obj1, "\(this as java.lang.String\).toLowerCase\(locale\)");
             objArray = obj1;
          }
       }
       return objArray;
    }
    public static final InetAddress d(l p0){
       Enumeration obj = PatchProxy.applyOneRefs(p0, null, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = NetworkInterface.getNetworkInterfaces();
       if (obj != null) {
          while (obj.hasMoreElements()) {
             Enumeration obj1 = obj.nextElement();
             Objects.requireNonNull(obj1, "null cannot be cast to non-null type java.net.NetworkInterface");
             obj1 = a.c(obj1);
             if (obj1 != null) {
                while (true) {
                   if (obj1.hasMoreElements()) {
                      Object obj2 = obj1.nextElement();
                      Objects.requireNonNull(obj2, "null cannot be cast to non-null type java.net.InetAddress");
                      if (!obj2.isLoopbackAddress() && (p0 == null || p0.invoke(obj2).booleanValue())) {
                         return obj2;
                      }
                   }else {
                      continue ;
                   }
                }
             }
          }
       }
       return null;
    }
    public static final String e(){
       String obj = PatchProxy.apply(null, null, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = DeviceInfoManager.d.e();
       Locale default = Locale.getDefault();
       a.o(default, "Locale.getDefault\(\)");
       Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
       obj = obj.toLowerCase(default);
       a.o(obj, "\(this as java.lang.String\).toLowerCase\(locale\)");
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("manufacturer", obj);
       if (obj.hashCode() == -1206476313 && obj.equals("huawei")) {
          jSONObject.put("manufacturer_os", a.c());
       }
       obj = jSONObject.toString();
       a.o(obj, "json.toString\(\)");
       return obj;
    }
    public static final String f(Context p0){
       String obj = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.g("ro.serialno");
       int i = 1;
       int i1 = (obj == null || u.S1(obj))? 1: 0;
       if (i1) {
          i1 = Build$VERSION.SDK_INT;
          if (i1 >= 26 && i1 < 29) {
             String[] stringArray = new String[]{"android.permission.READ_PHONE_STATE"};
             String serial = (b.a(p0, stringArray))? Build.getSerial(): "UG_AUTH_FAILED";
             obj = serial;
          }
       }
       if (obj != null && !u.S1(obj)) {
          i = 0;
       }
       if (i) {
          obj = "UG_GET_FIELD_EMPTY";
       }
       return obj;
    }
    public static final String g(String p0){
       String obj = PatchProxy.applyOneRefs(p0, null, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "key";
       try{
          a.p(p0, obj);
          String property = System.getProperty(p0);
          DeviceInfoManager d = DeviceInfoManager.d;
          d.d().info("getSystemProperty", "System.getProperty\(\""+p0+"\"\): "+property);
          int i = 1;
          int i1 = 0;
          String str = (property == null || u.S1(property))? 1: null;
          if (str) {
             Class uClass = Class.forName("android.os.SystemProperties");
             a.o(uClass, "Class.forName\(\"android.os.SystemProperties\"\)");
             Class[] uClassArray = new Class[i];
             uClassArray[i1] = String.class;
             Method method = uClass.getMethod("get", uClassArray);
             a.o(method, "clazz.getMethod\(\"get\", String::class.java\)");
             Object[] objArray = new Object[i];
             objArray[i1] = p0;
             String str1 = method.invoke(uClass, objArray);
             try{
                d.d().info("getSystemProperty", "SystemProperties.get\(\""+p0+"\"\): "+str1);
                property = str1;
             }catch(java.lang.Exception e10){
                property = str1;
             }
             e10.printStackTrace();
          }
          return property;
       }catch(java.lang.Exception e10){
          goto label_0097 ;
       }
    }
    public static final boolean h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       String str = (p0 == null || u.S1(p0))? 1: null;
       if (str || a.g("02:00:00:00:00:00", p0)) {
          b = true;
       }
       return b;
    }
}
