package com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.LiveAudienceMultiLineBaseDataBinding$2$1;
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
import androidx.lifecycle.LiveData;
import ir1.c;
import java.util.Map;
import j83.d;
import oq1.e;
import oq1.b;
import xp5.i;
import sq1.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.LiveAudienceMultiLineBaseDataBinding$handleNewUser$subVc$1;
import msd.p;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import android.view.ViewGroup;
import hr1.a;

public final class LiveAudienceMultiLineBaseDataBinding$2$1 extends FunctionReferenceImpl implements l	// class@001549
{

    public void LiveAudienceMultiLineBaseDataBinding$2$1(a p0){
       super(1, p0, a.class, "handleNewUser", "handleNewUser\(Lcom/kuaishou/live/common/core/component/multiline/model/LiveLineParticipantInfo;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLineBaseDataBinding$2$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, a.class, "3")) {
          Map value = treceiver.i.v0().getValue();
          if (value != null) {
             a.o(value, "it");
             i = treceiver.b(value);
          }else {
             i = 1;
          }
          d uod = new d(p0, i, treceiver.d, treceiver.e, treceiver.f, treceiver.g);
          ViewController viewControll = treceiver.a(p0, treceiver.g.h(), value, new LiveAudienceMultiLineBaseDataBinding$handleNewUser$subVc$1(treceiver));
          treceiver.b.put(String.valueOf(p0.h.userId), value);
          treceiver.a.put(String.valueOf(p0.h.userId), viewControll);
          treceiver.h.E2(treceiver.c, viewControll);
       }
       return;
    }
}
