package com.yxcorp.gifshow.share.post.PostEntrance$8;
import com.yxcorp.gifshow.share.post.PostEntrance;
import java.lang.String;
import com.yxcorp.gifshow.share.post.PostEntrance$1;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.util.List;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;
import com.yxcorp.gifshow.share.post.h;
import com.yxcorp.gifshow.share.post.g;
import java.lang.Runnable;
import java.lang.Boolean;

public final class PostEntrance$8 extends PostEntrance	// class@001c32
{

    public void PostEntrance$8(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public final SimpleMagicFace getFirstMagicFace(QPhoto p0){
       PhotoMeta obj = PatchProxy.applyOneRefs(p0, this, PostEntrance$8.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PhotoMeta photoMeta = PostEntrance.getPhotoMeta(p0);
       if (photoMeta != null) {
          obj = photoMeta.mMagicFaces;
          if (obj != null && obj.size() >= 1) {
             return photoMeta.mMagicFaces.get(0);
          }
       }
       return null;
    }
    public KwaiOp getKwaiOpType(){
       return KwaiOp.PHOTO_USE_MAGIC;
    }
    public void go(GifshowActivity p0,QPhoto p1,Bundle p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PostEntrance$8.class, "1")) {
          return;
       }
       SimpleMagicFace firstMagicFa = this.getFirstMagicFace(p1);
       if (firstMagicFa == null) {
          return;
       }
       p2.putInt("LOGIN_SOURCE", 76);
       if (!PatchProxy.applyVoidThreeRefs(p0, firstMagicFa, p2, null, h.class, "1")) {
          h.a(p0, p2, new g(p0, firstMagicFa, p2));
       }
       return;
    }
    public boolean isAvailable(QPhoto p0){
       PhotoMeta obj = PatchProxy.applyOneRefs(p0, this, PostEntrance$8.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = PostEntrance.getPhotoMeta(p0);
       boolean b = (obj != null && (obj.mHasMagicFaceTag != null && this.getFirstMagicFace(p0) != null))? true: false;
       return b;
    }
}
