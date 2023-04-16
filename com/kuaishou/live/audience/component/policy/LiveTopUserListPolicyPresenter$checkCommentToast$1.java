package com.kuaishou.live.audience.component.policy.LiveTopUserListPolicyPresenter$checkCommentToast$1;
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
import r21.a$b;

public final class LiveTopUserListPolicyPresenter$checkCommentToast$1 extends FunctionReferenceImpl implements l	// class@000bbf
{

    public void LiveTopUserListPolicyPresenter$checkCommentToast$1(a p0){
       super(1, p0, a.class, "handleCommentToast", "handleCommentToast\(Lcom/kuaishou/live/core/basic/model/LiveTimeConsumingUserStatusResponse$TopUserToastConfig;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveTimeConsumingUserStatusResponse$TopUserToastConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTopUserListPolicyPresenter$checkCommentToast$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, a.class, "6") && p0.commentToastTimesPerPeriod > null) {
          LiveTimeConsumingUserStatusResponse$TopUserToastConfig commentToast = p0.commentToastText;
          if (commentToast != null) {
             a.o(commentToast, "config.commentToastText");
             commentToast = (!commentToast.length())? 1: null;
             if (!commentToast) {
                long l = treceiver.P8();
                long l1 = treceiver.R8(l);
                if ((l1 - a.d()) - (long)p0.toastPeriod >= 0 && treceiver.S8(l)) {
                   a uoa = new a(a.e(), l1, a.b(), 0);
                   a.o(commentToast);
                }
                if (a.a() < p0.commentToastTimesPerPeriod) {
                   a w = treceiver.w;
                   w.a(l1);
                   p0 = p0.commentToastText;
                   a.o(p0, "config.commentToastText");
                   w.b(p0);
                   treceiver.w.run();
                }
             }
          }
       }
    label_0084 :
       return;
    }
}
