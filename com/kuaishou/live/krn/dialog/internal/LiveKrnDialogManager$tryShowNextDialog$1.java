package com.kuaishou.live.krn.dialog.internal.LiveKrnDialogManager$tryShowNextDialog$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.krn.dialog.internal.LiveKrnDialogManager;
import com.kuaishou.live.krn.dialog.internal.LiveKrnDialogManager$b;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import android.net.Uri;
import java.lang.StringBuilder;
import ftd.l0;
import com.kuaishou.livestream.message.nano.LiveCommonRoutePopupStrategy;
import kotlinx.coroutines.c;
import java.util.Objects;
import java.lang.Boolean;
import java.util.Queue;
import msd.a;
import o63.d;
import s63.s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.krn.dialog.internal.LiveLazyKrnPage$page$1;
import androidx.lifecycle.LifecycleObserver;

public final class LiveKrnDialogManager$tryShowNextDialog$1 extends SuspendLambda implements p	// class@001d5c
{
    public final LiveKrnDialogManager$b $dialog;
    public Object L$0;
    public int label;
    public k0 p$;
    public final LiveKrnDialogManager this$0;

    public void LiveKrnDialogManager$tryShowNextDialog$1(LiveKrnDialogManager p0,LiveKrnDialogManager$b p1,c p2){
       this.this$0 = p0;
       this.$dialog = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       LiveKrnDialogManager$tryShowNextDialog$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveKrnDialogManager$tryShowNextDialog$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LiveKrnDialogManager$tryShowNextDialog$1(this.this$0, this.$dialog, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveKrnDialogManager$tryShowNextDialog$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveKrnDialogManager$tryShowNextDialog$1 obj = PatchProxy.applyOneRefs(p0, this, LiveKrnDialogManager$tryShowNextDialog$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = b.h();
       LiveKrnDialogManager$tryShowNextDialog$1 tlabel = this.label;
       String str = "isActive: ";
       StringBuilder str1 = 1;
       if (tlabel != null) {
          if (tlabel == str1) {
             obj = this.L$0;
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          this.this$0.w("delayToShowNextDialog", this.$dialog.b(), str+l0.k(p0));
          if (!l0.k(p0)) {
             return l1.a;
          }else {
             this.L$0 = p0;
             this.label = str1;
             if (c.a((this.$dialog.a().minIntervalMs + (long)100), this) == obj) {
                return obj;
             }else {
                obj = p0;
             }
          }
       }
       this.this$0.w("delayEnd", this.$dialog.b(), str+l0.k(obj));
       if (!l0.k(obj)) {
          return l1.a;
       }else {
          p0 = this.this$0;
          Objects.requireNonNull(p0);
          Object obj1 = PatchProxy.apply(null, p0, LiveKrnDialogManager.class, "8");
          if (obj1 != patchProxyRe) {
             obj1.booleanValue();
          }else {
             LiveKrnDialogManager.G(p0, "pollPendingDialogAndShow", null, null, 6, null);
             LiveKrnDialogManager$b uob = p0.d.peek();
             if (uob != null) {
                LiveKrnDialogManager.G(p0, "pollPendingDialogAndShow", uob.b(), null, 4, null);
                if (p0.r(uob.a())) {
                   uob = p0.d.poll();
                   if (uob != null) {
                      p0 = p0.P(uob.b(), uob.e);
                      uob = uob.d;
                      Objects.requireNonNull(uob);
                      if (PatchProxy.applyVoidOneRefs(p0, uob, s.class, "1") || (uob.b == null && p0 != null)) {
                         uob.b = p0;
                         p0.getLifecycle().addObserver(new LiveLazyKrnPage$page$1(uob));
                      }
                   }
                }
             }
          }
          p0.f = false;
          return l1.a;
       }
    }
}
