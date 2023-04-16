package com.kuaishou.live.lite.bottombar.comments.LiteCommentBottomBarItemRegister$commentsBottomBarItem$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.bottombar.comments.LiteCommentBottomBarItemRegister;
import com.kuaishou.live.lite.bottombar.comments.CommentsBottomBarItem;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k93.m;
import k93.a;
import xp5.i;
import k93.m$a;
import k93.l;

public final class LiteCommentBottomBarItemRegister$commentsBottomBarItem$2 extends Lambda implements a	// class@001ec1
{
    public final LiteCommentBottomBarItemRegister this$0;

    public void LiteCommentBottomBarItemRegister$commentsBottomBarItem$2(LiteCommentBottomBarItemRegister p0){
       this.this$0 = p0;
       super(0);
    }
    public final CommentsBottomBarItem invoke(){
       Object obj = PatchProxy.apply(null, this, LiteCommentBottomBarItemRegister$commentsBottomBarItem$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CommentsBottomBarItem(new m(new a(this.this$0.j)), this.this$0.f);
    }
    public Object invoke(){
       return this.invoke();
    }
}
