package com.yxcorp.gifshow.widget.ProfilePYMKSwipeDetailLayout$b;
import android.view.animation.Animation;
import com.yxcorp.gifshow.widget.ProfilePYMKSwipeDetailLayout;
import com.yxcorp.gifshow.widget.ProfilePYMKSwipeDetailLayout$a;
import android.view.animation.Transformation;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.widget.ProfilePYMKSwipeDetailLayout$c;
import java.lang.Integer;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;

public class ProfilePYMKSwipeDetailLayout$b extends Animation	// class@0018a0
{
    public boolean b;
    public final ProfilePYMKSwipeDetailLayout c;

    public void ProfilePYMKSwipeDetailLayout$b(ProfilePYMKSwipeDetailLayout p0,boolean p1,ProfilePYMKSwipeDetailLayout$a p2){
       this.c = p0;
       super();
       p0.e = true;
       this.b = p1;
    }
    public void applyTransformation(float p0,Transformation p1){
       ProfilePYMKSwipeDetailLayout d;
       if (PatchProxy.isSupport(ProfilePYMKSwipeDetailLayout$b.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, ProfilePYMKSwipeDetailLayout$b.class, "1")) {
          return;
       }
       ProfilePYMKSwipeDetailLayout$b tc = this.c;
       tc.scrollBy((int)((float)(tc.getScrollX() - 0) * p0), 0);
       if (!p0 - 0x3f800000) {
          ProfilePYMKSwipeDetailLayout$b tc1 = this.c;
          if (tc1.e != null && this.b != null) {
             this.b = false;
             d = tc1.d;
             if (d != null) {
                d.a();
             }
          }
          d.e = false;
       }
       return;
    }
    public void initialize(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ProfilePYMKSwipeDetailLayout$b.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ProfilePYMKSwipeDetailLayout$b.class, "2")) {
          return;
       }
       super.initialize(p0, p1, p2, p3);
       this.setDuration(260);
       this.setInterpolator(new AccelerateInterpolator());
       return;
    }
}
