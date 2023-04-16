package com.yxcorp.gifshow.homepage.menu.e$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.homepage.menu.e;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xl8.b;
import java.lang.Boolean;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Objects;
import com.yxcorp.gifshow.homepage.menu.g;
import com.yxcorp.gifshow.homepage.menu.a;
import lnc.a1;
import wh5.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import k2b.e0;
import com.yxcorp.gifshow.m;
import dk9.a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.childprotect.util.ChildProtectUtil$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import java.util.List;
import uj9.l;
import com.yxcorp.gifshow.childprotect.ChildProtectActivity;
import android.content.Intent;
import android.content.Context;
import com.yxcorp.gifshow.childlock.ChildLockGuideActivity;

public class e$b extends m	// class@001777
{
    public final e c;

    public void e$b(e p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       String str5;
       String str6;
       String str7;
       boolean b2;
       boolean b6;
       i3 oi3;
       ClientContent$ContentPackage uContentPack;
       String obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, e$b.class, "1")) {
          return;
       }
       if (!obj.c.r.a().booleanValue()) {
          return;
       }
       e$b c = obj.c;
       GifshowActivity activity = c.getActivity();
       Objects.requireNonNull(c);
       g og = g.class;
       if (!PatchProxy.applyVoidOneRefs(activity, c, e.class, "10")) {
          c.p.a();
          c.q.a(13);
          e q = c.q;
          String str = a1.p(R.string.arg_RES_7f10471c);
          boolean b = (!c.x.getVisibility())? true: false;
          boolean b1 = c.b();
          Objects.requireNonNull(q);
          String str1 = "";
          String str2 = "S-27612AD84075";
          String str3 = "S-0C7AE44BC31B";
          String str4 = "status";
          if (PatchProxy.isSupport(og)) {
             str5 = str4;
             str6 = str3;
             str7 = str2;
             obj = str1;
             b2 = b;
             if (PatchProxy.applyVoidThreeRefs(str, Boolean.valueOf(b), Boolean.valueOf(b1), q, g.class, "34")) {
             label_00de :
                q = c.q;
                String str8 = a1.p(R.string.arg_RES_7f10471c);
                boolean b3 = (!c.x.getVisibility())? true: false;
                boolean b4 = c.b();
                Objects.requireNonNull(q);
                if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidThreeRefs(str8, Boolean.valueOf(b3), Boolean.valueOf(b4), q, g.class, "32")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "MENU_BUTTON";
                   oi3 = q.d("6", str8, b3, 0, "home");
                   str3 = (b4)? "on": "off";
                   oi3.d(str5, str3);
                   uElementPack.params = oi3.e();
                   uContentPack = new ClientContent$ContentPackage();
                   uContentPack.ksOrderInfoPackage = q.c(str6, str7, b3);
                   u1.L(obj, null, 3, uElementPack, uContentPack);
                }
                e v = c.v;
                if (PatchProxy.applyVoidOneRefs(v, null, m.class, "12")) {
                   boolean b5 = true;
                }else {
                   m.g(true, v);
                }
                List obj1 = PatchProxy.apply(null, null, a.class, "1");
                if (obj1 != PatchProxyResult.class) {
                   b6 = obj1.booleanValue();
                }else {
                   obj1 = l.d(new ChildProtectUtil$1().getType());
                   str7 = (obj1 != null && !obj1.isEmpty())? 1: 0;
                   b6 = str7;
                }
                if (b6) {
                   if (!PatchProxy.applyVoidOneRefs(activity, null, ChildProtectActivity.class, "1")) {
                      activity.startActivity(new Intent(activity, ChildProtectActivity.class));
                   }
                }else {
                   ChildLockGuideActivity.A3(activity);
                }
             }
          }else {
             str5 = str4;
             str6 = str3;
             str7 = str2;
             obj = str1;
             b2 = b;
          }
          ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
          uElementPack1.action2 = "FLOW_OPERATE_LOC";
          ClientEvent$ElementPackage uElementPack2 = uElementPack1;
          oi3 = q.d("6", str, b2, 0, "home");
          str4 = (b1)? "on": "off";
          oi3.d(str5, str4);
          uElementPack2.params = oi3.e();
          uContentPack = new ClientContent$ContentPackage();
          uContentPack.ksOrderInfoPackage = q.c(str6, str7, b2);
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page2 = "APP_GENERAL";
          u1.A(urlPackage, obj, 3, uElementPack2, uContentPack);
          goto label_00de ;
       }
       return;
    }
}
