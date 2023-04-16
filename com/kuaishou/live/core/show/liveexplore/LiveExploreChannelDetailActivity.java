package com.kuaishou.live.core.show.liveexplore.LiveExploreChannelDetailActivity;
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
import android.os.Bundle;
import zf6.l;
import ekd.i;
import com.kuaishou.live.core.show.liveexplore.LiveExploreChannelDetailActivity$a;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import va2.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Parcelable;
import ekd.j0;
import org.parceler.b;
import com.kwai.framework.model.channel.HotChannel;
import com.kuaishou.live.core.show.liveexplore.LiveExploreFragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public class LiveExploreChannelDetailActivity extends SingleFragmentActivity	// class@000c71
{
    public PresenterV2 A;
    public LiveExploreChannelDetailActivity$a y;
    public HotChannel z;

    public void LiveExploreChannelDetailActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LiveExploreChannelDetailActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return false;
    }
    public String o(){
       return "CHANNEL_PAGE";
    }
    public void onCreate(Bundle p0){
       LiveExploreChannelDetailActivity liveExploreC = LiveExploreChannelDetailActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveExploreC, "2")) {
          return;
       }
       super.onCreate(p0);
       i.h(this, 0, l.r());
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, liveExploreC, "5")) {
          LiveExploreChannelDetailActivity$a uoa = new LiveExploreChannelDetailActivity$a();
          this.y = uoa;
          uoa.b = this.z;
       }
       if (!PatchProxy.applyVoid(objArray, this, liveExploreC, "4")) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.A = presenterV2;
          presenterV2.U7(new b());
          this.A.f(this.findViewById(R.id.root_channel_detail));
       }
       Object[] objArray1 = new Object[]{this.y};
       this.A.i(objArray1);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveExploreChannelDetailActivity.class, "6")) {
          return;
       }
       super.onDestroy();
       LiveExploreChannelDetailActivity tA = this.A;
       if (tA != null) {
          tA.destroy();
          this.A = null;
       }
       return;
    }
    public Fragment u3(){
       LiveExploreFragment obj = PatchProxy.apply(null, this, LiveExploreChannelDetailActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.z = b.a(j0.d(this.getIntent(), "key_clicked_channel"));
       obj = new LiveExploreFragment();
       Bundle uBundle = new Bundle();
       SerializableHook.putSerializable(uBundle, "key_channel", this.z);
       obj.setArguments(uBundle);
       return obj;
    }
    public int x3(){
       return 0x7f0d0031;
    }
}
