package com.yxcorp.gifshow.m;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.gifshow.reddot.model.RedDotLogModel;
import k9c.e;
import com.yxcorp.gifshow.util.ReddotRecordHelper;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.reddot.model.RedDotLogModelWithNotifyId;
import k2b.u1;
import jn5.b;
import jn5.a$a;
import jn5.a;
import uv8.l0;
import msd.a;
import com.kwai.framework.kgi.sdk.Kgi;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.library.widget.textview.IconifyTextView;
import com.yxcorp.gifshow.reddot.model.RedDotLogModelExtParams;
import com.yxcorp.gifshow.reddot.model.RedDotLogModelExtParams$SocialValue;
import tkd.b;
import tkd.d;
import fo5.a;
import com.yxcorp.gifshow.reddot.model.RedDotExtParams;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import k2b.e0;
import wkd.b;
import com.kwai.component.menudot.b;
import com.yxcorp.gifshow.reddot.model.RedDot;
import com.kwai.component.menudot.a;
import ekd.s0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;

public class m	// class@001e61
{

    public void m(){
       super();
    }
    public static int a(int p0,View p1){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, om, "39");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 > 0) {
          return p0;
       }else if(p1 instanceof TextView){
          return Integer.valueOf(p1.getText()).intValue();
       }else {
          return -1;
       }
    }
    public static RedDotLogModel b(View p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, m.class, "38");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       p0 = p0.getTag(R.id.viewtag);
       if (p0 instanceof RedDotLogModel) {
          obj = p0;
       }
       return obj;
    }
    public static Object c(Object p0,Object p1){
       if (p0 != null) {
       }else {
          p0 = p1;
       }
       return p0;
    }
    public static void d(View p0,View p1){
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(obj, p1, obj, m.class, "6")) {
          return;
       }
       String str = "menu_message";
       if (!m.f(e.b(str), true, obj)) {
          m.f(e.b(str), false, p1);
       }
       return;
    }
    public static void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, m.class, "2")) {
          return;
       }
       m.f(e.b("menu_entrance"), true, p0);
       if (p0 != null && !p0.getVisibility()) {
          RedDotLogModel redDotLogMod = m.b(p0);
          if (redDotLogMod != null && redDotLogMod.isDot()) {
             ReddotRecordHelper.e.c("TopMenu");
          }
       }
       return;
    }
    public static boolean f(String p0,boolean p1,View p2){
       ClientEvent$ClickEvent obj;
       if (PatchProxy.isSupport(m.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, null, m.class, "34");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (p2 != null && !p2.getVisibility()) {
          RedDotLogModel redDotLogMod = m.b(p2);
          if (redDotLogMod != null && redDotLogMod.isDot() == p1) {
             a$a obj1 = null;
             if (!PatchProxy.applyVoidTwoRefs(p0, redDotLogMod, obj1, m.class, "41")) {
                obj = new ClientEvent$ClickEvent();
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                obj.elementPackage = uElementPack;
                uElementPack.action2 = "REDPOINT";
                ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
                urlPackage.page = 46;
                urlPackage.category = 1;
                if (TextUtils.x(p0)) {
                   p0.params = redDotLogMod.toString();
                }else {
                   obj.elementPackage.params = new RedDotLogModelWithNotifyId(redDotLogMod, p0).toString();
                }
                u1.z(urlPackage, obj);
                if (!PatchProxy.applyVoidOneRefs(redDotLogMod, obj1, m.class, "43") && TextUtils.n(redDotLogMod.mLocation, "menu_entrance")) {
                   obj1 = new a$a();
                   obj1.g(true);
                   obj1.d("TopMenu");
                   b.a.b(obj1.a());
                }
                Kgi.c(new l0(obj, urlPackage));
             }
             return true;
          }
       }
       return b;
    }
    public static boolean g(boolean p0,View p1){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, null, om, "35");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return m.f("", p0, p1);
    }
    public static void h(GifshowActivity p0,IconifyTextView p1,boolean p2,int p3,int p4,int p5,int p6,int p7){
       int i = 1;
       if (PatchProxy.isSupport2(m.class, "7")) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6),Integer.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, null, m.class, "7")) {
             return;
          }
       }
       RedDotLogModelExtParams redDotLogMod = new RedDotLogModelExtParams();
       RedDotLogModelExtParams$SocialValue socialValue = new RedDotLogModelExtParams$SocialValue(p4, p5, p6);
       redDotLogMod.mSocialValue = socialValue;
       socialValue.mSystemNoticeBox = p7;
       int[] ointArray = new int[i];
       ointArray[0] = 46;
       d.a(-788603288).tM(e.b("menu_message"), p0, p1, "menu_message", 1, false, p2, p3, null, redDotLogMod, ointArray);
       PatchProxy.onMethodExit(m.class, "7");
       return;
    }
    public static void i(GifshowActivity p0,IconifyTextView p1,boolean p2,int p3){
       if (PatchProxy.isSupport2(m.class, "3") && PatchProxy.applyVoidFourRefsWithListener(p0, p1, Boolean.valueOf(p2), Integer.valueOf(p3), null, m.class, "3")) {
          return;
       }
       int[] ointArray = new int[]{46};
       m.n(e.b("menu_notifications"), p0, p1, "menu_notifications", 1, false, p2, p3, null, ointArray);
       PatchProxy.onMethodExit(m.class, "3");
       return;
    }
    public static void j(GifshowActivity p0,View p1,boolean p2){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, m.class, "9")) {
          return;
       }
       int[] ointArray = new int[]{46};
       m.l(p0, p1, String.valueOf(1103), 1, true, p2, 1, ointArray);
       return;
    }
    public static void k(GifshowActivity p0,View p1,String p2,int p3,boolean p4,boolean p5,int p6,RedDotExtParams p7,int[] p8){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = Boolean.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = p7;
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, null, om, "33")) {
             return;
          }
       }
       m.m("", p0, p1, p2, p3, p4, p5, p6, p7, null, p8);
       return;
    }
    public static void l(GifshowActivity p0,View p1,String p2,int p3,boolean p4,boolean p5,int p6,int[] p7){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Boolean.valueOf(p4),Boolean.valueOf(p5),Integer.valueOf(p6),p7};
          if (PatchProxy.applyVoid(objArray, null, om, "32")) {
             return;
          }
       }
       m.k(p0, p1, p2, p3, p4, p5, p6, null, p7);
       return;
    }
    public static void m(String p0,GifshowActivity p1,View p2,String p3,int p4,boolean p5,boolean p6,int p7,RedDotExtParams p8,RedDotLogModelExtParams p9,int[] p10){
       int b;
       String str;
       RedDotLogModel redDotLogMod;
       RedDotExtParams mShowType;
       ClientEvent$ShowEvent showEvent;
       ClientEvent$ElementPackage uElementPack;
       ClientEvent$UrlPackage urlPackage;
       a$a uoa;
       RedDotLogModel redDotLogMod1;
       int i1;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p8;
       object oobject4 = p9;
       object oobject5 = p10;
       int i = 0;
       if (PatchProxy.isSupport(m.class)) {
          Object[] objArray = new Object[11];
          objArray[i] = oobject;
          objArray[1] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = p3;
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Boolean.valueOf(p5);
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = oobject3;
          objArray[9] = oobject4;
          objArray[10] = oobject5;
          if (PatchProxy.applyVoid(objArray, null, m.class, "30")) {
             return;
          }
       }
       if (oobject2 != null && !p2.getVisibility()) {
          RedDotLogModel obj = PatchProxy.applyTwoRefs(oobject1, oobject5, null, m.class, "36");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(!p1.b3() || oobject5.length <= 0){
             ClientEvent$UrlPackage urlPackage1 = u1.k();
             int page = (urlPackage1 == null)? p1.getPage(): urlPackage1.page;
             if (page == null) {
                Fragment uFragment = p1.getSupportFragmentManager().findFragmentById(0x1020002);
                if (uFragment instanceof e0) {
                   page = uFragment.getPage();
                   if (page) {
                   }
                }
             }else {
             }
          }
       label_00ae :
          b = false;
       }
    label_0197 :
       return;
    }
    public static void n(String p0,GifshowActivity p1,View p2,String p3,int p4,boolean p5,boolean p6,int p7,RedDotLogModelExtParams p8,int[] p9){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object[] objArray = new Object[10];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Boolean.valueOf(p5);
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = p8;
          objArray[9] = p9;
          if (PatchProxy.applyVoid(objArray, null, om, "31")) {
             return;
          }
       }
       m.m(p0, p1, p2, p3, p4, p5, p6, p7, null, p8, p9);
       return;
    }
}
