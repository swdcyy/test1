package com.yxcorp.gifshow.magic.ui.magicemoji.safearea.MagicSafeUIAreaHandler$doBindView$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.magic.ui.magicemoji.safearea.MagicSafeUIAreaHandler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import android.content.Context;
import android.view.View;
import android.app.Activity;
import s5b.b;
import q87.c;
import com.yxcorp.gifshow.magic.ui.magicemoji.safearea.MagicSafeUIAreaHandler$handlePanelShowEvent$2;
import y4b.e;
import msd.a;
import java.lang.Runnable;
import android.os.Handler;

public final class MagicSafeUIAreaHandler$doBindView$1 extends FunctionReferenceImpl implements l	// class@001beb
{

    public void MagicSafeUIAreaHandler$doBindView$1(MagicSafeUIAreaHandler p0){
       super(1, p0, MagicSafeUIAreaHandler.class, "handlePanelShowEvent", "handlePanelShowEvent\(Lcom/kwai/gifshow/post/api/core/event/PanelShowEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(PanelShowEvent p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicSafeUIAreaHandler$doBindView$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, MagicSafeUIAreaHandler.class, "18")) {
          a.p(p0, "event");
          MagicSafeUIAreaHandler b = treceiver.b;
          if (b != null && b.getContext() instanceof Activity) {
             Context context = b.getContext();
             Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
             if (PanelShowEvent.a(context, p0)) {
             }
          }else {
          }
       }
    label_0064 :
       return;
    }
}
