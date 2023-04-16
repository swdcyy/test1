package com.kuaishou.merchant.home2.home.titlebar.TitleBarPresenter$f;
import androidx.lifecycle.Observer;
import com.kuaishou.merchant.home2.home.titlebar.TitleBarPresenter;
import java.lang.Object;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$NavigationStyle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.home2.basic.model.HomePage;

public final class TitleBarPresenter$f implements Observer	// class@0017e3
{
    public final TitleBarPresenter b;

    public void TitleBarPresenter$f(TitleBarPresenter p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TitleBarPresenter$f.class, "1")) {
       }else {
          TitleBarPresenter$f tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, TitleBarPresenter.class, "8")) {
             TitleBarPresenter e = tb.E;
             tb.E = p0;
             if (e != p0) {
                tb.Y8(tb.r);
             }
          }
       }
       return;
    }
}
