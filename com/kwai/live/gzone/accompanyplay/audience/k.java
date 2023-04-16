package com.kwai.live.gzone.accompanyplay.audience.k;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment$d;
import com.kwai.live.gzone.accompanyplay.audience.g;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.live.gzone.accompanyplay.audience.h;
import com.kwai.live.gzone.accompanyplay.audience.i;
import com.kwai.live.gzone.accompanyplay.audience.j;
import java.lang.Class;
import mm8.a;

public final class k implements b	// class@000b94
{

    public void k(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("LIVE_GZONE_AUDIENCE_ACCOMPANY_INNER_SERVICE", new g(this, p1));
       p0.i("LIVE_GZONE_AUDIENCE_ACCOMPANY_TAB_HOST_SERVICE", new h(this, p1));
       i oi = new i(this, p1);
       String str = "LIVE_GZONE_ACCOMPANY_SDK_SERVICE";
       try{
          p0.i(str, oi);
          p0.h(LiveGzoneAccompanyTabHostFragment$d.class, new j(this, p1));
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
