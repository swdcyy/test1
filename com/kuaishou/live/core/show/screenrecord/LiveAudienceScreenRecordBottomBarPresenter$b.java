package com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordBottomBarPresenter$b;
import androidx.fragment.app.c$b;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordBottomBarPresenter;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason;

public class LiveAudienceScreenRecordBottomBarPresenter$b extends c$b	// class@000fd1
{
    public final LiveAudienceScreenRecordBottomBarPresenter a;

    public void LiveAudienceScreenRecordBottomBarPresenter$b(LiveAudienceScreenRecordBottomBarPresenter p0){
       this.a = p0;
       super();
    }
    public void f(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceScreenRecordBottomBarPresenter$b.class, "1")) {
          return;
       }
       this.a.V8(LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason.REASON_DELETE, "");
       return;
    }
}
