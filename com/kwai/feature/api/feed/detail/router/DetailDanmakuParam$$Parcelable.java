package com.kwai.feature.api.feed.detail.router.DetailDanmakuParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.feed.detail.router.DetailDanmakuParam$$Parcelable$a;
import com.kwai.feature.api.feed.detail.router.DetailDanmakuParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Long;

public class DetailDanmakuParam$$Parcelable implements Parcelable, d	// class@000e97
{
    public DetailDanmakuParam detailDanmakuParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       DetailDanmakuParam$$Parcelable.CREATOR = new DetailDanmakuParam$$Parcelable$a();
    }
    public void DetailDanmakuParam$$Parcelable(DetailDanmakuParam p0){
       super();
       this.detailDanmakuParam$$0 = p0;
    }
    public static DetailDanmakuParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          DetailDanmakuParam uDetailDanma = new DetailDanmakuParam();
          p1.f(p1.g(), uDetailDanma);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          uDetailDanma.forceOpenDanmaku = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          uDetailDanma.openDanmakuPanel = b;
          Long longx = (p0.readInt() < 0)? null: Long.valueOf(p0.readLong());
          uDetailDanma.forceDanmakuPosition = longx;
          uDetailDanma.forceDanmakuId = p0.readString();
          uDetailDanma.switchSupportType = p0.readInt();
          uDetailDanma.openDanmakuSource = p0.readString();
          p1.f(i, uDetailDanma);
          return uDetailDanma;
       }
    }
    public static void write(DetailDanmakuParam p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.forceOpenDanmaku);
          p1.writeInt(p0.openDanmakuPanel);
          if (p0.forceDanmakuPosition == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(1);
             p1.writeLong(p0.forceDanmakuPosition.longValue());
          }
          p1.writeString(p0.forceDanmakuId);
          p1.writeInt(p0.switchSupportType);
          p1.writeString(p0.openDanmakuSource);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public DetailDanmakuParam getParcel(){
       return this.detailDanmakuParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       DetailDanmakuParam$$Parcelable.write(this.detailDanmakuParam$$0, p0, p1, new a());
    }
}
