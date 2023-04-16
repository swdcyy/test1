package com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2$b;
import ub.a;
import com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;

public final class TitleBarPresenterV2$b extends a	// class@001771
{
    public final TitleBarPresenterV2 b;

    public void TitleBarPresenterV2$b(TitleBarPresenterV2 p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TitleBarPresenterV2$b.class, "1")) {
       }else {
          int i = 0;
          Integer integer = (p1 != null)? Integer.valueOf(p1.getWidth()): i;
          if (p1 != null) {
             i = Integer.valueOf(p1.getHeight());
          }
          if (integer && (i != null && (integer.intValue() > 0 && i.intValue() > 0))) {
             p1 = TitleBarPresenterV2.V8(this.b).getLayoutParams();
             p1.width = (p1.height * integer.intValue()) / i.intValue();
             TitleBarPresenterV2.V8(this.b).setLayoutParams(p1);
          }
       }
    label_005a :
       return;
    }
}
