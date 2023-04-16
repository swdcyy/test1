package com.kuaishou.live.lite.bottombar.comments.LiteCommentBottomBarItemRegister$b;
import erd.g;
import com.kuaishou.live.lite.bottombar.comments.LiteCommentBottomBarItemRegister;
import java.lang.Object;
import com.kuaishou.live.lite.userstatus.LiveLiteUserStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.userstatus.LiveLiteUserStatusResponse$LiveCommentStyle;
import ip3.a;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import com.kuaishou.live.lite.bottombar.comments.CommentsBottomBarItem;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;

public final class LiteCommentBottomBarItemRegister$b implements g	// class@001ebf
{
    public final LiteCommentBottomBarItemRegister b;

    public void LiteCommentBottomBarItemRegister$b(LiteCommentBottomBarItemRegister p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiteCommentBottomBarItemRegister$b.class, "1")) {
       }else {
          p0 = p0.mLiveCommentStyle;
          if (p0 != null) {
             boolean b = true;
             if (p0.mDisableComment == b) {
                p0 = this.b;
                p0.d = b;
                p0 = p0.m.get();
                if (p0 != null) {
                   p0.c(this.b.a());
                }
             }
          }
       }
       return;
    }
}
