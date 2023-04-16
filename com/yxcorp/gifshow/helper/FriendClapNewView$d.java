package com.yxcorp.gifshow.helper.FriendClapNewView$d;
import java.lang.Runnable;
import com.yxcorp.gifshow.helper.FriendClapNewView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.animation.ObjectAnimator;
import qra.h;
import android.animation.Animator$AnimatorListener;

public class FriendClapNewView$d implements Runnable	// class@001626
{
    public final FriendClapNewView b;

    public void FriendClapNewView$d(FriendClapNewView p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FriendClapNewView$d.class, "1")) {
          return;
       }
       FriendClapNewView$d tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, FriendClapNewView.class, "5")) {
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(tb.d, "alpha", new float[2]{0x3f800000,0});
          objectAnimat.setDuration(150);
          objectAnimat.addListener(new h(tb));
          objectAnimat.start();
       }
       return;
    }
}
