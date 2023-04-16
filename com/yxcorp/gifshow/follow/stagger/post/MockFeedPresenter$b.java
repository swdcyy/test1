package com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenter$b;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h8c.a;
import java.lang.StringBuilder;
import q87.c;
import dja.a;
import bja.a;
import java.lang.Runnable;
import ekd.k1;

public final class MockFeedPresenter$b implements Observer	// class@0011c1
{
    public final MockFeedPresenter b;

    public void MockFeedPresenter$b(MockFeedPresenter p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MockFeedPresenter$b.class, "1")) {
       }else {
          a uoa = a.C();
          StringBuilder str = "uploadedQPhoto:";
          String photoId = (p0 != null)? p0.getPhotoId(): null;
          Object[] objArray = new Object[0];
          uoa.w("MockFeedPresenter", str+photoId+" update "+"success,notify insert", objArray);
          if (p0 != null) {
             if (p0.isPublic()) {
                p0 = this.b.P8().r0();
                if (p0 != null) {
                   k1.r(new a(p0, this), 300);
                }
             }
             this.b.P8().s0();
             this.b.P8().q0();
          }
       }
       return;
    }
}
