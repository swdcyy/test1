package com.yxcorp.gifshow.v3.editor.sticker.vote.detail.h;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Rect;
import android.view.View;
import android.widget.RelativeLayout;
import faa.a;
import q87.c;
import android.view.ViewTreeObserver;
import com.kwai.gifshow.post.api.feature.vote.model.VoteResultResponse;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteView;
import nn6.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.PhotoType;
import kp.w1;
import android.widget.ImageView;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.i$c;

public class h implements ViewTreeObserver$OnGlobalLayoutListener	// class@0012d7
{
    public final i b;

    public void h(i p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       i h;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, h.class, "1")) {
          return;
       }
       h b = obj.b;
       i e = b.e;
       boolean i = (e == null)? b.f.height(): e.getHeight();
       if (i && (obj.b.h.getMeasuredWidth() && obj.b.h.getMeasuredHeight())) {
          int i1 = 1;
          Object[] objArray = new Object[i1];
          int i2 = 0;
          objArray[i2] = "initVoteView position";
          a.D().s("ShowVoteView", "photo detail show vote", objArray);
          obj.b.h.getViewTreeObserver().removeGlobalOnLayoutListener(obj);
          b = obj.b;
          h = b.h;
          i i3 = b.i;
          i = (b.b == null)? true: false;
          h.g(i3, i);
          b = obj.b;
          h = b.v;
          if (h != null) {
             b.h.setInteractStickerContainerBorder(h);
          }
          obj.b.j();
          if (w1.r(obj.b.g) == PhotoType.VIDEO) {
             obj.b.h.setVisibility(4);
          }
          i b1 = obj.b.b;
          if (b1 != null) {
             float f = (float)b1.getMeasuredWidth() / (float)obj.b.h.getMeasuredWidth();
             float f1 = (float)obj.b.b.getMeasuredHeight() / (float)obj.b.h.getMeasuredHeight();
             if (f - f1 > 0) {
                f = f1;
             }
             int[] ointArray = new int[2];
             obj.b.b.getLocationOnScreen(ointArray);
             h b2 = obj.b;
             i$c uoc = v15;
             i$c uoc1 = v15;
             uoc = new i$c(b2, (float)ointArray[i2], ((float)b2.h.getLeft() + obj.b.h.getTranslationX()), (float)ointArray[i1], ((float)obj.b.h.getTop() + obj.b.h.getTranslationY()), f, obj.b.h.getScaleX(), 0.30f, 0x3f800000);
             b2.p = uoc1;
             h b3 = obj.b;
             uoc = new i$c(b3, ((float)b3.h.getLeft() + obj.b.h.getTranslationX()), (float)ointArray[i2], ((float)obj.b.h.getTop() + obj.b.h.getTranslationY()), (float)ointArray[1], obj.b.h.getScaleX(), f, 0x3f800000, 0.30f);
             b3.q = b2;
          }
       }
    label_0148 :
       return;
    }
}
