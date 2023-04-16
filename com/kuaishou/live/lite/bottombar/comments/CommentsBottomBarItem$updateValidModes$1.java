package com.kuaishou.live.lite.bottombar.comments.CommentsBottomBarItem$updateValidModes$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.util.List;
import java.lang.Object;
import com.kuaishou.live.lite.bottombar.comments.CommentsBottomBarContainerLayout;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class CommentsBottomBarItem$updateValidModes$1 extends Lambda implements l	// class@001ebc
{
    public final List $emojiList;
    public final List $validModes;

    public void CommentsBottomBarItem$updateValidModes$1(List p0,List p1){
       this.$validModes = p0;
       this.$emojiList = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(CommentsBottomBarContainerLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentsBottomBarItem$updateValidModes$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       p0.a(this.$validModes, this.$emojiList);
       return;
    }
}
