package com.kwai.slide.play.detail.widget.CommentEmojiSelectionBar$b;
import java.lang.Runnable;
import com.kwai.slide.play.detail.widget.CommentEmojiSelectionBar;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import com.kwai.slide.play.detail.widget.CommentEmojiSelectionBar$b$a;

public class CommentEmojiSelectionBar$b implements Runnable	// class@00188a
{
    public final int b;
    public final CommentEmojiSelectionBar c;

    public void CommentEmojiSelectionBar$b(CommentEmojiSelectionBar p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CommentEmojiSelectionBar$b.class, "1")) {
          return;
       }
       View view = this.c.a(this.b);
       int[] ointArray = new int[2];
       view.getLocationOnScreen(ointArray);
       view.setPivotY(((float)view.getHeight() / 2.00f));
       view.setPivotX(((float)view.getWidth() / 2.00f));
       int i = 0;
       int i1 = (int)((float)this.c.s - ((float)ointArray[i] + ((float)(view.getWidth() / 2) * view.getScaleX())));
       int i2 = (int)((float)this.c.t - ((float)ointArray[1] + ((float)(view.getHeight() / 2) * view.getScaleY())));
       float f = 0.01f;
       LinearInterpolator linearInterp = new LinearInterpolator();
       int i3 = 300;
       while (i < this.c.getChildCount()) {
          View childAt = this.c.getChildAt(i);
          if (childAt != view) {
             childAt.animate().setListener(objArray).setInterpolator(linearInterp).setDuration((long)i3).alpha(0).start();
          }
          i = i + 1;
       }
       view.animate().alpha(0x3f800000).setInterpolator(linearInterp).scaleY(f).scaleX(f).setListener(objArray).setDuration((long)i3).translationX((float)i1).translationY((float)i2).setListener(new CommentEmojiSelectionBar$b$a(this, view)).start();
       return;
    }
}
