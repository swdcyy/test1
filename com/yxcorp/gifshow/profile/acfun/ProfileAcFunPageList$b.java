package com.yxcorp.gifshow.profile.acfun.ProfileAcFunPageList$b;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.ProfileFeedResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public final class ProfileAcFunPageList$b implements g	// class@0011ee
{
    public static final ProfileAcFunPageList$b b;

    static {
       ProfileAcFunPageList$b.b = new ProfileAcFunPageList$b();
    }
    public void ProfileAcFunPageList$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileAcFunPageList$b.class, "1")) {
       }else {
          a.o(p0, "it");
          List items = p0.getItems();
          a.o(items, "it.items");
          Iterator iterator = items.iterator();
          while (iterator.hasNext()) {
             r1.Y4(iterator.next().mEntity, p0.getLlsid());
          }
       }
       return;
    }
}
