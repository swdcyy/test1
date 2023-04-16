package com.kuaishou.live.preview.item.lifecycle.LivePreviewLifecyclePresenter$3;
import com.yxcorp.gifshow.osbug.FixedLifecycleObserver;
import com.kuaishou.live.preview.item.lifecycle.LivePreviewLifecyclePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import wk3.b;

public class LivePreviewLifecyclePresenter$3 extends FixedLifecycleObserver	// class@000de8
{
    public final LivePreviewLifecyclePresenter f;

    public void LivePreviewLifecyclePresenter$3(LivePreviewLifecyclePresenter p0){
       this.f = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LivePreviewLifecyclePresenter$3.class, "1")) {
          return;
       }
       LivePreviewLifecyclePresenter$3 tf = this.f;
       if (tf.y != null) {
          tf.y = false;
          Iterator iterator = tf.D.iterator();
          while (iterator.hasNext()) {
             iterator.next().onPause();
          }
          this.f.V8();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LivePreviewLifecyclePresenter$3.class, "2")) {
          return;
       }
       LivePreviewLifecyclePresenter$3 tf = this.f;
       if (tf.y == null) {
          tf.y = true;
          Iterator iterator = tf.D.iterator();
          while (iterator.hasNext()) {
             iterator.next().onResume();
          }
          this.f.V8();
       }
       return;
    }
}
