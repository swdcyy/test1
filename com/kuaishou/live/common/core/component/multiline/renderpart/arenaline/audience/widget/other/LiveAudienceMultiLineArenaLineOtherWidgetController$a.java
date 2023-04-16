package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.other.LiveAudienceMultiLineArenaLineOtherWidgetController$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.other.LiveAudienceMultiLineArenaLineOtherWidgetController;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.score.LiveMultiLineArenaLineOtherScoreViewModel;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel;
import androidx.lifecycle.LiveData;
import j83.b;
import dr1.f;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.ordertag.LiveAudienceMultiLineArenaLineOrderTagViewModel;
import zq1.d;
import com.kuaishou.live.common.core.component.multiline.model.a;
import zq1.a;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class LiveAudienceMultiLineArenaLineOtherWidgetController$a implements ViewModelProvider$Factory	// class@001511
{
    public final LiveAudienceMultiLineArenaLineOtherWidgetController a;

    public void LiveAudienceMultiLineArenaLineOtherWidgetController$a(LiveAudienceMultiLineArenaLineOtherWidgetController p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       LiveMultiLineArenaLineOtherScoreViewModel liveMultiLin;
       LiveAudienceMultiLineArenaLineOtherWidgetController$a obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceMultiLineArenaLineOtherWidgetController$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "aClass");
       if (a.g(p0, LiveMultiLineArenaLineOtherScoreViewModel.class)) {
          liveMultiLin = new LiveMultiLineArenaLineOtherScoreViewModel(this.a.j.d(), this.a.q.b(), this.a.r);
       }else if(a.g(p0, LiveAudienceMultiLineArenaLineOrderTagViewModel.class)){
          obj = this.a;
          liveMultiLin = new LiveAudienceMultiLineArenaLineOrderTagViewModel(obj.r, obj.j, obj.q.b(), this.a.q.d());
       }else if(a.g(p0, d.class)){
          obj = this.a;
          d uod = new d(this.a.j.d(), this.a.j.f(), true, obj.p, obj.q, obj.n, obj.r);
       }else {
          throw new IllegalArgumentException("unsupported ViewModel class "+p0);
       }
       return liveMultiLin;
    }
}
