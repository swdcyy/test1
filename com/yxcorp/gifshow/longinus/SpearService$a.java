package com.yxcorp.gifshow.longinus.SpearService$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.longinus.SpearService;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonObject;
import android.content.Context;
import android.app.Service;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonArray;
import android.os.Process;
import android.app.ActivityManager;
import java.util.List;
import java.lang.Iterable;
import wsd.m;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.longinus.SpearService$getProcessInfo$1;
import msd.l;
import kotlin.sequences.SequencesKt___SequencesKt;
import com.yxcorp.gifshow.longinus.SpearService$getProcessInfo$2;
import java.util.Iterator;
import com.google.gson.JsonElement;
import r3b.e;

public final class SpearService$a implements Runnable	// class@001b7d
{
    public final SpearService b;

    public void SpearService$a(SpearService p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SpearService$a.class, "1")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       SpearService$a tb = this.b;
       Context applicationC = tb.getApplicationContext();
       a.o(applicationC, "this.applicationContext");
       Objects.requireNonNull(tb);
       JsonArray jsonArray = PatchProxy.applyOneRefs(applicationC, tb, SpearService.class, "3");
       if (jsonArray != PatchProxyResult.class) {
       }else {
          a.p(applicationC, "context");
          int i = Process.myUid();
          JsonArray jsonArray1 = new JsonArray();
          Object systemServic = applicationC.getSystemService("activity");
          if (systemServic instanceof ActivityManager) {
             objArray = systemServic;
          }
          if (objArray != null) {
             List runningAppPr = objArray.getRunningAppProcesses();
             if (runningAppPr != null) {
                m om = CollectionsKt___CollectionsKt.l1(runningAppPr);
                if (om != null) {
                   om = SequencesKt___SequencesKt.i0(om, new SpearService$getProcessInfo$1(i));
                   if (om != null) {
                      om = SequencesKt___SequencesKt.b1(om, SpearService$getProcessInfo$2.INSTANCE);
                      if (om != null) {
                         Iterator iterator = om.iterator();
                         while (iterator.hasNext()) {
                            jsonArray1.a0(iterator.next());
                         }
                      }
                   }
                }
             }
          }
          jsonArray = jsonArray1;
       }
       jsonObject.G("process_info", jsonArray);
       e.a.a("LONGINUS_SPEAR", jsonObject, new JsonObject());
       return;
    }
}
