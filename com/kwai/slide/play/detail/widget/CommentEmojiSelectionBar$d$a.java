package com.kwai.slide.play.detail.widget.CommentEmojiSelectionBar$d$a;
import android.animation.AnimatorListenerAdapter;
import com.kwai.slide.play.detail.widget.CommentEmojiSelectionBar$d;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class CommentEmojiSelectionBar$d$a extends AnimatorListenerAdapter	// class@00188c
{
    public boolean a;
    public final CommentEmojiSelectionBar$d b;

    public void CommentEmojiSelectionBar$d$a(CommentEmojiSelectionBar$d p0){
       this.b = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       this.a = true;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentEmojiSelectionBar$d$a.class, "1")) {
          return;
       }
       if (this.a == null) {
          this.b.d(0x3f800000);
       }
       return;
    }
}
