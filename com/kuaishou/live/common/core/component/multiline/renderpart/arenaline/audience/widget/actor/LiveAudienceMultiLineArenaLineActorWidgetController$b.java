package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.actor.LiveAudienceMultiLineArenaLineActorWidgetController$b;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.actor.LiveAudienceMultiLineArenaLineActorWidgetController;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import gr1.b;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel;
import dr1.f;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.ordertag.LiveAudienceMultiLineArenaLineOrderTagViewModel;
import androidx.lifecycle.LiveData;
import j83.b;
import zq1.d;
import com.kuaishou.live.common.core.component.multiline.model.a;
import zq1.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.teamframe.LiveMultiLineArenaLineTeamFrameViewModel;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class LiveAudienceMultiLineArenaLineActorWidgetController$b implements ViewModelProvider$Factory	// class@00150f
{
    public final LiveAudienceMultiLineArenaLineActorWidgetController a;

    public void LiveAudienceMultiLineArenaLineActorWidgetController$b(LiveAudienceMultiLineArenaLineActorWidgetController p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       b uob;
       LiveAudienceMultiLineArenaLineActorWidgetController$b obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceMultiLineArenaLineActorWidgetController$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "aClass");
       if (a.g(p0, b.class)) {
          uob = new b(this.a.j.d(), this.a.s);
       }else if(a.g(p0, LiveAudienceMultiLineArenaLineOrderTagViewModel.class)){
          obj = this.a;
          uob = new LiveAudienceMultiLineArenaLineOrderTagViewModel(obj.s, obj.j, null, obj.r.d());
       }else if(a.g(p0, d.class)){
          obj = this.a;
          d uod = new d(this.a.j.d(), this.a.j.f(), false, obj.q, obj.r, obj.l, obj.s);
       }else if(a.g(p0, LiveMultiLineArenaLineTeamFrameViewModel.class)){
          uob = new LiveMultiLineArenaLineTeamFrameViewModel(this.a.j);
       }else {
          throw new IllegalArgumentException("unsupported ViewModel class "+p0);
       }
       return uob;
    }
}
