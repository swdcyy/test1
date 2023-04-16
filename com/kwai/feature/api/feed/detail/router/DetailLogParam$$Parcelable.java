package com.kwai.feature.api.feed.detail.router.DetailLogParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.feed.detail.router.DetailLogParam$$Parcelable$a;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.HashMap;
import xwd.b;
import java.io.Serializable;
import com.kuaishou.android.model.feed.SearchParams;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class DetailLogParam$$Parcelable implements Parcelable, d	// class@000e9b
{
    public DetailLogParam detailLogParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       DetailLogParam$$Parcelable.CREATOR = new DetailLogParam$$Parcelable$a();
    }
    public void DetailLogParam$$Parcelable(DetailLogParam p0){
       super();
       this.detailLogParam$$0 = p0;
    }
    public static DetailLogParam read(Parcel p0,a p1){
       Map map1;
       HashMap hashMap;
       int i3;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          DetailLogParam uDetailLogPa = new DetailLogParam();
          p1.f(p1.g(), uDetailLogPa);
          int i1 = p0.readInt();
          Map map = null;
          int i2 = 0;
          if (i1 < 0) {
             map1 = map;
          }else {
             hashMap = new HashMap(b.a(i1));
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                hashMap.put(p0.readString(), p0.readString());
             }
          }
          uDetailLogPa.mPageUrlParamMap = map1;
          uDetailLogPa.recoTabId = p0.readInt();
          i1 = p0.readInt();
          if (i1 < 0) {
             map1 = map;
          }else {
             hashMap = new HashMap(b.a(i1));
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                hashMap.put(p0.readString(), p0.readString());
             }
          }
          uDetailLogPa.mBizParams = map1;
          i1 = p0.readInt();
          if (i1 < 0) {
             map1 = map;
          }else {
             hashMap = new HashMap(b.a(i1));
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                hashMap.put(p0.readString(), p0.readString());
             }
          }
          uDetailLogPa.mVideoStatUrlParamMap = map1;
          i1 = p0.readInt();
          if (i1 >= 0) {
             map = new HashMap(b.a(i1));
             for (; i2 < i1; i2 = i2 + 1) {
                map.put(p0.readString(), p0.readString());
             }
          }
          uDetailLogPa.mRealShowExtraParamMap = map;
          uDetailLogPa.mSearchParams = p0.readSerializable();
          p1.f(i, uDetailLogPa);
          return uDetailLogPa;
       }
    }
    public static void write(DetailLogParam p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       Map$Entry uEntry;
       p2 = p3.c(p0);
       int i = -1;
       if (p2 != i) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          DetailLogParam mPageUrlPara = p0.mPageUrlParamMap;
          if (mPageUrlPara == null) {
             p1.writeInt(i);
          }else {
             p1.writeInt(mPageUrlPara.size());
             iterator = p0.mPageUrlParamMap.entrySet().iterator();
             while (iterator.hasNext()) {
                uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                p1.writeString(uEntry.getValue());
             }
          }
          p1.writeInt(p0.recoTabId);
          mPageUrlPara = p0.mBizParams;
          if (mPageUrlPara == null) {
             p1.writeInt(i);
          }else {
             p1.writeInt(mPageUrlPara.size());
             iterator = p0.mBizParams.entrySet().iterator();
             while (iterator.hasNext()) {
                uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                p1.writeString(uEntry.getValue());
             }
          }
          mPageUrlPara = p0.mVideoStatUrlParamMap;
          if (mPageUrlPara == null) {
             p1.writeInt(i);
          }else {
             p1.writeInt(mPageUrlPara.size());
             iterator = p0.mVideoStatUrlParamMap.entrySet().iterator();
             while (iterator.hasNext()) {
                uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                p1.writeString(uEntry.getValue());
             }
          }
          mPageUrlPara = p0.mRealShowExtraParamMap;
          if (mPageUrlPara == null) {
             p1.writeInt(i);
          }else {
             p1.writeInt(mPageUrlPara.size());
             iterator = p0.mRealShowExtraParamMap.entrySet().iterator();
             while (iterator.hasNext()) {
                uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                p1.writeString(uEntry.getValue());
             }
          }
          p1.writeSerializable(p0.mSearchParams);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public DetailLogParam getParcel(){
       return this.detailLogParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       DetailLogParam$$Parcelable.write(this.detailLogParam$$0, p0, p1, new a());
    }
}
