package com.kuaishou.merchant.marketing.platform.fullgiving.dialog.RandomTextView$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.RandomTextView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.RandomTextView$b;

public class RandomTextView$a extends AnimatorListenerAdapter	// class@001b15
{
    public final RandomTextView a;

    public void RandomTextView$a(RandomTextView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RandomTextView$a.class, "1")) {
          return;
       }
       RandomTextView m = this.a.m;
       if (m != null) {
          m.a();
       }
       return;
    }
}
