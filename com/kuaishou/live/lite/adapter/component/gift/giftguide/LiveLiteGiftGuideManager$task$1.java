package com.kuaishou.live.lite.adapter.component.gift.giftguide.LiveLiteGiftGuideManager$task$1;
import msd.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.LiveLiteGiftGuideManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import w73.q;
import com.kuaishou.livestream.message.nano.SCLiveAttachGiftNoticeAnimation;
import lf3.g;
import hf3.a;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.LiveLiteGiftGuideManager$handleGuideNotice$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;

public final class LiveLiteGiftGuideManager$task$1 extends FunctionReferenceImpl implements a	// class@001dd7
{

    public void LiveLiteGiftGuideManager$task$1(LiveLiteGiftGuideManager p0){
       super(0, p0, LiveLiteGiftGuideManager.class, "handleGuideNotice", "handleGuideNotice\(\)V", 0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, LiveLiteGiftGuideManager$task$1.class, str)) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoid(objArray, treceiver, LiveLiteGiftGuideManager.class, "3")) {
          LiveLiteGiftGuideManager e = treceiver.e;
          Objects.requireNonNull(e);
          if (!PatchProxy.applyVoid(objArray, e, q.class, str)) {
             e.j.u0(1050, SCLiveAttachGiftNoticeAnimation.class, e);
          }
          treceiver.e.b(treceiver.a(), new LiveLiteGiftGuideManager$handleGuideNotice$1(treceiver));
       }
       return;
    }
}
