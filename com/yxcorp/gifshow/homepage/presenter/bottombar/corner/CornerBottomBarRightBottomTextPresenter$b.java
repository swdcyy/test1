package com.yxcorp.gifshow.homepage.presenter.bottombar.corner.CornerBottomBarRightBottomTextPresenter$b;
import erd.g;
import com.yxcorp.gifshow.homepage.presenter.bottombar.corner.CornerBottomBarRightBottomTextPresenter;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class CornerBottomBarRightBottomTextPresenter$b implements g	// class@0017b6
{
    public final CornerBottomBarRightBottomTextPresenter b;
    public final PhotoMeta c;

    public void CornerBottomBarRightBottomTextPresenter$b(CornerBottomBarRightBottomTextPresenter p0,PhotoMeta p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CornerBottomBarRightBottomTextPresenter$b.class, "1")) {
       }else {
          this.b.P8(this.c);
       }
       return;
    }
}
