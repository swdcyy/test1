package com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$m;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PhotoMeta;

public final class IntensifyFollowElement$m implements g	// class@00141b
{
    public final IntensifyFollowElement b;

    public void IntensifyFollowElement$m(IntensifyFollowElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntensifyFollowElement$m.class, "1")) {
       }else {
          this.b.b0();
          p0 = IntensifyFollowElement.o0(this.b).getPhotoMeta();
          if (p0 != null) {
             p0.mIntensifyShowing = false;
          }
       }
       return;
    }
}
