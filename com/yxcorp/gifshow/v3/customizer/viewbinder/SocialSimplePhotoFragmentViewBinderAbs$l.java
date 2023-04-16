package com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$l;
import erd.o;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import kotlin.jvm.internal.a;
import android.graphics.Bitmap;
import java.util.Objects;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.graphics.RectF;
import com.yxcorp.gifshow.model.RectInfo;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder;
import com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder$a;
import android.graphics.Path;
import android.graphics.Path$Direction;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Rect;
import java.lang.Throwable;
import w46.b;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.System;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.yxcorp.gifshow.util.BitmapUtil;
import android.content.Context;
import lnc.a1;
import com.kuaishou.gifshow.files.a;
import o56.c;
import o56.a;
import android.app.Application;
import qkd.a;

public final class SocialSimplePhotoFragmentViewBinderAbs$l implements o	// class@000d82
{
    public final SocialSimplePhotoFragmentViewBinderAbs b;
    public final Ref$ObjectRef c;

    public void SocialSimplePhotoFragmentViewBinderAbs$l(SocialSimplePhotoFragmentViewBinderAbs p0,Ref$ObjectRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       File uFile;
       File uFile1;
       Object obj = this;
       SocialSimplePhotoFragmentViewBinderAbs$l obj1 = p0;
       Pair pair = PatchProxy.applyOneRefs(obj1, obj, SocialSimplePhotoFragmentViewBinderAbs$l.class, "1");
       if (pair != PatchProxyResult.class) {
       }else {
          a.p(obj1, "it");
          obj1 = obj.c;
          Ref$ObjectRef element = obj1.element;
          a.o(element, "finalBitmap");
          obj1.element = obj.b.x0(element);
          obj1 = obj.b;
          Ref$ObjectRef element1 = obj.c.element;
          a.o(element1, "finalBitmap");
          Objects.requireNonNull(obj1);
          if (!PatchProxy.applyVoidOneRefs(element1, obj1, SocialSimplePhotoFragmentViewBinderAbs.class, "10") && obj1.M != null) {
             int i = 0;
             Object[] objArray = new Object[i];
             a.D().w("SocialSimplePhotoFragmentViewBinderAbs", "saveToAlbum smallImageRectInfo: "+obj1.U0+", "+"bigImageRectInfo: "+obj1.Z, objArray);
             if (obj1.U0 == null || obj1.Z == null) {
                Object[] objArray1 = new Object[i];
                a.D().w("SocialSimplePhotoFragmentViewBinderAbs", "saveToAlbum, rectInfo is null", objArray1);
             }else {
                SocialSimplePhotoFragmentViewBinderAbs m = obj1.M;
                a.m(m);
                SocialSimplePhotoFragmentViewBinderAbs u0 = obj1.U0;
                a.m(u0);
                float f = (float)m.getWidth() / u0.getTargetRect().width();
                u0 = obj1.Z;
                a.m(u0);
                float f1 = u0.getTargetRect().width();
                SocialSimplePhotoFragmentViewBinderAbs z = obj1.Z;
                a.m(z);
                float f2 = z.getTargetRect().height();
                try{
                   SocialSimplePhotoFragmentViewBinderAbs m1 = obj1.M;
                   a.m(m1);
                   SocialSimplePhotoFragmentViewBinderAbs m2 = obj1.M;
                   a.m(m2);
                   Bitmap uBitmap = Bitmap.createBitmap(m1.getWidth(), m2.getHeight(), Bitmap$Config.ARGB_8888);
                   Canvas uCanvas = new Canvas(uBitmap);
                   SocialSimplePhotoFragmentViewBinderAbs u01 = obj1.U0;
                   a.m(u01);
                   float f3 = u01.getRadiusInner() * f;
                   float f4 = (float)SocialSimpleEditorActivityViewBinder.K.c() * f;
                   Path path = new Path();
                   a.o(uBitmap, "finalSmallBitmap");
                   path.addRoundRect(new RectF(0, 0, ((float)uBitmap.getWidth() * 0x3f800000), ((float)uBitmap.getHeight() * 0x3f800000)), f3, f3, Path$Direction.CW);
                   uCanvas.clipPath(path);
                   m = obj1.M;
                   a.m(m);
                   uCanvas.drawBitmap(m, 0, 0, null);
                   Paint paint = new Paint();
                   paint.setColor(-1);
                   paint.setStyle(Paint$Style.STROKE);
                   paint.setStrokeWidth(f4);
                   f4 = f4 / (float)2;
                   uCanvas.drawRoundRect(new RectF((0 + f4), (0 + f4), (((float)uBitmap.getWidth() * 0x3f800000) - f4), (((float)uBitmap.getHeight() * 0x3f800000) - f4)), (f3 * 0x3f75c28f), (f3 * 0x3f75c28f), paint);
                   m2 = obj1.U0;
                   a.m(m2);
                   u01 = obj1.Z;
                   a.m(u01);
                   u01 = obj1.U0;
                   a.m(u01);
                   SocialSimplePhotoFragmentViewBinderAbs z1 = obj1.Z;
                   a.m(z1);
                   z1 = obj1.U0;
                   a.m(z1);
                   SocialSimplePhotoFragmentViewBinderAbs z2 = obj1.Z;
                   a.m(z2);
                   u0 = obj1.U0;
                   a.m(u0);
                   SocialSimplePhotoFragmentViewBinderAbs z3 = obj1.Z;
                   a.m(z3);
                   new Canvas(element1).drawBitmap(uBitmap, null, new RectF((((m2.getTargetRect().left - u01.getTargetRect().left) * (float)element1.getWidth()) / f1), (((u01.getTargetRect().top - z1.getTargetRect().top) * (float)element1.getHeight()) / f2), (((z1.getTargetRect().right - z2.getTargetRect().left) * (float)element1.getWidth()) / f1), (((u0.getTargetRect().bottom - z3.getTargetRect().top) * (float)element1.getHeight()) / f2)), new Paint());
                   uBitmap.recycle();
                }catch(java.lang.Exception e0){
                   a.D().e("SocialSimplePhotoFragmentViewBinderAbs", "saveToAlbum error", e0);
                }
             }
          }
       }
       return pair;
    }
}
