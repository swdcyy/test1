package com.yxcorp.gifshow.profile.background.n;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundImagePreviewSelectFragment$a;
import com.yxcorp.gifshow.profile.background.f;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.profile.background.g;
import com.yxcorp.gifshow.profile.background.h;
import com.yxcorp.gifshow.profile.background.i;
import com.yxcorp.gifshow.profile.background.j;
import com.yxcorp.gifshow.profile.background.k;
import com.yxcorp.gifshow.profile.background.l;
import com.yxcorp.gifshow.profile.background.m;
import java.lang.Class;
import mm8.a;

public final class n implements b	// class@00124d
{

    public void n(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("PROFILE_PREVIEW_PHOTO_FEED", new f(this, p1));
       p0.i("FRAGMENT", new g(this, p1));
       p0.i("PROFILE_PREVIEW_IMAGE_URLS", new h(this, p1));
       p0.i("PROFILE_PREVIEW_PHOTO_LAST_UID", new i(this, p1));
       p0.i("PROFILE_PREVIEW_IMAGE_LOCAL_PATH", new j(this, p1));
       p0.i("PROFILE_PREVIEW_IS_MINE", new k(this, p1));
       l ol = new l(this, p1);
       String str = "PROFILE_PREVIEW_PHOTO_USER";
       try{
          p0.i(str, ol);
          p0.h(ProfileBackgroundImagePreviewSelectFragment$a.class, new m(this, p1));
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
