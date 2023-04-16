package com.kwai.live.gzone.accompanyplay.anchor.j;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kwai.live.gzone.accompanyplay.anchor.LiveGzoneAnchorAccompanyFleetStateFragment$c;
import com.kwai.live.gzone.accompanyplay.anchor.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.live.gzone.accompanyplay.anchor.b;
import k37.p1;
import com.kwai.live.gzone.accompanyplay.anchor.c;
import java.lang.Class;
import com.kwai.live.gzone.accompanyplay.anchor.d;
import com.kwai.live.gzone.accompanyplay.anchor.e;
import com.kwai.live.gzone.accompanyplay.anchor.LiveGzoneAnchorAccompanyFleetStateFragment;
import com.kwai.live.gzone.accompanyplay.anchor.f;
import com.kwai.live.gzone.accompanyplay.anchor.g;
import com.kwai.live.gzone.accompanyplay.anchor.h;
import com.kwai.live.gzone.accompanyplay.anchor.i;
import mm8.a;

public final class j implements b	// class@000b1b
{

    public void j(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("LIVE_GZONE_ANCHOR_ACCOMPANY_ID", new a(this, p1));
       p0.i("LIVE_GZONE_ANCHOR_ACCOMPANY_SDK_SERVICE", new b(this, p1));
       p0.h(p1.class, new c(this, p1));
       p0.i("LIVE_GZONE_ANCHOR_ACCOMPANY_ENTRANCE_STATE_SUBJECT", new d(this, p1));
       p0.i("LIVE_GZONE_ANCHOR_ACCOMPANY_FLEET_TITLE", new e(this, p1));
       p0.h(LiveGzoneAnchorAccompanyFleetStateFragment.class, new f(this, p1));
       p0.i("LIVE_GZONE_ANCHOR_ACCOMPANY_LIVE_STREAM_ID", new g(this, p1));
       h oh = new h(this, p1);
       String str = "LIVE_GZONE_ANCHOR_ACCOMPANY_REFRESH_SUBJECT";
       try{
          p0.i(str, oh);
          p0.h(LiveGzoneAnchorAccompanyFleetStateFragment$c.class, new i(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
