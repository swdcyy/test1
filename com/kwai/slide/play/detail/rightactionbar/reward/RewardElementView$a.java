package com.kwai.slide.play.detail.rightactionbar.reward.RewardElementView$a;
import android.view.View$OnClickListener;
import com.kwai.slide.play.detail.rightactionbar.reward.RewardElementView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.c;
import qp7.d;
import ts7.b;
import kotlin.jvm.internal.a;
import java.util.Objects;
import io.reactivex.subjects.PublishSubject;

public final class RewardElementView$a implements View$OnClickListener	// class@00186f
{
    public final RewardElementView b;

    public void RewardElementView$a(RewardElementView p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RewardElementView$a.class, "1")) {
          return;
       }
       b uob = this.b.l();
       a.o(p0, "it");
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoidOneRefs(p0, uob, b.class, "3")) {
          a.p(p0, "v");
          uob.b.onNext(p0);
       }
       return;
    }
}
