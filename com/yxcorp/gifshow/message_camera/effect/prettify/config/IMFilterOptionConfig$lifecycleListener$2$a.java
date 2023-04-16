package com.yxcorp.gifshow.message_camera.effect.prettify.config.IMFilterOptionConfig$lifecycleListener$2$a;
import o0c.d;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMFilterOptionConfig$lifecycleListener$2;
import java.lang.Object;
import o0c.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMFilterOptionConfig;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMFilterOptionConfig$a;
import android.view.View;
import android.os.Bundle;

public final class IMFilterOptionConfig$lifecycleListener$2$a implements d	// class@001db9
{
    public final IMFilterOptionConfig$lifecycleListener$2 b;

    public void IMFilterOptionConfig$lifecycleListener$2$a(IMFilterOptionConfig$lifecycleListener$2 p0){
       this.b = p0;
       super();
    }
    public void M3(){
       c.g(this);
    }
    public void W5(){
       if (PatchProxy.applyVoid(null, this, IMFilterOptionConfig$lifecycleListener$2$a.class, "1")) {
          return;
       }
       c.b(this);
       RxBus.f.b(IMFilterOptionConfig.d.a(this.b.$prettifyFragment, true));
       return;
    }
    public void f5(){
       if (PatchProxy.applyVoid(null, this, IMFilterOptionConfig$lifecycleListener$2$a.class, "2")) {
          return;
       }
       c.d(this);
       RxBus.f.b(IMFilterOptionConfig.d.a(this.b.$prettifyFragment, false));
       return;
    }
    public void f6(){
       c.a(this);
    }
    public void n4(){
       c.f(this);
    }
    public void q4(View p0,Bundle p1){
       c.j(this, p0, p1);
    }
    public void u3(){
       c.i(this);
    }
    public void v6(boolean p0){
       c.e(this, p0);
    }
    public void x5(){
       c.c(this);
    }
    public void y6(){
       c.h(this);
    }
}
