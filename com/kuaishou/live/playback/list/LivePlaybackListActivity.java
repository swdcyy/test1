package com.kuaishou.live.playback.list.LivePlaybackListActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.playback.list.LivePlaybackListFragment;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import java.lang.NumberFormatException;
import java.lang.Integer;

public class LivePlaybackListActivity extends SingleFragmentActivity	// class@000d21
{
    public LivePlaybackListFragment y;

    public void LivePlaybackListActivity(){
       super();
    }
    public int M(){
       return 5;
    }
    public String getPageParams(){
       LivePlaybackListActivity obj = PatchProxy.apply(null, this, LivePlaybackListActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj != null) {
          return obj.getPageParams();
       }
       return "";
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackListActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String o(){
       LivePlaybackListActivity obj = PatchProxy.apply(null, this, LivePlaybackListActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj != null) {
          return obj.o();
       }
       return super.o();
    }
    public Fragment u3(){
       LivePlaybackListFragment livePlayback;
       Object[] objArray = null;
       Uri obj = PatchProxy.apply(objArray, this, LivePlaybackListActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       long l = -1;
       obj = this.getIntent().getData();
       if (obj != null) {
          String str = x0.a(obj, "authorId");
          if (!TextUtils.x(str)) {
             try{
                l = Long.parseLong(str);
             }catch(java.lang.NumberFormatException e1){
                e1.printStackTrace();
             }
          }
       }
    }
    public boolean y3(){
       return true;
    }
}
