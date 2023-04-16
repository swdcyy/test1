package com.kwai.framework.map.MapPluginInitModule$a;
import hyb.b;
import com.kwai.framework.map.MapPluginInitModule;
import java.lang.Object;
import android.content.Context;
import o56.a;
import com.google.protobuf.nano.MessageNano;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import u96.a;
import com.kwai.framework.network.util.f;
import java.lang.Throwable;
import k2b.u1;
import android.content.SharedPreferences;
import oe6.n;

public class MapPluginInitModule$a implements b	// class@001680
{
    public final MapPluginInitModule a;

    public void MapPluginInitModule$a(MapPluginInitModule p0){
       this.a = p0;
       super();
    }
    public Context a(){
       return a.B;
    }
    public String b(MessageNano p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MapPluginInitModule$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b(p0, 0);
    }
    public String c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MapPluginInitModule$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.b(p0);
    }
    public void d(String p0,Throwable p1){
    }
    public void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MapPluginInitModule$a.class, "3")) {
          return;
       }
       u1.U(p0, p1);
       return;
    }
    public SharedPreferences f(){
       Object obj = PatchProxy.apply(null, this, MapPluginInitModule$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return n.b();
    }
    public void reportCustomEvent(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MapPluginInitModule$a.class, "2")) {
          return;
       }
       u1.Q(p0, p1);
       return;
    }
}
