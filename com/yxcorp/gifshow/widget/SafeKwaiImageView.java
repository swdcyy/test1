package com.yxcorp.gifshow.widget.SafeKwaiImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Bitmap;
import gq.a;
import q87.c;
import java.lang.Throwable;
import lnc.i1;

public class SafeKwaiImageView extends KwaiImageView	// class@0018bb
{
    public Bitmap x;

    public void SafeKwaiImageView(Context p0){
       super(p0);
    }
    public void SafeKwaiImageView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void SafeKwaiImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SafeKwaiImageView.class, "2")) {
          return;
       }
       try{
          SafeKwaiImageView tx = this.x;
          if (tx != null && tx.isRecycled()) {
             Object[] objArray = new Object[0];
             a.D().w("SafeKwaiImageView", "cachedBitmap isRecycled, draw not execute", objArray);
             return;
          }else {
             super.onDraw(p0);
          }
       }catch(java.lang.Exception e4){
          i1.c(e4);
       }
       return;
    }
    public void setImageBitmap(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SafeKwaiImageView.class, "1")) {
          return;
       }
       super.setImageBitmap(p0);
       this.x = p0;
       return;
    }
}
