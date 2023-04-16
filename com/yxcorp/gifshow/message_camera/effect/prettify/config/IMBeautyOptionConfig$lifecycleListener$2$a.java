package com.yxcorp.gifshow.message_camera.effect.prettify.config.IMBeautyOptionConfig$lifecycleListener$2$a;
import o0c.d;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMBeautyOptionConfig$lifecycleListener$2;
import java.lang.Object;
import o0c.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMBeautyOptionConfig;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMBeautyOptionConfig$a;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController;
import com.yxcorp.gifshow.prettify.beauty.data.BeautyDataHelper;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import java.lang.Enum;
import android.view.View;
import android.os.Bundle;
import java.lang.System;
import com.yxcorp.gifshow.prettify.beauty.h;

public final class IMBeautyOptionConfig$lifecycleListener$2$a implements d	// class@001db3
{
    public final IMBeautyOptionConfig$lifecycleListener$2 b;

    public void IMBeautyOptionConfig$lifecycleListener$2$a(IMBeautyOptionConfig$lifecycleListener$2 p0){
       this.b = p0;
       super();
    }
    public void M3(){
       c.g(this);
    }
    public void W5(){
       if (PatchProxy.applyVoid(null, this, IMBeautyOptionConfig$lifecycleListener$2$a.class, "2")) {
          return;
       }
       c.b(this);
       RxBus.f.b(IMBeautyOptionConfig.e.a(this.b.$prettifyFragment, true));
       return;
    }
    public void f5(){
       if (PatchProxy.applyVoid(null, this, IMBeautyOptionConfig$lifecycleListener$2$a.class, "5")) {
          return;
       }
       c.d(this);
       this.b.this$0.d.h(true);
       RxBus.f.b(IMBeautyOptionConfig.e.a(this.b.$prettifyFragment, false));
       return;
    }
    public void f6(){
       if (PatchProxy.applyVoid(null, this, IMBeautyOptionConfig$lifecycleListener$2$a.class, "1")) {
          return;
       }
       c.a(this);
       BeautyDataHelper.d.i(CameraPageType.IM_CHAT.name());
       return;
    }
    public void n4(){
       c.f(this);
    }
    public void q4(View p0,Bundle p1){
       c.j(this, p0, p1);
    }
    public void u3(){
       if (PatchProxy.applyVoid(null, this, IMBeautyOptionConfig$lifecycleListener$2$a.class, "4")) {
          return;
       }
       h.n((System.currentTimeMillis() - this.b.this$0.a));
       return;
    }
    public void v6(boolean p0){
       c.e(this, p0);
    }
    public void x5(){
       c.c(this);
    }
    public void y6(){
       if (PatchProxy.applyVoid(null, this, IMBeautyOptionConfig$lifecycleListener$2$a.class, "3")) {
          return;
       }
       this.b.this$0.a = System.currentTimeMillis();
       return;
    }
}
