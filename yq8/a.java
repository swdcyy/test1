package yq8.a;
import com.taobao.gcanvas.bridges.spec.module.IGBridgeModule;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.Bitmap;
import com.taobao.gcanvas.GCanvasJNI;
import xq8.b;
import xq8.c;
import yq8.a$a;
import android.content.Context;
import tq8.a$a;
import tq8.a;
import yq8.a$c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Throwable;
import yq8.b;
import org.json.JSONArray;
import java.lang.StringBuilder;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;
import yq8.a$b;
import java.util.Iterator;
import org.json.JSONException;
import java.lang.System;
import android.graphics.BitmapFactory;

public abstract class a implements IGBridgeModule	// class@0041bd
{
    public HashMap a;
    public HashMap b;
    public a c;
    public static final String d = "a";

    public void a(){
       super();
       this.a = new HashMap();
       this.b = new HashMap();
    }
    public void b(String p0,String p1,int p2,Object p3){
       if (!TextUtils.isEmpty(p1)) {
          try{
             if (p1.startsWith("data:image")) {
                Bitmap uBitmap = this.m(p1.substring((p1.indexOf("base64,") + 7)));
                if (uBitmap != null) {
                   GCanvasJNI.bindTexture(p0, uBitmap, p2, 3553, 0, 6408, 6408, 5121);
                }
             }else {
                c uoc = this.l().b();
                a$a uoa = new a$a(this, p0, p2, p3, uoc, p1);
                this.c.a(this.k(), p1, v8);
                a$c a = v8.a;
                _monitor_enter(a);
                while (!v8.b.get()) {
                   v8.a.wait();
                }
                _monitor_exit(a);
                this.n(p3, e0);
             }
          }catch(java.lang.InterruptedException e0){
          }
       }
    }
    public b c(String p0){
       return this.a.get(p0);
    }
    public void f(int p0){
       try{
          String str = "debug";
          if (p0) {
             if (p0 != 1) {
                if (p0 != 2) {
                   if (p0 == 3) {
                      str = "error";
                   }
                }else {
                   str = "warn";
                }
             }else {
                str = "info";
             }
          }
          GCanvasJNI.setLogLevel(str);
          return;
       }catch(java.lang.NumberFormatException e0){
       }
    }
    public void i(JSONArray p0,Object p1){
       ArrayList uArrayList;
       c uoc = this.l().b();
       String str = "error";
       if (p0 == null || p0.length() != 2) {
          uoc.putString(str, "invalid input param. specify an json array which length is 2, and index 0 is url to load, index 1 is image id.");
          this.n(p1, uoc);
          return;
       }else {
          int i = 0;
          try{
             String str1 = p0.getString(i);
             int intx = p0.getInt(1);
             if (TextUtils.isEmpty(str1)) {
                uoc.putString(str, "invalid input param. url is empty.");
                return;
             }else {
                c uoc1 = this.l().b();
                String str2 = "height";
                String str3 = "width";
                String str4 = "url";
                String str5 = "id";
                if (str1.startsWith("data:image")) {
                   Bitmap uBitmap = this.m(str1.substring((str1.indexOf("base64,") + 7)));
                   if (uBitmap != null) {
                      uoc1.putInt(str5, intx);
                      uoc1.putString(str4, str1);
                      uoc1.putInt(str3, uBitmap.getWidth());
                      uoc1.putInt(str2, uBitmap.getHeight());
                   }else {
                      uoc1.putString(str, "process base64 failed,url="+str1);
                   }
                   this.n(p1, uoc1);
                   return;
                }else {
                   b uob = this.a.get(str1);
                   if (uob == null) {
                      uob = new b();
                      this.a.put(str1, uob);
                   }
                   if (uob.e.get() == -1) {
                      uob.e.set(256);
                      uob.d = intx;
                      uArrayList = this.b.get(str1);
                      if (uArrayList == null) {
                         uArrayList = new ArrayList();
                         this.b.put(str1, uArrayList);
                      }
                      uArrayList.add(p1);
                      a$b uob1 = new a$b(this, str1, uoc1, intx, p1);
                      this.c.a(this.k(), str1, str);
                   }else if(256 == uob.e.get()){
                      uArrayList = this.b.get(str1);
                      if (uArrayList == null) {
                         uArrayList = new ArrayList();
                         this.b.put(str1, uArrayList);
                      }
                      uArrayList.add(p1);
                   }else if(512 == uob.e.get()){
                      uoc1.putInt(str5, intx);
                      uoc1.putString(str4, str1);
                      uoc1.putInt(str3, uob.b);
                      uoc1.putInt(str2, uob.c);
                      uArrayList = this.b.remove(str1);
                      if (uArrayList != null) {
                         Iterator iterator = uArrayList.iterator();
                         while (iterator.hasNext()) {
                            iterator.next();
                            this.n(p1, uoc1);
                         }
                      }
                      this.n(p1, uoc1);
                   }
                   return;
                }
             }
          }catch(org.json.JSONException e11){
             uoc.putString(str, "invalid input param. error parse preload image data:"+e11.getMessage());
             e11.getMessage();
             this.n(p1, uoc);
             return;
          }
       }
    }
    public abstract Context k();
    public abstract b l();
    public Bitmap m(String p0){
       byte[] bytes = p0.getBytes();
       int len = bytes.length;
       int i = 3;
       int i1 = (len / 4) * 3;
       if (!i1) {
          bytes = new byte[0];
       }else {
          byte[] uobyteArray = new byte[i1];
          int i2 = 0;
          int i3 = len - 1;
          int b = bytes[i3];
          int i4 = 10;
          while (b != i4 && (b != 13 && (b == 32 || b == 9))) {
          label_00bc :
             len = i3;
          }
          if (b == 61) {
             i2 = i2 + 1;
             goto label_00bc ;
          }else {
             i3 = 0;
             b = 0;
             int i5 = 0;
             int i6 = 0;
             while (true) {
                if (i3 < len) {
                   int b1 = bytes[i3];
                   if (b1 == i4 || (b1 == 13 || (b1 != 32 && b1 != 9))) {
                      if (b1 >= 65 && b1 <= 90) {
                         b1 = b1 - 65;
                      }else if(b1 >= 97 && b1 <= 122){
                         b1 = b1 - 71;
                      }else if(b1 >= 48 && b1 <= 57){
                         b1 = b1 + 4;
                      }else if(b1 == 43){
                         b1 = 62;
                      }else if(b1 == 47){
                         b1 = 63;
                      }else {
                         bytes = null;
                         break ;
                      }
                      b = b << 6;
                      b = b | (byte)b1;
                      i4 = i6 % 4;
                      if (i4 == i) {
                         i4 = i5 + 1;
                         b1 = b >> 16;
                         uobyteArray[i5] = (byte)b1;
                         i5 = i4 + 1;
                         b1 = b >> 8;
                         uobyteArray[i4] = (byte)b1;
                         i4 = i5 + 1;
                         uobyteArray[i5] = (byte)b;
                         i5 = i4;
                      }
                      i6 = i6 + 1;
                   }
                label_0093 :
                   i3 = i3 + 1;
                   i4 = 10;
                }else if(i2 > 0){
                   int i7 = b << (i2 * 6);
                   len = i5 + 1;
                   uobyteArray[i5] = (byte)(i7 >> 16);
                   if (i2 == 1) {
                      i5 = len + 1;
                      uobyteArray[len] = (byte)(i7 >> 8);
                   }else {
                      i5 = len;
                   }
                }
                bytes = new byte[i5];
                System.arraycopy(uobyteArray, 0, bytes, 0, i5);
                break ;
             }
          }
       }
       return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
    }
    public abstract void n(Object p0,Object p1);
}
