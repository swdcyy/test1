package com.yxcorp.gifshow.longinus.LonginusInitModule$onLaunchFinish$1$a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import r3b.e;
import android.app.Application;
import o56.a;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.kwai.android.longinus.Longinus;

public final class LonginusInitModule$onLaunchFinish$1$a implements Runnable	// class@001b6a
{
    public final int b;

    public void LonginusInitModule$onLaunchFinish$1$a(int p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LonginusInitModule$onLaunchFinish$1$a.class, "1")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       String str = "status";
       jsonObject.a0(str, Integer.valueOf(this.b));
       e a = e.a;
       a.a("LONGINUS_PREPARE", jsonObject, new JsonObject());
       jsonObject = new JsonObject();
       Application uApplication = a.b();
       a.o(uApplication, "AppEnv.getAppContext\(\)");
       String str1 = (Longinus.isReady(uApplication))? "success": "failed";
       jsonObject.c0(str, str1);
       a.a("LONGINUS_READY", jsonObject, new JsonObject());
       return;
    }
}
