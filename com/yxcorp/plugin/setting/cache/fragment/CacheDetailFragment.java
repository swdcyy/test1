package com.yxcorp.plugin.setting.cache.fragment.CacheDetailFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fgd.k;

public class CacheDetailFragment extends BaseFragment	// class@00082c
{
    public PresenterV2 j;

    public void CacheDetailFragment(){
       super();
    }
    public int M(){
       return 1;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, CacheDetailFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.getPageParams();
    }
    public String getUrl(){
       return "ks://settings";
    }
    public String o(){
       return "THIRD_STORAGE_SETTING_PAGE";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CacheDetailFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, CacheDetailFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d01ac, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, CacheDetailFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       CacheDetailFragment tj = this.j;
       if (tj != null) {
          tj.destroy();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CacheDetailFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       k ok = new k();
       this.j = ok;
       ok.f(p0);
       Object[] objArray = new Object[]{this};
       this.j.i(objArray);
       return;
    }
}
