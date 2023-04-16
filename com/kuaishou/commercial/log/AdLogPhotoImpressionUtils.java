package com.kuaishou.commercial.log.AdLogPhotoImpressionUtils;
import com.kuaishou.commercial.log.AdLogPhotoImpressionUtils$reportImpressionMinRate$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import dda.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import m66.a;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Objects;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import wkd.b;
import mxb.j0;
import yx.i0;
import java.lang.Integer;
import com.kuaishou.commercial.loggersdk.a;
import mxb.j;
import android.view.View;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverActionBarInfo;
import mxb.f0;
import com.yxcorp.gifshow.ad.fill.AdNotShownCache;
import com.yxcorp.gifshow.ad.fill.AdNotShownCache$a;
import java.lang.Long;
import androidx.collection.LruCache;
import java.lang.Double;
import java.lang.Number;

public final class AdLogPhotoImpressionUtils	// class@0014f3
{
    public static final p a;
    public static final AdLogPhotoImpressionUtils b;

    static {
       AdLogPhotoImpressionUtils.b = new AdLogPhotoImpressionUtils();
       AdLogPhotoImpressionUtils.a = s.c(AdLogPhotoImpressionUtils$reportImpressionMinRate$2.INSTANCE);
    }
    public void AdLogPhotoImpressionUtils(){
       super();
    }
    public static final void b(f p0){
       j obj;
       boolean b1;
       PhotoAdvertisement mAdData;
       j oj;
       AdLogPhotoImpressionUtils uAdLogPhotoI = AdLogPhotoImpressionUtils.class;
       if (PatchProxy.applyVoidOneRefs(p0, null, uAdLogPhotoI, "3")) {
          return;
       }
       a.p(p0, "event");
       f d = p0.d;
       QPhoto qPhoto = new QPhoto(p0.a);
       AdLogPhotoImpressionUtils b = AdLogPhotoImpressionUtils.b;
       Objects.requireNonNull(b);
       if (PatchProxy.isSupport(uAdLogPhotoI)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(d), b, uAdLogPhotoI, "4");
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else if(AdLogPhotoImpressionUtils.c() || (double)d - b.a() >= 0){
             b1 = true;
          }else {
             b1 = false;
          }
       }else {
          goto label_003e ;
       }
       if (b1 && !PatchProxy.applyVoidTwoRefs(qPhoto, p0, b, uAdLogPhotoI, "5")) {
          PhotoAdvertisement photoAdverti = k.B(qPhoto);
          PlcEntryStyleInfo plcEntryStyl = qPhoto.getPlcEntryStyleInfo();
          int i = 0x75e1;
          int i1 = 4;
          int i2 = 2;
          int i3 = 0x1d6683e9;
          if (photoAdverti != null) {
             if (!PatchProxy.applyVoidTwoRefs(photoAdverti, p0, b, uAdLogPhotoI, "6") && photoAdverti.mShowReported == null) {
                j0 oj0 = b.a(0x1332c7d4);
                i0 oi0 = b.a(i3);
                Integer[] integerArray = new Integer[i2];
                integerArray[0] = Integer.valueOf(i1);
                integerArray[1] = Integer.valueOf(i);
                if (a.a(p0, integerArray)) {
                   oj0.w(oi0.c(p0.a).m(p0.e));
                }else {
                   photoAdverti.mShowReported = true;
                   obj = oi0.d(p0.a, 1).m(p0.e);
                   a.o(obj, "logWrapper");
                   if (!PatchProxy.applyVoidTwoRefs(photoAdverti, obj, b, uAdLogPhotoI, "7")) {
                      mAdData = photoAdverti.mIsImpressionAtOutflow;
                      if (mAdData >= null) {
                         obj.l("is_search_outflow", Integer.valueOf(mAdData));
                      }
                   }
                   mAdData = photoAdverti.mAdData;
                   if (mAdData != null) {
                      PhotoAdvertisement$AdData mCoverAction = mAdData.mCoverActionbarInfo;
                      if (mCoverAction != null && mCoverAction.mSearchFormButtonExp == 1) {
                         mAdData = 1;
                      label_00ed :
                         if (mAdData) {
                            b.a(-762347696).r1(p0.a, "key_enteraction", Integer.valueOf(7));
                            oj0.i(obj, 0);
                         }else {
                            oj0.r(obj);
                         }
                      }
                   }
                   mAdData = null;
                   goto label_00ed ;
                }
                photoAdverti.mShowAdItemReported = true;
                AdNotShownCache.c.a().remove(Long.valueOf(photoAdverti.mCreativeId));
             }
          }else if(plcEntryStyl == null || (PatchProxy.applyVoidTwoRefs(plcEntryStyl, p0, b, uAdLogPhotoI, "8") || plcEntryStyl.mShowReported != null)){
             j0 oj01 = b.a(0x1332c7d4);
             i0 oi01 = b.a(i3);
             Integer[] integerArray1 = new Integer[i2];
             integerArray1[0] = Integer.valueOf(i1);
             integerArray1[1] = Integer.valueOf(i);
             if (a.a(p0, integerArray1)) {
                oj = oi01.d(p0.a, 1);
                a.b(plcEntryStyl, oj);
                oj01.w(oj);
             }else {
                plcEntryStyl.mShowReported = true;
                oj = oi01.d(p0.a, 1);
                a.b(plcEntryStyl, oj);
                oj01.r(oj);
             }
          }
       }
       return;
    }
    public static final boolean c(){
       Object obj = PatchProxy.apply(null, null, AdLogPhotoImpressionUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!Double.compare(AdLogPhotoImpressionUtils.b.a(), 0))? true: false;
       return b;
    }
    public final double a(){
       Object obj = PatchProxy.apply(null, this, AdLogPhotoImpressionUtils.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = AdLogPhotoImpressionUtils.a.getValue();
       }
       return obj.doubleValue();
    }
}
