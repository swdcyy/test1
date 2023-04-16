package com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.b;
import erd.g;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.f;
import java.lang.Object;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import mn6.a;
import android.content.Context;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.InteractStickerWrapperView;
import hmd.d;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.e;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.PhotoType;
import kp.w1;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.a;
import crd.b;
import ok.h;
import lnc.b9;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;

public final class b implements g	// class@000a8c
{
    public final f b;

    public void b(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       if (tb.l != null) {
       }else if(tb.h == null){
          f uof = f.class;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uof, "3")) {
             Object[] objArray = new Object[]{"voteResultResponse:"+p0.toString()};
             a.D().s("ShowVoteView", "photo detail show vote", objArray);
             tb.i = p0;
             tb.h = tb.v.d(tb, tb.c, p0);
             if (!PatchProxy.applyVoid(null, tb, uof, "4")) {
                tb.h.getViewTreeObserver().addOnGlobalLayoutListener(new e(tb));
                if (w1.r(tb.g) == PhotoType.VIDEO) {
                   tb.k = b9.c(tb.k, new a(tb));
                }
             }
             tb.d.addView(tb.h, new ViewGroup$LayoutParams(-2, -2));
             if (tb.r == null) {
                tb.h.setAlpha(0);
             }
          }
       }else {
          tb.v.c(tb, tb.c, p0);
       }
       return;
    }
}
