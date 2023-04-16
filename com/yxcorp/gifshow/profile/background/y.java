package com.yxcorp.gifshow.profile.background.y;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundVideoPreviewSelectFragment$a;
import com.yxcorp.gifshow.profile.background.p;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.profile.background.q;
import com.yxcorp.gifshow.profile.background.r;
import com.yxcorp.gifshow.profile.background.s;
import com.yxcorp.gifshow.profile.background.t;
import com.yxcorp.gifshow.profile.background.u;
import com.yxcorp.gifshow.profile.background.v;
import com.yxcorp.gifshow.profile.background.w;
import com.yxcorp.gifshow.profile.background.x;
import com.yxcorp.gifshow.profile.background.o;
import java.lang.Class;
import mm8.a;

public final class y implements b	// class@001294
{

    public void y(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("PROFILE_PREVIEW_VIDEO_INFO", new p(this, p1));
       p0.i("PROFILE_PREVIEW_CLICK_EXIT", new q(this, p1));
       p0.i("PROFILE_PREVIEW_PHOTO_FEED", new r(this, p1));
       p0.i("FRAGMENT", new s(this, p1));
       p0.i("PROFILE_PREVIEW_PHOTO_LAST_UID", new t(this, p1));
       p0.i("PROFILE_PREVIEW_MEDIA_PREPARED", new u(this, p1));
       p0.i("PROFILE_PREVIEW_IS_MINE", new v(this, p1));
       p0.i("PROFILE_PREVIEW_VIDEO_PROGRESS", new w(this, p1));
       x ox = new x(this, p1);
       String str = "PROFILE_PREVIEW_PHOTO_USER";
       try{
          p0.i(str, ox);
          p0.h(ProfileBackgroundVideoPreviewSelectFragment$a.class, new o(this, p1));
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
