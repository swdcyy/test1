package com.yxcorp.gifshow.share.post.h;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import ekd.p0;
import e17.i;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import qic.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.share.post.f;

public final class h	// class@001c3c
{

    public void h(){
       super();
    }
    public static void a(GifshowActivity p0,Bundle p1,Runnable p2){
       int i;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, h.class, "3")) {
          return;
       }
       if (!p0.C(p0)) {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
          return;
       }else if(QCurrentUser.me() != null && !QCurrentUser.me().isLogined()){
          i.a(R.style.arg_RES_7f11066a, 0x7f10305c);
          b uob = d.a(-1712118428);
          String url = p0.getUrl();
          String url1 = p0.getUrl();
          Object obj = PatchProxy.applyOneRefs(p1, null, h.class, "4");
          i = (obj != PatchProxyResult.class)? obj.intValue(): p1.getInt("LOGIN_SOURCE", 76);
          uob.ne(p0, url, url1, i, "", null, null, null, new b(p2)).h();
          return;
       }else {
          p2.run();
          return;
       }
    }
    public static void b(GifshowActivity p0,Music p1,Bundle p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, h.class, "2")) {
          return;
       }
       h.a(p0, p2, new f(p0, p1, p2));
       return;
    }
}
