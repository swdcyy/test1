package com.kwai.feature.api.feed.growth.model.HotInsertPageStartUpConfig$InsertPageItemConfig$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.feed.growth.model.HotInsertPageStartUpConfig$InsertPageItemConfig$$Parcelable$a;
import com.kwai.feature.api.feed.growth.model.HotInsertPageStartUpConfig$InsertPageItemConfig;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class HotInsertPageStartUpConfig$InsertPageItemConfig$$Parcelable implements Parcelable, d	// class@000ec5
{
    public HotInsertPageStartUpConfig$InsertPageItemConfig insertPageItemConfig$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       HotInsertPageStartUpConfig$InsertPageItemConfig$$Parcelable.CREATOR = new HotInsertPageStartUpConfig$InsertPageItemConfig$$Parcelable$a();
    }
    public void HotInsertPageStartUpConfig$InsertPageItemConfig$$Parcelable(HotInsertPageStartUpConfig$InsertPageItemConfig p0){
       super();
       this.insertPageItemConfig$$0 = p0;
    }
    public static HotInsertPageStartUpConfig$InsertPageItemConfig read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          HotInsertPageStartUpConfig$InsertPageItemConfig insertPageIt = new HotInsertPageStartUpConfig$InsertPageItemConfig();
          p1.f(p1.g(), insertPageIt);
          insertPageIt.mShakeLimit = p0.readString();
          insertPageIt.mDisplayCycle = p0.readString();
          insertPageIt.mDayDisplayLimit = p0.readString();
          insertPageIt.mHeadTitle = p0.readString();
          insertPageIt.mPriority = p0.readString();
          insertPageIt.mPagePhotoId = p0.readString();
          insertPageIt.mPageCount = p0.readInt();
          insertPageIt.mMonthDisplayLimit = p0.readString();
          insertPageIt.mSubTitle = p0.readString();
          p1.f(i, insertPageIt);
          return insertPageIt;
       }
    }
    public static void write(HotInsertPageStartUpConfig$InsertPageItemConfig p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mShakeLimit);
          p1.writeString(p0.mDisplayCycle);
          p1.writeString(p0.mDayDisplayLimit);
          p1.writeString(p0.mHeadTitle);
          p1.writeString(p0.mPriority);
          p1.writeString(p0.mPagePhotoId);
          p1.writeInt(p0.mPageCount);
          p1.writeString(p0.mMonthDisplayLimit);
          p1.writeString(p0.mSubTitle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public HotInsertPageStartUpConfig$InsertPageItemConfig getParcel(){
       return this.insertPageItemConfig$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       HotInsertPageStartUpConfig$InsertPageItemConfig$$Parcelable.write(this.insertPageItemConfig$$0, p0, p1, new a());
    }
}
