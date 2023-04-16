package com.kwai.live.gzone.turntable.b$a;
import y8c.f$b;
import com.kwai.live.gzone.turntable.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.turntable.m;
import java.util.Map;

public class b$a extends f$b	// class@000e2f
{
    public c h;
    public b$b i;
    public a j;
    public final b k;

    public void b$a(b p0,f$b p1){
       this.k = p0;
       super(p1);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(b$a.class, new m());
       }else {
          obj.put(b$a.class, null);
       }
       return obj;
    }
}
