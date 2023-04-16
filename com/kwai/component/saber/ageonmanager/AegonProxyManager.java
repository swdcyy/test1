package com.kwai.component.saber.ageonmanager.AegonProxyManager;
import com.kwai.component.saber.ageonmanager.AegonProxyManager$a;
import nsd.u;
import com.kwai.component.saber.ageonmanager.AegonProxyManager$Companion$aegonProxyManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import com.kwai.component.saber.ageonmanager.AegonProxyManager$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import java.util.Map;
import com.kwai.component.saber.ageonmanager.AegonSpManager;
import java.lang.Boolean;
import com.kuaishou.aegon.Aegon;
import com.kwai.component.saber.ageonmanager.AegonSpManager$a;
import java.util.Objects;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.lang.StringBuilder;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public final class AegonProxyManager	// class@000b23
{
    public int a;
    public Map b;
    public final String[] c;
    public final String[] d;
    public static final p e;
    public static final AegonProxyManager$a f;

    static {
       AegonProxyManager.f = new AegonProxyManager$a(null);
       AegonProxyManager.e = s.c(AegonProxyManager$Companion$aegonProxyManager$2.INSTANCE);
    }
    public void AegonProxyManager(){
       super();
       String[] stringArray = new String[]{"*/rest/n/log/client/collect","*/rest/n/log/client/realtime/collect","*/rest/n/log/client/hp/collect","*/rest/nebula/log/client/collect","*/rest/nebula/log/client/realtime/collect","*/rest/nebula/log/client/hp/collect","*/grey/rest/n/log/client/collect"};
       this.c = stringArray;
       stringArray = new String[0];
       this.d = stringArray;
    }
    public void AegonProxyManager(u p0){
       super();
       String[] stringArray = new String[]{"*/rest/n/log/client/collect","*/rest/n/log/client/realtime/collect","*/rest/n/log/client/hp/collect","*/rest/nebula/log/client/collect","*/rest/nebula/log/client/realtime/collect","*/rest/nebula/log/client/hp/collect","*/grey/rest/n/log/client/collect"};
       this.c = stringArray;
       stringArray = new String[0];
       this.d = stringArray;
    }
    public final void a(int p0,AegonProxyManager$b p1){
       AegonProxyManager uAegonProxyM = AegonProxyManager.class;
       if (PatchProxy.isSupport(uAegonProxyM) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uAegonProxyM, "5")) {
          return;
       }
       a.p(p1, "onProxyHostChangeListener");
       if (this.b == null) {
          this.b = new LinkedHashMap();
       }
       uAegonProxyM = this.b;
       if (uAegonProxyM != null && !uAegonProxyM.containsKey(Integer.valueOf(p0))) {
          uAegonProxyM.put(Integer.valueOf(p0), p1);
       }
       return;
    }
    public final void b(String p0,int p1,int p2,int p3,boolean p4){
       String str = "2";
       int i = 2;
       if (PatchProxy.isSupport(AegonProxyManager.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, AegonProxyManager.class, str)) {
             return;
          }
       }
       String str1 = "host";
       a.p(p0, str1);
       Aegon.m(p0, p1, p2);
       if (p3 == i) {
          Aegon.a(this.c);
       }else {
          Aegon.a(this.d);
       }
       AegonSpManager$a h = AegonSpManager.h;
       AegonSpManager uAegonSpMana = h.a();
       Objects.requireNonNull(uAegonSpMana);
       if (!PatchProxy.isSupport(AegonSpManager.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p3), uAegonSpMana, AegonSpManager.class, "1")) {
          g.a(uAegonSpMana.f.edit().putInt(uAegonSpMana.a, p3));
       }
       uAegonSpMana = h.a();
       Objects.requireNonNull(uAegonSpMana);
       if (!PatchProxy.isSupport(AegonSpManager.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p3), Boolean.valueOf(p4), uAegonSpMana, AegonSpManager.class, str)) {
          g.a(uAegonSpMana.f.edit().putBoolean(uAegonSpMana.e+p3, p4));
       }
       AegonSpManager uAegonSpMana1 = h.a();
       Objects.requireNonNull(uAegonSpMana1);
       if (!PatchProxy.isSupport(AegonSpManager.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p3), p0, uAegonSpMana1, AegonSpManager.class, "3")) {
          a.p(p0, str1);
          g.a(uAegonSpMana1.f.edit().putString(uAegonSpMana1.b+p3, p0));
       }
       AegonSpManager uAegonSpMana2 = h.a();
       Objects.requireNonNull(uAegonSpMana2);
       if (!PatchProxy.isSupport(AegonSpManager.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p3), Integer.valueOf(p1), uAegonSpMana2, AegonSpManager.class, "4")) {
          g.a(uAegonSpMana2.f.edit().putInt(uAegonSpMana2.c+p3, p1));
       }
       uAegonSpMana2 = h.a();
       Objects.requireNonNull(uAegonSpMana2);
       if (!PatchProxy.isSupport(AegonSpManager.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p3), Integer.valueOf(p2), uAegonSpMana2, AegonSpManager.class, "5")) {
          g.a(uAegonSpMana2.f.edit().putInt(uAegonSpMana2.d+p3, p2));
       }
       AegonProxyManager ta = this.a;
       if (!PatchProxy.isSupport(AegonProxyManager.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(ta), Integer.valueOf(p3), this, AegonProxyManager.class, "4")) {
          AegonProxyManager tb = this.b;
          if (tb != null) {
             Iterator iterator = tb.entrySet().iterator();
             while (iterator.hasNext()) {
                iterator.next().getValue().b(ta, p3);
             }
          }
       }
       this.a = p3;
       return;
    }
}
