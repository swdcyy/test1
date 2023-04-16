package com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController$e;
import xq5.c;
import com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rq1.a;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public final class LiveAudienceMultiLineEntryController$e implements c	// class@0014f9
{
    public final LiveAudienceMultiLineEntryController b;

    public void LiveAudienceMultiLineEntryController$e(LiveAudienceMultiLineEntryController p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiLineEntryController$e.class, "1")) {
          return;
       }
       LiveAudienceMultiLineEntryController t = this.b.t;
       if (t != null) {
          t.c();
       }
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
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
