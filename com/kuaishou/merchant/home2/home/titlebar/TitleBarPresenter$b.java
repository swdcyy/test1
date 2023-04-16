package com.kuaishou.merchant.home2.home.titlebar.TitleBarPresenter$b;
import androidx.lifecycle.Observer;
import com.kuaishou.merchant.home2.home.titlebar.TitleBarPresenter;
import java.lang.Object;
import com.kuaishou.merchant.home2.basic.model.HomePage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class TitleBarPresenter$b implements Observer	// class@0017df
{
    public final TitleBarPresenter b;

    public void TitleBarPresenter$b(TitleBarPresenter p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TitleBarPresenter$b.class, "1")) {
       }else {
          this.b.Y8(p0);
       }
       return;
    }
}
