package com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLineWidgetContainerViewController$onCreate$1$1$1;
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
import androidx.lifecycle.LiveData;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatLayoutConfig;
import j83.c;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import i83.c;
import com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLineWidgetContainerViewController$createSubVc$1;
import j83.a;
import msd.p;
import i83.a;
import com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLineWidgetContainerViewController$createSubVc$2;
import java.util.HashMap;
import android.view.ViewGroup;

public final class LiveLiteMultiLineWidgetContainerViewController$onCreate$1$1$1 extends FunctionReferenceImpl implements l	// class@001e10
{

    public void LiveLiteMultiLineWidgetContainerViewController$onCreate$1$1$1(c p0){
       super(1, p0, c.class, "handleNewUser", "handleNewUser\(Lcom/kuaishou/live/common/core/component/multiline/model/LiveLineParticipantInfo;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiLineWidgetContainerViewController$onCreate$1$1$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, c.class, "3")) {
          String str = 1;
          InteractiveChatLayoutConfig value = treceiver.o.getValue();
          if (value != null) {
             a.o(value, "it");
             str = treceiver.V2(value);
          }
          c uoc = new c(p0, str);
          c p = treceiver.p;
          c uoc1 = PatchProxy.applyThreeRefs(p0, p, uoc, treceiver, c.class, "4");
          if (uoc1 != PatchProxyResult.class) {
          }else if(a.g(String.valueOf(p0.h.userId), p)){
             uoc1 = new c(uoc, new LiveLiteMultiLineWidgetContainerViewController$createSubVc$1(treceiver));
          }else {
             uoc1 = new a(uoc, new LiveLiteMultiLineWidgetContainerViewController$createSubVc$2(treceiver));
          }
          treceiver.j.put(String.valueOf(p0.h.userId), uoc1);
          treceiver.k.put(String.valueOf(p0.h.userId), uoc);
          c l = treceiver.l;
          if (l == null) {
             a.S("widgetContainer");
          }
          treceiver.y2(l, uoc1);
       }
       return;
    }
}
