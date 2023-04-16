package com.kuaishou.live.lite.bottombar.comments.LiteCommentBottomBarItemRegister$d;
import z1.a;
import com.kuaishou.live.lite.bottombar.comments.LiteCommentBottomBarItemRegister;
import java.lang.Object;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.bottombar.comments.CommentsBottomBarItem;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;

public final class LiteCommentBottomBarItemRegister$d implements a	// class@001ec2
{
    public final LiteCommentBottomBarItemRegister a;

    public void LiteCommentBottomBarItemRegister$d(LiteCommentBottomBarItemRegister p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiteCommentBottomBarItemRegister$d.class, "1")) {
       }else {
          LiteCommentBottomBarItemRegister$d ta = this.a;
          if (ta.d == null) {
             p0.a(ta.a());
          }
       }
       return;
    }
}
