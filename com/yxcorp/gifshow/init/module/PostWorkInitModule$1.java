package com.yxcorp.gifshow.init.module.PostWorkInitModule$1;
import com.kwai.video.devicepersona.DevicePersonaLogger;
import com.yxcorp.gifshow.init.module.PostWorkInitModule;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import iq.a;
import q87.c;
import java.lang.Throwable;
import w46.b;

public class PostWorkInitModule$1 implements DevicePersonaLogger	// class@001996
{
    public final PostWorkInitModule a;

    public void PostWorkInitModule$1(PostWorkInitModule p0){
       this.a = p0;
       super();
    }
    public void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, PostWorkInitModule$1.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s(p0, p1, objArray);
       PatchProxy.onMethodExit(PostWorkInitModule$1.class, "2");
       return;
    }
    public void e(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, PostWorkInitModule$1.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().t(p0, p1, objArray);
       PatchProxy.onMethodExit(PostWorkInitModule$1.class, "5");
       return;
    }
    public void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, PostWorkInitModule$1.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w(p0, p1, objArray);
       PatchProxy.onMethodExit(PostWorkInitModule$1.class, "3");
       return;
    }
    public void v(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, PostWorkInitModule$1.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().y(p0, p1, objArray);
       PatchProxy.onMethodExit(PostWorkInitModule$1.class, "1");
       return;
    }
    public void w(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, PostWorkInitModule$1.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().A(p0, p1, objArray);
       PatchProxy.onMethodExit(PostWorkInitModule$1.class, "4");
       return;
    }
}
