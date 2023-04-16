package com.yxcorp.gifshow.featured.detail.featured.pushinject.a;
import java.lang.Object;
import com.yxcorp.gifshow.featured.detail.featured.pushinject.FeaturePushInjectTask$FailType;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.u1;

public class a	// class@000f8e
{

    public void a(){
       super();
    }
    public static void a(FeaturePushInjectTask$FailType p0,String p1,String p2,boolean p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, a.class, "1")) {
          return;
       }
       h$b uob = h$b.e(7, "PUSH_GUIDE_RESULT");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PUSH_GUIDE_RESULT";
       i3 oi3 = i3.f();
       oi3.d("push_type", p2);
       p2 = (p3)? "SUCCESS": "FAILED";
       oi3.d("task_result", p2);
       oi3.d("push_id", p1);
       if (!p3) {
          oi3.d("fail_type", p0.mType);
       }
       uElementPack.params = oi3.e();
       uob.k(uElementPack);
       u1.r0(uob);
       return;
    }
}
