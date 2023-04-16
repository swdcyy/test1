package com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenterV2$b;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenterV2;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h8c.a;
import java.lang.StringBuilder;
import q87.c;
import dja.a;
import bja.e;
import java.lang.Runnable;
import ekd.k1;

public final class MockFeedPresenterV2$b implements g	// class@0011c5
{
    public final MockFeedPresenterV2 b;

    public void MockFeedPresenterV2$b(MockFeedPresenterV2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MockFeedPresenterV2$b.class, "1")) {
       }else {
          a uoa = a.C();
          StringBuilder str = "uploadedQPhoto:";
          String photoId = (p0 != null)? p0.getPhotoId(): null;
          Object[] objArray = new Object[0];
          uoa.w("MockFeedPresenterV2", str+photoId+" update "+"success,notify insert", objArray);
          if (p0 != null) {
             if (p0.isPublic()) {
                p0 = this.b.P8().r0();
                if (p0 != null) {
                   k1.r(new e(p0, this), 300);
                }
             }
             this.b.P8().s0();
             this.b.P8().q0();
          }
       }
       return;
    }
}
