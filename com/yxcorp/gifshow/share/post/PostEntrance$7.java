package com.yxcorp.gifshow.share.post.PostEntrance$7;
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
import com.yxcorp.gifshow.util.rx.RxBus;
import h46.q;
import qic.f;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.PostOperationEntranceInfo;
import pm6.b;
import wh5.c;

public final class PostEntrance$7 extends PostEntrance	// class@001c31
{

    public void PostEntrance$7(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public KwaiOp getKwaiOpType(){
       return KwaiOp.PHOTO_LIPS_SYNC;
    }
    public void go(GifshowActivity p0,QPhoto p1,Bundle p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PostEntrance$7.class, "1")) {
          return;
       }
       RxBus.f.b(new q(7, p1, p2));
       if (p2 == null || (p2.getInt("post_entrance_source", 0) == 2 && !PatchProxy.applyVoidOneRefs(p1, null, f.class, "5"))) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SOLITAIRE_VIDEO_REC";
          uElementPack.name = "solitaire";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.referPhotoPackage = w1.f(p1.mEntity);
          u1.u(1, uElementPack, uContentPack);
       }
    label_0050 :
       return;
    }
    public boolean isAvailable(QPhoto p0){
       boolean b2;
       Object obj = PatchProxy.applyOneRefs(p0, this, PostEntrance$7.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       boolean b1 = (p0 != null && (p0.getPhotoMeta() == null || p0.getPhotoMeta().mPostOperationEntranceInfo == null))? true: false;
       if (("LIPS_SYNC").equals(p0.getPhotoMeta().mPostOperationEntranceInfo.mType)) {
          b uob = b.class;
          if (PatchProxy.isSupport(uob)) {
             uob = PatchProxy.applyOneRefs(Boolean.valueOf(b1), null, uob, "1");
             if (uob != PatchProxyResult.class) {
                b2 = uob.booleanValue();
             }else if(!c.g() || b1){
                b2 = false;
             }else {
                b2 = true;
             }
          }else {
             goto label_0055 ;
          }
          if (b2) {
             b = true;
          }
       }
       return b;
    }
}
