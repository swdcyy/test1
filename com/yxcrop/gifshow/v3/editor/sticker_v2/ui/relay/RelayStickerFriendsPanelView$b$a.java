package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.relay.RelayStickerFriendsPanelView$b$a;
import ub.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.relay.RelayStickerFriendsPanelView$b;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicInteger;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.relay.RelayStickerFriendsPanelView;
import android.graphics.drawable.Animatable;
import bd.f;

public final class RelayStickerFriendsPanelView$b$a extends a	// class@000acd
{
    public final RelayStickerFriendsPanelView$b b;

    public void RelayStickerFriendsPanelView$b$a(RelayStickerFriendsPanelView$b p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RelayStickerFriendsPanelView$b$a.class, "1")) {
          return;
       }
       RelayStickerFriendsPanelView$b$a tb = this.b;
       tb.b.c(tb.c);
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, RelayStickerFriendsPanelView$b$a.class, "2")) {
       }else {
          RelayStickerFriendsPanelView$b$a tb = this.b;
          tb.b.c(tb.c);
       }
       return;
    }
}
