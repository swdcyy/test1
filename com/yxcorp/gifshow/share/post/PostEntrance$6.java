package com.yxcorp.gifshow.share.post.PostEntrance$6;
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
import e17.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class PostEntrance$6 extends PostEntrance	// class@001c30
{

    public void PostEntrance$6(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public KwaiOp getKwaiOpType(){
       return KwaiOp.VIDEO_DISABLE_RECREATION;
    }
    public void go(GifshowActivity p0,QPhoto p1,Bundle p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PostEntrance$6.class, "1")) {
          return;
       }
       i.a(R.style.arg_RES_7f11066a, 0x7f100a52);
       return;
    }
    public boolean isAvailable(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostEntrance$6.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (PostEntrance.enableReCreation(p0) ^ 0x01);
    }
}
