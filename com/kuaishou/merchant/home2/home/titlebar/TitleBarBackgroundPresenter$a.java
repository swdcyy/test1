package com.kuaishou.merchant.home2.home.titlebar.TitleBarBackgroundPresenter$a;
import androidx.lifecycle.Observer;
import com.kuaishou.merchant.home2.home.titlebar.TitleBarBackgroundPresenter;
import java.lang.Object;
import com.kuaishou.merchant.home2.basic.model.HomePage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class TitleBarBackgroundPresenter$a implements Observer	// class@0017da
{
    public final TitleBarBackgroundPresenter b;

    public void TitleBarBackgroundPresenter$a(TitleBarBackgroundPresenter p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TitleBarBackgroundPresenter$a.class, "1")) {
       }else {
          this.b.R8(p0);
       }
       return;
    }
}
