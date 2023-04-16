package com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenterV2$c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostUtils;

public final class MockFeedPresenterV2$c implements g	// class@0011c6
{
    public static final MockFeedPresenterV2$c b;

    static {
       MockFeedPresenterV2$c.b = new MockFeedPresenterV2$c();
    }
    public void MockFeedPresenterV2$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MockFeedPresenterV2$c.class, "1")) {
       }else {
          PostUtils.D("MockFeedPresenterV2", "uploadedQPhotoSubject error", p0);
       }
       return;
    }
}
