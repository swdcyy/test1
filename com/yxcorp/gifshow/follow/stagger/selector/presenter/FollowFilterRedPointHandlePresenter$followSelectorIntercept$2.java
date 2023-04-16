package com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterRedPointHandlePresenter$followSelectorIntercept$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import uja.x;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dha.d;
import com.yxcorp.gifshow.refresh.RefreshType;
import rja.c;

public final class FollowFilterRedPointHandlePresenter$followSelectorIntercept$2 extends Lambda implements a	// class@00123b
{
    public final x this$0;

    public void FollowFilterRedPointHandlePresenter$followSelectorIntercept$2(x p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, FollowFilterRedPointHandlePresenter$followSelectorIntercept$2.class, "1")) {
          return;
       }
       this.this$0.P8().b(1);
       x s = this.this$0.s;
       if (s != null) {
          c.o(s, RefreshType.FOLLOW_REDPOINT, false, 2, null);
       }
       return;
    }
}
