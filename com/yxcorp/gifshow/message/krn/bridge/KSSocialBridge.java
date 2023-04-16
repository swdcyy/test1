package com.yxcorp.gifshow.message.krn.bridge.KSSocialBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.facebook.react.bridge.Promise;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import km8.b;
import android.content.SharedPreferences;
import java.lang.Boolean;
import java.lang.Integer;
import com.facebook.react.bridge.ReactContext;
import lj0.c;
import lj0.d;
import bi5.a;
import com.facebook.react.bridge.ReadableMap;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType;
import lnc.a1;
import com.facebook.react.bridge.ReadableArray;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$Type;
import qdb.c;
import java.util.Objects;
import w69.i$a;
import w69.b$a;
import w69.b;
import w69.k$a;
import w69.k;
import w69.f$a;
import o79.a;
import w69.f;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import w69.i;
import qdb.c$a;

public final class KSSocialBridge extends KrnBridge	// class@001d78
{

    public void KSSocialBridge(ReactApplicationContext p0){
       a.p(p0, "context");
       super(p0);
    }
    public String getName(){
       return "KSSocialBridge";
    }
    public final void getStartUpConfig(String p0,String p1,Promise p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KSSocialBridge.class, "1")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "type");
       a.p(p2, "promise");
       this.reportAndCheck(this.getName(), "getStartUpConfig", this.getReactApplicationContext());
       SharedPreferences sharedPrefer = b.b("DefaultPreferenceHelper");
       if (sharedPrefer == null) {
          p2.reject("0", "");
          return;
       }else {
          String str = null;
          switch (p1.hashCode()){
              case 0xcad56011:
                if (p1.equals("string")) {
                   str = sharedPrefer.getString(p0, str);
                }
                break;
              case 0x197ef:
                if (p1.equals("int")) {
                label_0072 :
                   str = Integer.valueOf(sharedPrefer.getInt(p0, 0));
                }
                break;
              case 0x2e3aea:
                if (p1.equals("bool")) {
                label_0061 :
                   str = Boolean.valueOf(sharedPrefer.getBoolean(p0, 0));
                }
                break;
              case 0x3db6c28:
                if (p1.equals("boolean")) {
                   goto label_0061 ;
                }
                break;
              case 0x74b5813e:
                if (p1.equals("integer")) {
                   goto label_0072 ;
                }
                break;
              default:
          }
       label_0087 :
          if (str != null) {
             p2.resolve(str);
          }else {
             p2.reject("0", "");
          }
          return;
       }
    }
    public final void reportAndCheck(String p0,String p1,ReactApplicationContext p2){
       String str1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KSSocialBridge.class, "3")) {
          return;
       }
       c uoc = d.a(p2);
       String str = "";
       if (uoc != null) {
          str = uoc.b();
          str1 = uoc.f();
       }else {
          str1 = str;
       }
       a.a(p0, p1, str, str1);
       return;
    }
    public final void selectImg(int p0,ReadableMap p1,Promise p2){
       b$a uoc2;
       k$a uoc2;
       f$a uoc21;
       AlbumLimitOption$Builder uoc21;
       c$a uoa;
       ReadableArray obj = p1;
       Object obj1 = p2;
       if (PatchProxy.isSupport(KSSocialBridge.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, KSSocialBridge.class, "2")) {
          return;
       }
       a.p(obj, "params");
       String str = "promise";
       a.p(obj1, str);
       this.reportAndCheck(this.getName(), "selectImg", this.getReactApplicationContext());
       Activity currentActiv = this.getCurrentActivity();
       c uoc = null;
       if (!currentActiv instanceof GifshowActivity) {
          currentActiv = uoc;
       }
       if (currentActiv != null) {
          String str1 = "needCrop";
          int i = 1;
          boolean b = (obj.hasKey(str1))? obj.getBoolean(str1): true;
          int i1 = 480;
          String str2 = "minWidth";
          if (obj.hasKey(str2)) {
             i1 = obj.getInt(str2);
          }
          ImageSelectSupplier$ImageSelectType aVATAR = ImageSelectSupplier$ImageSelectType.AVATAR;
          String str3 = "cropType";
          if (obj.hasKey(str3)) {
             str3 = obj.getString(str3);
             if (str3 != null && (str3.hashCode() != -1405959847 || !str3.equals("avatar"))) {
                aVATAR = ImageSelectSupplier$ImageSelectType.BACKGROUND;
             }
          }
          int i2 = 0x7f103e99;
          String str4 = a1.p(i2);
          String str5 = "minToast";
          if (obj.hasKey(str5)) {
             str4 = obj.getString(str5);
             if (str4 == null) {
                str4 = a1.p(i2);
             }
          }
          str3 = "source";
          if (obj.hasKey(str3)) {
             obj = obj.getArray(str3);
             if (obj != null && obj.size() == i) {
                String str6 = obj.getString(0);
                if (str6 != null) {
                   i2 = str6.hashCode();
                   if (i2 != -1367751899) {
                      if (i2 == 0x5897e6f && str6.equals("album")) {
                         uoc = ImageSelectSupplier$Type.GALLERY;
                      }
                   }else if(str6.equals("camera")){
                      uoc = ImageSelectSupplier$Type.CAMERA;
                   }
                }
             }
          }
          ImageSelectSupplier$Type type = uoc;
          uoc = c.a;
          a.o(str4, str5);
          Objects.requireNonNull(uoc);
          c uoc1 = c.class;
          if (PatchProxy.isSupport(uoc1)) {
             Object[] objArray = new Object[]{currentActiv,Integer.valueOf(i1),str4,aVATAR,Boolean.valueOf(b),type,obj1};
             if (!PatchProxy.applyVoid(objArray, uoc, uoc1, "1")) {
             }
          }else {
          }
       }
    label_0191 :
       return;
    }
}
