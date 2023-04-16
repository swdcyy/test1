package com.kwai.video.waynelive.datasource.LiveDataSource$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.video.waynelive.datasource.LiveDataSource$$Parcelable$1;
import com.kwai.video.waynelive.datasource.LiveDataSource;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.io.Serializable;
import com.kuaishou.android.live.model.ResolutionPlayUrls;
import com.kuaishou.android.live.model.LiveAdaptiveManifest;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class LiveDataSource$$Parcelable implements Parcelable, d	// class@000de4
{
    public LiveDataSource liveDataSource$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveDataSource$$Parcelable.CREATOR = new LiveDataSource$$Parcelable$1();
    }
    public void LiveDataSource$$Parcelable(LiveDataSource p0){
       super();
       this.liveDataSource$$0 = p0;
    }
    public static LiveDataSource read(Parcel p0,a p1){
       List list1;
       ArrayList uArrayList;
       int i3;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveDataSource liveDataSour = new LiveDataSource();
          p1.f(p1.g(), liveDataSour);
          int i1 = p0.readInt();
          List list = null;
          int i2 = 0;
          if (i1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          liveDataSour.mMultiResolutionPlayUrls = list1;
          i1 = p0.readInt();
          if (i1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          liveDataSour.mLiveAdaptiveManifests = list1;
          i1 = p0.readInt();
          if (i1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(CDNUrl$$Parcelable.read(p0, p1));
             }
          }
          liveDataSour.mPlayUrls = list1;
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (; i2 < i1; i2 = i2 + 1) {
                list.add(p0.readSerializable());
             }
          }
          liveDataSour.mWebRTCAdaptiveManifests = list;
          liveDataSour.dataSourceType = p0.readInt();
          p1.f(i, liveDataSour);
          return liveDataSour;
       }
    }
    public static void write(LiveDataSource p0,Parcel p1,int p2,a p3){
       Iterator iterator1;
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          LiveDataSource mMultiResolu = p0.mMultiResolutionPlayUrls;
          if (mMultiResolu == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mMultiResolu.size());
             iterator1 = p0.mMultiResolutionPlayUrls.iterator();
             while (iterator1.hasNext()) {
                p1.writeSerializable(iterator1.next());
             }
          }
          mMultiResolu = p0.mLiveAdaptiveManifests;
          if (mMultiResolu == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mMultiResolu.size());
             iterator1 = p0.mLiveAdaptiveManifests.iterator();
             while (iterator1.hasNext()) {
                p1.writeSerializable(iterator1.next());
             }
          }
          mMultiResolu = p0.mPlayUrls;
          if (mMultiResolu == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mMultiResolu.size());
             iterator1 = p0.mPlayUrls.iterator();
             while (iterator1.hasNext()) {
                CDNUrl$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          LiveDataSource mWebRTCAdapt = p0.mWebRTCAdaptiveManifests;
          if (mWebRTCAdapt == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mWebRTCAdapt.size());
             Iterator iterator = p0.mWebRTCAdaptiveManifests.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          p1.writeInt(p0.dataSourceType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveDataSource getParcel(){
       return this.liveDataSource$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveDataSource$$Parcelable.write(this.liveDataSource$$0, p0, p1, new a());
    }
}
