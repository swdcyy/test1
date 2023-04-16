package com.kwai.feature.api.pendant.task.PhotoDetailTaskManagerWrapperV2;
import yt5.f;
import java.lang.Object;
import com.kwai.feature.api.pendant.task.PhotoDetailTaskManagerWrapperV2$mPhotoDetailTaskManagerV2$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.feature.api.pendant.task.PhotoDetailTaskManagerWrapperV2$mPhotoDetailTaskManagerV3$2;
import android.app.Activity;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PhotoDetailTaskManagerWrapperV2 implements f	// class@001039
{
    public final p a;
    public final p b;

    public void PhotoDetailTaskManagerWrapperV2(){
       super();
       this.a = s.c(PhotoDetailTaskManagerWrapperV2$mPhotoDetailTaskManagerV2$2.INSTANCE);
       this.b = s.c(PhotoDetailTaskManagerWrapperV2$mPhotoDetailTaskManagerV3$2.INSTANCE);
    }
    public void a(Activity p0,BaseFeed p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoDetailTaskManagerWrapperV2.class, "3")) {
          return;
       }
       this.d().a(p0, p1);
       this.e().a(p0, p1);
       return;
    }
    public void b(Activity p0,BaseFeed p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoDetailTaskManagerWrapperV2.class, "5")) {
          return;
       }
       this.d().b(p0, p1);
       this.e().b(p0, p1);
       return;
    }
    public void c(Activity p0,BaseFeed p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoDetailTaskManagerWrapperV2.class, "4")) {
          return;
       }
       this.d().c(p0, p1);
       this.e().c(p0, p1);
       return;
    }
    public final f d(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailTaskManagerWrapperV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final f e(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailTaskManagerWrapperV2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
}
