package com.yxcorp.login.userlogin.LaunchLoginHelper;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Collection;
import ekd.q;
import com.yxcorp.login.userlogin.LaunchLoginHelper$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import java.util.List;
import h3b.a;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.Iterator;
import ov5.a;
import java.lang.Exception;

public class LaunchLoginHelper	// class@001afc
{
    public static List a;
    public static boolean b;

    static {
       LaunchLoginHelper.a = new CopyOnWriteArrayList();
    }
    public void LaunchLoginHelper(){
       super();
    }
    public static void a(int p0){
       LaunchLoginHelper launchLoginH = LaunchLoginHelper.class;
       if (PatchProxy.isSupport(launchLoginH) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, launchLoginH, "4")) {
          return;
       }
       if (q.f(LaunchLoginHelper.a)) {
          return;
       }
       boolean b = true;
       if (LaunchLoginHelper.b) {
          if (q.i(a.l(new LaunchLoginHelper$1().getType())).size() <= b) {
             b = false;
          }
       }else {
          b = QCurrentUser.me().isLogined();
       }
       Iterator iterator = LaunchLoginHelper.a.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (uoa == null) {
             continue ;
          }
          uoa.a(b, p0, LaunchLoginHelper.b);
       }
       return;
    }
    public static void b(int p0){
       LaunchLoginHelper launchLoginH = LaunchLoginHelper.class;
       if (PatchProxy.isSupport(launchLoginH) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, launchLoginH, "3")) {
          return;
       }
       if (q.f(LaunchLoginHelper.a)) {
          return;
       }
       LaunchLoginHelper.b = QCurrentUser.me().isLogined();
       Iterator iterator = LaunchLoginHelper.a.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (uoa == null) {
             continue ;
          }else {
             try{
                uoa.b(p0, LaunchLoginHelper.b);
             }catch(java.lang.Exception e1){
                e1.printStackTrace();
                goto label_002f ;
             }
          }
       }
       return;
    }
}
