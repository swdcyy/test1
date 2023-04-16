package com.yxcorp.gifshow.helper.FriendClapNewView$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.helper.FriendClapNewView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.gifshow.helper.FriendClapNewView$b$a;
import android.animation.Animator$AnimatorListener;

public class FriendClapNewView$b implements Runnable	// class@001624
{
    public final FriendClapNewView b;

    public void FriendClapNewView$b(FriendClapNewView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, FriendClapNewView$b.class, "1")) {
          return;
       }
       this.b.c.s();
       this.b.c.a(new FriendClapNewView$b$a(this));
       return;
    }
}
