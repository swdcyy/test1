package com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$h;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement;
import java.lang.Object;
import sra.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qp7.x0;
import qp7.b;
import dr7.f0;

public final class IntensifyFollowElement$h implements g	// class@001416
{
    public final IntensifyFollowElement b;

    public void IntensifyFollowElement$h(IntensifyFollowElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntensifyFollowElement$h.class, "1")) {
       }else {
          a.p(p0, "followBackEvent");
          if (!p0.a() || TextUtils.n(p0.b(), IntensifyFollowElement.p0(this.b).getId())) {
             this.b.E().l(false);
             this.b.M0(true);
          }
       }
       return;
    }
}
