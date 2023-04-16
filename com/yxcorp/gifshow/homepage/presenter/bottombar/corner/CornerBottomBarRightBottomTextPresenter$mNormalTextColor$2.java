package com.yxcorp.gifshow.homepage.presenter.bottombar.corner.CornerBottomBarRightBottomTextPresenter$mNormalTextColor$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.homepage.presenter.bottombar.corner.CornerBottomBarRightBottomTextPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.res.Resources;
import java.lang.Integer;

public final class CornerBottomBarRightBottomTextPresenter$mNormalTextColor$2 extends Lambda implements a	// class@0017b9
{
    public final CornerBottomBarRightBottomTextPresenter this$0;

    public void CornerBottomBarRightBottomTextPresenter$mNormalTextColor$2(CornerBottomBarRightBottomTextPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       int color;
       Context obj = PatchProxy.apply(null, this, CornerBottomBarRightBottomTextPresenter$mNormalTextColor$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.this$0.getContext();
       if (obj != null) {
          Resources resources = obj.getResources();
          if (resources != null) {
             color = resources.getColor(R.color.arg_RES_7f061671);
          label_002b :
             return color;
          }
       }
       color = 0;
       goto label_002b ;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
