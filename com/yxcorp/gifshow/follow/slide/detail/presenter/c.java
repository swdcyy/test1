package com.yxcorp.gifshow.follow.slide.detail.presenter.c;
import erd.g;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$g;
import com.yxcorp.gifshow.follow.common.data.PymiTipsShowResponse;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.follow.common.data.PymiTipsShowResponse$PymiTipModel;
import java.util.List;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter;

public final class c implements g	// class@001143
{
    public final FollowSlideInternalPymiListPresenter$g b;
    public final PymiTipsShowResponse c;

    public void c(FollowSlideInternalPymiListPresenter$g p0,PymiTipsShowResponse p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          this.b.b.P8(this.c.mPymiUserBar.mInfos);
       }
       return;
    }
}
