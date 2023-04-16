package com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailPageActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailPageActivity$a;
import nsd.u;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailFullScreenContainerFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import java.util.Objects;
import com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailFullScreenContainerFragment$a;
import java.lang.Integer;
import sr5.a;
import sr5.b;

public final class LiveHotSpotDetailPageActivity extends SingleFragmentActivity	// class@001367
{
    public HashMap y;
    public static final LiveHotSpotDetailPageActivity$a z;

    static {
       LiveHotSpotDetailPageActivity.z = new LiveHotSpotDetailPageActivity$a(null);
    }
    public void LiveHotSpotDetailPageActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailPageActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public Fragment u3(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Intent obj = PatchProxy.apply(null, this, LiveHotSpotDetailPageActivity.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.getIntent();
       if (obj == null) {
          return null;
       }
       String stringExtra = obj.getStringExtra("hot_spot_id");
       a.m(stringExtra);
       a.o(stringExtra, "intent.getStringExtra\(KEY_STRING_HOT_SPOT_ID\)!!");
       int i = 0;
       int intExtra = obj.getIntExtra("hot_spot_entry_src", i);
       LiveHotSpotDetailFullScreenContainerFragment$a q = LiveHotSpotDetailFullScreenContainerFragment.q;
       c supportFragm = this.getSupportFragmentManager();
       a.o(supportFragm, "supportFragmentManager");
       Objects.requireNonNull(q);
       if (PatchProxy.isSupport(LiveHotSpotDetailFullScreenContainerFragment$a.class)) {
          Object[] objArray = new Object[]{stringExtra,Integer.valueOf(intExtra),supportFragm,null,null};
          LiveHotSpotDetailFullScreenContainerFragment liveHotSpotD = PatchProxy.apply(objArray, q, LiveHotSpotDetailFullScreenContainerFragment$a.class, "1");
          if (liveHotSpotD != patchProxyRe) {
          label_0071 :
             return liveHotSpotD;
          }
       }
       a.p(stringExtra, "hotSpotId");
       a.p(supportFragm, "parentFragmentManager");
       LiveHotSpotDetailFullScreenContainerFragment liveHotSpotD1 = new LiveHotSpotDetailFullScreenContainerFragment(stringExtra, intExtra, supportFragm, null, null);
       goto label_0071 ;
    }
}
