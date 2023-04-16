package com.kuaishou.merchant.home2.home.titlebar.TitleBarBackgroundPresenter$b;
import androidx.lifecycle.Observer;
import com.kuaishou.merchant.home2.home.titlebar.TitleBarBackgroundPresenter;
import java.lang.Object;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$NavigationStyle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.home2.basic.model.HomePage;

public final class TitleBarBackgroundPresenter$b implements Observer	// class@0017db
{
    public final TitleBarBackgroundPresenter b;

    public void TitleBarBackgroundPresenter$b(TitleBarBackgroundPresenter p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TitleBarBackgroundPresenter$b.class, "1")) {
       }else {
          TitleBarBackgroundPresenter$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, TitleBarBackgroundPresenter.class, "6")) {
             TitleBarBackgroundPresenter u = tb.u;
             tb.u = p0;
             if (u != p0) {
                tb.R8(tb.w);
             }
          }
       }
       return;
    }
}
