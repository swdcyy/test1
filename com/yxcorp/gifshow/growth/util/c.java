package com.yxcorp.gifshow.growth.util.c;
import java.lang.Runnable;
import java.lang.Object;
import com.google.gson.JsonObject;
import java.lang.StringBuilder;
import java.lang.String;
import cra.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.ContentResolver;
import com.kwai.framework.deviceid.a;
import com.google.gson.JsonElement;
import k2b.u1;

public final class c implements Runnable	// class@0015a0
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void run(){
       JsonObject jsonObject = new JsonObject();
       StringBuilder str = "ANDROID_";
       Object obj = PatchProxy.apply(null, null, u.class, "9");
       String str1 = (obj != PatchProxyResult.class)? obj: a.g(a.a().a().getContentResolver(), "android_id");
       jsonObject.c0("originalId", str+str1);
       u1.R("app_launch_original_android_id_event", jsonObject.toString(), 9);
       u.f = true;
       return;
    }
}
