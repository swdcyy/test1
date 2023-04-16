package com.kwai.feature.post.api.encode.a;
import erd.g;
import java.lang.Object;
import com.kwai.feature.post.api.feature.encode.model.EncodeConfigResponse;
import com.kwai.feature.post.api.encode.d;
import java.lang.System;
import rq.a;
import com.kwai.framework.player.config.PlayerConfigModel;
import com.kwai.framework.player.config.PhotoPlayerConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.media.model.WatermarkEncodeConfig;

public final class a implements g	// class@00130c
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       a.P(System.currentTimeMillis());
       a.K(p0);
       PhotoPlayerConfig.o(p0.mPlayerConfig, true);
       d.a = p0.mWatermarkEncodeConfig;
       p0 = p0.mWatermarkEncodeConfig;
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "3")) {
       }else if(d.a == null){
          d.a = new WatermarkEncodeConfig();
       }else {
          d.a = p0;
       }
       return;
    }
}
