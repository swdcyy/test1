package com.yxcorp.gifshow.growth.framework.GrowthLoginRouterActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Ref$ObjectRef;
import ekd.w0;
import java.lang.CharSequence;
import zsd.u;
import java.net.URLDecoder;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import zsd.t;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import com.yxcorp.gifshow.growth.framework.GrowthLoginRouterActivity$a;
import android.content.Context;
import n3d.a;
import wkd.b;
import nf6.i;
import java.lang.Boolean;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import com.yxcorp.gifshow.log.h;

public final class GrowthLoginRouterActivity extends GifshowActivity	// class@001379
{
    public boolean y;

    public void GrowthLoginRouterActivity(){
       super();
       this.y = true;
    }
    public void f3(){
       if (PatchProxy.applyVoid(null, this, GrowthLoginRouterActivity.class, "2")) {
          return;
       }
       if (this.y != null) {
          super.f3();
       }
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, GrowthLoginRouterActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthLoginRouterActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Intent intent = this.getIntent();
       Uri data = (intent != null)? intent.getData(): null;
       if (data == null || !data.isHierarchical()) {
          this.finish();
          return;
       }else {
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          String str = w0.a(data, "scheme");
          objectRef.element = str;
          String str1 = 1;
          int i = 0;
          Ref$ObjectRef objectRef1 = (str == null || u.S1(str))? 1: null;
          if (!objectRef1) {
             try{
                str = URLDecoder.decode(objectRef.element, "utf-8");
             }catch(java.lang.Exception e1){
                Object[] objArray = new Object[i];
                w.C().y("GrowthLoginRouter", ": routerScheme decode, catch Exception = "+e1, objArray);
                objectRef1 = objectRef.element;
             }
             objectRef.element = objectRef1;
          }
          objectRef1 = objectRef.element;
          if (objectRef1 != null && !u.S1(objectRef1)) {
             str1 = null;
          }
          if (str1) {
             Object[] objArray1 = new Object[i];
             w.C().y("GrowthLoginRouter", ": routerScheme is null or blank, just finish", objArray1);
             this.finish();
             return;
          }else {
             QCurrentUser mE = QCurrentUser.ME;
             a.o(mE, "QCurrentUser.ME");
             if (mE.isLogined()) {
                this.u3(objectRef.element);
                this.finish();
             }else {
                String str2 = w0.a(data, "ls");
                if (str2 != null) {
                   Integer integer = t.X0(str2);
                   if (integer != null) {
                      i = integer.intValue();
                   }
                }
                d.a(-1712118428).x00(this, i, new LoginParams$a().a(), new GrowthLoginRouterActivity$a(this, objectRef));
             }
             return;
          }
       }
    }
    public final void u3(String p0){
       boolean b;
       String str = "GrowthLoginRouter";
       GrowthLoginRouterActivity growthLoginR = GrowthLoginRouterActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, growthLoginR, "3")) {
          return;
       }
       StringBuilder str1 = null;
       Uri uri = Uri.parse(p0);
       if (uri != null) {
          Intent intent = b.a(0x66dce92a).a(this, uri);
          Object obj = PatchProxy.applyOneRefs(intent, this, growthLoginR, "4");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(intent != null){
             str1 = intent.resolveActivity(this.getPackageManager());
          }
          if (str1 != null) {
             try{
                ComponentName component = intent.getComponent();
                if (component != null && !a.g(component.getClassName(), growthLoginR.getName())) {
                   ActivityInfo activityInfo = this.getPackageManager().getActivityInfo(component, false);
                   a.o(activityInfo, "packageManager.getActivityInfo\(componentName, 0\)");
                   activityInfo = activityInfo.exported;
                }
             }catch(android.content.pm.PackageManager$NameNotFoundException e1){
                e1.printStackTrace();
             }
          }
          if (b != null) {
             this.y = false;
             this.startActivity(intent);
             b.a(0x4b316083).p0("URI", true);
          }else {
             Object[] objArray = new Object[false];
             w.C().y(str, ": routerScheme parse is not valid target, intent = "+intent, objArray);
          }
       }
       return;
    }
}
