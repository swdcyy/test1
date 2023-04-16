package com.kuaishou.logic.fetchframe.d;
import erd.o;
import com.kuaishou.logic.fetchframe.FetchFrameManager;
import java.lang.Object;
import qr3.i;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.regex.Pattern;
import lnc.v5;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import brd.t;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import android.graphics.Bitmap;
import w46.b;
import com.kuaishou.logic.fetchframe.FetchFrameManager$RxGetThumbException;
import java.lang.Throwable;
import java.lang.System;
import com.kwai.video.editorsdk2.ThumbnailGenerator;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.video.editorsdk2.ThumbnailGeneratorRequestBuilder;
import com.kwai.video.editorsdk2.ThumbnailGeneratorRequest;
import com.kuaishou.logic.fetchframe.b;
import io.reactivex.g;
import java.lang.IllegalArgumentException;
import android.text.TextUtils;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;

public final class d implements o	// class@0014c3
{
    public final FetchFrameManager b;

    public void d(FetchFrameManager p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       t ot;
       int i;
       d b = this.b;
       Object obj = p0;
       Objects.requireNonNull(b);
       FetchFrameManager uFetchFrameM = FetchFrameManager.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Objects.requireNonNull(obj);
       Object[] objArray = null;
       Object obj1 = PatchProxy.apply(objArray, obj, i.class, "1");
       int b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): obj1.a().matcher(obj.e).matches();
       String str = "FetchFrameManager";
       String str1 = "]";
       if (b1 && !obj.e()) {
          ot = PatchProxy.applyOneRefs(obj, objArray, uFetchFrameM, "15");
          if (ot != patchProxyRe) {
          }else {
             Object[] objArray1 = new Object[0];
             a.D().w(str, "rxGetImageThumbnail\(\) req = ["+obj+str1, objArray1);
             Bitmap uBitmap = FetchFrameManager.c(obj.e, obj.a, obj.b);
             if (uBitmap == null) {
                objArray1 = new Object[0];
                a.D().t(str, "rxGetImageThumbnail: cant find file "+obj.e, objArray1);
                ot = t.error(new FetchFrameManager$RxGetThumbException("rxGetImageThumbnail: cant get:"+obj.e));
             }else {
                objArray1 = new Object[0];
                a.D().w(str, "rxGetImageThumbnail:"+obj.e+" w="+uBitmap.getWidth()+" h="+uBitmap.getHeight(), objArray1);
                ot = t.just(uBitmap);
             }
          }
       }else {
          obj1 = PatchProxy.applyOneRefs(obj, b, uFetchFrameM, "16");
          if (obj1 != patchProxyRe) {
             ot = obj1;
          }else {
             Object[] objArray2 = new Object[0];
             a.D().w(str, "rxSdkGetVideoThumbnail\(\) request = ["+obj+str1, objArray2);
             long l = System.currentTimeMillis();
             try{
                ThumbnailGenerator thumbnailGen = b.m(obj);
                EditorSdk2V2$VideoEditorProject videoEditorP = b.n(obj);
                b1 = EditorSdk2UtilsV2.getComputedWidth(videoEditorP);
                int computedHeig = EditorSdk2UtilsV2.getComputedHeight(videoEditorP);
                if (!computedHeig || !b1) {
                   ot = t.empty();
                }else {
                   Size size = FetchFrameManager.k(b1, computedHeig, FetchFrameManager.j(obj.a, obj.b));
                   double d = 0x408f400000000000;
                   i = (int)(EditorSdk2UtilsV2.getComputedDuration(videoEditorP) * d);
                   int i1 = obj.c();
                   if (i1 > i) {
                      Object[] objArray3 = new Object[0];
                      a.D().w(str, "fetch: currentRequest.getNormalizeTime="+obj.c()+" is bigger than duration="+i, objArray3);
                      i1 = i;
                   }
                   objArray = new Object[0];
                   a.D().w(str, "fetch: originW="+b1+" originH="+computedHeig+" width="+size.b+" height="+size.c+" duration="+i+" currentRequest.getNormalizeTime="+obj.c(), objArray);
                   Size b2 = size.b;
                   Size c = size.c;
                   long l1 = (long)i1;
                   boolean b3 = obj.f();
                   if (PatchProxy.isSupport(uFetchFrameM)) {
                      Object[] objArray4 = new Object[]{thumbnailGen,Integer.valueOf(b2),Integer.valueOf(c),Long.valueOf(l1),Boolean.valueOf(b3),Long.valueOf(l)};
                      Object obj2 = PatchProxy.apply(objArray4, null, uFetchFrameM, "21");
                      if (obj2 != patchProxyRe) {
                         ot = obj2;
                      }
                   }
                   Object[] objArray5 = new Object[0];
                   a.D().w(str, "rxSdkGetThumbnail\(\) called with:  width = ["+b2+"], height = ["+c+"], atTime = ["+l1+str1, objArray5);
                   if (b2 > null && (c <= null || l1 - null < 0)) {
                      ot = t.error(new IllegalArgumentException("width="+b2+" height="+c+" atTime="+l1));
                   }else {
                      b uob = new b(l1, l, thumbnailGen, thumbnailGen.newRequestBuilder().setTolerance(0x3fc47ae147ae147b).setUseMetadataRetriever(b3).setProjectRenderFlags(0xa00a).setThumbnailSize(b2, c).setPositionByRenderPositionSec(((double)l1 / d)).build());
                      ot = t.create(b2);
                   }
                }
             }catch(java.lang.Exception e0){
                Throwable throwable = e0;
                try{
                   if (!TextUtils.isEmpty(obj.e) && new File(obj.e).exists()) {
                      PostUtils.D(str, "rxSdkGetVideoThumbnail create failed thumbnail or project", throwable);
                   }
                }catch(java.lang.SecurityException e0){
                   a.D().e(str, "file check exception"+obj.e, e0);
                }
                a.D().e(str, "rxSdkGetVideoThumbnail create failed thumbnail or project "+obj.e, throwable);
                ot = t.empty();
             }
          }
       }
       return ot;
    }
}
