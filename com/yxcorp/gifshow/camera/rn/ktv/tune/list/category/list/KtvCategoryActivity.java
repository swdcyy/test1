package com.yxcorp.gifshow.camera.rn.ktv.tune.list.category.list.KtvCategoryActivity;
import com.yxcorp.gifshow.camera.rn.ktv.tune.BaseKtvKrnActivity;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.model.LaunchModel$b;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import com.kuaishou.krn.model.LaunchModel;
import com.kwai.kds.krn.api.page.KwaiRnFragment$a;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public final class KtvCategoryActivity extends BaseKtvKrnActivity	// class@000ffb
{

    public void KtvCategoryActivity(){
       super();
    }
    public Fragment G3(){
       LaunchModel$b obj = PatchProxy.apply(null, this, KtvCategoryActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LaunchModel$b();
       obj.i("KMusicRefactor");
       obj.j("theme");
       this.K3(obj);
       return KwaiRnFragment.B.a(obj.h());
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, KtvCategoryActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
