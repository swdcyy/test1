package com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment$b;
import com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment$c;
import android.net.Uri;
import java.lang.Object;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.albumcontrol.a;
import o56.a;
import android.content.ContentResolver;
import android.app.Application;
import v79.a;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.content.Context;
import com.yxcorp.utility.n;
import android.content.res.Resources;
import android.graphics.BitmapFactory;

public final class ForwardPicSectionFragment$b implements ForwardPicSectionFragment$c	// class@001cee
{
    public Bitmap a;
    public final Uri b;
    public final boolean c;

    public void ForwardPicSectionFragment$b(Uri p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public boolean a(KwaiImageView p0){
       boolean b;
       ForwardPicSectionFragment$b obj = PatchProxy.applyOneRefs(p0, this, ForwardPicSectionFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "imageView");
       obj = this.a;
       if (obj != null) {
          p0.setImageBitmap(obj);
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public Bitmap getBitmap(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ForwardPicSectionFragment$b uob = ForwardPicSectionFragment$b.class;
       Object[] objArray = null;
       ForwardPicSectionFragment$b obj = PatchProxy.apply(objArray, this, uob, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          objArray = obj;
       }else {
          Application b = a.B;
          String str = "AppEnv.APP";
          a.o(b, str);
          ContentResolver contentResol = b.getContentResolver();
          a.o(contentResol, "AppEnv.APP.contentResolver");
          ForwardPicSectionFragment$b tb = this.b;
          a.m(tb);
          Bitmap uBitmap = a.b.c("feed_kuaishou_forward", contentResol, tb).a();
          if (uBitmap != null) {
             if (this.c != null) {
                Bitmap uBitmap1 = PatchProxy.applyOneRefs(uBitmap, this, uob, "3");
                if (uBitmap1 != patchProxyRe) {
                }else {
                   a.p(uBitmap, "localBmp");
                   uBitmap1 = Bitmap.createBitmap(uBitmap.getWidth(), uBitmap.getHeight(), Bitmap$Config.ARGB_8888);
                   Canvas uCanvas = new Canvas(uBitmap1);
                   uCanvas.drawBitmap(uBitmap, 0, 0, objArray);
                   Bitmap uBitmap2 = Bitmap.createBitmap(uBitmap.getWidth(), n.A(a.B), Bitmap$Config.ARGB_8888);
                   Application b1 = a.B;
                   a.o(b1, str);
                   uBitmap2.eraseColor(b1.getResources().getColor(R.color.arg_RES_7f060a30));
                   uCanvas.drawBitmap(uBitmap2, 0, 0, objArray);
                   b = a.B;
                   a.o(b, str);
                   Bitmap uBitmap3 = BitmapFactory.decodeResource(b.getResources(), R.drawable.arg_RES_7f08094f);
                   a.o(uBitmap3, "logoBmp");
                   uCanvas.drawBitmap(uBitmap3, ((float)(uBitmap.getWidth() - uBitmap3.getWidth()) / 2.00f), (float)n.c(a.B, 12.00f), objArray);
                   a.o(uBitmap1, "newBmp");
                }
                objArray = uBitmap1;
             }else {
                objArray = uBitmap;
             }
             this.a = objArray;
          }
       }
       return objArray;
    }
}
