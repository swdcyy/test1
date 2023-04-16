package com.yxcorp.gifshow.photo.download.task.w;
import io.reactivex.g;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import java.lang.Object;
import brd.v;
import com.yxcorp.gifshow.photo.download.task.a0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.lang.reflect.Type;
import com.kwai.framework.abtest.f;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.d;
import brd.t;
import com.yxcorp.gifshow.photo.download.task.s;
import ixb.f1;
import erd.o;
import ixb.b1;
import brd.w;
import erd.c;
import android.graphics.Bitmap;
import wb5.c;
import java.io.File;
import wkd.b;
import j80.c;
import java.lang.StringBuilder;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.media.util.c;
import com.yxcorp.gifshow.photo.download.task.a0$a;
import com.yxcorp.gifshow.photo.download.task.z;
import brd.g;
import com.yxcorp.gifshow.video.d;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.qa;
import com.yxcorp.gifshow.video.d$a;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.video.api.watermark.BitmapAlignType;

public final class w implements g	// class@000f1c
{
    public final QPhoto b;
    public final boolean c;
    public final StatModel d;

    public void w(QPhoto p0,boolean p1,StatModel p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       String str1;
       List atlasPhotosC;
       CDNUrl[] uCDNUrlArray;
       ImageRequest[] imageRequest;
       int i5;
       Bitmap uBitmap;
       String absolutePath;
       float f1;
       d uod;
       d$a uoa;
       CDNUrl[] uCDNUrlArray1;
       ImageRequest[] imageRequest1;
       Bitmap uBitmap1;
       float f2;
       w ow = this;
       object oobject = p0;
       w b = ow.b;
       w c = ow.c;
       w d = ow.d;
       StatModel startIndex = d.startIndex;
       StatModel endIndex = d.endIndex;
       a0 uoa0 = a0.class;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 5;
       int i4 = 0;
       Object obj = null;
       if (PatchProxy.isSupport(uoa0)) {
          Object[] objArray = new Object[i3];
          objArray[i4] = oobject;
          objArray[1] = b;
          objArray[i2] = Boolean.valueOf(c);
          objArray[i1] = Integer.valueOf(startIndex);
          objArray[i] = Integer.valueOf(endIndex);
          if (!PatchProxy.applyVoid(objArray, obj, uoa0, "5")) {
          label_003f :
             String str = ".jpg";
             float f = -1.#Rf;
             if (f.b("photoDownload", Boolean.class, Boolean.FALSE).booleanValue()) {
                if (PatchProxy.isSupport(uoa0)) {
                   str1 = str;
                   if (!PatchProxy.applyVoidFourRefs(p0, b, Integer.valueOf(startIndex), Integer.valueOf(endIndex), 0, a0.class, "7")) {
                   }
                }else {
                   str1 = str;
                }
             }else {
                str1 = str;
                if (PatchProxy.isSupport(uoa0)) {
                   objArray = new Object[i3];
                   objArray[0] = oobject;
                   objArray[1] = b;
                   objArray[i2] = Boolean.valueOf(c);
                   objArray[i1] = Integer.valueOf(startIndex);
                   objArray[4] = Integer.valueOf(endIndex);
                   if (!PatchProxy.applyVoid(objArray, null, uoa0, "6")) {
                   }
                }else {
                   List atlasPhotosC1 = null;
                }
             }
          }
       }else {
          goto label_003f ;
       }
       return;
    }
}
