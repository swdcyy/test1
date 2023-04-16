package com.yxcorp.gifshow.camera.record.c;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import w46.b;

public final class c implements Runnable	// class@001d3c
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void run(){
       _monitor_enter(d.class);
       if (PatchProxy.applyVoid(null, null, d.class, "2")) {
          _monitor_exit(d.class);
       }else if(d.g != null){
          Object[] objArray = new Object[0];
          a.D().t("CameraManager", "time out, release preload camera", objArray);
          d.g.b();
          d.g = null;
       }
       _monitor_exit(d.class);
       return;
    }
}
