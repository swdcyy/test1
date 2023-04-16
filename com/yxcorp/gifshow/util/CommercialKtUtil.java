package com.yxcorp.gifshow.util.CommercialKtUtil;
import com.yxcorp.gifshow.util.CommercialKtUtil$mPhotoLimit$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.util.CommercialKtUtil$mLiveLimit$2;
import com.yxcorp.gifshow.util.CommercialKtUtil$mAdRateStrategyInfo$2;
import java.lang.Object;
import java.util.List;
import com.google.gson.JsonObject;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import yx.j0;
import ty8.d;
import java.lang.Math;
import com.google.gson.JsonArray;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.gson.JsonElement;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ty8.c;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import mxb.c;
import wkd.b;
import l66.a;
import dda.b;
import com.kwai.framework.model.feed.BaseFeed;
import m66.a;
import android.app.Application;
import o56.a;
import android.os.Vibrator;
import java.lang.Number;

public final class CommercialKtUtil	// class@001ede
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final CommercialKtUtil d;

    static {
       CommercialKtUtil.d = new CommercialKtUtil();
       CommercialKtUtil.a = s.c(CommercialKtUtil$mPhotoLimit$2.INSTANCE);
       CommercialKtUtil.b = s.c(CommercialKtUtil$mLiveLimit$2.INSTANCE);
       CommercialKtUtil.c = s.c(CommercialKtUtil$mAdRateStrategyInfo$2.INSTANCE);
    }
    public void CommercialKtUtil(){
       super();
    }
    public static final void a(List p0,JsonObject p1){
       Object[] objArray;
       int i3;
       a.p(p0, "qPhotos");
       a.p(p1, "clientInfo");
       StringBuilder str = "";
       StringBuilder str1 = "";
       int i = p0.size() - 1;
       int i1 = 0;
       int i2 = 0;
       while (i >= 0) {
          QPhoto qPhoto = p0.get(i);
          CommercialKtUtil d = CommercialKtUtil.d;
          if (i1 >= d.e() && i2 >= d.d()) {
             break ;
          }else if(qPhoto.isLiveStream()){
             if (i2 >= d.d()) {
                objArray = new Object[0];
                j0.f("buildFeedIds", "ad liveStreamIds reach limit "+d.d(), objArray);
             }else {
                i3 = i2 + 1;
                if (i2 > 0) {
                   str1.insert(0, qPhoto.getPhotoId()+',');
                }else {
                   str1 = str1+qPhoto.getPhotoId();
                }
                i2 = i3;
             }
          }else if(i1 >= d.e()){
             objArray = new Object[0];
             j0.f("buildFeedIds", "ad photoIds reach limit "+d.e(), objArray);
          }else {
             i3 = i1 + 1;
             if (i1 > 0) {
                str.insert(0, qPhoto.getPhotoId()+',');
             }else {
                str = str+qPhoto.getPhotoId();
             }
             i1 = i3;
          }
          i = i - 1;
       }
       p1.c0("photoIds", str);
       p1.c0("liveStreamIds", str1);
       return;
    }
    public static final void b(List p0,JsonObject p1){
       List c;
       a.p(p0, "qPhotos");
       a.p(p1, "clientInfo");
       int i = p0.size() - 1;
       int i1 = Math.max(0, (i - CommercialKtUtil.d.c().a()));
       JsonArray jsonArray = new JsonArray();
       ArrayList uArrayList = new ArrayList();
       if (i >= i1) {
          while (true) {
             QPhoto qPhoto = p0.get(i);
             if (qPhoto.isLiveStream()) {
             label_0090 :
                if (i != i1) {
                   i = i - 1;
                }
             }else {
                PhotoAdvertisement photoAdverti = k.B(qPhoto);
                if (photoAdverti != null) {
                   photoAdverti = photoAdverti.mAdData;
                   if (photoAdverti != null) {
                      PhotoAdvertisement$AdData mRateInfo = photoAdverti.mRateInfo;
                      if (mRateInfo != null) {
                         int i2 = mRateInfo.isEmpty() ^ 0x01;
                         if (i2) {
                            uArrayList.add(mRateInfo);
                            JsonObject jsonObject = new JsonObject();
                            Iterator iterator = mRateInfo.entrySet().iterator();
                            while (iterator.hasNext()) {
                               Map$Entry uEntry = iterator.next();
                               String key = uEntry.getKey();
                               jsonObject.c0(key, uEntry.getValue());
                            }
                            jsonArray.G(jsonObject);
                         }
                      }
                   }
                }
                if (uArrayList.size() < CommercialKtUtil.d.c().a()) {
                }
             }
          }
       }
    label_0095 :
       p1.G("rateInfos", jsonArray);
       p0 = CollectionsKt___CollectionsKt.u5(uArrayList, CommercialKtUtil.d.c().c);
       c d = c.d;
       Objects.requireNonNull(d);
       if (!PatchProxy.applyVoidOneRefs(p0, d, c.class, "22")) {
          a.p(p0, "rateList");
          c = c.c;
          c.clear();
          c.addAll(p0);
       }
       return;
    }
    public static final List f(int p0,List p1){
       a.p(p1, "pageList");
       ArrayList uArrayList = new ArrayList();
       p0++;
       int i = p1.size();
       while (p0 < i) {
          QPhoto qPhoto = q.d(p1, p0);
          if (qPhoto == null || (!qPhoto.isShowed() && c.T(qPhoto))) {
             b.a(0x6d2a4fdd).b(new b(qPhoto.mEntity, 4));
             uArrayList.add(qPhoto);
             PhotoAdvertisement photoAdverti = k.B(qPhoto);
             if (photoAdverti != null) {
                Object[] objArray = new Object[0];
                j0.f("PhotoAbandon", "negative clear ad"+photoAdverti.mCreativeId, objArray);
             }
          }
          p0++;
       }
       return uArrayList;
    }
    public static final void g(long p0){
       Object systemServic = a.b().getSystemService("vibrator");
       if (!systemServic instanceof Vibrator) {
          systemServic = null;
       }
       if (systemServic != null && systemServic.hasVibrator()) {
          systemServic.vibrate(p0);
       }
       return;
    }
    public final d c(){
       return CommercialKtUtil.c.getValue();
    }
    public final int d(){
       return CommercialKtUtil.b.getValue().intValue();
    }
    public final int e(){
       return CommercialKtUtil.a.getValue().intValue();
    }
}
