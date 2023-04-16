package com.yxcorp.gifshow.ad.AdProcessUtils$c;
import p49.a;
import android.net.Uri;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import java.lang.String;
import java.lang.Object;
import q35.c$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.app.Application;
import o56.a;
import kotlin.jvm.internal.a;
import android.content.pm.PackageManager;
import java.util.List;
import q35.b;
import q35.d;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.google.gson.JsonObject;
import o49.g;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.c;
import java.util.Collection;
import java.lang.Integer;
import java.lang.Number;
import g59.o;
import qrd.l1;

public final class AdProcessUtils$c implements a	// class@0014ed
{
    public final Uri a;
    public final AdDataWrapper b;
    public final String c;
    public final String d;

    public void AdProcessUtils$c(Uri p0,AdDataWrapper p1,String p2,String p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public final void a(c$a p0){
       Intent intent;
       List list;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdProcessUtils$c.class, "1")) {
          return;
       }
       AdProcessUtils$c ta = this.a;
       String str = "android.intent.action.VIEW";
       try{
          intent = new Intent(str, ta);
          Application uApplication = a.b();
          a.o(uApplication, "AppEnv.getAppContext\(\)");
          list = uApplication.getPackageManager().queryIntentActivities(intent, 0x20000);
       }catch(java.lang.Exception e0){
          list = null;
       }
       p0.i(b.n);
       p0.d(BusinessType.OTHER);
       p0.h("deep_link");
       JsonObject jsonObject = new JsonObject();
       g.b(g.a, this.b.getPhoto(), jsonObject, 0, 0, 12, null);
       jsonObject.c0("origin_url", c.i(this.b.getPhoto()));
       jsonObject.c0("main_url", this.c);
       int i = 0;
       int i1 = 1;
       int i2 = (list == null || list.isEmpty())? 1: 0;
       jsonObject.a0("is_installed", Integer.valueOf((i2 ^ i1)));
       jsonObject.a0("evocation_type", Integer.valueOf(o.a(this.d, i)));
       jsonObject.c0("package_name", this.b.getPackageName());
       p0.f(jsonObject);
       return;
    }
}
