package com.yxcorp.gifshow.v3.editor.sticker.vote.detail.i$b;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.i;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.widget.RelativeLayout;
import android.widget.ImageView;
import android.view.View;
import com.yxcorp.utility.n;
import android.animation.AnimatorSet;

public class i$b extends AnimatorListenerAdapter	// class@0012d9
{
    public final boolean a;
    public final i b;

    public void i$b(i p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("VoteViewHelper", "onAnimationEnd isEndAnimation: "+this.b.s+", isHide: "+this.a, objArray);
       if (this.a != null) {
          this.b.h.setVisibility(4);
          i b = this.b.b;
          if (b != null) {
             b.setImageResource(R.drawable.arg_RES_7f08237f);
          }
          n.Y(this.b.b, 0, true);
       }
       this.b.o.removeAllListeners();
       return;
    }
}
