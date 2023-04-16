package com.kuaishou.live.lite.bottombar.comments.LiteCommentBottomBarItemRegister$c;
import erd.a;
import com.kuaishou.live.lite.bottombar.comments.LiteCommentBottomBarItemRegister;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.bottombar.comments.CommentsBottomBarItem;
import java.util.Objects;
import k93.n;
import android.animation.Animator;

public final class LiteCommentBottomBarItemRegister$c implements a	// class@001ec0
{
    public final LiteCommentBottomBarItemRegister b;

    public void LiteCommentBottomBarItemRegister$c(LiteCommentBottomBarItemRegister p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiteCommentBottomBarItemRegister$c.class, "1")) {
          return;
       }
       CommentsBottomBarItem uCommentsBot = this.b.a();
       Objects.requireNonNull(uCommentsBot);
       if (!PatchProxy.applyVoid(objArray, uCommentsBot, CommentsBottomBarItem.class, "6")) {
          n on = uCommentsBot.j();
          Objects.requireNonNull(on);
          if (!PatchProxy.applyVoid(objArray, on, n.class, "7")) {
             on = on.a;
             if (on != null) {
                on.cancel();
             }
          }
       }
       return;
    }
}
