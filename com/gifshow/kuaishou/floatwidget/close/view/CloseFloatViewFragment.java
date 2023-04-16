package com.gifshow.kuaishou.floatwidget.close.view.CloseFloatViewFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$FeatureSwitchPackage;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import ag6.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lh.c;
import java.lang.Number;
import nh.c;
import lh.b;
import lh.a;
import im8.c;
import k2b.e0;
import k2b.u1;

public class CloseFloatViewFragment extends BaseFragment	// class@0015cc
{
    public PresenterV2 j;

    public void CloseFloatViewFragment(){
       super();
    }
    public int M(){
       return 2;
    }
    public ClientContent$ContentPackage Q3(){
       ClientContent$ContentPackage obj = PatchProxy.apply(null, this, CloseFloatViewFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       ClientContent$FeatureSwitchPackage uFeatureSwit = new ClientContent$FeatureSwitchPackage();
       uFeatureSwit.name = "nebula_timer";
       uFeatureSwit.on = false;
       obj.featureSwitchPackage = uFeatureSwit;
       return obj;
    }
    public String o(){
       return "TIMER_MODEL_RECOMMEND";
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, CloseFloatViewFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.c(p0, 0x7f0d01b5, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, CloseFloatViewFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       this.j.destroy();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CloseFloatViewFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       PresenterV2 presenterV2 = new PresenterV2();
       this.j = presenterV2;
       Object obj = PatchProxy.apply(null, this, CloseFloatViewFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else if(c.a()){
          i = 0x7f1007e8;
       }else {
          i = 0x7f1007e9;
       }
       presenterV2.U7(new c(i));
       this.j.U7(new b());
       this.j.U7(new a());
       this.j.f(p0);
       Object[] objArray = new Object[]{new c("FRAGMENT", this),this};
       this.j.i(objArray);
       u1.L0(this);
       return;
    }
}
