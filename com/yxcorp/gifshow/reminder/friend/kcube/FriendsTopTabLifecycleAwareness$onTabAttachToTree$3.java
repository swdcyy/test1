package com.yxcorp.gifshow.reminder.friend.kcube.FriendsTopTabLifecycleAwareness$onTabAttachToTree$3;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import mdc.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import eda.n;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;

public final class FriendsTopTabLifecycleAwareness$onTabAttachToTree$3 extends FunctionReferenceImpl implements l	// class@001aa2
{

    public void FriendsTopTabLifecycleAwareness$onTabAttachToTree$3(o p0){
       super(1, p0, o.class, "onLogoutEventMainThread", "onLogoutEventMainThread\(Lcom/yxcorp/gifshow/events/LogoutEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendsTopTabLifecycleAwareness$onTabAttachToTree$3.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, o.class, "12")) {
          treceiver.p();
       }
       return;
    }
}
