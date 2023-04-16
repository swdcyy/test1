package com.yxcorp.gifshow.detail.slidev2.presenter.d$b;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.slidev2.presenter.c;
import java.util.Map;
import java.util.HashMap;

public class d$b implements g	// class@0018f4
{
    public QPhoto b;

    public void d$b(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d$b.class, new c());
       }else {
          obj.put(d$b.class, null);
       }
       return obj;
    }
}
