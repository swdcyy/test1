package com.kwai.yoda.function.ui.j;
import com.kwai.yoda.function.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.kwai.yoda.model.PullLoadingResultParams;
import yz7.e;
import java.lang.Exception;
import yz7.r;
import ey7.i;
import java.lang.Runnable;
import ca7.v;
import com.kwai.yoda.bridge.YodaException;

public class j extends c	// class@001241
{

    public void j(){
       super();
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       Object[] objArray;
       PullLoadingResultParams pullLoadingR;
       if (PatchProxy.isSupport(j.class)) {
          objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, j.class, "1")) {
             return;
          }
       }
       objArray = 0;
       try{
          pullLoadingR = e.a(p3, PullLoadingResultParams.class);
       }catch(java.lang.Exception e13){
          r.j(j.class.getSimpleName(), e13.getMessage());
          pullLoadingR = objArray;
       }
       if (pullLoadingR != null) {
          i oi = new i(this, p0, pullLoadingR, p1, p2, p4);
          v.e(e13.getMessage());
          return;
       }else {
          throw new YodaException(0x1e84f, "The Input is invalid: root params should be object.");
       }
    }
}
