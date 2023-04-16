package com.gifshow.tuna.player.poi.PoiFoodListSlidePlayActivity;
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
import java.lang.Number;
import zf6.l;
import android.os.Bundle;
import android.view.Window;
import lnc.i5;
import androidx.fragment.app.Fragment;
import com.gifshow.tuna.player.poi.PoiFoodListSlidePlayFragment;
import android.content.Intent;
import android.net.Uri;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;

public class PoiFoodListSlidePlayActivity extends SingleFragmentActivity	// class@0015ed
{

    public void PoiFoodListSlidePlayActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PoiFoodListSlidePlayActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public int getStatusColor(){
       Object obj = PatchProxy.apply(null, this, PoiFoodListSlidePlayActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return l.o(0xff000000);
    }
    public String o(){
       return "POI_RECOMMEND_FOOD";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PoiFoodListSlidePlayActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       i5.j(this.getWindow(), 0xff000000);
       return;
    }
    public Fragment u3(){
       String str = "poiId";
       PoiFoodListSlidePlayFragment obj = PatchProxy.apply(null, this, PoiFoodListSlidePlayActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PoiFoodListSlidePlayFragment();
       Intent intent = this.getIntent();
       if (intent != null) {
          Uri data = intent.getData();
          if (data != null) {
             String queryParamet = data.getQueryParameter("index");
             Bundle uBundle = new Bundle();
             uBundle.putString(str, data.getQueryParameter(str));
             if (!TextUtils.isEmpty(queryParamet)) {
                uBundle.putInt("index", Integer.parseInt(queryParamet));
             }
             obj.setArguments(uBundle);
          }
       }
       return obj;
    }
}
