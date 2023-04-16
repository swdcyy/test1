package com.kuaishou.android.model.ads.a;
import ip.c;
import java.lang.Object;
import com.kuaishou.android.commercial.PhotoAdvertisementInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.SideWindowInfo;
import ip.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import ekd.q;

public class a implements c	// class@000604
{

    public void a(){
       super();
    }
    public boolean a(PhotoAdvertisementInterface p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PhotoAdvertisement photoAdverti = k.z(p0);
       if (photoAdverti != null) {
          photoAdverti = photoAdverti.mAdData;
          if (photoAdverti != null) {
             PhotoAdvertisement$AdData mSideWindowI = photoAdverti.mSideWindowInfo;
             if (mSideWindowI != null && mSideWindowI.mEnableSmallWindow != null) {
                b = true;
             label_0028 :
                return b;
             }
          }
       }
       b = false;
       goto label_0028 ;
    }
    public void b(PhotoAdvertisementInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       if (p0 != null) {
          k.z(p0).mockFansTopChargeInfo();
       }
       return;
    }
    public void c(PhotoAdvertisementInterface p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       if (p0 != null) {
          k.z(p0).mockFansTop(p1);
       }
       return;
    }
    public a d(PhotoAdvertisementInterface p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PhotoAdvertisement photoAdverti = k.z(p0);
       if (photoAdverti != null) {
          photoAdverti = photoAdverti.mAdData;
          if (photoAdverti != null) {
             return photoAdverti.mSideWindowInfo;
          }
       }
       return null;
    }
    public void e(PhotoAdvertisementInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       if (p0 != null) {
          k.z(p0).mockFansTop();
       }
       return;
    }
    public void f(PhotoAdvertisementInterface p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "4")) {
          return;
       }
       if (p0 != null) {
          p0.mIsNonSlideAd = p1;
       }
       return;
    }
    public boolean g(PhotoAdvertisementInterface p0){
       PhotoAdvertisement$AdGroup[] obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       if (k.z(p0) != null) {
          obj = new PhotoAdvertisement$AdGroup[i];
          obj[0] = PhotoAdvertisement$AdGroup.THIRD_PLATFORM;
          if (k.z(p0).isAdGroup(obj)) {
          label_002d :
             return i;
          }
       }
       i = false;
       goto label_002d ;
    }
    public boolean h(PhotoAdvertisementInterface p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PhotoAdvertisement photoAdverti = k.z(p0);
       int i = 0;
       if (photoAdverti != null) {
          PhotoAdvertisement$AdGroup[] uAdGroupArra = new PhotoAdvertisement$AdGroup[]{PhotoAdvertisement$AdGroup.DSP,PhotoAdvertisement$AdGroup.THIRD_PLATFORM,PhotoAdvertisement$AdGroup.ALI_DONG_FENG};
          if (!photoAdverti.isAdGroup(uAdGroupArra) && photoAdverti.mAdQueueType == 2) {
             i = true;
          }
       }
       return i;
    }
    public boolean i(PhotoAdvertisementInterface p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          return k.z(p0).mIsNonSlideAd;
       }
       return false;
    }
    public void j(List p0){
       int i2;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       int i = p0.size();
       if (i <= 1) {
          return;
       }
       int i1 = 0;
       while (i1 < i) {
          PhotoAdvertisement photoAdverti = k.B(p0.get(i1));
          if (photoAdverti != null) {
             photoAdverti = photoAdverti.mAdData;
             if (photoAdverti != null) {
                PhotoAdvertisement$AdData mSideWindowI = photoAdverti.mSideWindowInfo;
                if (mSideWindowI != null && mSideWindowI.mEnableSmallWindow != null) {
                   if (!i1) {
                      i2 = i1 + 1;
                      mSideWindowI.mSidePhoto = q.d(p0, i2);
                      mSideWindowI.mInsertType = 2;
                   }else {
                      i2 = i1 - 1;
                      mSideWindowI.mSidePhoto = q.d(p0, i2);
                      mSideWindowI.mInsertType = 1;
                   }
                }
             }
          }
          i1 = i1 + 1;
       }
       return;
    }
}
