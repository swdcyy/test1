package com.kuaishou.live.core.show.enterroom.floatingscreen.framework.widget.LiveFloatingScreenStdImageView;
import zq5.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hc.a;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenImageItem;
import hr5.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.CDNUrl;
import java.io.File;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.graphics.drawable.Drawable;
import lnc.a1;
import ok.w;
import jr5.a;
import com.kuaishou.live.core.show.enterroom.floatingscreen.framework.widget.LiveFloatingScreenStdImageView$a;
import com.kuaishou.live.core.show.enterroom.floatingscreen.framework.widget.LiveFloatingScreenStdImageView$b;
import java.lang.Runnable;
import msd.l;
import jr5.a$a;
import com.kuaishou.live.core.show.enterroom.floatingscreen.framework.widget.LiveFloatingScreenStdImageView$c;
import com.kuaishou.live.core.show.enterroom.floatingscreen.framework.widget.LiveFloatingScreenStdImageView$d;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.view.ViewGroup$MarginLayoutParams;

public final class LiveFloatingScreenStdImageView extends KwaiImageView implements a	// class@000b17
{
    public a x;
    public HashMap y;

    public void LiveFloatingScreenStdImageView(Context p0){
       super(p0, null);
    }
    public void LiveFloatingScreenStdImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveFloatingScreenStdImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingScreenStdImageView.class, "3")) {
          return;
       }
       LiveFloatingScreenStdImageView tx = this.x;
       if (tx != null) {
          tx.start();
       }
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingScreenStdImageView.class, "4")) {
          return;
       }
       LiveFloatingScreenStdImageView tx = this.x;
       if (tx != null) {
          tx.stop();
       }
       return;
    }
    public final void p0(LiveFloatingScreenImageItem p0,a p1){
       Integer integer;
       File uFile;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveFloatingScreenStdImageView.class, "1")) {
          return;
       }
       a.p(p1, "resourceProvider");
       if (p0 != null) {
          CDNUrl[] picUrls = p0.getPicUrls();
          LiveFloatingScreenStdImageView liveFloating = 1;
          int i = 0;
          if (!p0.getPicType()) {
             if (picUrls != null) {
                integer = (!picUrls.length)? 1: null;
                if (!integer) {
                   liveFloating = null;
                }
             }
             if (!liveFloating) {
                uFile = p1.b(picUrls);
                if (uFile != null) {
                   this.v(uFile, i, i);
                }
             }else if(p0.getDrawablePicId()){
                this.setImageDrawable(a1.f(p0.getDrawablePicId()));
             }
          }else if(p0.getPicType() == liveFloating){
             if (!w.a(p0.getPicPreloadKey())) {
                a.b.b(this, p1.a(p0.getPicPreLoadType(), p0.getPicPreloadKey()), false, new LiveFloatingScreenStdImageView$a(this, picUrls), new LiveFloatingScreenStdImageView$b(this));
             }else if(picUrls != null){
                integer = (!picUrls.length)? 1: null;
                if (!integer) {
                   liveFloating = null;
                }
             }
             if (liveFloating == null) {
                a.b.b(this, p1.d(picUrls), false, new LiveFloatingScreenStdImageView$c(this, p0), new LiveFloatingScreenStdImageView$d(this));
             }
          }
          uFile = this.getHierarchy();
          a.o(uFile, "hierarchy");
          uFile.u(t$b.e);
          int picWidth = p0.getPicWidth();
          int picHeight = p0.getPicHeight();
          if (!PatchProxy.isSupport(LiveFloatingScreenStdImageView.class) || (PatchProxy.applyVoidTwoRefs(Integer.valueOf(picWidth), Integer.valueOf(picHeight), this, LiveFloatingScreenStdImageView.class, "2") || (picWidth && picHeight))) {
             picWidth = a1.e((float)picWidth);
             picHeight = a1.e((float)picHeight);
             ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
             if (layoutParams != null) {
                layoutParams.width = picWidth;
                layoutParams.height = picHeight;
             }else {
                layoutParams = new ViewGroup$MarginLayoutParams(picWidth, picHeight);
             }
             this.setLayoutParams(layoutParams);
          }
       }
    label_00ee :
       return;
    }
}
