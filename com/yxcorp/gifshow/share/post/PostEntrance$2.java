package com.yxcorp.gifshow.share.post.PostEntrance$2;
import com.yxcorp.gifshow.share.post.PostEntrance;
import java.lang.String;
import com.yxcorp.gifshow.share.post.PostEntrance$1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import android.os.Bundle;
import um6.h;
import com.kuaishou.android.model.music.Music;
import java.lang.Throwable;
import lnc.p3;
import w46.b;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import yxa.b;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import brd.f0;
import qic.a;
import com.yxcorp.gifshow.share.post.a;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import um6.b;

public final class PostEntrance$2 extends PostEntrance	// class@001c2a
{

    public void PostEntrance$2(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public static void lambda$go$0(GifshowActivity p0,QPhoto p1,Bundle p2,h p3){
       p3.US(p0, p1.getMusic(), p1.isKtvSong(), p2);
    }
    public static void lambda$go$1(Throwable p0){
       p3.D().e("KTV_RECORD", "enter ktv load plugin error", p0);
    }
    public KwaiOp getKwaiOpType(){
       return KwaiOp.PHOTO_KTV_RECORD;
    }
    public void go(GifshowActivity p0,QPhoto p1,Bundle p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PostEntrance$2.class, "1")) {
          return;
       }
       b.r(h.class, LoadPolicy.DIALOG).g(p0.E2(ActivityEvent.DESTROY)).R(new a(p0, p1, p2), a.b);
       return;
    }
    public boolean isAvailable(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostEntrance$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.isKtv() && b.b(p0.getMusic())))? true: false;
       return b;
    }
}
