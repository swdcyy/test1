package com.yxcorp.gifshow.message.init.KLinkInitManager;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import n75.b;
import com.kwai.social.startup.reminder.model.IMConfigInfo;
import pt7.a;
import java.util.HashMap;
import java.lang.Number;
import xf6.i;
import com.kwai.chat.kwailink.data.ClientAppInfo$b;
import java.util.Locale;
import ra6.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.util.Map;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import com.yxcorp.gifshow.message.init.KLinkInitManager$1;
import java.lang.Integer;
import com.kwai.chat.kwailink.config.KwaiLinkDefaultServerInfo;
import java.util.List;
import dc5.e;
import com.kwai.chat.kwailink.log.KLog;
import dc5.c;
import com.kwai.chat.kwailink.data.ZtCommonInfo;
import com.kwai.chat.kwailink.base.b;

public class KLinkInitManager	// class@001222
{
    public static final KLinkInitManager a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;

    static {
       KLinkInitManager.a = new KLinkInitManager();
       KLinkInitManager.b = new int[3]{443,'P',0x36b0};
       int[] ointArray = new int[]{6443};
       KLinkInitManager.c = ointArray;
       KLinkInitManager.d = new int[3]{6443,6080,0x340a};
    }
    public void KLinkInitManager(){
       super();
    }
    public static KLinkInitManager a(){
       return KLinkInitManager.a;
    }
    public void b(){
       String a;
       int i;
       int[] obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KLinkInitManager kLinkInitMan = KLinkInitManager.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, kLinkInitMan, "1")) {
          return;
       }
       Application uApplication = a.b();
       b uob = new b(uApplication, SystemUtil.r(uApplication));
       uob.c(0x41eb0);
       uob.a(false);
       uob.d(false);
       uob.b(false);
       IMConfigInfo iMConfigInfo = a.b();
       Object[] objArray1 = (iMConfigInfo == null)? objArray: iMConfigInfo.mKtraceConfig;
       if (objArray1 != null) {
          uob.e(objArray1);
       }
       HashMap hashMap = new HashMap();
       String str = "11.3.10.0";
       hashMap.put("imsdkVersion", str);
       a = a.a;
       Object obj = PatchProxy.apply(objArray, this, kLinkInitMan, "6");
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else if(i.f() == 1){
          i = 11;
       }else if(i.f() == 2){
          i = 1;
       }else {
          i = 0;
       }
       ClientAppInfo$b uob1 = new ClientAppInfo$b();
       uob1.b(a.v);
       uob1.c(uApplication.getPackageName());
       uob1.e(a.m);
       uob1.d(a.k);
       uob1.i(a);
       uob1.k(a);
       uob1.f(a);
       String str1 = PatchProxy.apply(objArray, this, kLinkInitMan, "4");
       if (str1 != patchProxyRe) {
       }else {
          Locale locale = a.c();
          a = locale.getLanguage();
          str1 = locale.getCountry();
          str1 = (!TextUtils.isEmpty(str1))? a+"_"+str1: a;
       }
       uob1.j(str1);
       uob1.h(hashMap);
       uob1.g(i);
       ClientAppInfo uClientAppIn = uob1.a();
       uClientAppIn.j().put("sdkVersion", str);
       KLinkInitManager$1 u1 = new KLinkInitManager$1(this);
       if (PatchProxy.isSupport(kLinkInitMan)) {
          obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i), this, kLinkInitMan, "3");
          if (obj1 != patchProxyRe) {
          }else if(SystemUtil.K()){
             Object obj2 = PatchProxy.apply(objArray, this, kLinkInitMan, "2");
             if (obj2 != patchProxyRe) {
                obj1 = obj2;
             }else {
                List list = e.a();
                if (list != null && list.size() == 2) {
                   a = list.get(1);
                   if (!TextUtils.isEmpty(list.get(false)) && (!TextUtils.isEmpty(a) && TextUtils.isDigitsOnly(a))) {
                      objArray = new KwaiLinkDefaultServerInfo();
                      obj1 = new int[]{Integer.parseInt(list.get(1))};
                      objArray.a(list.get(false)).e(obj1);
                   }
                }
             label_014f :
                obj1 = objArray;
             }
             if (obj1 == null) {
             label_0153 :
                if (i) {
                   if (i != 1) {
                      if (i != 2) {
                         obj1 = new KwaiLinkDefaultServerInfo().b("10.32.144.21").a("klink-tcp.testing.internal");
                         obj1.e(KLinkInitManager.c);
                      }else {
                         obj1 = new KwaiLinkDefaultServerInfo().a("bjfk-staging-ls54.yz02");
                         obj1.e(KLinkInitManager.d);
                      }
                   }else {
                      obj1 = new KwaiLinkDefaultServerInfo().a("infra-xm-rs-klink-staging1.idchb1az1.hb1.kwaidc.com");
                      obj1.e(KLinkInitManager.d);
                   }
                }else {
                   obj1 = new KwaiLinkDefaultServerInfo().b("103.102.200.14").b("103.107.219.52").a("slink.gifshow.com").a("slink.ksapisrv.com");
                   obj1.e(KLinkInitManager.b);
                }
             }
          }else {
             goto label_0153 ;
          }
       }else {
          goto label_00f3 ;
       }
       b.f(uob, uClientAppIn, u1, obj1, c.f());
       return;
    }
}
