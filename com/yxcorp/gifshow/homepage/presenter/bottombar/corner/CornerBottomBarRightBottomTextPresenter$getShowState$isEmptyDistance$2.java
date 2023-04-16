package com.yxcorp.gifshow.homepage.presenter.bottombar.corner.CornerBottomBarRightBottomTextPresenter$getShowState$isEmptyDistance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.homepage.presenter.bottombar.corner.CornerBottomBarRightBottomTextPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.CommonMeta;

public final class CornerBottomBarRightBottomTextPresenter$getShowState$isEmptyDistance$2 extends Lambda implements a	// class@0017b8
{
    public final CornerBottomBarRightBottomTextPresenter this$0;

    public void CornerBottomBarRightBottomTextPresenter$getShowState$isEmptyDistance$2(CornerBottomBarRightBottomTextPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, CornerBottomBarRightBottomTextPresenter$getShowState$isEmptyDistance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.this$0.b9() && (this.this$0.c9() && this.this$0.V8().mDistance == null))? true: false;
       return b;
    }
}
