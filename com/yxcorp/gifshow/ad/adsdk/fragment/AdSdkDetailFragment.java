package com.yxcorp.gifshow.ad.adsdk.fragment.AdSdkDetailFragment;
import com.trello.rxlifecycle3.components.support.RxFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;

public class AdSdkDetailFragment extends RxFragment	// class@0014f3
{
    public HashMap c;

    public void AdSdkDetailFragment(){
       super();
    }
    public void Vg(){
       if (PatchProxy.applyVoid(null, this, AdSdkDetailFragment.class, "2")) {
          return;
       }
       AdSdkDetailFragment tc = this.c;
       if (tc != null) {
          tc.clear();
       }
       return;
    }
    public boolean Wg(){
       return false;
    }
    public void onDestroyView(){
       super.onDestroyView();
       this.Vg();
    }
}
