package com.yxcorp.login.userlogin.pluginimpl.GrowthLoginPluginImpl;
import eyb.c;
import com.yxcorp.login.userlogin.pluginimpl.GrowthLoginPluginImpl$a;
import nsd.u;
import com.yxcorp.login.userlogin.pluginimpl.GrowthLoginPluginImpl$Companion$slideGuideInterval$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.login.userlogin.pluginimpl.GrowthLoginPluginImpl$Companion$slideGuideDailyLimit$2;
import com.yxcorp.login.userlogin.pluginimpl.GrowthLoginPluginImpl$Companion$slideGuideLimit$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h3b.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.lang.System;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Boolean;
import oe6.e;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Number;
import com.yxcorp.gifshow.util.DateUtils;

public class GrowthLoginPluginImpl implements c	// class@001b91
{
    public static int b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final GrowthLoginPluginImpl$a f;

    static {
       GrowthLoginPluginImpl.f = new GrowthLoginPluginImpl$a(null);
       GrowthLoginPluginImpl.b = -1;
       GrowthLoginPluginImpl.c = s.c(GrowthLoginPluginImpl$Companion$slideGuideInterval$2.INSTANCE);
       GrowthLoginPluginImpl.d = s.c(GrowthLoginPluginImpl$Companion$slideGuideDailyLimit$2.INSTANCE);
       GrowthLoginPluginImpl.e = s.c(GrowthLoginPluginImpl$Companion$slideGuideLimit$2.INSTANCE);
    }
    public void GrowthLoginPluginImpl(){
       super();
    }
    public void FE(){
       if (PatchProxy.applyVoid(null, this, GrowthLoginPluginImpl.class, "2")) {
          return;
       }
       SharedPreferences a = a.a;
       SharedPreferences$Editor uEditor = a.edit();
       uEditor.putInt("slide_guide_limit", (a.k() + 1));
       g.a(uEditor);
       a.w((a.j() + 1));
       SharedPreferences$Editor uEditor1 = a.edit();
       uEditor1.putLong("slide_guide_daily_time", System.currentTimeMillis());
       g.a(uEditor1);
       return;
    }
    public boolean RJ(int p0){
       QCurrentUser obj;
       boolean b1;
       int i2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       GrowthLoginPluginImpl growthLoginP = GrowthLoginPluginImpl.class;
       if (PatchProxy.isSupport(growthLoginP)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, growthLoginP, "1");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (e.i()) {
          obj = QCurrentUser.ME;
          a.o(obj, "QCurrentUser.ME");
          if (!obj.isLogined()) {
             String str = "3";
             if (PatchProxy.isSupport(growthLoginP)) {
                Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, growthLoginP, str);
                if (obj1 != patchProxyRe) {
                   b1 = obj1.booleanValue();
                }else {
                label_004b :
                   int i = a.j();
                   long longx = a.a.getLong("slide_guide_daily_time", 0);
                   int i1 = a.k();
                   GrowthLoginPluginImpl$a f = GrowthLoginPluginImpl.f;
                   Objects.requireNonNull(f);
                   Number number = PatchProxy.apply(null, f, GrowthLoginPluginImpl$a.class, str);
                   if (number == patchProxyRe) {
                      number = GrowthLoginPluginImpl.e.getValue();
                   }
                   if (i1 < number.intValue()) {
                      if (DateUtils.I(longx, System.currentTimeMillis())) {
                         if (i < f.a()) {
                         label_0095 :
                            i2 = 1;
                         label_0098 :
                            if (i2 && (f.b() <= 0 || !(p0 % (f.b() + 1)))) {
                               b1 = true;
                            }
                         }
                      }else {
                         a.w(b);
                         if (f.a() > 0) {
                            goto label_0095 ;
                         }
                      }
                      i2 = 0;
                      goto label_0098 ;
                   }
                label_00aa :
                   b1 = false;
                }
             }else {
                goto label_004b ;
             }
             if (b1) {
                b = true;
             }
          }
       }
       return b;
    }
    public boolean isAvailable(){
       return true;
    }
}
