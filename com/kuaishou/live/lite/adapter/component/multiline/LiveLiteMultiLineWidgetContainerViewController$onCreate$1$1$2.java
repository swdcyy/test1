package com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLineWidgetContainerViewController$onCreate$1$1$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import h83.c;
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
import j83.c;
import androidx.lifecycle.MutableLiveData;

public final class LiveLiteMultiLineWidgetContainerViewController$onCreate$1$1$2 extends FunctionReferenceImpl implements l	// class@001e11
{

    public void LiveLiteMultiLineWidgetContainerViewController$onCreate$1$1$2(c p0){
       super(1, p0, c.class, "handleUpdateUser", "handleUpdateUser\(Lcom/kuaishou/live/common/core/component/multiline/model/LiveLineParticipantInfo;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiLineWidgetContainerViewController$onCreate$1$1$2.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, c.class, "5")) {
          c uoc = treceiver.k.get(String.valueOf(p0.h.userId));
          if (uoc != null && !PatchProxy.applyVoidOneRefs(p0, uoc, c.class, "2")) {
             a.p(p0, "participantInfo");
             uoc.e().setValue(p0);
          }
       }
       return;
    }
}
