package com.yxcorp.gifshow.detail.slideplay.presenter.sticker.helper.view.TagStickerResizableMaskView;
import com.yxcorp.gifshow.detail.slideplay.presenter.sticker.helper.view.TagStickerMaskView;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xf6.d;
import android.graphics.Path;
import java.lang.Number;
import android.view.ViewGroup;
import android.view.View;

public class TagStickerResizableMaskView extends TagStickerMaskView	// class@001867
{
    public final Paint t;
    public ViewGroup u;

    public void TagStickerResizableMaskView(Context p0){
       super(p0);
       this.t = new Paint();
    }
    public void TagStickerResizableMaskView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.t = new Paint();
    }
    public void TagStickerResizableMaskView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.t = new Paint();
    }
    public boolean c(Canvas p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TagStickerResizableMaskView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.m != null && d.o()) {
          this.b();
          p0.drawPoint(0, 0, this.t);
          p0.drawPath(this.i, this.h);
       }
       return true;
    }
    public int getDeltaX(){
       Object obj = PatchProxy.apply(null, this, TagStickerResizableMaskView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.u.getLeft() + this.c.getLeft());
    }
    public int getDeltaY(){
       Object obj = PatchProxy.apply(null, this, TagStickerResizableMaskView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.u.getTop() + this.c.getTop());
    }
}
