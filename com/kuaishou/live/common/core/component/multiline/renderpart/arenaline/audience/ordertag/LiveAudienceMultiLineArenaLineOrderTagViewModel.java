package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.ordertag.LiveAudienceMultiLineArenaLineOrderTagViewModel;
import yh3.a;
import dr1.f;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.ordertag.LiveAudienceMultiLineArenaLineOrderTagViewModel$a;
import z0.a;
import androidx.lifecycle.Transformations;
import cu1.d;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.ordertag.LiveAudienceMultiLineArenaLineOrderTagViewModel$tagVisibility$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.ordertag.LiveAudienceMultiLineArenaLineOrderTagViewModel$tagStyleConfig$1$1;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.ordertag.LiveAudienceMultiLineArenaLineOrderTagViewModel$b;

public final class LiveAudienceMultiLineArenaLineOrderTagViewModel extends a	// class@00150c
{
    public final LiveData a;
    public final LiveData b;
    public final LiveData c;

    public void LiveAudienceMultiLineArenaLineOrderTagViewModel(f p0,LiveMultiLineArenaLineMemberModel p1,LiveData p2,LiveData p3){
       a.p(p0, "arenaLineModel");
       a.p(p1, "arenaMemberModel");
       a.p(p3, "cellInfoLiveData");
       super();
       LiveData liveData = Transformations.map(p1.c(), new LiveAudienceMultiLineArenaLineOrderTagViewModel$a());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       liveData = Transformations.distinctUntilChanged(liveData);
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       liveData = d.a(liveData);
       this.a = liveData;
       LiveData liveData1 = Transformations.distinctUntilChanged(LiveDataOperators.b(liveData, p0.e(), LiveAudienceMultiLineArenaLineOrderTagViewModel$tagVisibility$1.INSTANCE));
       a.h(liveData1, "Transformations.distinctUntilChanged\(this\)");
       this.b = liveData1;
       if (p2 != null) {
          liveData1 = Transformations.distinctUntilChanged(LiveDataOperators.b(p2, p3, LiveAudienceMultiLineArenaLineOrderTagViewModel$tagStyleConfig$1$1.INSTANCE));
          a.h(liveData1, "Transformations.distinctUntilChanged\(this\)");
          if (liveData1 != null) {
          label_006b :
             this.c = liveData1;
             return;
          }
       }
       liveData1 = Transformations.map(p3, new LiveAudienceMultiLineArenaLineOrderTagViewModel$b());
       a.h(liveData1, "Transformations.map\(this\) { transform\(it\) }");
       liveData1 = Transformations.distinctUntilChanged(liveData1);
       a.h(liveData1, "Transformations.distinctUntilChanged\(this\)");
       goto label_006b ;
    }
    public final LiveData u0(){
       return this.c;
    }
    public final LiveData v0(){
       return this.a;
    }
    public final LiveData w0(){
       return this.b;
    }
}
