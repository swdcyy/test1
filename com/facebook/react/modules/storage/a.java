package com.facebook.react.modules.storage.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.Arrays;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import org.json.JSONObject;
import java.util.Iterator;
import android.database.sqlite.SQLiteDatabase;
import java.lang.Boolean;
import android.database.Cursor;
import android.content.ContentValues;

public class a	// class@0012f0
{

    public void a(){
       super();
    }
    public static String a(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String[] stringArray = new String[p0];
       Arrays.fill(stringArray, "?");
       return "key IN \("+TextUtils.join(", ", stringArray)+"\)";
    }
    public static String[] b(ReadableArray p0,int p1,int p2){
       String[] obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new String[p2];
       for (int i = 0; i < p2; i = i + 1) {
          int i1 = p1 + i;
          obj[i] = p0.getString(i1);
       }
       return obj;
    }
    public static void c(JSONObject p0,JSONObject p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "6")) {
          return;
       }
       Iterator iterator = p1.keys();
       while (iterator.hasNext()) {
          String str = iterator.next();
          JSONObject jSONObject = p1.optJSONObject(str);
          JSONObject jSONObject1 = p0.optJSONObject(str);
          if (jSONObject != null && jSONObject1 != null) {
             a.c(jSONObject1, jSONObject);
             p0.put(str, jSONObject1);
          }else {
             p0.put(str, p1.get(str));
          }
       }
       return;
    }
    public static boolean d(SQLiteDatabase p0,String p1,String p2){
       String str;
       boolean b;
       String str1;
       Object obj = p1;
       ContentValues obj1 = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "5");
       if (obj1 != PatchProxyResult.class) {
          return obj1.booleanValue();
       }
       obj1 = PatchProxy.applyTwoRefs(p0, obj, null, a.class, "3");
       int i = 0;
       if (obj1 != PatchProxyResult.class) {
       }else {
          String[] stringArray = new String[]{"value"};
          String[] stringArray1 = new String[]{obj};
          Cursor uCursor = p0.query("catalystLocalStorage", stringArray, "key=?", stringArray1, null, null, null);
          if (!uCursor.moveToFirst()) {
             uCursor.close();
             str1 = null;
          }else {
             uCursor.close();
             str1 = uCursor.getString(i);
          }
       }
       if (obj1 == null) {
          str = p2;
       }else {
          JSONObject jSONObject = new JSONObject(obj1);
          a.c(jSONObject, new JSONObject(p2));
          str = jSONObject.toString();
       }
       obj1 = PatchProxy.applyThreeRefs(p0, p1, str, null, a.class, "4");
       if (obj1 != PatchProxyResult.class) {
          b = obj1.booleanValue();
       }else {
          obj1 = new ContentValues();
          obj1.put("key", obj);
          obj1.put("value", str);
          if (-1 - p0.insertWithOnConflict("catalystLocalStorage", null, obj1, 5)) {
             i = 1;
          }
          b = i;
       }
       return b;
    }
}
