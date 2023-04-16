package com.kuaishou.network.testconfig.RegionInfoActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import zk.d;
import com.google.gson.Gson;
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
import android.view.View;
import android.widget.TextView;
import o56.c;
import o56.a;
import xf6.l;
import java.lang.CharSequence;
import wkd.b;
import pjd.c;
import com.yxcorp.retrofit.region.config.RegionInfo;

public class RegionInfoActivity extends GifshowActivity	// class@000a37
{
    public Gson y;

    public void RegionInfoActivity(){
       super();
       d uod = new d();
       uod.n();
       this.y = uod.b();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, RegionInfoActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RegionInfoActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d15cb);
       TextView textView = this.findViewById(R.id.region_info_text);
       if (!l.c("enable_api_region_scheduling", (a.a().c() ^ 0x01))) {
          textView.setText("多机房调度开关未打开：\n开启路径：摇一摇=>网络=>开启region api调度策略");
       }else {
          textView.setText(this.y.q(b.a(0x3c63ef10).c()));
       }
       return;
    }
}
