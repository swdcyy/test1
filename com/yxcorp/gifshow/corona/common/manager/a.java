package com.yxcorp.gifshow.corona.common.manager.a;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import iq9.b;
import java.lang.Runnable;
import t45.c;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.LinkedHashMap;
import com.google.common.base.Optional;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import z1.e;
import iq9.c;
import java.util.List;

public class a	// class@0011f3
{
    public LinkedHashMap a;
    public boolean b;
    public boolean c;
    public static final long d;

    static {
       a.d = TimeUnit.DAYS.toMillis(7);
    }
    public void a(){
       super();
       c.a(new b(this));
    }
    public final boolean a(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       return this.b;
    }
    public boolean b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.a("get")) {
          return false;
       }
       boolean b = Optional.fromNullable(this.a.get(p0)).or(Boolean.FALSE).booleanValue();
       if (b) {
          this.c();
       }
       return b;
    }
    public final void c(){
       this.c = true;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       if (!this.a("persist")) {
          return;
       }
       if (this.c == null) {
          return;
       }
       if (this.a.isEmpty()) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.a.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          uArrayList.add(new e(key, uEntry.getValue()));
       }
       this.c = false;
       c.a(new c(this, uArrayList));
       return;
    }
}
