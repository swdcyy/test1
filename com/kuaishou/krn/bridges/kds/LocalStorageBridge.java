package com.kuaishou.krn.bridges.kds.LocalStorageBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.c;
import android.content.Context;
import oe6.o;
import java.lang.Integer;
import java.util.Map;
import java.util.Set;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Number;

public final class LocalStorageBridge extends KrnBridge	// class@00081c
{

    public void LocalStorageBridge(ReactApplicationContext p0){
       a.p(p0, "reactContext");
       super(p0);
    }
    public final void clear(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalStorageBridge.class, "7")) {
          return;
       }
       a.p(p0, "id");
       g.b(this.getSharedPreferences(p0).edit().clear());
       return;
    }
    public final String getItem(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LocalStorageBridge.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "id");
       a.p(p1, "key");
       SharedPreferences sharedPrefer = this.getSharedPreferences(p0);
       sharedPrefer = (sharedPrefer.contains(p1))? sharedPrefer.getString(p1, ""): null;
       return sharedPrefer;
    }
    public String getName(){
       return "LocalStorage";
    }
    public final SharedPreferences getSharedPreferences(String p0){
       c obj = PatchProxy.applyOneRefs(p0, this, LocalStorageBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.b();
       a.o(obj, "KrnManager.get\(\)");
       SharedPreferences sharedPrefer = o.c(obj.d(), p0, 0);
       a.o(sharedPrefer, "KrnManager.get\(\).context¡­me, Context.MODE_PRIVATE\)");
       return sharedPrefer;
    }
    public final String key(String p0,int p1){
       LocalStorageBridge localStorage = LocalStorageBridge.class;
       if (PatchProxy.isSupport(localStorage)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, localStorage, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "id");
       return CollectionsKt___CollectionsKt.V1(this.getSharedPreferences(p0).getAll().keySet(), p1);
    }
    public final int length(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LocalStorageBridge.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "id");
       return this.getSharedPreferences(p0).getAll().size();
    }
    public final void removeItem(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalStorageBridge.class, "6")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "key");
       g.b(this.getSharedPreferences(p0).edit().remove(p1));
       return;
    }
    public final void setItem(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LocalStorageBridge.class, "5")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "key");
       a.p(p2, "value");
       g.b(this.getSharedPreferences(p0).edit().putString(p1, p2));
       return;
    }
}
