package com.feature.post.bridge.util.PostVideoHelper$3;
import androidx.lifecycle.LifecycleObserver;
import crd.b;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import com.feature.post.bridge.util.PostVideoHelper;

public class PostVideoHelper$3 implements LifecycleObserver	// class@0014be
{
    public final b b;
    public final ProgressFragment c;

    public void PostVideoHelper$3(b p0,ProgressFragment p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onDestroy(){
       if (!this.b.isDisposed()) {
          PostVideoHelper.d(this.c);
          this.b.dispose();
       }
       return;
    }
}
