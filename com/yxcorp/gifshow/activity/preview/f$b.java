package com.yxcorp.gifshow.activity.preview.f$b;
import im8.g;
import vl8.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.activity.preview.a;
import java.util.Map;
import java.util.HashMap;

public class f$b extends c implements g	// class@001365
{
    public a c;
    public int d;
    public int e;
    public Size f;
    public boolean g;

    public void f$b(int p0,int p1){
       super();
       this.g = true;
       this.d = p0;
       this.e = p1;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("injector")) {
          return new a();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("injector")) {
          obj.put(f$b.class, new a());
       }else {
          obj.put(f$b.class, null);
       }
       return obj;
    }
}
