package com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.AdPlayEndBaseView$a;
import hka.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.AdPlayEndBaseView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.FrameLayout;

public class AdPlayEndBaseView$a implements a	// class@0015f1
{
    public final AdPlayEndBaseView b;

    public void AdPlayEndBaseView$a(AdPlayEndBaseView p0){
       this.b = p0;
       super();
    }
    public boolean onBackPressed(){
       AdPlayEndBaseView$a obj = PatchProxy.apply(null, this, AdPlayEndBaseView$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj.e == null || obj.getVisibility()) {
          return false;
       }
       this.b.e(4);
       return true;
    }
}
