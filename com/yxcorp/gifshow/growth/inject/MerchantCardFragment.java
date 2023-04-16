package com.yxcorp.gifshow.growth.inject.MerchantCardFragment;
import com.yxcorp.gifshow.commoninsertcard.fragment.CommonCardFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import ag6.a;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.growth.inject.a;
import im8.c;

public class MerchantCardFragment extends CommonCardFragment	// class@0013b4
{
    public PresenterV2 G;
    public static final int H;

    public void MerchantCardFragment(){
       super();
    }
    public int M(){
       return 1;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantCardFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.onCreateView(p0, p1, p2);
       this.j = a.c(p0, 0x7f0d0ef6, p1, false);
       this.xh();
       return this.j;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MerchantCardFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       MerchantCardFragment tG = this.G;
       if (tG != null) {
          tG.destroy();
          this.G = null;
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantCardFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       DetailSlidePlayFragment tx = this.x;
       if (tx != null && (tx.mPhoto != null && !PatchProxy.applyVoidOneRefs(p0, this, MerchantCardFragment.class, "3"))) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.G = presenterV2;
          presenterV2.U7(new a());
          this.G.f(p0);
          Object[] objArray = new Object[]{this.x,new c("FRAGMENT", this)};
          this.G.i(objArray);
       }
    label_004d :
       return;
    }
}
