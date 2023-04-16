package com.kwai.component.saber.ageonmanager.AegonSpManager;
import com.kwai.component.saber.ageonmanager.AegonSpManager$a;
import nsd.u;
import com.kwai.component.saber.ageonmanager.AegonSpManager$Companion$aegonSpManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.content.SharedPreferences;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import java.lang.StringBuilder;

public final class AegonSpManager	// class@000b26
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final SharedPreferences f;
    public static final p g;
    public static final AegonSpManager$a h;

    static {
       AegonSpManager.h = new AegonSpManager$a(null);
       AegonSpManager.g = s.c(AegonSpManager$Companion$aegonSpManager$2.INSTANCE);
    }
    public void AegonSpManager(SharedPreferences p0){
       super();
       this.f = p0;
       this.a = "key_last_proxy_type";
       this.b = "key_proxy_host";
       this.c = "key_proxy_port";
       this.d = "key_proxy_mask";
       this.e = "key_proxy_startup";
    }
    public final int a(){
       Object obj = PatchProxy.apply(null, this, AegonSpManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.f.getInt(this.a, 0);
    }
    public final String b(int p0){
       AegonSpManager uAegonSpMana = AegonSpManager.class;
       if (PatchProxy.isSupport(uAegonSpMana)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAegonSpMana, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.f.getString(this.b+p0, "");
    }
}
