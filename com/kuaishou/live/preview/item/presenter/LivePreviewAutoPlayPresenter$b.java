package com.kuaishou.live.preview.item.presenter.LivePreviewAutoPlayPresenter$b;
import d6a.a;
import com.kuaishou.live.preview.item.presenter.LivePreviewAutoPlayPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LivePreviewAutoPlayPresenter$b extends a	// class@000dfb
{
    public final LivePreviewAutoPlayPresenter b;

    public void LivePreviewAutoPlayPresenter$b(LivePreviewAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, LivePreviewAutoPlayPresenter$b.class, "2")) {
          return;
       }
       LivePreviewAutoPlayPresenter$b tb = this.b;
       tb.s = false;
       tb.R8();
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, LivePreviewAutoPlayPresenter$b.class, "1")) {
          return;
       }
       LivePreviewAutoPlayPresenter$b tb = this.b;
       tb.s = true;
       tb.P8();
       return;
    }
}
