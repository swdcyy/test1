package com.yxcorp.gifshow.v3.constructor.i;
import java.lang.Object;
import maa.a;
import com.yxcorp.gifshow.model.MultiplePhotosProject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.MultiplePhotosProject$Type;
import com.yxcorp.gifshow.model.MultiplePhotosProject$b;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.model.MultiplePhotosProject$a;
import java.io.File;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import lnc.i1;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Asset$b;
import com.kuaishou.edit.draft.Asset$Type;
import wba.n0;
import faa.a;
import q87.c;
import com.kuaishou.edit.draft.AssetSegment$b;
import com.kuaishou.edit.draft.AssetSegment;
import w46.b;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.kuaishou.edit.draft.StickerResult$b;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.LyricAsset$b;
import com.kuaishou.edit.draft.LyricAsset;
import java.lang.Math;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.TimeRange;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.StickerResult;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import crd.a;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.SerialArg;
import com.kuaishou.android.post.PostPageArg;
import com.yxcorp.gifshow.model.CustomMagicInfo;
import com.yxcorp.gifshow.model.CustomConfig;
import laa.m0;
import q5b.a;
import brd.a0;
import t45.d;
import brd.z;
import qoc.h;
import com.yxcorp.gifshow.v3.constructor.h;
import erd.g;
import crd.b;

public class i	// class@000d47
{

    public void i(){
       super();
    }
    public static void a(a p0,MultiplePhotosProject p1){
       int i;
       int i1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, i.class, "1")) {
          return;
       }
       MultiplePhotosProject$b uob = p1.g(MultiplePhotosProject$Type.ATLAS);
       MultiplePhotosProject$b uob1 = p1.g(MultiplePhotosProject$Type.LONGPICTURE);
       if (uob != null && (uob1 != null && (uob.mPictures.isEmpty() || uob1.mPictures.isEmpty()))) {
          Object[] objArray = new Object[0];
          a.D().t("ConstructorUtils", "addCroppedPictureToAsset atlasSubProject:"+uob+",longPictureSubProject:"+uob1, objArray);
          return;
       }else {
          Iterator iterator = uob.mPictures.iterator();
          i = 0;
          while (iterator.hasNext()) {
             MultiplePhotosProject$a uoa = iterator.next();
             File uFile = uob.a(uoa.mImageName);
             if (uFile == null) {
                i1.c(new RuntimeException("atlas image file is null atlasPiece:"+uoa));
             }else {
                Asset$b uob2 = p0.b();
                uob2.w(Asset$Type.PICTURE);
                uob2.d(uoa.a());
                uob2.m(n0.e(uoa.mImageName));
                uob2.k(p0.Q(uFile.getAbsolutePath()));
                uob2.p((double)uoa.mCropWidth);
                uob2.o((double)uoa.mCropHeight);
                MultiplePhotosProject$a uoa1 = uob1.mPictures.get(i);
                Object[] objArray1 = new Object[0];
                a.D().w("ConstructorUtils", "addCroppedPictureToAsset longPictureIndex:"+i+",atlasImageFile:"+uFile+",atlasPiece:"+uoa+",firstLongPicturePiece:"+uoa1, objArray1);
                if (uoa1.b() != 1) {
                   i1 = 0;
                   while (i1 < uoa1.b()) {
                      MultiplePhotosProject$a uoa2 = uob1.mPictures.get(i);
                      File uFile1 = uob1.a(uoa2.mImageName);
                      if (uFile1 == null) {
                         i1.c(new RuntimeException("long image file is null longPicturePiece:"+uoa2));
                      }else {
                         AssetSegment$b uob3 = AssetSegment.newBuilder();
                         uob3.c(p0.Q(uFile1.getAbsolutePath()));
                         uob3.e(n0.e(uoa2.mImageName));
                         uob3.g((double)uoa2.mCropWidth);
                         uob3.f((double)uoa2.mCropHeight);
                         uob2.b(uob3);
                         i = i + 1;
                         Object[] objArray2 = new Object[0];
                         a.D().w("ConstructorUtils", "addCroppedPictureToAsset longPicturePiece:"+uoa2+",longPictureImageFile:"+uFile1+",longPictureIndex:"+i, objArray2);
                      }
                      i1 = i1 + 1;
                   }
                }else {
                   i = i + 1;
                }
             }
          }
          return;
       }
    }
    public static StickerResult$b b(int p0,String p1,double p2,double p3,float p4,float p5,float p6,Size p7){
       LyricAsset$b obj;
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Double.valueOf(p2),Double.valueOf(p3),Float.valueOf(p4),Float.valueOf(p5),Float.valueOf(p6),p7};
          obj = PatchProxy.apply(objArray, null, oi, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = LyricAsset.newBuilder();
       double d = 0;
       if (p2 - d < 0) {
          p3 = Math.max((p3 + p2), d);
          p2 = d;
       }
       TimeRange$b uob = TimeRange.newBuilder();
       uob.b(p2);
       uob.a(p3);
       StickerResult$b uob1 = StickerResult.newBuilder();
       uob1.o(uob.build());
       uob1.f(p4);
       uob1.g(p5);
       uob1.w(p0);
       uob1.t(p6);
       uob1.v(0x3f800000);
       if (p7 != null) {
          uob1.r((double)p7.b);
          uob1.q((double)p7.c);
       }
       obj.c(p1);
       obj.b(uob1);
       return uob1;
    }
    public static void c(c p0,a p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, i.class, "8")) {
          return;
       }
       CustomMagicInfo uCustomMagic = i.g().getCustomMagicInfo().get();
       if (uCustomMagic == null || (uCustomMagic.getMagicId() != null && uCustomMagic.getCustomConfig() != null)) {
          p2.c(a.a.b(uCustomMagic.getMagicId(), new File(p0.f0().getAbsolutePath()), uCustomMagic.getCoverPath(), uCustomMagic.getCustomConfig()).T(d.c).G(d.a).R(new h(p1, uCustomMagic), h.b));
       }
    label_0065 :
       return;
    }
}
