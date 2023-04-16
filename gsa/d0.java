package gsa.d0;
import java.lang.Object;
import wq6.h;
import pua.a;
import com.kwai.component.homepage_interface.skin.HomeActionBarSkinHelper;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.component.homepage_interface.skin.HomeActionBarSkinHelper$getTabBackgroundImage$1;
import msd.l;
import pua.a$a;
import tyc.o5;
import com.kwai.component.homepage_interface.skin.HomeActionBarSkinHelper$getTabBackgroundImageGravity$1;
import android.content.Context;
import java.lang.Boolean;
import java.lang.Number;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.plugin.impl.growth.GrowthUserLoginPlugin;
import androidx.core.content.ContextCompat;
import com.kwai.component.homepage_interface.skin.HomeActionBarSkinHelper$getLeftTextColor$1;
import com.kwai.component.homepage_interface.skin.HomeActionBarSkinHelper$getRedPointFillColor$1;
import zf6.k;
import ekd.r;

public class d0	// class@002be4
{

    public void d0(){
       super();
    }
    public static a a(h p0,int p1){
       String obj;
       HomeActionBarSkinHelper homeActionBa = HomeActionBarSkinHelper.class;
       d0 uod0 = d0.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(uod0)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uod0, "15");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = PatchProxy.applyOneRefs(p0, null, homeActionBa, "10");
       if (obj == patchProxyRe) {
          a.p(p0, "tab");
          obj = HomeActionBarSkinHelper.a.a(p0, null, HomeActionBarSkinHelper$getTabBackgroundImage$1.INSTANCE);
       }
       if (obj == null) {
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             uoa = PatchProxy.applyOneRefs(Integer.valueOf(p1), null, uoa, "11");
             if (uoa != patchProxyRe) {
             label_0055 :
                return uoa;
             }
          }
          uoa = a.d.a(p1);
          goto label_0055 ;
       }else {
          Object obj1 = PatchProxy.applyOneRefs(p0, null, homeActionBa, "11");
          if (obj1 != patchProxyRe) {
          }else {
             a.p(p0, "tab");
             obj1 = HomeActionBarSkinHelper.a.a(p0, null, HomeActionBarSkinHelper$getTabBackgroundImageGravity$1.INSTANCE);
          }
          return new o5(obj, p1, obj1);
       }
    }
    public static a b(h p0,Context p1,boolean p2){
       if (PatchProxy.isSupport(d0.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, d0.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = (p2)? d0.l(p1, p0): d0.f(p1, p0);
       return d0.a(p0, i);
    }
    public static int c(Context p0,h p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       HomeActionBarSkinHelper obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, d0.class, "8");
       if (obj1 != patchProxyRe) {
          return obj1.intValue();
       }
       int i = 0x7f06160b;
       if (d.a(-2043427941).BH()) {
          i = 0x7f061f86;
       }
       int color = ContextCompat.getColor(p0, i);
       obj1 = HomeActionBarSkinHelper.class;
       if (PatchProxy.isSupport(obj1)) {
          Object obj2 = PatchProxy.applyTwoRefs(p1, Integer.valueOf(color), obj, obj1, "15");
          if (obj2 != patchProxyRe) {
             color = obj2.intValue();
          label_0062 :
             return color;
          }
       }
       a.p(p1, "tab");
       color = HomeActionBarSkinHelper.a.a(p1, Integer.valueOf(color), new HomeActionBarSkinHelper$getLeftTextColor$1(color)).intValue();
       goto label_0062 ;
    }
    public static int d(Context p0,h p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       HomeActionBarSkinHelper obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, d0.class, "13");
       if (obj1 != patchProxyRe) {
          return obj1.intValue();
       }
       int color = ContextCompat.getColor(p0, R.color.arg_RES_7f060751);
       obj1 = HomeActionBarSkinHelper.class;
       if (PatchProxy.isSupport(obj1)) {
          Object obj2 = PatchProxy.applyTwoRefs(p1, Integer.valueOf(color), obj, obj1, "14");
          if (obj2 != patchProxyRe) {
             color = obj2.intValue();
          label_0050 :
             return color;
          }
       }
       a.p(p1, "tab");
       color = HomeActionBarSkinHelper.a.a(p1, Integer.valueOf(color), new HomeActionBarSkinHelper$getRedPointFillColor$1(color)).intValue();
       goto label_0050 ;
    }
    public static int e(Context p0,h p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d0.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return HomeActionBarSkinHelper.e(p1, ContextCompat.getColor(p0, 0x7f06008d));
    }
    public static int f(Context p0,h p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return HomeActionBarSkinHelper.h(p1, ContextCompat.getColor(p0, 0x7f061f1e));
    }
    public static int g(Context p0,h p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (k.d())? 0x7f061e52: 0x7f061d77;
       return HomeActionBarSkinHelper.j(p1, ContextCompat.getColor(p0, i));
    }
    public static int h(Context p0,h p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return HomeActionBarSkinHelper.d(p1, ContextCompat.getColor(p0, 0x7f061680));
    }
    public static int i(Context p0,h p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return HomeActionBarSkinHelper.k(p1, ContextCompat.getColor(p0, 0x7f061642));
    }
    public static int j(Context p0,h p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d0.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return HomeActionBarSkinHelper.e(p1, ContextCompat.getColor(p0, 0x7f062030));
    }
    public static int k(h p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d0.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return HomeActionBarSkinHelper.k(p0, -1);
    }
    public static int l(Context p0,h p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return HomeActionBarSkinHelper.h(p1, r.d(0, ContextCompat.getColor(p0, 0x7f061f1e)));
    }
    public static int m(Context p0,h p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d0.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return HomeActionBarSkinHelper.j(p1, ContextCompat.getColor(p0, 0x7f061e52));
    }
    public static int n(Context p0,h p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return HomeActionBarSkinHelper.d(p1, ContextCompat.getColor(p0, 0x7f062055));
    }
}
