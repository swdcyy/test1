package com.kuaishou.android.model.mix.CoverMetaExt;
import java.lang.Object;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CoverSize;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kuaishou.android.model.mix.PhotoCoverStyle;

public final class CoverMetaExt	// class@000c4f
{

    public void CoverMetaExt(){
       super();
    }
    public static float getCoverAspectRatio(CoverMeta p0){
       float f;
       float f1;
       CoverMeta mOverrideCov = p0.mOverrideCoverSize;
       if (mOverrideCov != null) {
          CoverSize mWidth = mOverrideCov.mWidth;
          if (mWidth > null) {
             CoverSize mHeight = mOverrideCov.mHeight;
             if (mHeight > null) {
                f = (float)mHeight;
                f1 = (float)mWidth;
             label_000e :
                return (f / f1);
             }
          }
       }
       mOverrideCov = p0.mWidth;
       if (mOverrideCov > null) {
          p0 = p0.mHeight;
          if (p0 > null) {
             f = (float)p0;
             f1 = (float)mOverrideCov;
             goto label_000e ;
          }
       }
       return 0x3f800000;
    }
    public static float getCoverAspectRatioPrioritizeAdCover(CoverMeta p0,CommonMeta p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, CoverMetaExt.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (p0 != null) {
          return CoverMetaExt.getCoverAspectRatio(p0);
       }
       CommonMeta mWidth = p1.mWidth;
       if (mWidth > null) {
          p1 = p1.mHeight;
          if (p1 > null) {
             return ((float)p1 / (float)mWidth);
          }
       }
       return 0x3f800000;
    }
    public static int getCoverCutShift(CoverMeta p0){
       p0 = p0.mOverrideCoverSize;
       if (p0 != null) {
          return p0.mCuttingShift;
       }
       return 0;
    }
    public static int getCoverCutType(CoverMeta p0){
       p0 = p0.mOverrideCoverSize;
       if (p0 != null) {
          return p0.mCuttingType;
       }
       return 0;
    }
    public static String getFirstNonNullAdsCoverThumbUrl(CoverMeta p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CoverMetaExt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!j.h(p0.mOverrideCoverThumbnailUrls)) {
          return p0.mOverrideCoverThumbnailUrls[0].getUrl();
       }
       return p0.mCoverThumbnailUrl;
    }
    public static int getShiftDirection(CoverMeta p0){
       p0 = p0.mOverrideCoverSize;
       if (p0 != null) {
          return p0.mShiftDirection;
       }
       return 0;
    }
    public static int[] getTargetBitmapSize(CoverMeta p0,CommonMeta p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, CoverMetaExt.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = n.y(a.b()) / 2;
       int[] ointArray = new int[]{i,(int)(CoverMetaExt.getCoverAspectRatioPrioritizeAdCover(p0, p1) * (float)i)};
       return ointArray;
    }
    public static boolean isShowDescription(CoverMeta p0){
       p0 = p0.mCoverStyle;
       boolean b = (p0 != null && p0.isShowDesc != null)? true: false;
       return b;
    }
}
