package com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator$f;
import erd.g;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.post.PostArguments;
import java.lang.Object;
import om6.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator;
import kotlin.jvm.internal.a;
import java.io.File;

public final class ReEditAfterDeleteOperator$f implements g	// class@001432
{
    public final QPhoto b;
    public final GifshowActivity c;
    public final PostArguments d;

    public void ReEditAfterDeleteOperator$f(QPhoto p0,GifshowActivity p1,PostArguments p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, ReEditAfterDeleteOperator$f.class, "1")) {
       }else {
          p0 = ReEditAfterDeleteOperator.d;
          String photoId = this.b.getPhotoId();
          a.o(photoId, "photo.photoId");
          photoId = p0.i(photoId);
          if (photoId != null) {
             if (!ReEditAfterDeleteOperator.m(photoId)) {
                p0.d(photoId);
             }
             obj.f50(photoId, this.c, null, true, 5, "toEditDraft: REEDIT_AFTER_DELETE", null, this.d);
          }
       }
       return;
    }
}
