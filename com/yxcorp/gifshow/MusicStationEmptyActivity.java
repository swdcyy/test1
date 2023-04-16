package com.yxcorp.gifshow.MusicStationEmptyActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
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
import ekd.i;
import android.view.View;
import uv8.t1;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.image.KwaiImageView;
import tkd.b;
import tkd.d;
import os5.l;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class MusicStationEmptyActivity extends GifshowActivity	// class@0012f9
{
    public View y;
    public static final int z;

    public void MusicStationEmptyActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MusicStationEmptyActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicStationEmptyActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d0841);
       i.h(this, 0, 0);
       View view = this.findViewById(R.id.music_station_top_pendant_container_close_view);
       this.y = view;
       view.setOnClickListener(new t1(this));
       a$a uoa = a.d();
       uoa.b(":ks-features:ft-live:live-music-station");
       uoa.d(ImageSource.DETAIL_COVER_IMAGE);
       this.findViewById(R.id.music_station_empty_bg).M(d.a(-1492894991).uP("udata/pkg/kwai-client-image/live_music_station_empty_bg.png"), uoa.a());
       return;
    }
}
