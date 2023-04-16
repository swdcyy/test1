package com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.e;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import faa.a;
import q87.c;
import android.view.ViewTreeObserver;
import mn6.a;
import android.content.Context;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import hmd.d;
import nn6.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.InteractStickerWrapperView;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.PhotoType;
import kp.w1;
import android.widget.ImageView;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.f$c;

public class e implements ViewTreeObserver$OnGlobalLayoutListener	// class@000a8f
{
    public final f b;

    public void e(f p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       f e;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, e.class, "1")) {
          return;
       }
       e b = obj.b;
       e = b.e;
       int i = (e == null)? b.f.height(): e.getHeight();
       if (i && (obj.b.h.getMeasuredWidth() && obj.b.h.getMeasuredHeight())) {
          int i1 = 1;
          Object[] objArray = new Object[i1];
          int i2 = 0;
          objArray[i2] = "initVoteView position";
          a.D().s("ShowVoteView", "photo detail show vote", objArray);
          obj.b.h.getViewTreeObserver().removeGlobalOnLayoutListener(obj);
          b = obj.b;
          b.v.c(b, b.c, b.i);
          b = obj.b;
          f t = b.t;
          if (t != null) {
             b.h.setInteractStickerContainerBorder(t);
          }
          obj.b.i();
          if (w1.r(obj.b.g) == PhotoType.VIDEO) {
             obj.b.h.setVisibility(4);
          }
          f b1 = obj.b.b;
          if (b1 != null) {
             float f = (float)b1.getMeasuredWidth() / (float)obj.b.h.getMeasuredWidth();
             float f1 = (float)obj.b.b.getMeasuredHeight() / (float)obj.b.h.getMeasuredHeight();
             if (f - f1 > 0) {
                f = f1;
             }
             int[] ointArray = new int[2];
             obj.b.b.getLocationOnScreen(ointArray);
             e b2 = obj.b;
             f$c uoc = v15;
             f$c uoc1 = v15;
             uoc = new f$c(b2, (float)ointArray[i2], ((float)b2.h.getLeft() + obj.b.h.getTranslationX()), (float)ointArray[i1], ((float)obj.b.h.getTop() + obj.b.h.getTranslationY()), f, obj.b.h.getScaleX(), 0.30f, 0x3f800000);
             b2.n = uoc1;
             e b3 = obj.b;
             uoc = new f$c(b3, ((float)b3.h.getLeft() + obj.b.h.getTranslationX()), (float)ointArray[i2], ((float)obj.b.h.getTop() + obj.b.h.getTranslationY()), (float)ointArray[1], obj.b.h.getScaleX(), f, 0x3f800000, 0.30f);
             b3.o = b2;
          }
       }
    label_0143 :
       return;
    }
}
