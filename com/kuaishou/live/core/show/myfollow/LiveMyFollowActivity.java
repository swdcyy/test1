package com.kuaishou.live.core.show.myfollow.LiveMyFollowActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import kqb.a;
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
import com.yxcorp.gifshow.activity.GifshowActivity;
import lnc.a1;
import ekd.i;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.show.myfollow.LiveMyFollowFragment;
import android.content.Intent;

public class LiveMyFollowActivity extends SingleFragmentActivity	// class@000d46
{
    public static a y;

    static {
       LiveMyFollowActivity.y = new a(2);
    }
    public void LiveMyFollowActivity(){
       super();
    }
    public int M(){
       return 5;
    }
    public int O2(){
       return 2;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LiveMyFollowActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String o(){
       return "MY_FOLLOW_LIVE";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMyFollowActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       LiveMyFollowActivity.y.a(this);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveMyFollowActivity.class, "4")) {
          return;
       }
       super.onDestroy();
       LiveMyFollowActivity.y.b(this);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LiveMyFollowActivity.class, "3")) {
          return;
       }
       super.onResume();
       LiveMyFollowActivity.y.c(this);
       i.h(this, a1.a(R.color.arg_RES_7f061d74), false);
       return;
    }
    public Fragment u3(){
       LiveMyFollowFragment obj = PatchProxy.apply(null, this, LiveMyFollowActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveMyFollowFragment();
       obj.setArguments(this.getIntent().getExtras());
       return obj;
    }
}
