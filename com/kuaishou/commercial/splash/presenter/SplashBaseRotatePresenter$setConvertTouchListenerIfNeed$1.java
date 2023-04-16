package com.kuaishou.commercial.splash.presenter.SplashBaseRotatePresenter$setConvertTouchListenerIfNeed$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.commercial.splash.presenter.SplashBaseRotatePresenter;
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
import java.util.Objects;
import java.lang.Integer;
import com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager;
import com.kwai.adclient.kscommerciallogger.snapshot.a;
import com.kwai.adclient.kscommerciallogger.snapshot.Span;

public final class SplashBaseRotatePresenter$setConvertTouchListenerIfNeed$1 extends Lambda implements l	// class@0015cb
{
    public final SplashBaseRotatePresenter this$0;

    public void SplashBaseRotatePresenter$setConvertTouchListenerIfNeed$1(SplashBaseRotatePresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashBaseRotatePresenter$setConvertTouchListenerIfNeed$1.class, "1")) {
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
       SplashBaseRotatePresenter$setConvertTouchListenerIfNeed$1 tthis$0 = this.this$0;
       int i = tthis$0.n9();
       int i1 = this.this$0.o9();
       Objects.requireNonNull(tthis$0);
       SplashBaseRotatePresenter splashBaseRo = SplashBaseRotatePresenter.class;
       if (!PatchProxy.isSupport(splashBaseRo) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), tthis$0, splashBaseRo, "12")) {
          SegmentManager segmentManag = ((tthis$0.d9()).length() > 0)? 1: null;
          if (segmentManag) {
             Span span = SegmentManager.Instance.loadSegment(tthis$0.d9(), "ROTATE_CONVERT").f("´¥·¢°´Å¥µã»÷");
             span.d("touch_x", String.valueOf(i));
             span.d("touch_y", String.valueOf(i1));
          }
       }
       this.this$0.aa(-1, false);
       return;
    }
}
