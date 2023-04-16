package com.kuaishou.merchant.basic.util.FoldUtils;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.res.Resources;
import android.content.res.Configuration;
import java.lang.CharSequence;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.merchant.basic.util.FoldUtils$FoldSwitchConfig;
import java.lang.reflect.Type;
import com.yxcorp.utility.RomUtils;
import lnc.d2;

public class FoldUtils	// class@0015cf
{

    public void FoldUtils(){
       super();
    }
    public static boolean a(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FoldUtils.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (p0.getResources().getConfiguration().toString()).contains("mWindowingMode=fullscreen");
    }
    public static boolean b(Activity p0){
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FoldUtils uFoldUtils = FoldUtils.class;
       FoldUtils$FoldSwitchConfig obj = PatchProxy.applyOneRefs(p0, null, uFoldUtils, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, null, uFoldUtils, "10");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): a.t().getValue("merchantFoldLiveShopSplit", FoldUtils$FoldSwitchConfig.class, new FoldUtils$FoldSwitchConfig()).mShowShopSplitEnable;
       boolean b1 = false;
       if (b == null) {
          return b1;
       }else if(!FoldUtils.d(p0)){
          obj = PatchProxy.apply(null, null, uFoldUtils, "11");
          b = (obj != patchProxyRe)? obj.booleanValue(): a.t().getValue("merchantFoldLiveShopSplit", FoldUtils$FoldSwitchConfig.class, new FoldUtils$FoldSwitchConfig()).mOtherSplitEnable;
          if (b != null) {
             obj = PatchProxy.applyOneRefs(p0, null, uFoldUtils, "6");
             if (obj != patchProxyRe) {
                b2 = obj.booleanValue();
             }else {
                obj = PatchProxy.apply(null, null, uFoldUtils, "4");
                if (obj != patchProxyRe) {
                   b = obj.booleanValue();
                }else if(RomUtils.n() && d2.g()){
                   b = true;
                }else {
                   b = false;
                }
                if (b) {
                   if (!FoldUtils.e()) {
                      Object obj1 = PatchProxy.applyOneRefs(p0, null, uFoldUtils, "5");
                      if (obj1 != patchProxyRe) {
                         b2 = obj1.booleanValue();
                      }else {
                         String str = p0.getResources().getConfiguration().toString();
                         b2 = (str.contains("hwMultiwindow-magic") || str.contains("hw-magic-windows"))? true: false;
                      }
                      if (!b2) {
                      label_00cf :
                         b2 = false;
                      }
                   }
                   b2 = true;
                }else {
                   goto label_00cf ;
                }
             }
             if (b2) {
             label_00d2 :
                b1 = true;
             }
          }
       }else {
          goto label_00d2 ;
       }
       return b1;
    }
    public static boolean c(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FoldUtils.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!FoldUtils.d(p0)) {
          return false;
       }
       return a.t().getValue("merchantFoldLiveShopSplit", FoldUtils$FoldSwitchConfig.class, new FoldUtils$FoldSwitchConfig()).mJumpThirdSplit;
    }
    public static boolean d(Activity p0){
       boolean b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FoldUtils uFoldUtils = FoldUtils.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, uFoldUtils, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, null, uFoldUtils, "1");
       boolean b = true;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else if(RomUtils.s() && d2.g()){
          b1 = true;
       }else {
          b1 = false;
       }
       if (b1) {
          if (!FoldUtils.e()) {
             Object obj1 = PatchProxy.applyOneRefs(p0, null, uFoldUtils, "2");
             if (obj1 != patchProxyRe) {
                b2 = obj1.booleanValue();
             }else {
                String str = p0.getResources().getConfiguration().toString();
                b2 = (str.contains("oplus-magic-windows") || str.contains("mWindowingMode=9"))? true: false;
             }
             if (!b2) {
             label_006e :
                b = false;
             }
          }
       }else {
          goto label_006e ;
       }
       return b;
    }
    public static boolean e(){
       Object obj = PatchProxy.apply(null, null, FoldUtils.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       d2.n();
       return d2.k();
    }
}
