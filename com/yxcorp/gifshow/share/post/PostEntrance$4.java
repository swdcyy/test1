package com.yxcorp.gifshow.share.post.PostEntrance$4;
import com.yxcorp.gifshow.share.post.PostEntrance;
import java.lang.String;
import com.yxcorp.gifshow.share.post.PostEntrance$1;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import com.yxcorp.gifshow.share.post.PostEntrance$4$a;
import android.content.Context;
import com.kwai.feature.api.social.login.model.LoginParams;
import n3d.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import h46.q;
import qic.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import pm6.a;
import tca.w2;

public final class PostEntrance$4 extends PostEntrance	// class@001c2e
{

    public void PostEntrance$4(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public KwaiOp getKwaiOpType(){
       return KwaiOp.PHOTO_FOLLOW_SHOOT;
    }
    public void go(GifshowActivity p0,QPhoto p1,Bundle p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PostEntrance$4.class, "1")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          d.a(-1712118428).x00(p0, 64, null, super(this, p0, p1, p2));
          return;
       }else {
          RxBus.f.b(new q(2, p1, p2));
          f.a(p1, p2, 1689);
          return;
       }
    }
    public boolean isAvailable(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostEntrance$4.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (a.a(p0.disableFollowShoot(), p0.isVideoAndNotKtv()) && !w2.b(p0)))? true: false;
       return b;
    }
}
