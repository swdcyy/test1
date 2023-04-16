package com.facebook.react.views.textinput.ReactTextInputManager$g;
import android.text.TextWatcher;
import com.facebook.react.views.textinput.ReactTextInputManager;
import ze.n0;
import com.facebook.react.views.textinput.ReactEditText;
import java.lang.Object;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.Class;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import df.c;
import android.text.Editable;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import od.a;
import com.facebook.react.bridge.JavaOnlyMap;
import java.lang.StringBuilder;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Math;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableArray;
import ze.m0;
import ag.d;
import android.widget.EditText;
import df.b;
import ag.g;
import com.facebook.react.bridge.ReactApplicationContext;

public class ReactTextInputManager$g implements TextWatcher	// class@00142e
{
    public final n0 b;
    public c c;
    public ReactEditText d;
    public String e;
    public final ReactTextInputManager f;

    public void ReactTextInputManager$g(ReactTextInputManager p0,n0 p1,ReactEditText p2){
       this.f = p0;
       super();
       this.c = p1.getNativeModule(UIManagerModule.class).getEventDispatcher();
       this.b = p1;
       this.d = p2;
       this.e = null;
    }
    public void afterTextChanged(Editable p0){
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ReactTextInputManager$g.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ReactTextInputManager$g.class, "1")) {
          return;
       }
       this.e = p0.toString();
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       String this;
       int i6;
       String str7;
       String str8;
       ReactTextInputManager$g og = this;
       int i = p1;
       int i1 = p2;
       int i2 = p3;
       if (PatchProxy.isSupport(ReactTextInputManager$g.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ReactTextInputManager$g.class, "2")) {
          return;
       }
       if (og.d.D != null) {
          return;
       }
       if (!i2 && !i1) {
          return;
       }
       a.c(og.e);
       int i3 = i + i2;
       String str = (p0.toString()).substring(i, i3);
       int i4 = i + i1;
       String str1 = (og.e).substring(i, i4);
       if (i2 == i1 && str.equals(str1)) {
          return;
       }
       ReactEditText b = og.d.B;
       this = "fragments";
       int i5 = 0;
       if (b != null && b.hasKey(this)) {
          String str2 = p0.subSequence(i, i3).toString();
          String str3 = b.getString("string");
          StringBuilder str4 = str3.substring(i5, i)+str2;
          String str5 = "";
          String str6 = (str3.length() > i4)? str3.substring(i4): str5;
          b.putString("string", str4+str6);
          JavaOnlyArray array = b.getArray(this);
          i6 = 0;
          int i7 = 0;
          int i8 = 0;
          while (i6 < array.size() && !i7) {
             JavaOnlyMap map = array.getMap(i6);
             JavaOnlyArray javaOnlyArra = array;
             str6 = map.getString("string");
             i2 = i8 + str6.length();
             if (i2 < i) {
                p1 = i2;
                str7 = str1;
                str8 = str5;
                str5 = null;
             }else {
                i7 = i - i8;
                i8 = str6.length() - i7;
                p1 = i2;
                str7 = str1;
                str8 = str5;
                i7 = i7 + Math.min(i1, i8);
                map.putString("string", str6.substring(0, i7)+str2+str6.substring(i7));
                if (i8 < i1) {
                   i = i + i8;
                   i1 = i1 - i8;
                   str2 = str8;
                   i7 = 0;
                }else {
                   i7 = 1;
                }
             }
             i6 = i6 + 1;
             i8 = p1;
             array = javaOnlyArra;
             str5 = str8;
             str1 = str7;
          }
       }
       str7 = str1;
       int i9 = 0;
       i6 = i;
       if (og.d.C != null && b != null) {
          WritableNativeMap writableNati = new WritableNativeMap();
          WritableNativeMap writableNati1 = new WritableNativeMap();
          WritableNativeArray writableNati2 = new WritableNativeArray();
          for (; i9 < b.getArray(this).size(); i9 = i9 + 1) {
             ReadableMap map1 = b.getArray(this).getMap(i9);
             WritableNativeMap writableNati3 = new WritableNativeMap();
             str1 = "reactTag";
             writableNati3.putDouble(str1, (double)map1.getInt(str1));
             writableNati3.putString("string", map1.getString("string"));
             writableNati2.pushMap(writableNati3);
          }
          writableNati1.putString("string", b.getString("string"));
          writableNati1.putArray(this, writableNati2);
          writableNati.putInt("mostRecentEventCount", og.d.c());
          writableNati.putMap("textChanged", writableNati1);
          og.d.C.a(writableNati);
       }
       og.c.c(new d(og.d.getId(), p0.toString(), og.d.c()));
       g og1 = new g(og.d.getId(), str, str7, i6, (i6 + i1));
       og.c.c(b);
       og.b.b().onInputEvent();
       return;
    }
}
