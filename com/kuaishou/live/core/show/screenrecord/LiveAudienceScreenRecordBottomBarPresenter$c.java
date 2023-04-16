package com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordBottomBarPresenter$c;
import xq5.c;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordBottomBarPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mq5.h;
import mq5.b;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class LiveAudienceScreenRecordBottomBarPresenter$c implements c	// class@000fd2
{
    public final LiveAudienceScreenRecordBottomBarPresenter b;

    public void LiveAudienceScreenRecordBottomBarPresenter$c(LiveAudienceScreenRecordBottomBarPresenter p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceScreenRecordBottomBarPresenter$c.class, "2")) {
          return;
       }
       this.b.S8();
       LiveAudienceScreenRecordBottomBarPresenter$c tb = this.b;
       tb.s.le(tb.P);
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceScreenRecordBottomBarPresenter$c.class, "1")) {
          return;
       }
       this.b.R8();
       return;
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
