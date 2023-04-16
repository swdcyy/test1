package com.yxcorp.gifshow.location.PostLocationPermissionHolder$mLifecycleObserver$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.location.PostLocationPermissionHolder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import brd.y;
import j2b.s;
import java.util.Objects;

public final class PostLocationPermissionHolder$mLifecycleObserver$1 implements LifecycleObserver	// class@001add
{
    public final PostLocationPermissionHolder b;
    public final boolean c;

    public void PostLocationPermissionHolder$mLifecycleObserver$1(PostLocationPermissionHolder p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onResume(){
       if (PatchProxy.applyVoid(null, this, PostLocationPermissionHolder$mLifecycleObserver$1.class, "1")) {
          return;
       }
       if (this.c != null) {
          this.b.c.onNext(Boolean.TRUE);
       }else {
          PostLocationPermissionHolder$mLifecycleObserver$1 tb = this.b;
          boolean b = s.b();
          Objects.requireNonNull(tb);
          PostLocationPermissionHolder postLocation = PostLocationPermissionHolder.class;
          if (!PatchProxy.isSupport(postLocation) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, postLocation, "3")) {
             if (b && tb.a == null) {
                tb.c.onNext(Boolean.TRUE);
             }
             tb.a = b;
          }
       }
       return;
    }
}
