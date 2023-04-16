package com.kuaishou.live.core.voiceparty.micseats.pendant.PKFireAnimationPendantViewModel;
import jt2.c;
import ts2.f;
import tu2.f;
import brd.t;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import io.reactivex.BackpressureStrategy;
import yu2.c;
import com.kuaishou.live.core.voiceparty.micseats.pendant.PKFireAnimationPendantViewModel$myTeam$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import kt2.a;
import kt2.b;
import zh3.c;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import yh3.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.PKFireAnimationPendantViewModel$a;
import tu2.f$f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModel;

public final class PKFireAnimationPendantViewModel extends c	// class@00173a
{
    public final a g;
    public final a h;
    public final LiveEvent i;
    public final PKFireAnimationPendantViewModel$a j;
    public final f k;

    public void PKFireAnimationPendantViewModel(f p0,f p1,t p2,LiveData p3){
       a.p(p0, "micSeatStateService");
       a.p(p1, "pkAnimationDispatchService");
       a.p(p2, "teamInfo");
       a.p(p3, "micSeatId");
       super(p0, p3);
       this.k = p1;
       this.g = b.a(LiveDataOperators.b(c.a(p2, null, 1, null), p3, PKFireAnimationPendantViewModel$myTeam$1.INSTANCE));
       this.h = b.a(this.w0());
       c uoc = new c();
       this.p0(uoc);
       this.i = uoc;
       PKFireAnimationPendantViewModel$a uoa = new PKFireAnimationPendantViewModel$a(this);
       this.j = uoa;
       p1.a(uoa);
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, PKFireAnimationPendantViewModel.class, "1")) {
          return;
       }
       super.onCleared();
       this.k.d(this.j);
       this.h.b();
       this.g.b();
       return;
    }
    public final LiveEvent x0(){
       return this.i;
    }
}
