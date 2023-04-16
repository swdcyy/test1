package com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2$h;
import androidx.lifecycle.Observer;
import com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2;
import java.lang.Object;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$NavigationStyle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.home2.basic.model.HomePage;

public final class TitleBarPresenterV2$h implements Observer	// class@001777
{
    public final TitleBarPresenterV2 b;

    public void TitleBarPresenterV2$h(TitleBarPresenterV2 p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TitleBarPresenterV2$h.class, "1")) {
       }else {
          TitleBarPresenterV2$h tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, TitleBarPresenterV2.class, "8")) {
             TitleBarPresenterV2 j = tb.J;
             tb.J = p0;
             if (j != p0) {
                tb.a9(tb.r);
             }
          }
       }
       return;
    }
}
