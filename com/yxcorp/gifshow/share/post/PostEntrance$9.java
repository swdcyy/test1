package com.yxcorp.gifshow.share.post.PostEntrance$9;
import com.yxcorp.gifshow.share.post.PostEntrance;
import java.lang.String;
import com.yxcorp.gifshow.share.post.PostEntrance$1;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;
import com.yxcorp.gifshow.share.post.h;
import java.lang.Boolean;
import lnc.d6;

public final class PostEntrance$9 extends PostEntrance	// class@001c33
{

    public void PostEntrance$9(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public KwaiOp getKwaiOpType(){
       return KwaiOp.PHOTO_USE_MUSIC;
    }
    public final Music getMusic(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostEntrance$9.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Music soundTrack = (p0.isKtv())? p0.getSoundTrack(): p0.getMusic();
       return soundTrack;
    }
    public void go(GifshowActivity p0,QPhoto p1,Bundle p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PostEntrance$9.class, "1")) {
          return;
       }
       p2.putInt("LOGIN_SOURCE", 76);
       h.b(p0, this.getMusic(p1), p2);
       return;
    }
    public boolean isAvailable(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostEntrance$9.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!d6.a(p0)) {
          return b;
       }
       if (this.getMusic(p0) != null) {
          b = true;
       }
       return b;
    }
}
