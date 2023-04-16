package com.yxcorp.gifshow.v3.editor.ktv.crop.KtvSongTimeLineView;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvBaseTimeLineView;
import android.content.Context;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.v3.editor.i;
import android.content.res.Resources;
import lnc.a1;
import android.graphics.BitmapFactory;

public class KtvSongTimeLineView extends KtvBaseTimeLineView	// class@000fc0
{
    public Bitmap D;
    public Bitmap E;

    public void KtvSongTimeLineView(Context p0){
       super(p0);
    }
    public void a(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvSongTimeLineView.class, "2")) {
          return;
       }
       p0.save();
       p0.clipRect(this.u, 0, this.v, (float)this.getHeight());
       this.b(p0, true);
       p0.restore();
       return;
    }
    public Bitmap c(int p0,boolean p1){
       KtvSongTimeLineView tE = (p1)? this.E: this.D;
       return tE;
    }
    public void e(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvSongTimeLineView.class, "1")) {
          return;
       }
       Resources resources = a1.m();
       this.D = BitmapFactory.decodeResource(resources, 0x7f08100a);
       this.E = BitmapFactory.decodeResource(resources, 0x7f08100b);
       this.l = this.D.getWidth();
       this.m = this.D.getHeight();
       return;
    }
    public boolean f(){
       return false;
    }
    public boolean g(){
       return false;
    }
}
