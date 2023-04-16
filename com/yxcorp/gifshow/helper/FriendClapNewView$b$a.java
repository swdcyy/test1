package com.yxcorp.gifshow.helper.FriendClapNewView$b$a;
import ekd.f$j;
import com.yxcorp.gifshow.helper.FriendClapNewView$b;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.helper.FriendClapNewView;
import java.lang.Runnable;
import android.widget.FrameLayout;

public class FriendClapNewView$b$a extends f$j	// class@001623
{
    public final FriendClapNewView$b a;

    public void FriendClapNewView$b$a(FriendClapNewView$b p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendClapNewView$b$a.class, "1")) {
          return;
       }
       FriendClapNewView$b b = this.a.b;
       b.removeCallbacks(b.n);
       b = this.a.b;
       b.postDelayed(b.n, 1000);
       return;
    }
}
