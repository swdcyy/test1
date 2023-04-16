package com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.NotifyBaseAvatarAction$b;
import android.os.Handler;
import com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.NotifyBaseAvatarAction;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import android.os.Message;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.animation.ValueAnimator;

public final class NotifyBaseAvatarAction$b extends Handler	// class@0010ea
{
    public final WeakReference a;

    public void NotifyBaseAvatarAction$b(NotifyBaseAvatarAction p0){
       a.p(p0, "action");
       super();
       this.a = new WeakReference(p0);
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NotifyBaseAvatarAction$b.class, "1")) {
          return;
       }
       a.p(p0, "msg");
       p0 = p0.what;
       NotifyBaseAvatarAction notifyBaseAv = this.a.get();
       if (notifyBaseAv != null && p0 == notifyBaseAv.e()) {
          NotifyBaseAvatarAction notifyBaseAv1 = this.a.get();
          if (notifyBaseAv1 != null && !PatchProxy.applyVoid(null, notifyBaseAv1, NotifyBaseAvatarAction.class, "1")) {
             if (notifyBaseAv1.c().isRunning()) {
                notifyBaseAv1.c().cancel();
             }
             notifyBaseAv1.c().start();
          }
       }
       return;
    }
}
