package com.kuaishou.live.preview.item.presenter.ad.LivePreviewAdAutoToLivePresenter$a;
import d6a.a;
import com.kuaishou.live.preview.item.presenter.ad.LivePreviewAdAutoToLivePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;

public class LivePreviewAdAutoToLivePresenter$a extends a	// class@000e03
{
    public final LivePreviewAdAutoToLivePresenter b;

    public void LivePreviewAdAutoToLivePresenter$a(LivePreviewAdAutoToLivePresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, LivePreviewAdAutoToLivePresenter$a.class, "1")) {
          return;
       }
       LivePreviewAdAutoToLivePresenter$a tb = this.b;
       tb.v = false;
       b9.a(tb.u);
       return;
    }
    public void i2(){
       this.b.v = true;
    }
}
