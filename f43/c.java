package f43.c;
import java.lang.Object;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import e43.b;
import e43.a;
import brd.t;
import t45.d;
import brd.z;
import f43.c$g;
import f43.c$a;
import erd.g;
import crd.b;
import android.app.Activity;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import pp.a;
import q87.c;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import java.util.Map;
import com.kuaishou.live.gameinteractive.auth.model.GameLiveAuthInfo;
import java.lang.IllegalStateException;
import f43.c$f;
import io.reactivex.g;
import f43.c$e;
import erd.o;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import j43.a;
import f43.b;
import com.kwai.library.widget.popup.common.c;
import f43.c$c;
import f43.c$b;
import f43.b$b;
import java.util.Objects;
import java.util.List;
import g43.a;
import f43.c$d;
import java.lang.StringBuilder;
import java.util.Iterator;

public class c	// class@002873
{
    public Map a;
    public Map b;
    public Map c;
    public Set d;
    public static c e;

    public void c(){
       super();
       this.a = new HashMap();
       this.b = new HashMap();
       this.c = new HashMap();
       this.d = new HashSet();
    }
    public static c c(){
       c uoc = c.class;
       Object obj = PatchProxy.apply(null, null, uoc, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (c.e == null) {
          _monitor_enter(uoc);
          if (c.e == null) {
             c.e = new c();
          }
          _monitor_exit(uoc);
       }
       return c.e;
    }
    public void a(String p0,Set p1,Set p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "11")) {
          return;
       }
       a.a().l(p0, this.i(p1), this.i(p2)).retry(3).subscribeOn(d.b).observeOn(d.a).subscribe(new c$g(this, p0), new c$a(this));
       return;
    }
    public t b(String p0,Activity p1,Set p2,boolean p3,ClientContent$LiveStreamPackage p4){
       c$f obj;
       Object[] objArray1;
       c uoc = c.class;
       int i = 0;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, uoc, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = "GameLiveAuthManager";
       if (TextUtils.x(p0)) {
          objArray1 = new Object[i];
          a.C().t(str, "checkAndRequestAuthByAppId error --- empty appId!", objArray1);
          return t.error(new IllegalArgumentException("checkAndRequestAuthByAppId error --- empty appId!"));
       }else {
          Object obj1 = this.b.get(p0);
          if (obj1 == null) {
             objArray1 = new Object[i];
             a.C().t(str, "checkAndRequestAuthByAppId error --- empty AuthInfo!", objArray1);
             return t.error(new IllegalStateException("checkAndRequestAuthByAppId error --- empty AuthInfo!"));
          }else {
             obj = new c$f(this, obj1, p2, p3, p0, p1, p4);
             return t.create(v8).subscribeOn(d.a).map(new c$e(this));
          }
       }
    }
    public void d(boolean p0,ClientContent$LiveStreamPackage p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoc, "13")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.c("button_name", Integer.valueOf(p0));
       String str = oi3.e();
       a.a("USER_INTERACTION_GAME_AUTHORITY_POP_BUTTON", p1, str);
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "7")) {
          return;
       }
       p0 = (!TextUtils.x(p0))? this.a.get(p0): "";
       this.f(p0);
       return;
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "8")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          b uob = this.c.get(p0);
          if (uob != null) {
             if (uob.K()) {
                uob.o();
             }
             this.c.remove(p0);
          }
          this.d.remove(p0);
       }
       return;
    }
    public t g(Activity p0,String p1,String p2,ClientContent$LiveStreamPackage p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p1)) {
          return a.a().k(p1, p2).subscribeOn(d.b).map(new c$c(this)).observeOn(d.a).doOnNext(new c$b(this, p1, p0, p3));
       }
       Object[] objArray = new Object[0];
       a.C().t("GameLiveAuthManager", "requestAuthInfoByAppId error --- empty appId!", objArray);
       return t.error(new IllegalArgumentException("requestAuthInfoByAppId error --- empty appId!"));
    }
    public void h(String p0,Activity p1,GameLiveAuthInfo p2,String p3,ClientContent$LiveStreamPackage p4,b$b p5){
       Object[] objArray;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uoc, "5")) {
             return;
          }
       }
       if (!TextUtils.x(p0) && !this.d.contains(p0)) {
          objArray = null;
          if (!PatchProxy.applyVoidOneRefs(p4, this, uoc, "14")) {
             a.b("USER_INTERACTION_GAME_AUTHORITY_POP", p4, objArray);
          }
          uoc = this.c;
          b uob = new b(p1);
          Objects.requireNonNull(p2);
          p1 = PatchProxy.apply(objArray, p2, GameLiveAuthInfo.class, "10");
          if (p1 != PatchProxyResult.class) {
             objArray = p1;
          }else {
             GameLiveAuthInfo e = p2.e;
             if (e != null && !e.isEmpty()) {
                a url = p2.e.get(0).url;
             }
          }
          uob.z = objArray;
          uob.A = p2.d;
          uob.B = p3;
          uob.C = p2.g;
          uob.D = new c$d(this, p4, p5, p0);
          uob.Z();
          uoc.put(p0, uob);
       }
       return;
    }
    public final String i(Set p0){
       String obj = PatchProxy.applyOneRefs(p0, this, c.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       if (p0 != null && !p0.isEmpty()) {
          StringBuilder str = "";
          Iterator iterator = p0.iterator();
          int i = 0;
          while (iterator.hasNext()) {
             Integer integer = iterator.next();
             if (integer != null) {
                str = str+integer+",";
                i = 1;
             }
          }
          if (i) {
             obj = str.substring(0, str.lastIndexOf(","));
          }
       }
       return obj;
    }
}
