package com.yxcorp.gifshow.detail.common.bottom.StandardSerialElement$e;
import erd.g;
import com.yxcorp.gifshow.detail.common.bottom.StandardSerialElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import b9a.b;
import java.lang.System;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import qp7.d;
import qp7.b;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import kotlin.jvm.internal.a;
import android.view.View;
import io.reactivex.subjects.PublishSubject;
import com.kwai.corona.CoronaApiExperimentUtil;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class StandardSerialElement$e implements g	// class@00139d
{
    public final StandardSerialElement b;

    public void StandardSerialElement$e(StandardSerialElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StandardSerialElement$e.class, "1")) {
       }else {
          p0 = this.b;
          p0.A.b(p0.s0());
          p0.P = System.currentTimeMillis();
          if (!VisitorModeManager.g(16)) {
             p0 = this.b;
             if (p0.w == null && (p0.y != null && p0.C() != null)) {
                d uod = this.b.C();
                a.m(uod);
                this.b.r0().b.onNext(uod.p());
             }else {
                p0 = CoronaApiExperimentUtil.d;
                if (p0.b() == 1 || p0.b() == 2) {
                   p0 = this.b;
                   p0.w0(p0.s0());
                }else {
                   p0 = this.b;
                   p0.A.a(p0.s0(), StandardSerialElement.n0(this.b), "MANUAL");
                   this.b.x0();
                }
             }
          }
       }
       return;
    }
}
