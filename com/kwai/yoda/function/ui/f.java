package com.kwai.yoda.function.ui.f;
import com.kwai.yoda.function.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.kwai.yoda.model.PullDownTypeParams;
import yz7.e;
import java.lang.Exception;
import yz7.r;
import ey7.g;
import java.lang.Runnable;
import ca7.v;
import com.kwai.yoda.bridge.YodaException;

public class f extends c	// class@00123b
{

    public void f(){
       super();
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       Object[] objArray;
       PullDownTypeParams pullDownType;
       if (PatchProxy.isSupport(f.class)) {
          objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, f.class, "1")) {
             return;
          }
       }
       objArray = 0;
       try{
          pullDownType = e.a(p3, PullDownTypeParams.class);
       }catch(java.lang.Exception e13){
          r.j(f.class.getSimpleName(), e13.getMessage());
          pullDownType = objArray;
       }
       if (pullDownType != null) {
          g og = new g(this, p0, pullDownType, p1, p2, p4);
          v.e(e13.getMessage());
          return;
       }else {
          throw new YodaException(0x1e84f, "The Input is invalid: root params should be object.");
       }
    }
}
