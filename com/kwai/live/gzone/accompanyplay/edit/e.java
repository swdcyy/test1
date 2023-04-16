package com.kwai.live.gzone.accompanyplay.edit.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kwai.live.gzone.accompanyplay.edit.g0$c;
import com.kwai.live.gzone.accompanyplay.edit.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.live.gzone.accompanyplay.edit.b;
import com.kwai.live.gzone.accompanyplay.edit.c;
import com.kwai.live.gzone.accompanyplay.edit.d;
import java.lang.Class;
import mm8.a;

public final class e implements b	// class@000be2
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("LIVE_GZONE_ANCHOR_ACCOMPANY_EDIT_PARAMS", new a(this, p1));
       p0.i("LIVE_GZONE_ANCHOR_ACCOMPANY_EDIT_POPUP", new b(this, p1));
       c uoc = new c(this, p1);
       String str = "LIVE_GZONE_ANCHOR_ACCOMPANY_SDK_SERVICE";
       try{
          p0.i(str, uoc);
          p0.h(g0$c.class, new d(this, p1));
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
