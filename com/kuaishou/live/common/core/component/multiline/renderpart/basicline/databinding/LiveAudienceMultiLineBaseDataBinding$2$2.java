package com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.LiveAudienceMultiLineBaseDataBinding$2$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kuaishou.live.common.core.component.multiline.model.a;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.util.HashMap;
import j83.d;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.common.core.component.follow.cache.c;
import java.lang.Boolean;

public final class LiveAudienceMultiLineBaseDataBinding$2$2 extends FunctionReferenceImpl implements l	// class@00154a
{

    public void LiveAudienceMultiLineBaseDataBinding$2$2(a p0){
       super(1, p0, a.class, "handleUpdateUser", "handleUpdateUser\(Lcom/kuaishou/live/common/core/component/multiline/model/LiveLineParticipantInfo;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLineBaseDataBinding$2$2.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       String str = "5";
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, a.class, str)) {
          d uod = treceiver.b.get(String.valueOf(p0.h.userId));
          if (uod != null && !PatchProxy.applyVoidOneRefs(p0, uod, d.class, str)) {
             a.p(p0, "participantInfo");
             uod.k().setValue(p0);
             uod.a.setValue(Boolean.valueOf(c.b().c(String.valueOf(p0.h.userId))));
          }
          treceiver.f(p0);
       }
       return;
    }
}
