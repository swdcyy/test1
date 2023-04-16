package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.actor.LiveAudienceMultiLineArenaLineActorWidgetController$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.actor.LiveAudienceMultiLineArenaLineActorWidgetController;
import java.lang.Object;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaLiveState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import fr1.a;
import dr1.f;
import er1.c;
import xp5.g;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel;
import xp5.i;
import oq1.b;
import android.view.View;
import com.kuaishou.live.viewcontroller.ViewController;
import android.view.ViewGroup;
import qrd.l1;
import tq1.b;
import ns1.f;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.teamframe.LiveMultiLineArenaLineTeamFrameViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.a;
import ns1.a;
import nsd.u;

public final class LiveAudienceMultiLineArenaLineActorWidgetController$a implements Observer	// class@00150d
{
    public final LiveAudienceMultiLineArenaLineActorWidgetController b;

    public void LiveAudienceMultiLineArenaLineActorWidgetController$a(LiveAudienceMultiLineArenaLineActorWidgetController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       LiveAudienceMultiLineArenaLineActorWidgetController liveAudience = LiveAudienceMultiLineArenaLineActorWidgetController.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLineArenaLineActorWidgetController$a.class, "1")) {
       }else {
          Object[] objArray = null;
          if (p0 == LiveMultiLineArenaLiveState.SHOWING) {
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(objArray, p0, liveAudience, "3") && p0.n == null) {
                a uoa = new a(false, p0.s, p0.u, p0.p, p0.j, p0.v, p0.w);
                p0.y2(p0.A2(R.id.multi_line_arena_widget_countdown_container), v1);
                p0.n = v1;
             }
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(objArray, p0, liveAudience, "4") && (p0.o == null && !b.a.e())) {
                ViewModel viewModel = p0.m.get(LiveMultiLineArenaLineTeamFrameViewModel.class);
                a.o(viewModel, "viewModelProvider.get\(Li¡­ameViewModel::class.java\)");
                f uof = new f(0, viewModel, 1, objArray);
                View view = p0.P2();
                Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
                p0.y2(view, uof);
                p0.o = uof;
             }
          }else {
             p0 = this.b;
             liveAudience = p0.n;
             if (liveAudience != null) {
                p0.O2(liveAudience);
                p0.n = objArray;
             }
             p0 = this.b;
             liveAudience = p0.o;
             if (liveAudience != null) {
                p0.O2(liveAudience);
                p0.o = objArray;
             }
          }
       }
       return;
    }
}
