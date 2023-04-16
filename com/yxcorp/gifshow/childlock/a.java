package com.yxcorp.gifshow.childlock.a;
import java.lang.Object;
import com.google.common.collect.ImmutableList;
import java.lang.String;
import java.util.regex.Pattern;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.net.Uri;
import ekd.w0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import crd.b;
import lnc.b9;
import uj9.l;
import java.lang.Number;
import xf6.d;
import xf6.l;
import com.kwai.component.uiconfig.childlock.model.TeenageModeConfig;
import wh5.a;
import java.lang.Long;
import java.lang.Exception;
import uj9.c;
import java.lang.Runnable;
import ekd.k1;
import uj9.d;
import androidx.fragment.app.KwaiDialogFragment;
import wh5.c;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.Integer;
import java.lang.NumberFormatException;

public class a	// class@00107a
{
    public b a;
    public ChildLockDialog b;
    public boolean c;
    public boolean d;
    public static final ImmutableList e;
    public static final Pattern f;

    static {
       a.e = ImmutableList.of("ChildLockSettingActivity", "ChildLockSettingConfirmActivity", "ChildLockGuideActivity", "ChildVerifyActivity", "VerifyPhoneActivity", "BindPhoneNumberActivity", "BindPhoneVerifyActivity");
       a.f = Pattern.compile("^kwai://.*[\\\\?|&].*openFrom=.*xxl_.*_gdt_.*");
    }
    public void a(){
       super();
    }
    public boolean a(Activity p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (p0 instanceof KwaiYodaWebViewActivity) {
          Object obj1 = PatchProxy.applyOneRefs(p0, this, uoa, "2");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             Uri uri = w0.f(p0.getWebUrl());
             b = (!uri.isHierarchical())? 1: Boolean.parseBoolean(w0.a(uri, "disableChildLockTipsDialog"));
          }
          return (b ^ 1);
       }else if(p0 instanceof GifshowActivity){
          return (a.e.contains(p0.getClass().getSimpleName()) ^ 1);
       }else {
          return false;
       }
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       b9.a(this.a);
       return;
    }
    public final void c(){
       long l1;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "6")) {
          return;
       }
       if (!this.e()) {
          long l = l.a();
          TeenageModeConfig obj = PatchProxy.apply(objArray, this, uoa, "9");
          if (obj != PatchProxyResult.class) {
             l1 = obj.longValue();
          }else {
             long l2 = 0xea60;
             if (l.c("key_enable_childlock_debug", false)) {
                l1 = l2;
             }else {
                obj = a.c();
                try{
                   l1 = Long.parseLong(obj.mMaxUsageMinutes) * l2;
                }catch(java.lang.Exception e0){
                   e0.printStackTrace();
                   l1 = 0x249f00;
                }
             }
          }
       }
       k1.o(new d(this));
    label_0061 :
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       try{
          a tb = this.b;
          if (tb != null) {
             tb.dismissAllowingStateLoss();
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       this.b = null;
       return;
    }
    public final boolean e(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       TeenageModeConfig obj = PatchProxy.apply(objArray, this, uoa, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!c.b()) {
          return b;
       }
       obj = a.c();
       if (obj != null) {
          long l = c.i() - l.a.getLong(b.d("user")+"disable_child_lock_curfew_mode_time", 0);
          TeenageModeConfig mDisableStar = obj.mDisableStartHour;
          obj = obj.mDisableEndHour;
          int i = (mDisableStar <= obj)? obj - mDisableStar: (obj - mDisableStar) + 24;
          if (l - ((long)i * 0x36ee80) < 0) {
             return b;
          }
       }
       String[] obj1 = PatchProxy.apply(objArray, this, uoa, "10");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          TeenageModeConfig teenageModeC = a.c();
          if (teenageModeC != null && teenageModeC.mDisableStartHour != teenageModeC.mDisableEndHour) {
             obj1 = (DateUtils.b(c.i())).split(" ");
             if (obj1.length > 1) {
                try{
                   obj1 = (obj1[1]).split(":");
                   if (obj1.length >= 1) {
                      int i1 = Integer.parseInt(obj1[b]);
                      TeenageModeConfig mDisableStar1 = teenageModeC.mDisableStartHour;
                      teenageModeC = teenageModeC.mDisableEndHour;
                      if (mDisableStar1 < teenageModeC) {
                         if (i1 < mDisableStar1 || i1 >= teenageModeC) {
                         }
                      }else if(i1 >= mDisableStar1 || i1 < teenageModeC){
                      }
                      b = true;
                   }
                }catch(java.lang.NumberFormatException e0){
                   e0.printStackTrace();
                }
             }
          }
       }
    }
}
