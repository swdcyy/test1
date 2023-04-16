package com.kuaishou.live.lite.bottombar.comments.LiteCommentBottomBarItemRegister$f;
import androidx.lifecycle.Observer;
import com.kuaishou.live.lite.bottombar.comments.LiteCommentBottomBarItemRegister;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.bottombar.comments.CommentsBottomBarItem;
import kotlin.jvm.internal.a;
import k93.c;
import java.util.Objects;
import com.kuaishou.live.lite.bottombar.comments.CommentsBottomBarContainerLayout;
import com.kuaishou.live.lite.bottombar.comments.CommentsBottomBarItem$updateValidModes$1;

public final class LiteCommentBottomBarItemRegister$f implements Observer	// class@001ec4
{
    public final LiteCommentBottomBarItemRegister b;

    public void LiteCommentBottomBarItemRegister$f(LiteCommentBottomBarItemRegister p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiteCommentBottomBarItemRegister$f.class, "1")) {
       }else {
          CommentsBottomBarItem uCommentsBot = this.b.a();
          a.o(p0, "it");
          c c = this.b.c.c;
          Objects.requireNonNull(uCommentsBot);
          if (!PatchProxy.applyVoidTwoRefs(p0, c, uCommentsBot, CommentsBottomBarItem.class, "5")) {
             a.p(p0, "validModes");
             a.p(c, "emojiList");
             CommentsBottomBarItem b = uCommentsBot.b;
             if (b != null) {
                b.a(p0, c);
                p0 = uCommentsBot.a;
             }else {
                p0 = new CommentsBottomBarItem$updateValidModes$1(p0, c);
             }
             uCommentsBot.c = p0;
          }
       }
       return;
    }
}
