package esa.s;
import java.lang.Object;
import com.google.gson.JsonObject;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.q;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wq6.h;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import esa.s$a;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.kcube.TabIdentifier;
import on5.b;
import wkd.b;
import lnc.u5;
import tkd.b;
import tkd.d;
import gx5.b;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k9c.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import on5.a;
import lnc.i3;
import lnc.o5;
import java.lang.StringBuilder;
import jn5.b;
import jn5.a$a;
import jn5.a;
import org.json.JSONException;
import java.lang.Boolean;
import esa.r;
import msd.a;
import com.kwai.framework.kgi.sdk.Kgi;

public final class s	// class@0027d6
{

    public void s(){
       super();
    }
    public static void a(JsonObject p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, s.class, "8")) {
          return;
       }
       if (!q.h(p1)) {
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (!TextUtils.x(uEntry.getKey()) && !TextUtils.x(uEntry.getValue())) {
                p0.c0(uEntry.getKey(), uEntry.getValue());
             }
          }
       }
       return;
    }
    public static String b(h p0,View p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       s os = s.class;
       Object obj = null;
       String obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, os, "7");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       s$a tag = p1.getTag(R.id.tag_badge_log_info);
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("name", s.h(p0));
       obj1 = "type";
       if (tag != null) {
          jsonObject.a0(obj1, Integer.valueOf(tag.a));
          if (tag.a != null) {
             TabIdentifier tabIdentifie = p0.M2();
             String str = PatchProxy.applyOneRefs(tabIdentifie, obj, os, "9");
             if (str != patchProxyRe) {
             }else {
                int i = -1071465158;
                if (b.n.equals(tabIdentifie)) {
                   str = b.a(i).f();
                }else if(b.l.equals(tabIdentifie)){
                   str = b.a(i).e();
                }else if(b.h.equals(tabIdentifie) || b.E.equals(tabIdentifie)){
                   u5 ou5 = b.a(i);
                   if (!TextUtils.x(ou5.c)) {
                      str = ou5.c;
                   }
                }
                str = "";
             }
             jsonObject.c0("redpoint_id", str);
          }
          s.a(jsonObject, tag.b);
       }else {
          jsonObject.a0(obj1, Integer.valueOf(0));
       }
       if (b.l.equals(p0.M2())) {
          s.a(jsonObject, d.a(0x3673894c).vF());
       }
       return jsonObject.toString();
    }
    public static void c(h p0,int p1,Map p2){
       if (PatchProxy.isSupport(s.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, s.class, "3")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "NAVIGATION_RED_POINT";
       JsonObject jsonObject = new JsonObject();
       String str = s.h(p0);
       jsonObject.c0("red_point_id", e.b(str));
       jsonObject.c0("name", str);
       jsonObject.a0("type", Integer.valueOf(p1));
       s.a(jsonObject, p2);
       uElementPack.params = jsonObject.toString();
       u1.u0(7, uElementPack, null);
       return;
    }
    public static void d(h p0,int p1,Map p2,JsonObject p3,int p4,String p5){
       String str1;
       s os = s.class;
       int i = 2;
       if (PatchProxy.isSupport(os)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, null, os, "4")) {
             return;
          }
       }
       String str = a.c(p0.M2());
       i3 oi3 = i3.f();
       if (p2 != null) {
          Iterator iterator = p2.entrySet().iterator();
          str1 = "";
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (!TextUtils.x(uEntry.getKey()) && !TextUtils.x(uEntry.getValue())) {
                if (TextUtils.n("home_region_source", uEntry.getKey())) {
                   str1 = uEntry.getValue();
                }else {
                   oi3.d(uEntry.getKey(), uEntry.getValue());
                }
             }
          }
       }else {
          str1 = "";
       }
       if (p1 != 4) {
          i = 1;
       }
       p1 = -1;
       int i1 = o5.b(p5, p1);
       String str2 = (i1 == p1)? "": i1+"";
       if (!TextUtils.x(str2)) {
          p5 = "";
       }
       a$a uoa = new a$a();
       uoa.c(p4);
       uoa.e(str2);
       uoa.h(p5);
       uoa.g(i);
       uoa.f(str1);
       uoa.b(p3);
       uoa.d(str);
       b.a.d(uoa.a());
       return;
    }
    public static int e(int p0){
       if (!p0) {
          return 0;
       }
       int i = 1;
       if (p0 == i || (p0 == 5 || (p0 == 6 || (p0 != 7 && p0 != 8)))) {
          i = 2;
          if (p0 == i) {
             return i;
          }else {
             i = 3;
             if (p0 != i && p0 != 4) {
                return 0;
             }
          }
       }
    label_0021 :
       return i;
    }
    public static void f(int p0,View p1,h p2){
       if (PatchProxy.isSupport(s.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, s.class, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       String str = "CLICK_BOTTOM_NAVIGATION_REFRESH";
       try{
          uElementPack.action2 = str;
          uElementPack.params = s.b(p2, p1);
       }catch(org.json.JSONException e8){
          e8.printStackTrace();
       }
       u1.G("", 1, uElementPack, null);
       return;
    }
    public static void g(int p0,boolean p1,View p2,h p3){
       if (PatchProxy.isSupport(s.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, p3, null, s.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       try{
          uElementPack.action2 = "SWITCH_BOTTOM_NAVIGATION";
          uElementPack.params = s.b(p3, p2);
       }catch(org.json.JSONException e10){
          e10.printStackTrace();
       }
       int i = (p1)? 1: 5;
       u1.G("", i, uElementPack, null);
       Kgi.c(new r(uElementPack));
       return;
    }
    public static String h(h p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, s.class, "5");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       TabIdentifier tabIdentifie = p0.M2();
       obj1 = PatchProxy.applyOneRefs(tabIdentifie, obj, a.class, "7");
       obj = "FEATURED";
       if (obj1 != patchProxyRe) {
          obj = obj1;
       }else if(b.B.equals(tabIdentifie)){
          obj = "HOME";
       }else if(b.c.equals(tabIdentifie)){
          obj = "FOLLOW";
       }else if(b.b.equals(tabIdentifie)){
          obj = "HOT";
       }else if(b.d.equals(tabIdentifie)){
          obj = "LOCAL";
       }else if(b.f.equals(tabIdentifie)){
          if (b.n.equals(tabIdentifie)) {
             obj = "NOTIFICATION";
          }else if(b.l.equals(tabIdentifie)){
             obj = "MY";
          }else if(b.h.equals(tabIdentifie)){
             if (b.C.equals(tabIdentifie)) {
                obj = "RECOMMEND";
             }else if(b.D.equals(tabIdentifie)){
                if (b.o.equals(tabIdentifie)) {
                   obj = "CORONA_TV";
                }else if(b.q.equals(tabIdentifie)){
                   obj = "NEWS_SLIDE";
                }else if(b.E.equals(tabIdentifie)){
                   if (b.H.equals(tabIdentifie)) {
                      obj = "explorationContainer";
                   }else {
                      obj = "OTHERS";
                   }
                }
             }
          }
          obj = "FRIENDS";
       }
       return obj;
    }
    public static void i(View p0,int p1,Map p2){
       if (PatchProxy.isSupport(s.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, s.class, "6")) {
          return;
       }
       p0.setTag(R.id.tag_badge_log_info, new s$a(p1, p2));
       return;
    }
}
