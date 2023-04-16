package com.yxcorp.gifshow.ad.detail.presenter.ad.magic.AnimationVideoPresenter$registerSubjectListener$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import wz8.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import z49.s0;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import fg6.a;
import wz8.g;
import com.google.gson.Gson;
import im8.f;
import android.view.TextureView;
import android.view.View;
import com.kwai.framework.player.core.b;

public final class AnimationVideoPresenter$registerSubjectListener$2 extends FunctionReferenceImpl implements l	// class@0015ce
{

    public void AnimationVideoPresenter$registerSubjectListener$2(a p0){
       super(1, p0, a.class, "onTKGlobalEventReceived", "onTKGlobalEventReceived\(Lcom/yxcorp/gifshow/ad/tachikoma/bridge/ad/TKGlobalEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(s0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AnimationVideoPresenter$registerSubjectListener$2.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, a.class, "10")) {
          g type = a.a.h(p0.a(), g.class).type;
          int i = type.hashCode();
          if (i != -803143598) {
             if (i == -347134518 && (type.equals("boxStrongWeakShouldShow") && treceiver.A != null)) {
                treceiver.Y8();
             }
          }else if(type.equals("boxStrongCloseClick")){
             a w = treceiver.w;
             if (w != null) {
                TextureView textureView = w.get();
                if (textureView != null) {
                   w = (!textureView.getVisibility())? 1: null;
                   if (w == 1) {
                      w = treceiver.t;
                      if (w != null) {
                         w.pause();
                      }
                      treceiver.P8();
                   }
                }
             }
             treceiver.X8();
          }
       }
       return;
    }
}
