package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.score.LiveMultiLineArenaLineOtherScoreViewModel;
import er1.a;
import java.lang.String;
import androidx.lifecycle.LiveData;
import dr1.f;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.score.LiveMultiLineArenaLineOtherScoreViewModel$a;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.score.LiveMultiLineArenaLineOtherScoreViewModel$b;
import androidx.lifecycle.Observer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.Transformations;
import cu1.d;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.score.LiveMultiLineArenaLineOtherScoreViewModel$layoutConfig$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import androidx.lifecycle.ViewModel;

public final class LiveMultiLineArenaLineOtherScoreViewModel extends a	// class@001541
{
    public final Observer g;
    public final Observer h;
    public final String i;
    public final LiveData j;
    public final f k;

    public void LiveMultiLineArenaLineOtherScoreViewModel(String p0,LiveData p1,f p2){
       a.p(p0, "userId");
       a.p(p1, "shrinkLevel");
       a.p(p2, "arenaLineModel");
       super();
       this.i = p0;
       this.j = p1;
       this.k = p2;
       LiveMultiLineArenaLineOtherScoreViewModel$a uoa = new LiveMultiLineArenaLineOtherScoreViewModel$a(this);
       this.g = uoa;
       LiveMultiLineArenaLineOtherScoreViewModel$b uob = new LiveMultiLineArenaLineOtherScoreViewModel$b(this);
       this.h = uob;
       p2.e().observeForever(uob);
       p2.d().observeForever(uoa);
    }
    public LiveData f(){
       LiveData obj = PatchProxy.apply(null, this, LiveMultiLineArenaLineOtherScoreViewModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Transformations.distinctUntilChanged(this.j);
       a.h(obj, "Transformations.distinctUntilChanged\(this\)");
       return d.a(LiveDataOperators.b(obj, d.a(this.k.e()), new LiveMultiLineArenaLineOtherScoreViewModel$layoutConfig$1(this)));
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, LiveMultiLineArenaLineOtherScoreViewModel.class, "1")) {
          return;
       }
       super.onCleared();
       this.k.e().removeObserver(this.h);
       this.k.d().removeObserver(this.g);
       return;
    }
}
