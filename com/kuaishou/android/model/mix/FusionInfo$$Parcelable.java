package com.kuaishou.android.model.mix.FusionInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.FusionInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.FusionInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.mix.FusionPlayInfo;
import com.kuaishou.android.model.mix.FusionPlayInfo$$Parcelable;
import com.kuaishou.android.model.mix.HighLightStartEndTime;
import com.kuaishou.android.model.mix.HighLightStartEndTime$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class FusionInfo$$Parcelable implements Parcelable, d	// class@000c90
{
    public FusionInfo fusionInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FusionInfo$$Parcelable.CREATOR = new FusionInfo$$Parcelable$a();
    }
    public void FusionInfo$$Parcelable(FusionInfo p0){
       super();
       this.fusionInfo$$0 = p0;
    }
    public static FusionInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          FusionInfo uFusionInfo = new FusionInfo();
          p1.f(p1.g(), uFusionInfo);
          uFusionInfo.mDuration = p0.readLong();
          int i1 = 0;
          boolean b = true;
          boolean b1 = (p0.readInt() == b)? true: false;
          uFusionInfo.mHighlightUrlFake = b1;
          b1 = (p0.readInt() == b)? true: false;
          uFusionInfo.isEnableSDKFetch = b1;
          uFusionInfo.mSource = p0.readString();
          if (p0.readInt() != b) {
             b = false;
          }
          uFusionInfo.isPreview = b;
          uFusionInfo.mEpisodeId = p0.readString();
          b1 = p0.readInt();
          if (b1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(b1);
             for (; i1 < b1; i1 = i1 + 1) {
                uArrayList.add(FusionPlayInfo$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          uFusionInfo.mPlays = list;
          uFusionInfo.mMediaId = p0.readString();
          uFusionInfo.mHighlightStartEndTime = HighLightStartEndTime$$Parcelable.read(p0, p1);
          p1.f(i, uFusionInfo);
          return uFusionInfo;
       }
    }
    public static void write(FusionInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeLong(p0.mDuration);
          p1.writeInt(p0.mHighlightUrlFake);
          p1.writeInt(p0.isEnableSDKFetch);
          p1.writeString(p0.mSource);
          p1.writeInt(p0.isPreview);
          p1.writeString(p0.mEpisodeId);
          FusionInfo mPlays = p0.mPlays;
          if (mPlays == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mPlays.size());
             Iterator iterator = p0.mPlays.iterator();
             while (iterator.hasNext()) {
                FusionPlayInfo$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mMediaId);
          HighLightStartEndTime$$Parcelable.write(p0.mHighlightStartEndTime, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public FusionInfo getParcel(){
       return this.fusionInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FusionInfo$$Parcelable.write(this.fusionInfo$$0, p0, p1, new a());
    }
}
