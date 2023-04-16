package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.relay.RelayStickerFriendsPanelView$a;
import ub.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.relay.RelayStickerFriendsPanelView;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Animatable;
import bd.f;

public final class RelayStickerFriendsPanelView$a extends a	// class@000acc
{
    public final RelayStickerFriendsPanelView b;
    public final AtomicInteger c;

    public void RelayStickerFriendsPanelView$a(RelayStickerFriendsPanelView p0,AtomicInteger p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RelayStickerFriendsPanelView$a.class, "1")) {
          return;
       }
       this.b.c(this.c);
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, RelayStickerFriendsPanelView$a.class, "2")) {
       }else {
          this.b.c(this.c);
       }
       return;
    }
}
