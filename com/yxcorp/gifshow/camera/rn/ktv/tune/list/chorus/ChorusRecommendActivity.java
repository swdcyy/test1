package com.yxcorp.gifshow.camera.rn.ktv.tune.list.chorus.ChorusRecommendActivity;
import com.yxcorp.gifshow.camera.rn.ktv.tune.BaseKtvKrnActivity;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.model.LaunchModel$b;
import com.kuaishou.krn.model.LaunchModel;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class ChorusRecommendActivity extends BaseKtvKrnActivity	// class@000ffc
{

    public void ChorusRecommendActivity(){
       super();
    }
    public Fragment G3(){
       LaunchModel$b obj = PatchProxy.apply(null, this, ChorusRecommendActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LaunchModel$b();
       obj.i("KMusicRefactor");
       obj.j("chorus");
       obj.e("containerSource", "ChorusRecommendActivity");
       this.K3(obj);
       return KwaiRnFragment.Yg(obj.h());
    }
    public int M(){
       return 1;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ChorusRecommendActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String o(){
       return "SELECT_KARAOKE_CHORUS";
    }
}
