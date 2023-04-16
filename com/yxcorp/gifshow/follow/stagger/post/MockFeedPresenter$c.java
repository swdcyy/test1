package com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenter$c;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenter;
import java.lang.Object;
import cda.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import h8c.a;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Long;
import q87.c;
import o26.d;

public final class MockFeedPresenter$c implements g	// class@0011c2
{
    public final MockFeedPresenter b;

    public void MockFeedPresenter$c(MockFeedPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MockFeedPresenter$c.class, "1")) {
       }else {
          MockFeedPresenter$c tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, MockFeedPresenter.class, "13") && (p0 != null && p0.b == 6)) {
             f a = p0.a;
             a.o(a, "it.mQPhoto");
             String photoId = a.getPhotoId();
             a.o(photoId, "it.mQPhoto.photoId");
             Object[] objArray = new Object[0];
             a.C().w("MockFeedPresenter", "handlePhotoEvent£ºdelete "+Long.parseLong(photoId), objArray);
             MockFeedPresenter t = tb.t;
             if (t == null) {
                a.S("mockFeedRepo");
             }
             t.ec(p0.a);
          }
       }
       return;
    }
}
