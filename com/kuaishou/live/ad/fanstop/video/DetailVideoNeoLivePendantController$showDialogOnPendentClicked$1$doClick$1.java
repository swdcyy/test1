package com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$showDialogOnPendentClicked$1$doClick$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$showDialogOnPendentClicked$1;
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
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController;
import com.yxcorp.gifshow.commercial.response.magnetic.LiveNeoPendentTasksResponse;
import java.util.Objects;
import android.app.Activity;
import lnc.y0;
import yx.j0;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$showDialogOnPendentClicked$1$showNeoDialog$1;
import msd.a;
import com.kwai.library.widget.popup.common.c;
import tl0.c;
import com.yxcorp.gifshow.commercial.response.magnetic.LiveNeoPendentTasksResponse$LiveNeoPendentTasksData;
import com.kwai.framework.model.feed.BaseFeed;

public final class DetailVideoNeoLivePendantController$showDialogOnPendentClicked$1$doClick$1 extends SuspendLambda implements p	// class@0009bc
{
    public Object L$0;
    public int label;
    public k0 p$;
    public final DetailVideoNeoLivePendantController$showDialogOnPendentClicked$1 this$0;

    public void DetailVideoNeoLivePendantController$showDialogOnPendentClicked$1$doClick$1(DetailVideoNeoLivePendantController$showDialogOnPendentClicked$1 p0,c p1){
       this.this$0 = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       DetailVideoNeoLivePendantController$showDialogOnPendentClicked$1$doClick$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, DetailVideoNeoLivePendantController$showDialogOnPendentClicked$1$doClick$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new DetailVideoNeoLivePendantController$showDialogOnPendentClicked$1$doClick$1(this.this$0, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DetailVideoNeoLivePendantController$showDialogOnPendentClicked$1$doClick$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       DetailVideoNeoLivePendantController$showDialogOnPendentClicked$1$doClick$1 obj = PatchProxy.applyOneRefs(p0, this, DetailVideoNeoLivePendantController$showDialogOnPendentClicked$1$doClick$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       DetailVideoNeoLivePendantController$showDialogOnPendentClicked$1$doClick$1 tlabel = this.label;
       String str = 1;
       if (tlabel != null) {
          if (tlabel == str) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          this.L$0 = this.p$;
          this.label = str;
          p0 = this.this$0.c.m(1, this);
          if (p0 == obj) {
             return obj;
          }
       }
       if (p0 != null) {
          obj = this.this$0;
          Objects.requireNonNull(obj);
          if (!PatchProxy.applyVoidOneRefs(p0, obj, DetailVideoNeoLivePendantController$showDialogOnPendentClicked$1.class, "2") && !y0.o(obj.c.n)) {
             if (!p0.isValid()) {
                p0 = new Object[0];
                j0.f("DetailVideoNeoLivePendantController", "Tasks data is illegal", p0);
             }else {
                DetailVideoNeoLivePendantController$showDialogOnPendentClicked$1 c = obj.c;
                c uoc = c.b(c.n, p0, new DetailVideoNeoLivePendantController$showDialogOnPendentClicked$1$showNeoDialog$1(obj));
                uoc.Z();
                c.e = uoc;
                p0 = p0.mData;
                a.m(p0);
                c.f(obj.c.p, p0.mExtData);
             }
          }
          return l1.a;
       }else {
          return l1.a;
       }
    }
}
