package com.yxcorp.gifshow.message_camera.effect.prettify.config.IMMakeupOptionConfig$lifecycleListener$2$a;
import o0c.d;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMMakeupOptionConfig$lifecycleListener$2;
import java.lang.Object;
import o0c.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMMakeupOptionConfig;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMMakeupOptionConfig$a;
import dc5.c;
import java.util.Objects;
import com.yxcorp.gifshow.message_camera.effect.prettify.makeup.IMMakeupController;
import com.yxcorp.gifshow.prettify.makeup.d;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupKey;
import com.yxcorp.gifshow.prettify.makeup.m;
import android.view.View;
import android.os.Bundle;

public final class IMMakeupOptionConfig$lifecycleListener$2$a implements d	// class@001dbf
{
    public final IMMakeupOptionConfig$lifecycleListener$2 b;

    public void IMMakeupOptionConfig$lifecycleListener$2$a(IMMakeupOptionConfig$lifecycleListener$2 p0){
       this.b = p0;
       super();
    }
    public void M3(){
       c.g(this);
    }
    public void W5(){
       if (PatchProxy.applyVoid(null, this, IMMakeupOptionConfig$lifecycleListener$2$a.class, "1")) {
          return;
       }
       c.b(this);
       RxBus.f.b(IMMakeupOptionConfig.d.a(this.b.$prettifyFragment, true));
       return;
    }
    public void f5(){
       if (PatchProxy.applyVoid(null, this, IMMakeupOptionConfig$lifecycleListener$2$a.class, "3")) {
          return;
       }
       c.d(this);
       RxBus.f.b(IMMakeupOptionConfig.d.a(this.b.$prettifyFragment, false));
       return;
    }
    public void f6(){
       c.a(this);
    }
    public void n4(){
       IMMakeupOptionConfig c;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, IMMakeupOptionConfig$lifecycleListener$2$a.class, "2")) {
          return;
       }
       c.f(this);
       c.g("IMMakeupOptionConfig", "onPFragmentStop: save data");
       c = this.b.this$0.c;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoid(objArray, c, IMMakeupController.class, "6")) {
          c.g("IMMakeupController", "saveMakeupConfig");
          d.a().b(IMMakeupController.f).n();
       }
       return;
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
