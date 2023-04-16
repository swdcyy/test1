package com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2$c;
import androidx.lifecycle.Observer;
import com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2;
import java.lang.Object;
import com.kuaishou.merchant.home2.basic.model.HomePage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class TitleBarPresenterV2$c implements Observer	// class@001772
{
    public final TitleBarPresenterV2 b;

    public void TitleBarPresenterV2$c(TitleBarPresenterV2 p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TitleBarPresenterV2$c.class, "1")) {
       }else {
          this.b.a9(p0);
       }
       return;
    }
}
