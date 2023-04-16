package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.score.LiveMultiLineArenaLineOtherScoreViewModel$b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.score.LiveMultiLineArenaLineOtherScoreViewModel;
import java.lang.Object;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaLiveState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import androidx.lifecycle.LiveData;
import dr1.f;
import dr1.d;
import java.util.Map;
import dr1.e;
import dr1.a;
import dr1.a$a;
import er1.a;

public final class LiveMultiLineArenaLineOtherScoreViewModel$b implements Observer	// class@00153f
{
    public final LiveMultiLineArenaLineOtherScoreViewModel b;

    public void LiveMultiLineArenaLineOtherScoreViewModel$b(LiveMultiLineArenaLineOtherScoreViewModel p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineArenaLineOtherScoreViewModel$b.class, "1")) {
       }else if(p0 == LiveMultiLineArenaLiveState.SHOW_END){
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, LiveMultiLineArenaLineOtherScoreViewModel.class, "5")) {
             d value = p0.k.d().getValue();
             if (value != null) {
                Map map = value.c();
                if (map != null) {
                   e uoe = map.get(p0.i);
                   if (uoe != null) {
                      p0.u0(R.string.arg_RES_7f1025c2, String.valueOf(uoe.c()), uoe.a(), a.f.a());
                   }
                }
             }
          }
       }
       return;
    }
}
