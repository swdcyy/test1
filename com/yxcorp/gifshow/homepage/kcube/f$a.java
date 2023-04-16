package com.yxcorp.gifshow.homepage.kcube.f$a;
import im8.g;
import com.kwai.kcube.decorator.IContainerDecorator;
import wq6.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.homepage.kcube.d;
import java.util.Map;
import java.util.HashMap;

public final class f$a implements g	// class@00172f
{
    public final IContainerDecorator b;
    public final f c;

    public void f$a(IContainerDecorator p0,f p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f$a.class, new d());
       }else {
          obj.put(f$a.class, null);
       }
       return obj;
    }
}
