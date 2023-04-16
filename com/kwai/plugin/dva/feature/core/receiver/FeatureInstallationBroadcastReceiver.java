package com.kwai.plugin.dva.feature.core.receiver.FeatureInstallationBroadcastReceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.feature.core.receiver.a;
import java.util.Objects;
import java.lang.StringBuilder;
import qj7.d;
import com.kwai.plugin.dva.feature.core.receiver.a$a;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.HashMap;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Map;
import java.util.Iterator;
import com.kwai.plugin.dva.feature.core.receiver.a$b;
import java.lang.Runnable;
import android.os.Handler;

public abstract class FeatureInstallationBroadcastReceiver extends BroadcastReceiver	// class@000e70
{

    public void FeatureInstallationBroadcastReceiver(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       a a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FeatureInstallationBroadcastReceiver.class, "1")) {
          return;
       }
       a.p(p0, "context");
       a.p(p1, "intent");
       boolean i = 0;
       int intExtra = p1.getIntExtra("broadcast_type", i);
       if (intExtra) {
          if (intExtra != 1) {
             if (intExtra == 2) {
                a = a.a;
                Objects.requireNonNull(a);
                if (!PatchProxy.applyVoidOneRefs(p1, a, a.class, "9")) {
                   a.p(p1, "intent");
                   d.a("receiver\("+a.b()+"\): parseInstallationResult");
                   String stringExtra = p1.getStringExtra("receiver_process");
                   if (!a.a(stringExtra)) {
                      d.c("receiver\("+a.b()+"\), but receive process="+stringExtra);
                   }else {
                      stringExtra = p1.getStringExtra("feature_name");
                      a.m(stringExtra);
                      a.o(stringExtra, "intent.getStringExtra\(FEATURE_NAME_EXTRA\)!!");
                      i = p1.getBooleanExtra("install_feature_success", i);
                      d.a("receiver\("+a.b()+"\): receive result, f="+stringExtra+" result="+i);
                      a$a a1 = a$a.a;
                      Objects.requireNonNull(a1);
                      Iterable iterable = PatchProxy.applyOneRefs(stringExtra, a1, a$a.class, "4");
                      if (iterable != PatchProxyResult.class) {
                      }else {
                         a.p(stringExtra, "feature");
                         HashMap c = a$a.c;
                         _monitor_enter(c);
                         List list = c.get(stringExtra);
                         Runnable obj = null;
                         Iterable iterable1 = (list == null)? obj: CollectionsKt___CollectionsKt.G5(list);
                         if (iterable1 == null) {
                            iterable1 = CollectionsKt__CollectionsKt.E();
                         }
                         c.put(stringExtra, obj);
                         Iterator iterator1 = iterable1.iterator();
                         while (iterator1.hasNext()) {
                            obj = a$a.d.get(iterator1.next());
                            if (obj == null) {
                               continue ;
                            }
                            a$a.b.removeCallbacks(obj);
                         }
                         _monitor_exit(c);
                         iterable = iterable1;
                      }
                      Iterator iterator = iterable.iterator();
                      while (iterator.hasNext()) {
                         a$b uob = iterator.next();
                         if (i) {
                            uob.d();
                         }else {
                            String stringExtra1 = p1.getStringExtra("installation_error_msg");
                            if (stringExtra1 == null) {
                               stringExtra1 = "";
                            }
                            uob.onFailed(stringExtra1);
                         }
                      }
                   }
                }
             }
          }else {
             a.a.e(p1);
          }
       }else {
          d.c("receiver="+this.getClass().getCanonicalName()+", invalid type.");
       }
       return;
    }
}
