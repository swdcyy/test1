package com.kwai.slide.play.detail.rightactionbar.comment.EmojiFireWorkAnimView$a;
import android.os.Handler;
import com.kwai.slide.play.detail.rightactionbar.comment.EmojiFireWorkAnimView;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.os.Message;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;

public class EmojiFireWorkAnimView$a extends Handler	// class@001849
{
    public final WeakReference a;

    public void EmojiFireWorkAnimView$a(EmojiFireWorkAnimView p0){
       super();
       this.a = new WeakReference(p0);
    }
    public void dispatchMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmojiFireWorkAnimView$a.class, "1")) {
          return;
       }
       super.dispatchMessage(p0);
       EmojiFireWorkAnimView uEmojiFireWo = this.a.get();
       if (uEmojiFireWo == null) {
          return;
       }
       if (p0.what == 3 && !PatchProxy.applyVoid(null, uEmojiFireWo, EmojiFireWorkAnimView.class, "5")) {
          EmojiFireWorkAnimView i = uEmojiFireWo.i;
          if (i != null) {
             i.setTag(R.id.like_comment_anim_view, null);
             uEmojiFireWo.i.removeView(uEmojiFireWo);
             uEmojiFireWo.i = null;
          }
       }
       return;
    }
}
