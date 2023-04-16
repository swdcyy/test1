package com.yxcorp.gifshow.map.PhotoMapActivity;
import txc.j;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import com.yxcorp.gifshow.map.PhotoMapActivity$a;
import nsd.u;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import android.os.Bundle;
import com.yxcorp.gifshow.activity.GifshowActivity;
import ekd.i;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import com.yxcorp.gifshow.map.container.PhotoMapContainerFragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.w0;
import k3d.a;
import java.lang.Float;
import java.lang.Number;
import ekd.x0;

public final class PhotoMapActivity extends SingleFragmentActivity implements j	// class@001c64
{
    public String y;
    public static final PhotoMapActivity$a z;

    static {
       PhotoMapActivity.z = new PhotoMapActivity$a(null);
    }
    public void PhotoMapActivity(){
       super();
    }
    public int f(){
       return 297;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PhotoMapActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoMapActivity.class, "4")) {
          return;
       }
       super.onCreate(p0);
       i.i(this, 0, this.isDarkImmersiveMode(), true);
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoMapActivity.class, "3")) {
          return;
       }
       a.p(p0, "outState");
       return;
    }
    public void r1(String p0){
       this.y = p0;
    }
    public Fragment u3(){
       PhotoMapContainerFragment photoMapCont;
       double d;
       double d1;
       String str1;
       String str2;
       String str3;
       boolean b;
       String str4;
       String str5;
       String str6;
       String str7;
       boolean b1;
       String str8;
       boolean b2;
       String str9;
       String str10;
       String str11;
       String str13;
       String str15;
       String str16;
       String str18;
       String str19;
       String str20;
       String str21;
       float f1;
       PhotoMapContainerFragment obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PhotoMapActivity photoMapActi = PhotoMapActivity.class;
       Object[] objArray = null;
       Intent obj1 = PatchProxy.apply(objArray, obj, photoMapActi, "1");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = this.getIntent();
       if (obj1 != null) {
          Uri data = obj1.getData();
          if (data != null) {
             a.o(data, "it");
             String obj2 = PatchProxy.applyOneRefs(data, obj, photoMapActi, "2");
             if (obj2 != patchProxyRe) {
                photoMapCont = obj2;
             label_0205 :
                if (photoMapCont == null) {
                   photoMapCont = new PhotoMapContainerFragment();
                }
                return photoMapCont;
             }else {
                obj2 = data.getScheme();
                String host = data.getHost();
                if (TextUtils.x(obj2) || ((a.g("kwai", obj2) ^ 0x01) || (!TextUtils.x(host) && !(a.g("nearby", host) ^ 0x01)))) {
                   try{
                      obj2 = "latitude";
                      d = a.c(w0.a(data, obj2), 0);
                      d1 = a.c(w0.a(data, "longitude"), 0);
                      String str = "defaultTitle";
                      str1 = w0.a(data, str);
                      str2 = "roleDisable";
                      str3 = "roamCityId";
                      b = a.b(w0.a(data, str2), false);
                      str4 = w0.a(data, "roamCityId");
                      str5 = "province";
                      str6 = w0.a(data, "province");
                      str7 = "isLocator";
                      b1 = a.b(w0.a(data, "isLocator"), false);
                      str8 = "city";
                      b2 = a.b(w0.a(data, "isLocationWhenAuthorized"), false);
                      str9 = w0.a(data, "feedId");
                      str10 = "feedId";
                      str11 = "feedType";
                      String str12 = "mapEnterSource";
                      str13 = w0.a(data, "feedType");
                      String str14 = w0.a(data, str12);
                      str15 = "isLocationWhenAuthorized";
                      str16 = w0.a(data, "city");
                      String str17 = w0.a(data, "firstLevel");
                      float f = 0;
                      str18 = "firstLevel";
                      a uoa = a.class;
                      if (PatchProxy.isSupport(uoa)) {
                         str19 = str12;
                         str20 = str14;
                         str21 = str;
                         Object obj3 = PatchProxy.applyTwoRefs(str17, Float.valueOf(f), null, uoa, "5");
                         if (obj3 != patchProxyRe) {
                            f1 = obj3.floatValue();
                         }
                      }else {
                         str21 = str;
                         str19 = str12;
                         str20 = str14;
                      }
                      f = Float.parseFloat(str17);
                      f1 = f;
                   }catch(java.lang.Exception e0){
                   }
                   Bundle uBundle = new Bundle();
                   uBundle.putBoolean(str2, b);
                   uBundle.putDouble(obj2, d);
                   uBundle.putDouble("longitude", d1);
                   uBundle.putString(str21, str1);
                   uBundle.putString(str19, str20);
                   uBundle.putString(str8, str16);
                   uBundle.putString(str3, str4);
                   uBundle.putString(str5, str6);
                   uBundle.putBoolean(str7, b1);
                   uBundle.putBoolean(str15, b2);
                   uBundle.putString(str10, str9);
                   uBundle.putString(str11, str13);
                   uBundle.putFloat(str18, f1);
                   uBundle.putInt("fromSource", a.d(w0.a(data, "fromSource"), 0));
                   uBundle.putString("pageSource", w0.a(data, "pageSource"));
                   uBundle.putInt("innerLocationSourceType", a.d(w0.a(data, "innerLocationSourceType"), 0));
                   uBundle.putBoolean("distanceTagAnnotationed", a.b(w0.a(data, "distanceTagAnnotationed"), 0));
                   uBundle.putString("momentUserType", w0.a(data, "momentUserType"));
                   uBundle.putString("momentUserId", x0.a(data, "momentUserId"));
                   uBundle.putString("chatroomUserId", x0.a(data, "chatroomUserId"));
                   uBundle.putString("extlistUserId", x0.a(data, "extlistUserId"));
                   uBundle.putBoolean("showMomentList", a.b(w0.a(data, "showMomentList"), false));
                   obj = new PhotoMapContainerFragment();
                   obj.setArguments(uBundle);
                   photoMapCont = obj;
                   goto label_0205 ;
                }
             }
          }
       }
       photoMapCont = objArray;
       goto label_0205 ;
    }
    public int x3(){
       return 0x7f0d0028;
    }
    public String y(){
       Object obj = PatchProxy.apply(null, this, PhotoMapActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(297);
    }
    public void z2(int p0){
    }
}
