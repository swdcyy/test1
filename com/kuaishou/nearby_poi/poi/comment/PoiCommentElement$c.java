package com.kuaishou.nearby_poi.poi.comment.PoiCommentElement$c;
import erd.g;
import com.kuaishou.nearby_poi.poi.comment.PoiCommentElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import tkd.b;
import tkd.d;
import xw5.c;

public final class PoiCommentElement$c implements g	// class@000a18
{
    public final PoiCommentElement b;

    public void PoiCommentElement$c(PoiCommentElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PoiCommentElement$c.class, "1")) {
       }else {
          this.b.r0();
          p0 = this.b.A;
          if (p0 != null) {
             p0 = p0.getEntity();
             if (p0 != null) {
                p0.setPartData("BUTTON_CLOSED", Boolean.TRUE);
             }
          }
          d.a(0x1e777b83).vg();
       }
       return;
    }
}
