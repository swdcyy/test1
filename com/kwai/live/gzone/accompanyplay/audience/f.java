package com.kwai.live.gzone.accompanyplay.audience.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyJoinFragment$a;
import com.kwai.live.gzone.accompanyplay.audience.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.live.gzone.accompanyplay.audience.b;
import com.kwai.live.gzone.accompanyplay.audience.c;
import com.kwai.live.gzone.accompanyplay.audience.d;
import com.kwai.live.gzone.accompanyplay.audience.e;
import java.lang.Class;
import mm8.a;

public final class f implements b	// class@000b7d
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("LIVE_GZONE_AUDIENCE_ACCOMPANY_INNER_SERVICE", new a(this, p1));
       p0.i("LIVE_GZONE_AUDIENCE_ACCOMPANY_TAB_HOST_SERVICE", new b(this, p1));
       p0.i("LIVE_GZONE_AUDIENCE_ACCOMPANY_MODIFY_GAME_INFO_SUBJECT", new c(this, p1));
       d uod = new d(this, p1);
       String str = "LIVE_GZONE_ACCOMPANY_SDK_SERVICE";
       try{
          p0.i(str, uod);
          p0.h(LiveGzoneAccompanyJoinFragment$a.class, new e(this, p1));
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
