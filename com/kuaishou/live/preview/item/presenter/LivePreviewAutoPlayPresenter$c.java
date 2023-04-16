package com.kuaishou.live.preview.item.presenter.LivePreviewAutoPlayPresenter$c;
import erd.g;
import com.kuaishou.live.preview.item.presenter.LivePreviewAutoPlayPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kuaishou.live.preview.item.presenter.LivePreviewAutoPlayPresenter$STOP_REASON;
import java.util.BitSet;

public final class LivePreviewAutoPlayPresenter$c implements g	// class@000dfc
{
    public final LivePreviewAutoPlayPresenter b;

    public void LivePreviewAutoPlayPresenter$c(LivePreviewAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       LivePreviewAutoPlayPresenter$c uoc = LivePreviewAutoPlayPresenter$c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uoc, "1")) {
          uoc = this.b;
          if (uoc.s != null) {
             if (b) {
                uoc.u.set(LivePreviewAutoPlayPresenter$STOP_REASON.STOP_BY_SLIDE_MENU.getType());
                this.b.R8();
             }else {
                uoc.u.clear(LivePreviewAutoPlayPresenter$STOP_REASON.STOP_BY_SLIDE_MENU.getType());
                this.b.P8();
             }
          }
       }
       return;
    }
}
