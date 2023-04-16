package com.k.s.v2.MServiceS;
import com.k.a.BService;
import android.app.Service;
import xw7.a;
import android.content.Context;
import java.lang.String;
import java.util.Map;
import android.content.Intent;
import gx7.g;
import android.content.pm.ServiceInfo;
import gx7.f;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.content.ServiceConnection;
import com.kwai.plugin.dva.feature.core.hook.a;
import qrd.l1;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Objects;
import java.lang.CharSequence;

public final class MServiceS extends BService	// class@00070d
{

    public void MServiceS(){
       super();
    }
    public void a(){
       this.stopSelf();
       if (a.c.a()) {
          this.a(null, "", null);
       }
       return;
    }
    public final void a(Context p0,String p1,Map p2){
       l1 a;
       if (p0 != null) {
          Intent intent = Intent.parseUri(p1, 0);
          this.b(intent, p2);
          if (intent != null && g.a.i(p0, intent, true) != null) {
             p0 = p0.getApplicationContext();
             a.o(p0, "a.applicationContext");
             a.a(p0.getApplicationContext(), intent, new f(p0, true), true);
             a = l1.a;
          }
       }
       return;
    }
    public final void b(Intent p0,Map p1){
       if (p1 != null && (p0 != null && (p1.isEmpty() ^ 1))) {
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             String value = uEntry.getValue();
             Objects.requireNonNull(key, "null cannot be cast to non-null type kotlin.String");
             Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.String");
             int i = 0;
             int i1 = (key.length() > 0)? 1: 0;
             if (i1) {
                if (value.length() > 0) {
                   i = 1;
                }
                if (i) {
                   p0.putExtra(key, value);
                }
             }
          }
       }
       return;
    }
}
