package com.yxcorp.gifshow.detailbubble.LikeRandomBubbleView$d;
import java.lang.Runnable;
import com.yxcorp.gifshow.detailbubble.LikeRandomBubbleView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import com.yxcorp.gifshow.detailbubble.LikeBubbleBaseView;
import t9a.b;

public final class LikeRandomBubbleView$d implements Runnable	// class@001a96
{
    public final LikeRandomBubbleView b;

    public void LikeRandomBubbleView$d(LikeRandomBubbleView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LikeRandomBubbleView$d.class, "1")) {
          return;
       }
       LikeRandomBubbleView$d tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, LikeRandomBubbleView.class, "9") && (tb.d != null && tb.getParent() != null)) {
          ViewParent parent = tb.getParent();
          Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
          b.e(tb, parent);
       }
    label_0034 :
       return;
    }
}
