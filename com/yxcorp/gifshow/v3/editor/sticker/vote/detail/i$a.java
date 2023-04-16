package com.yxcorp.gifshow.v3.editor.sticker.vote.detail.i$a;
import android.view.animation.Animation$AnimationListener;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.i;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.i$c;

public class i$a implements Animation$AnimationListener	// class@0012d8
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       i b = this.b.b;
       if (b != null) {
          b.setVisibility(4);
       }
       b = this.b.h;
       if (b != null) {
          b.setVisibility(0);
          i$a tb = this.b;
          tb.i(tb.h, tb.p, 0);
       }
       return;
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
    }
}
