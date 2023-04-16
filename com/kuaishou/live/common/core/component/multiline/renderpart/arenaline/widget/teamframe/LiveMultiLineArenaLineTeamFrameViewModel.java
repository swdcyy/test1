package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.teamframe.LiveMultiLineArenaLineTeamFrameViewModel;
import ns1.a;
import yh3.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.teamframe.LiveMultiLineArenaLineTeamFrameViewModel$a;
import z0.a;
import androidx.lifecycle.Transformations;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.teamframe.LiveMultiLineArenaLineTeamFrameViewModel$teamFrameVisible$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;

public final class LiveMultiLineArenaLineTeamFrameViewModel extends a implements a	// class@001544
{
    public final LiveData b;
    public final LiveData c;

    public void LiveMultiLineArenaLineTeamFrameViewModel(LiveMultiLineArenaLineMemberModel p0){
       a.p(p0, "arenaMemberModel");
       super();
       LiveData liveData = Transformations.map(p0.c(), new LiveMultiLineArenaLineTeamFrameViewModel$a());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       liveData = Transformations.distinctUntilChanged(liveData);
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       this.b = liveData;
       LiveData liveData1 = Transformations.distinctUntilChanged(LiveDataOperators.b(this.i(), p0.a(), LiveMultiLineArenaLineTeamFrameViewModel$teamFrameVisible$1.INSTANCE));
       a.h(liveData1, "Transformations.distinctUntilChanged\(this\)");
       this.c = liveData1;
    }
    public LiveData L(){
       return this.c;
    }
    public LiveData i(){
       return this.b;
    }
}
