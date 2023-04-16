package com.yxcorp.gifshow.bubble.PostBubbleManager$2;
import com.yxcorp.gifshow.bubble.PostBubbleManager$LifeCycleObserver;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import java.lang.Object;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;

public class PostBubbleManager$2 extends PostBubbleManager$LifeCycleObserver	// class@001c6d
{
    public final Fragment e;
    public final PostBubbleManager f;

    public void PostBubbleManager$2(PostBubbleManager p0,Object p1,Lifecycle p2,Fragment p3){
       this.f = p0;
       this.e = p3;
       super(p0, p1, p2);
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostBubbleManager$2.class, "1")) {
          return;
       }
       PostBubbleManager$2 tf = this.f;
       if (tf.f == null) {
          tf.f = this.e.getActivity();
       }
       super.onResume(p0);
       return;
    }
}
