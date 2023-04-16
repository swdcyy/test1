package com.yxcorp.gifshow.v3.editor.cover.x0;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.v3.editor.cover.d1;
import android.util.Pair;
import qaa.a;
import java.io.File;
import java.lang.Object;
import java.util.Objects;
import faa.a;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.System;
import q87.c;
import xf6.l;
import java.lang.Thread;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.AssetSegment;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.yxcorp.gifshow.edit.previewer.utils.d;
import ekd.j;
import voc.t;
import wba.z;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import vba.h;
import ppc.z0;
import vba.d;
import sxb.a;
import kotlin.jvm.internal.a;
import com.kwai.video.minecraft.model.nano.Minecraft$BeautyFilterParam;
import com.kwai.video.minecraft.model.nano.Minecraft$ColorFilterParam;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosBeautyFilterParam;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosMakeupParam;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosBodySlimmingParam;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosFaceMagicParam;
import ppc.x0;
import android.content.Context;
import lnc.a1;
import rwc.j;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import pwc.a;
import haa.a;
import kotlin.Pair;
import java.lang.Float;
import voc.l;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Cover;
import com.kuaishou.edit.draft.Text;
import com.kuaishou.edit.draft.StickerResult;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.kuaishou.edit.draft.RatioRect;
import wba.h0;
import com.yxcorp.gifshow.edit.previewer.utils.StickerTextValueType;
import lnc.z2;
import lnc.o6;
import ppc.k;
import java.lang.RuntimeException;
import com.kwai.feature.post.api.core.model.GSConfig;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;

public final class x0 implements Callable	// class@000eea
{
    public final d1 b;
    public final Pair[] c;
    public final int d;
    public final a e;
    public final File f;

    public void x0(d1 p0,Pair[] p1,int p2,a p3,File p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final Object call(){
       String str1;
       x0 ox01;
       x0 ox02;
       int i1;
       String str2;
       d1 uod11;
       x0 ox03;
       d1 uod12;
       RatioRect ratioRect;
       float f6;
       x0 ox0 = this;
       x0 b = ox0.b;
       x0 c = ox0.c;
       x0 d = ox0.d;
       x0 e = ox0.e;
       x0 f = ox0.f;
       Objects.requireNonNull(b);
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "PhotosGenerateCoverPresenter";
       a.D().w(str, "generate execute "+System.currentTimeMillis(), objArray);
       if (l.c("COVER_PREVIEW_GENERATE_DELAY", i)) {
          Thread.sleep(5000);
       }
       Bitmap uBitmap = null;
       if (b.p.a1() == Workspace$Type.SINGLE_PICTURE) {
          Pair first = c[i].first;
          if (j.h(d.l(b.p, first, i))) {
             BitmapDrawable uBitmapDrawa = t.a().b(z.f(first));
             if (uBitmapDrawa != null) {
                uBitmap = uBitmapDrawa.getBitmap();
                objArray = new Object[i];
                a.D().w(str, "generatePhotoCover: single picture use cache bitmap", objArray);
             }
          }
       }
       if (uBitmap == null) {
          d1 p = b.p;
          d d1 uod1 = d1.class;
          if (PatchProxy.isSupport(uod1)) {
             uBitmap = PatchProxy.applyThreeRefs(p, c, Integer.valueOf(d), b, d1.class, "5");
             if (uBitmap != PatchProxyResult.class) {
                str1 = str;
                ox01 = f;
                ox02 = e;
                i1 = 0;
             label_03b4 :
                Object[] objArray1 = new Object[i1];
                str2 = str1;
                a.D().w(str2, "generatePhotoCover: renderFilterAndDrawText", objArray1);
             }
          }
          h oh = new h();
          oh.g(p);
          int b1 = true;
          z0 oz0 = new z0(b, oh.b(b1).c(b1).d(b1).e(b1));
          d uod = d.class;
          if (PatchProxy.isSupport(uod1)) {
             uod11 = p;
             str1 = str;
             i1 = 0;
             ox01 = f;
             ox02 = e;
             ox03 = d;
             if (PatchProxy.applyVoidFourRefs(oz0, c, Integer.valueOf(d), uod11, null, d1.class, "6")) {
             }
          }else {
             uod11 = p;
             str1 = str;
             ox01 = f;
             ox02 = e;
             ox03 = d;
             i1 = 0;
          }
          i = 0;
          while (i < c.length) {
             object oobject = c[i];
             Pair second = oobject.second;
             a uoa1 = oz0.a(oobject.first);
             if (uoa1 != null) {
                int i3 = ox03 + i;
                uod12 = uod11;
                uoa1.h().u(z.n(i3, uod12), i3);
                if (second != null) {
                   uod1 = second.h();
                   d i4 = uoa1.h().i;
                   Objects.requireNonNull(uod1);
                   String str4 = "<set-?>";
                   if (!PatchProxy.applyVoidOneRefs(i4, uod1, uod, "16")) {
                      a.p(i4, str4);
                      uod1.i = i4;
                   }
                   uod1 = second.h();
                   Minecraft$BeautyFilterParam uBeautyFilte = uoa1.h().f();
                   Objects.requireNonNull(uod1);
                   if (!PatchProxy.applyVoidOneRefs(uBeautyFilte, uod1, uod, "1")) {
                      a.p(uBeautyFilte, str4);
                      uod1.a = uBeautyFilte;
                   }
                   uod1 = second.h();
                   Minecraft$ColorFilterParam uColorFilter = uoa1.h().g();
                   Objects.requireNonNull(uod1);
                   if (!PatchProxy.applyVoidOneRefs(uColorFilter, uod1, uod, "2")) {
                      a.p(uColorFilter, str4);
                      uod1.b = uColorFilter;
                   }
                   uod1 = second.h();
                   Minecraft$WesterosBeautyFilterParam westerosBeau = uoa1.h().i();
                   Objects.requireNonNull(uod1);
                   if (!PatchProxy.applyVoidOneRefs(westerosBeau, uod1, uod, "3")) {
                      a.p(westerosBeau, str4);
                      uod1.c = westerosBeau;
                   }
                   uod1 = second.h();
                   Minecraft$WesterosMakeupParam westerosMake = uoa1.h().k();
                   Objects.requireNonNull(uod1);
                   if (!PatchProxy.applyVoidOneRefs(westerosMake, uod1, uod, "4")) {
                      a.p(westerosMake, str4);
                      uod1.d = westerosMake;
                   }
                   uod1 = second.h();
                   Minecraft$WesterosBodySlimmingParam westerosBody = uoa1.h().j();
                   Objects.requireNonNull(uod1);
                   if (!PatchProxy.applyVoidOneRefs(westerosBody, uod1, uod, "5")) {
                      a.p(westerosBody, str4);
                      uod1.e = westerosBody;
                   }
                   uod1 = second.h();
                   Minecraft$WesterosFaceMagicParam westerosFace = uoa1.h().l();
                   Objects.requireNonNull(uod1);
                   if (!PatchProxy.applyVoidOneRefs(westerosFace, uod1, uod, "7")) {
                      a.p(westerosFace, str4);
                      uod1.g = westerosFace;
                   }
                }else {
                   c[i] = new Pair(oobject.first, uoa1);
                }
             }else {
                uod12 = uod11;
             }
             i = i + 1;
             uod11 = uod12;
             b1 = 1;
          }
          uod12 = uod11;
          j oj = new j(new x0(a1.c()).a(c));
          int len = c.length;
          String[] stringArray = new String[len];
          for (i = 0; i < c.length; i = i + 1) {
             stringArray[i] = z.f(c[i].first);
          }
          Pair first1 = c[i1].first;
          a uoa = a.f(uod12);
          float f1 = z.l(first1, a.a(first1.getFile())).getSecond().floatValue();
          if (!PatchProxy.isSupport(l.class) || !PatchProxy.applyVoidFourRefs(uoa, oj, stringArray, Float.valueOf(f1), null, l.class, "1")) {
             Cover uCover = uoa.v();
             if (oj.getValue() == null || (uCover == null || (uCover.getTextsCount() && uCover.getTexts(i1).hasResult()))) {
                StickerResult result = uCover.getTexts(i1).getResult();
                float f2 = (DraftFileManager.E().B(result.getPreviewImageFile(), uoa) == null)? Float.MIN_VALUE: 0;
                DraftFileManager uDraftFileMa = DraftFileManager.E();
                str = (f2)? result.getOutputImageFile(): result.getPreviewImageFile();
                Bitmap uBitmap1 = uDraftFileMa.z(str, uoa);
                if (uBitmap1 != null) {
                   float f3 = 0x3f800000;
                   float f4 = ((float)oj.getValue().getWidth() * f3) / (float)a.a(stringArray[i1]).b;
                   if (len != 1) {
                      f1 = 0x3f800000;
                   }
                   if (result.hasRatioRect() && result.getRatioRect().getBottom() - result.getRatioRect().getTop()) {
                      ratioRect = result.getRatioRect();
                      len = oj.getValue().getWidth();
                      int height = oj.getValue().getHeight();
                      int i2 = (int)((ratioRect.getRight() - ratioRect.getLeft()) * (float)len);
                      float f5 = ((float)i2 * f3) / (float)uBitmap1.getWidth();
                      StringBuilder str3 = "drawDraftTextToVideoBitmap ratioRect = "+ratioRect;
                      Object[] objArray2 = new Object[i1];
                      a.D().w("EditCoverDrawAssetUtils", str3+" frameWidth = "+len+" frameHeight = "+height+" textExpectedWidth = "+i2+" textExpectedHeight = "+(int)((ratioRect.getBottom() - ratioRect.getTop()) * (float)height)+" textBitmap.getWidth\(\) = "+uBitmap1.getWidth()+" textBitmap.getHeight\(\) = "+uBitmap1.getHeight()+" assetTransformedScale = "+f5, objArray2);
                      f6 = f5;
                   }else {
                      f6 = f1;
                   }
                   h0 oh0 = new h0(result.getCenterX(), result.getCenterY(), f4, result.getRotate(), StickerTextValueType.Draft, f6, result.getViewScale(), result.getIdentifier());
                   o6.b(oj, uBitmap1, ratioRect.b(StickerTextValueType.EditElement));
                }
             }
          }
       label_03ad :
          uBitmap = oj.getValue();
          goto label_03b4 ;
       }else {
          str2 = str;
          ox01 = f;
          ox02 = e;
          i1 = 0;
       }
       if (uBitmap == null) {
          ox02.j();
          if (!k.a(b.p)) {
             throw new RuntimeException("PhotosGenerateCoverPresentergeneratePhotoCover coverBitmap is null");
          }
       }
       try{
          BitmapUtil.Q(uBitmap, ox01.getAbsolutePath(), GSConfig.b());
       }catch(java.io.IOException e0){
          k.a(b.p);
          PostUtils.D(str2, "BitmapUtil.saveToFile failed", e0);
       }
       objArray = new Object[i1];
       a.D().w(str2, "generatePhotoCover: "+uBitmap.getWidth()+","+uBitmap.getHeight(), objArray);
       return uBitmap;
    }
}
