package com.kuaishou.live.audience.component.policy.LiveTopUserListPolicyPresenter$checkDurationToast$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import r21.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse$TopUserToastConfig;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import ow0.a;
import s21.a;
import java.lang.Runnable;
import r21.a$a;
import r21.a$c;

public final class LiveTopUserListPolicyPresenter$checkDurationToast$1 extends FunctionReferenceImpl implements l	// class@000bc0
{

    public void LiveTopUserListPolicyPresenter$checkDurationToast$1(a p0){
       super(1, p0, a.class, "handleTimeToast", "handleTimeToast\(Lcom/kuaishou/live/core/basic/model/LiveTimeConsumingUserStatusResponse$TopUserToastConfig;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveTimeConsumingUserStatusResponse$TopUserToastConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTopUserListPolicyPresenter$checkDurationToast$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, a.class, "3") && p0.durationToastTimesPerPeriod > null) {
          LiveTimeConsumingUserStatusResponse$TopUserToastConfig durationToas = p0.durationToastText;
          if (durationToas != null) {
             a.o(durationToas, "config\n        .durationToastText");
             long l = (!durationToas.length())? 1: 0;
             if (!l) {
                l = treceiver.P8();
                long l1 = treceiver.R8(l);
                if ((l1 - a.e()) - (long)p0.toastPeriod >= 0 && treceiver.S8(l)) {
                   a uoa = new a(l1, a.d(), 0, a.a());
                   a.o(l);
                }
                if (a.b() < p0.durationToastTimesPerPeriod) {
                   a v = treceiver.v;
                   v.a(l1);
                   p0 = p0.durationToastText;
                   a.o(p0, "config.durationToastText");
                   v.b(p0);
                   treceiver.v.run();
                }
             }
          }
       }
    label_0086 :
       return;
    }
}
