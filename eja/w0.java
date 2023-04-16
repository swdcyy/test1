package eja.w0;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.x;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.util.Objects;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.lang.String;
import java.util.List;
import yga.b;
import yga.c;
import java.lang.Boolean;
import dha.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import xl8.b;
import w99.h;

public final class w0 implements g	// class@002702
{
    public final x b;

    public void w0(x p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       w0 tb = this.b;
       Objects.requireNonNull(tb);
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFromDetailStatePresenter"), "backFromDetail");
       p0 = tb.p;
       Boolean tRUE = Boolean.TRUE;
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(tRUE, p0, a.class, "2")) {
       }else {
          p0.b.d(tRUE);
       }
       tb.q.b(false);
       return;
    }
}
