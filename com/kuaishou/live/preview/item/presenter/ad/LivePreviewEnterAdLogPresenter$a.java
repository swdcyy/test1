package com.kuaishou.live.preview.item.presenter.ad.LivePreviewEnterAdLogPresenter$a;
import d6a.a;
import com.kuaishou.live.preview.item.presenter.ad.LivePreviewEnterAdLogPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import wkd.b;
import mxb.f0;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import com.kwai.framework.model.feed.BaseFeed;

public class LivePreviewEnterAdLogPresenter$a extends a	// class@000e05
{
    public final LivePreviewEnterAdLogPresenter b;

    public void LivePreviewEnterAdLogPresenter$a(LivePreviewEnterAdLogPresenter p0){
       this.b = p0;
       super();
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, LivePreviewEnterAdLogPresenter$a.class, "1")) {
          return;
       }
       int i = this.b.r.c();
       int i1 = 2;
       LivePreviewEnterAdLogPresenter livePreviewE = 1;
       if (i == livePreviewE) {
          this.b.t = i1;
       }else if(i == i1){
          this.b.t = 3;
       }else {
          LivePreviewEnterAdLogPresenter$a tb1 = this.b;
          tb1.t = (tb1.s != null)? 5: livePreviewE;
       }
       LivePreviewEnterAdLogPresenter$a tb = this.b;
       b.a(-762347696).r1(tb.p.mEntity, "key_enteraction", Integer.valueOf(tb.t));
       return;
    }
}
