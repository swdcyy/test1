package com.yxcorp.gifshow.profile.background.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundImagePreviewFragment$a;
import com.yxcorp.gifshow.profile.background.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.profile.background.b;
import com.yxcorp.gifshow.profile.background.c;
import com.yxcorp.gifshow.profile.background.d;
import java.lang.Class;
import mm8.a;

public final class e implements b	// class@001244
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("FRAGMENT", new a(this, p1));
       p0.i("PROFILE_PREVIEW_IMAGE_URLS", new b(this, p1));
       c uoc = new c(this, p1);
       String str = "PROFILE_PREVIEW_IMAGE_LOCAL_PATH";
       try{
          p0.i(str, uoc);
          p0.h(ProfileBackgroundImagePreviewFragment$a.class, new d(this, p1));
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
