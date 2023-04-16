package com.kuaishou.commercial.splash.presenter.SplashSlidePresenter$setConvertTouchListenerIfNeed$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import gz.p3;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import im8.f;
import gz.y2;
import com.kuaishou.commercial.splash.SplashUtils;
import yy.x0;

public final class SplashSlidePresenter$setConvertTouchListenerIfNeed$1 extends Lambda implements l	// class@0015d8
{
    public final p3 this$0;

    public void SplashSlidePresenter$setConvertTouchListenerIfNeed$1(p3 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashSlidePresenter$setConvertTouchListenerIfNeed$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       if (SplashUtils.z(this.this$0.V8())) {
          return;
       }
       f uof = this.this$0.e9();
       if (uof != null) {
          x0 ox0 = uof.get();
          if (ox0 != null) {
             ox0.n(this.this$0.n9(), this.this$0.o9());
          }
       }
       this.this$0.aa();
       return;
    }
}
