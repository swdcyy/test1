package com.yxcorp.gifshow.share.post.PostEntrance$1;
import com.yxcorp.gifshow.share.post.PostEntrance;
import java.lang.String;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import h46.q;
import qic.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.components.feedmodel.feed.KaraokeChorusModel;
import um6.b;

public final class PostEntrance$1 extends PostEntrance	// class@001c29
{

    public void PostEntrance$1(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public KwaiOp getKwaiOpType(){
       return KwaiOp.PHOTO_KTV_CHORUS;
    }
    public void go(GifshowActivity p0,QPhoto p1,Bundle p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PostEntrance$1.class, "1")) {
          return;
       }
       RxBus.f.b(new q(3, p1, p2));
       f.a(p1, p2, 1859);
       return;
    }
    public boolean isAvailable(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostEntrance$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(p0.isChorus(), p0.getKaraokeChorusModel());
    }
}
