package com.yxcorp.gifshow.profile.adapter.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.profile.adapter.g$a;
import com.yxcorp.gifshow.profile.adapter.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.profile.adapter.b;
import com.yxcorp.gifshow.profile.adapter.c;
import com.yxcorp.gifshow.profile.adapter.d;
import com.yxcorp.gifshow.profile.adapter.e;
import java.lang.Class;
import mm8.a;

public final class f implements b	// class@00120b
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("PHOTO_CLICK_LOGGER", new a(this, p1));
       p0.i("LIVE_STREAM_CLICK_LISTENER", new b(this, p1));
       p0.i("PHOTO_CLICK_LISTENER", new c(this, p1));
       d uod = new d(this, p1);
       String str = "PHOTO_DETAIL_PARAM_PROCESSOR";
       try{
          p0.i(str, uod);
          p0.h(g$a.class, new e(this, p1));
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
