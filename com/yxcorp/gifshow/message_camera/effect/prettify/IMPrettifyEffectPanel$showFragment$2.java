package com.yxcorp.gifshow.message_camera.effect.prettify.IMPrettifyEffectPanel$showFragment$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.message_camera.effect.prettify.IMPrettifyEffectPanel;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import lw5.c$a;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import android.app.Activity;
import lw5.d;
import android.content.Context;

public final class IMPrettifyEffectPanel$showFragment$2 extends Lambda implements a	// class@001da1
{
    public final IMPrettifyEffectPanel this$0;

    public void IMPrettifyEffectPanel$showFragment$2(IMPrettifyEffectPanel p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, IMPrettifyEffectPanel$showFragment$2.class, "1")) {
          return;
       }
       IMPrettifyEffectPanel$showFragment$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoid(objArray, tthis$0, IMPrettifyEffectPanel.class, "10")) {
          Iterator iterator = tthis$0.d().iterator();
          while (iterator.hasNext()) {
             iterator.next().b();
          }
          RxBus.f.b(new PanelShowEvent(CameraPageType.IM_CHAT, PanelShowEvent$PanelType.PRETTIFY, tthis$0.f.a(), true));
       }
       return;
    }
}
