package com.yxcorp.gifshow.growth.shortcut.UninstallToStayActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.yxcorp.gifshow.growth.shortcut.UninstallToStayFragment;
import io.reactivex.subjects.PublishSubject;
import sqa.a;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Objects;

public final class UninstallToStayActivity extends SingleFragmentActivity	// class@0014c1
{
    public UninstallToStayFragment y;

    public void UninstallToStayActivity(){
       super();
    }
    public int M(){
       return 4;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, UninstallToStayActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String o(){
       return "UNLOAD_HOLD";
    }
    public void onBackPressed(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, UninstallToStayActivity.class, "3")) {
          return;
       }
       UninstallToStayActivity ty = this.y;
       if (ty != null && !PatchProxy.applyVoid(objArray, ty, UninstallToStayFragment.class, "3")) {
          ty.k.b().onNext("onBackPressed");
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UninstallToStayActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       View view = this.findViewById(R.id.fragment_container);
       view.setBackgroundColor(view.getResources().getColor(R.color.arg_RES_7f061dd7));
       return;
    }
    public Fragment u3(){
       UninstallToStayFragment obj = PatchProxy.apply(null, this, UninstallToStayActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new UninstallToStayFragment();
       this.y = obj;
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.growth.shortcut.UninstallToStayFragment");
       return obj;
    }
}
