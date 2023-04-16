package com.gifshow.kuaishou.floatwidget.close.view.CloseFloatViewActivity;
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
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.gifshow.kuaishou.floatwidget.close.view.CloseFloatViewFragment;
import k2b.u1;
import androidx.fragment.app.Fragment;

public class CloseFloatViewActivity extends SingleFragmentActivity	// class@0015cb
{
    public CloseFloatViewFragment y;
    public static final int z;

    public void CloseFloatViewActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, CloseFloatViewActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, CloseFloatViewActivity.class, "3")) {
          return;
       }
       super.onBackPressed();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "BACK_BUTTON";
       u1.u(1, uElementPack, this.y.Q3());
       return;
    }
    public Fragment u3(){
       CloseFloatViewFragment obj = PatchProxy.apply(null, this, CloseFloatViewActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CloseFloatViewFragment();
       this.y = obj;
       return obj;
    }
}
