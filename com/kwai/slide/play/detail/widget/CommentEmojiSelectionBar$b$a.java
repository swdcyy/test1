package com.kwai.slide.play.detail.widget.CommentEmojiSelectionBar$b$a;
import android.animation.AnimatorListenerAdapter;
import com.kwai.slide.play.detail.widget.CommentEmojiSelectionBar$b;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.slide.play.detail.widget.CommentEmojiSelectionBar;
import com.kwai.slide.play.detail.widget.CommentEmojiSelectionBar$e;

public class CommentEmojiSelectionBar$b$a extends AnimatorListenerAdapter	// class@001889
{
    public final View a;
    public final CommentEmojiSelectionBar$b b;

    public void CommentEmojiSelectionBar$b$a(CommentEmojiSelectionBar$b p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentEmojiSelectionBar$b$a.class, "1")) {
          return;
       }
       CommentEmojiSelectionBar$b c = this.b.c;
       CommentEmojiSelectionBar q = c.q;
       if (q != null) {
          CommentEmojiSelectionBar$b$a ta = this.a;
          q.a(ta, c.b(ta));
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentEmojiSelectionBar$b$a.class, "2")) {
          return;
       }
       super.onAnimationStart(p0);
       CommentEmojiSelectionBar$b c = this.b.c;
       CommentEmojiSelectionBar q = c.q;
       if (q != null) {
          CommentEmojiSelectionBar$b$a ta = this.a;
          q.b(ta, c.b(ta));
       }
       return;
    }
}
