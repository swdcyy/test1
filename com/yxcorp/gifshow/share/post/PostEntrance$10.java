package com.yxcorp.gifshow.share.post.PostEntrance$10;
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
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.share.post.h;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lnc.d6;

public final class PostEntrance$10 extends PostEntrance	// class@001c28
{

    public void PostEntrance$10(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public KwaiOp getKwaiOpType(){
       return KwaiOp.PHOTO_USE_SOUNDTRACK;
    }
    public void go(GifshowActivity p0,QPhoto p1,Bundle p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PostEntrance$10.class, "1")) {
          return;
       }
       p2.putInt("LOGIN_SOURCE", 76);
       h.b(p0, p1.getSoundTrack(), p2);
       return;
    }
    public boolean isAvailable(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostEntrance$10.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!d6.a(p0)) {
          return b;
       }
       if (p0.getMusic() == null && p0.getSoundTrack() != null) {
          b = true;
       }
       return b;
    }
}
