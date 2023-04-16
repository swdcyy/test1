package com.yxcorp.plugin.search.utils.x;
import java.lang.Object;
import android.content.Context;
import com.kwai.feature.api.social.login.model.LoginParams;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import nfd.h2;
import n3d.a;
import com.kwai.feature.api.social.login.model.LoginParams$a;

public class x	// class@0007b7
{

    public void x(){
       super();
    }
    public static void a(Context p0,int p1,LoginParams p2,Runnable p3){
       if (PatchProxy.isSupport(x.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, null, x.class, "1")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          d.a(-1712118428).x00(p0, p1, p2, new h2(p3));
          return;
       }else if(p3 != null){
          p3.run();
       }
       return;
    }
    public static void b(Context p0,int p1,String p2,Runnable p3){
       if (PatchProxy.isSupport(x.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, null, x.class, "3")) {
          return;
       }
       LoginParams$a uoa = new LoginParams$a();
       uoa.d(p2);
       x.a(p0, p1, uoa.a(), p3);
       return;
    }
    public static void c(Context p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, x.class, "5")) {
          return;
       }
       LoginParams loginParams = new LoginParams();
       if (!PatchProxy.applyVoidThreeRefs(p0, loginParams, p1, null, x.class, "2")) {
          x.a(p0, 0, loginParams, p1);
       }
       return;
    }
    public static void d(Context p0,String p1,Runnable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, x.class, "4")) {
          return;
       }
       x.b(p0, 0, p1, p2);
       return;
    }
}
