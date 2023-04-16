package com.yxcorp.gifshow.share.screenshot.m;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.share.screenshot.ScreenShotShareDialog$a;
import com.yxcorp.gifshow.share.screenshot.d;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.share.screenshot.e;
import com.yxcorp.gifshow.share.screenshot.f;
import com.yxcorp.gifshow.share.screenshot.g;
import com.yxcorp.gifshow.share.screenshot.h;
import com.yxcorp.gifshow.share.screenshot.i;
import com.yxcorp.gifshow.share.screenshot.j;
import com.yxcorp.gifshow.share.screenshot.k;
import com.yxcorp.gifshow.share.screenshot.l;
import com.yxcorp.gifshow.share.screenshot.a;
import com.yxcorp.gifshow.share.screenshot.b;
import com.yxcorp.gifshow.share.screenshot.c;
import java.lang.Class;
import mm8.a;

public final class m implements b	// class@001c5f
{

    public void m(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("SCREEN_SHOT_AUTHOR_ID", new d(this, p1));
       p0.i("SCREEN_SHOT_CHANNEL", new e(this, p1));
       p0.i("SCREEN_SHOT_CONTENT_ID", new f(this, p1));
       p0.i("SCREEN_SHOT_CONTENT_TYPE", new g(this, p1));
       p0.i("SCREEN_SHOT_SHARE_EXP_TAG", new h(this, p1));
       p0.i("SCREEN_SHOT_FEED", new i(this, p1));
       p0.i("SCREEN_SHOT_DIALOG_FRAGMENT", new j(this, p1));
       p0.i("SCREEN_SHOT_PREVIEW_BITMAP", new k(this, p1));
       p0.i("SCREEN_SHOT_URI", new l(this, p1));
       p0.i("SCREEN_SHOT_SHARE_CONTENT", new a(this, p1));
       b uob = new b(this, p1);
       String str = "SCREEN_SHOT_SUBBIZ";
       try{
          p0.i(str, uob);
          p0.h(ScreenShotShareDialog$a.class, new c(this, p1));
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
