package com.kuaishou.merchant.home2.magnet.banner.BannerPresenter$d;
import android.view.View$OnTouchListener;
import com.kuaishou.merchant.home2.magnet.banner.BannerPresenter;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class BannerPresenter$d implements View$OnTouchListener	// class@0017ea
{
    public final BannerPresenter b;

    public void BannerPresenter$d(BannerPresenter p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, BannerPresenter$d.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       int actionMasked = p1.getActionMasked();
       if (!actionMasked) {
          this.b.X8();
       }else if(actionMasked == 1 || actionMasked == 3){
          this.b.W8();
       }
       return false;
    }
}
