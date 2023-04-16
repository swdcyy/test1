package com.k.p.MSProviderT;
import com.k.a.BSProvider;
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
import android.net.Uri;
import android.content.ContentValues;
import xw7.a;

public final class MSProviderT extends BSProvider	// class@000702
{

    public void MSProviderT(){
       super();
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
    public int update(Uri p0,ContentValues p1,String p2,String[] p3){
       a.p(p0, "uri");
       if (a.c.a()) {
          this.a(null, "", null);
       }
       super.update(p0, p1, p2, p3);
       return 0;
    }
}
