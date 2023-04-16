package com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$j;
import erd.g;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.CollectFeedInfo;

public final class CollectElement$j implements g	// class@00149d
{
    public final CollectElement b;

    public void CollectElement$j(CollectElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectElement$j.class, "1")) {
       }else {
          p0 = CollectElement.n0(this.b).getPhotoMeta();
          if (p0 != null) {
             p0 = p0.mCollectFeedInfo;
             if (p0 != null) {
                p0.mShowForWeak = false;
             }
          }
       }
       return;
    }
}
