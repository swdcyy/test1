package com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$b;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement;
import java.lang.Object;
import jga.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.action.c;

public final class IntensifyFollowElement$b implements FollowHelper$a	// class@001410
{
    public final IntensifyFollowElement a;

    public void IntensifyFollowElement$b(IntensifyFollowElement p0){
       this.a = p0;
       super();
    }
    public final void a(boolean p0,g p1){
       if (PatchProxy.isSupport(IntensifyFollowElement$b.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, IntensifyFollowElement$b.class, "1")) {
          return;
       }
       if (p0) {
          c.a(12, IntensifyFollowElement.o0(this.a).mEntity);
       }
       return;
    }
}
