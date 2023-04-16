package com.yxcorp.gifshow.ad.tachikoma.bridge.follow.RegisterFollowListenerBridge$onPageShow$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.ad.tachikoma.bridge.follow.RegisterFollowListenerBridge;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import wca.n;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import a59.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import a59.a;
import a59.a$a;

public final class RegisterFollowListenerBridge$onPageShow$1 extends FunctionReferenceImpl implements l	// class@00182b
{

    public void RegisterFollowListenerBridge$onPageShow$1(RegisterFollowListenerBridge p0){
       super(1, p0, RegisterFollowListenerBridge.class, "onMainThread", "onMainThread\(Lcom/yxcorp/gifshow/entity/helper/FollowUpdateEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RegisterFollowListenerBridge$onPageShow$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, RegisterFollowListenerBridge.class, "4")) {
          QPhoto qPhoto = treceiver.d.e();
          String userId = (qPhoto != null)? qPhoto.getUserId(): null;
          if (TextUtils.n(userId, p0.b) && p0.d == null) {
             i3 oi3 = i3.f();
             if (p0.c != null) {
                oi3.c("isFollowing", Integer.valueOf(1));
             }else {
                oi3.c("isFollowing", Integer.valueOf(0));
             }
             RegisterFollowListenerBridge b = treceiver.b;
             if (b != null) {
                a$a.a(b, oi3.e(), null, 2, null);
             }
          }
       }
    label_0065 :
       return;
    }
}
