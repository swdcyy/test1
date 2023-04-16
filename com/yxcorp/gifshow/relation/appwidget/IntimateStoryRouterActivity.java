package com.yxcorp.gifshow.relation.appwidget.IntimateStoryRouterActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import android.content.Intent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import qrd.l1;
import com.google.gson.JsonElement;
import q2b.h$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import k2b.u1;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import android.app.Application;
import o56.a;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import com.yxcorp.gifshow.relation.appwidget.IntimateStoryRouterActivity$a;
import android.content.Context;
import n3d.a;
import zac.b;
import android.net.Uri;
import ekd.x0;
import java.lang.Boolean;
import com.kwai.kds.krn.api.page.KwaiRnActivity;
import com.kuaishou.krn.model.LaunchModel;
import java.util.Set;
import java.util.Iterator;
import js6.a;
import v9c.a;
import java.lang.StringBuilder;
import java.lang.Exception;
import q87.c;
import xh7.b;
import qh7.b;
import qh7.a;

public final class IntimateStoryRouterActivity extends GifshowActivity	// class@0017da
{
    public Activity y;

    public void IntimateStoryRouterActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, IntimateStoryRouterActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String o(){
       return "PHONE_DESKTOP";
    }
    public void onCreate(Bundle p0){
       String str1;
       String str4;
       String str6;
       Object[] objArray2;
       Object[] objArray3;
       IntimateStoryRouterActivity intimateStor = IntimateStoryRouterActivity.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, intimateStor, str)) {
          return;
       }
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       this.y = uActivityCon.f();
       super.onCreate(p0);
       Intent intent = this.getIntent();
       Object[] objArray = null;
       intent = (intent != null)? intent.getExtras(): objArray;
       boolean b = true;
       if (intent != null && !PatchProxy.applyVoid(objArray, this, intimateStor, "4")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          String str5 = "TIETIE_DESKTOP_WIDGET";
          uElementPack.action2 = str5;
          JsonObject jsonObject1 = new JsonObject();
          Intent intent1 = this.getIntent();
          str4 = "show_type";
          if (intent1 != null) {
             Bundle extras = intent1.getExtras();
             if (extras != null) {
                Integer integer = Integer.valueOf(extras.getInt(str4));
             label_005e :
                jsonObject1.a0(str4, integer);
                intent1 = this.getIntent();
                str4 = "group";
                if (intent1 != null) {
                   extras = intent1.getExtras();
                   if (extras != null && extras.getBoolean(str4) == b) {
                      str6 = "exp";
                   label_007a :
                      jsonObject1.c0(str4, str6);
                      intent1 = this.getIntent();
                      str4 = "tietieid";
                      if (intent1 != null) {
                         extras = intent1.getExtras();
                         if (extras != null) {
                            str6 = extras.getString(str4);
                         label_0091 :
                            if (!TextUtils.isEmpty(str6)) {
                               intent1 = this.getIntent();
                               if (intent1 != null) {
                                  extras = intent1.getExtras();
                                  if (extras != null) {
                                     str6 = extras.getString(str4);
                                  label_00a9 :
                                     jsonObject1.c0(str4, str6);
                                  }
                               }
                               objArray2 = objArray;
                               goto label_00a9 ;
                            }
                            intent1 = this.getIntent();
                            str4 = "uid";
                            if (intent1 != null) {
                               extras = intent1.getExtras();
                               if (extras != null) {
                                  str6 = extras.getString(str4);
                               label_00c0 :
                                  if (!TextUtils.isEmpty(str6)) {
                                     intent1 = this.getIntent();
                                     if (intent1 != null) {
                                        extras = intent1.getExtras();
                                        if (extras != null) {
                                           str6 = extras.getString(str4);
                                        label_00d8 :
                                           jsonObject1.c0(str4, str6);
                                        }
                                     }
                                     objArray2 = objArray;
                                     goto label_00d8 ;
                                  }
                                  uElementPack.params = jsonObject1.toString();
                                  h$b uob = h$b.e(0, str5);
                                  a.o(uob, "TaskEventBuilder.newBuil¡­ \"TIETIE_DESKTOP_WIDGET\"\)");
                                  uob.h(objArray);
                                  a.o(uob, "taskEventBuilder.setContentPackage\(contentPackage\)");
                                  uob.k(uElementPack);
                                  u1.p0("3964043", this, uob);
                               }
                            }
                            objArray2 = objArray;
                            goto label_00c0 ;
                         }
                      }
                      objArray2 = objArray;
                      goto label_0091 ;
                   }
                }
                str6 = "base";
                goto label_007a ;
             }
          }
          objArray2 = objArray;
          goto label_005e ;
       }
       try{
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          if (!qCurrentUser.isLogined()) {
             d.a(-1712118428).x00(a.b(), 0, new LoginParams$a().a(), new IntimateStoryRouterActivity$a(this));
          }else {
             intent = this.getIntent();
             if (intent != null) {
                intent = intent.getExtras();
                if (intent != null) {
                   str1 = intent.getString("path");
                label_013f :
                   if (str1 != null) {
                      try{
                         Uri uri = x0.f(str1);
                         a.o(uri, "SafetyUriUtil.parseUriFromString\(uri\)");
                         str1 = b.a.c(uri).toString();
                         a.o(str1, "intercept\(SafetyUriUtil.¡­omString\(uri\)\).toString\(\)");
                         IntimateStoryRouterActivity ty = this.y;
                         Uri obj = PatchProxy.applyTwoRefs(str1, ty, this, intimateStor, "3");
                         if (obj != PatchProxyResult.class) {
                            b = obj.booleanValue();
                         }else {
                            obj = x0.f(str1);
                            String str3 = x0.a(obj, "refreshTopPage");
                            if (ty instanceof KwaiRnActivity && a.g(str3, str)) {
                               str4 = x0.a(obj, "componentName");
                               LaunchModel launchModel = ty.C3();
                               a.o(launchModel, "activity.launchModel");
                               if (a.g(launchModel.a(), x0.a(obj, "bundleId"))) {
                                  LaunchModel launchModel1 = ty.C3();
                                  a.o(launchModel1, "activity.launchModel");
                                  if (!a.g(launchModel1.b(), str4)) {
                                  }
                               }else {
                               }
                            }else {
                            }
                         }
                      }catch(java.lang.Exception e0){
                         b = false;
                      }
                      if (b) {
                         if (!PatchProxy.applyVoidOneRefs(str1, this, intimateStor, "2")) {
                            Uri uri1 = x0.f(str1);
                            a.o(uri1, "SafetyUriUtil.parseUriFromString\(uri\)");
                            JsonObject jsonObject = new JsonObject();
                            Iterator iterator = uri1.getQueryParameterNames().iterator();
                            while (iterator.hasNext()) {
                               String str2 = iterator.next();
                               jsonObject.c0(str2, x0.a(x0.f(str1), str2));
                            }
                            a.b.pt(this.y, "refreshPageWithParams", jsonObject);
                         }
                      }else {
                         a.b(b.j(this, str1), objArray);
                      }
                   }
                }
             }
             str1 = objArray;
             goto label_013f ;
          }
       }catch(java.lang.Exception e12){
          Object[] objArray1 = new Object[0];
          a.C().t("IntimateStoryRouterActivity", "handle krn refresh failed:"+e12.getLocalizedMessage(), objArray1);
       }
       this.finish();
       return;
    }
}
