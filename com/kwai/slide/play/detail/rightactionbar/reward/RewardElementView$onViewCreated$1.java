package com.kwai.slide.play.detail.rightactionbar.reward.RewardElementView$onViewCreated$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.slide.play.detail.rightactionbar.reward.RewardElementView;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.c;
import qp7.d;
import ts7.b;
import java.util.Objects;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public final class RewardElementView$onViewCreated$1 extends Lambda implements a	// class@001870
{
    public final RewardElementView this$0;

    public void RewardElementView$onViewCreated$1(RewardElementView p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RewardElementView$onViewCreated$1.class, "1")) {
          return;
       }
       b uob = this.this$0.l();
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoid(objArray, uob, b.class, "1")) {
          uob.a.onNext(Boolean.TRUE);
       }
       return;
    }
}
