package com.yxcorp.gifshow.relation.explore.search.ExploreSearchActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.relation.explore.search.ExploreSearchFragment;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

public class ExploreSearchActivity extends SingleFragmentActivity	// class@00186c
{
    public ExploreSearchFragment y;
    public static final int z;

    public void ExploreSearchActivity(){
       super();
    }
    public int M(){
       ExploreSearchActivity obj = PatchProxy.apply(null, this, ExploreSearchActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y;
       if (obj == null) {
          return 0;
       }
       return obj.M();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ExploreSearchActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public int getStatusColor(){
       Object obj = PatchProxy.apply(null, this, ExploreSearchActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getResources().getColor(0x7f06008d);
    }
    public String o(){
       ExploreSearchActivity obj = PatchProxy.apply(null, this, ExploreSearchActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj == null) {
          return super.o();
       }
       return obj.o();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExploreSearchActivity.class, "2")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
    public Fragment u3(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ExploreSearchFragment obj = PatchProxy.apply(null, this, ExploreSearchActivity.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, ExploreSearchFragment.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = new ExploreSearchFragment();
          obj.setArguments(new Bundle());
       }
       this.y = obj;
       return obj;
    }
    public int x3(){
       return 0x7f0d0028;
    }
    public boolean y3(){
       return true;
    }
}
