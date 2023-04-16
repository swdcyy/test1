package com.yxcorp.gifshow.v3.editor.ktv.crop.KtvMvTimeLineView;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvBaseTimeLineView;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import java.lang.Boolean;
import java.lang.Math;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import android.graphics.Rect;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import crc.e;
import p16.c;
import com.yxcorp.gifshow.v3.editor.k;
import com.yxcorp.gifshow.v3.editor.i;
import lnc.a1;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;

public class KtvMvTimeLineView extends KtvBaseTimeLineView	// class@000fbf
{
    public k D;
    public Paint E;
    public static final int F;

    public void KtvMvTimeLineView(Context p0){
       super(p0);
       this.E = new Paint();
    }
    public void a(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvMvTimeLineView.class, "4")) {
          return;
       }
       if (this.u > 0) {
          p0.save();
          p0.clipRect(0, 0, this.u, (float)this.getHeight());
          p0.drawColor(0x66000000);
          p0.restore();
       }
       if (this.v - this.j < 0) {
          p0.save();
          p0.clipRect(this.v, 0, this.j, (float)this.getHeight());
          p0.drawColor(0x66000000);
          p0.restore();
       }
       return;
    }
    public void b(Canvas p0,boolean p1){
       Rect rect;
       if (PatchProxy.isSupport(KtvMvTimeLineView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, KtvMvTimeLineView.class, "3")) {
          return;
       }
       int i = (int)Math.floor((double)(this.t / (float)this.l));
       int i1 = (int)Math.ceil((double)((this.t + this.k) / (float)this.l));
       int height = this.getHeight();
       Bitmap uBitmap = null;
       while (i <= i1) {
          Bitmap uBitmap1 = this.c(i, p1);
          if (BitmapUtil.I(uBitmap1)) {
             uBitmap = uBitmap1;
          }
          if (BitmapUtil.I(uBitmap)) {
             float f = (float)uBitmap.getWidth();
             float f1 = (float)uBitmap.getHeight();
             float f2 = f1 / f;
             float f3 = (float)height * 0x3f800000;
             f3 = f3 / (float)this.l;
             float f4 = 2.00f;
             if (f2 - f3 > 0) {
                f3 = f3 / f2;
                f3 = f3 * f1;
                f2 = f1 - f3;
                f2 = f2 / f4;
                f1 = f1 + f3;
                f1 = f1 / f4;
                rect = new Rect(0, (int)f2, (int)f, (int)f1);
             }else {
                f2 = f2 / f3;
                f2 = f2 * f;
                f3 = f - f2;
                f3 = f3 / f4;
                f = f + f2;
                f = f / f4;
                rect = new Rect((int)f3, 0, (int)f, (int)f1);
             }
             KtvBaseTimeLineView tl = this.l;
             int i2 = i * tl;
             int i3 = i + 1;
             i3 = i3 * tl;
             p0.drawBitmap(uBitmap, rect, new Rect(i2, 0, i3, height), this.E);
          }
          i = i + 1;
       }
       return;
    }
    public Bitmap c(int p0,boolean p1){
       if (PatchProxy.isSupport(KtvMvTimeLineView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, KtvMvTimeLineView.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.D.b((double)(this.s * (float)p0), this.l, this.m, new e(this));
    }
    public void e(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvMvTimeLineView.class, "1")) {
          return;
       }
       this.D = k.f();
       this.m = a1.d(0x7f070d65);
       VideoSDKPlayerView videoSDKPlay = p0.j();
       int videoWidth = videoSDKPlay.getVideoWidth();
       this.l = (videoWidth * this.m) / videoSDKPlay.getVideoHeight();
       return;
    }
    public boolean f(){
       return true;
    }
    public boolean g(){
       return true;
    }
}
