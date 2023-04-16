package com.kwai.components.feedmodel.OperationBarInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.feedmodel.OperationBarInfo$$Parcelable$a;
import com.kwai.components.feedmodel.OperationBarInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kwai.components.feedmodel.OperationBarInfo$RelatedVideoItem;
import com.kwai.components.feedmodel.OperationBarInfo$RelatedVideoItem$$Parcelable;
import com.kwai.components.feedmodel.OperationBarInfo$GeneralInfo;
import com.kwai.components.feedmodel.OperationBarInfo$GeneralInfo$$Parcelable;
import com.kwai.components.feedmodel.OperationBarInfo$TopTrendingItem;
import com.kwai.components.feedmodel.OperationBarInfo$TopTrendingItem$$Parcelable;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class OperationBarInfo$$Parcelable implements Parcelable, d	// class@000c1d
{
    public OperationBarInfo operationBarInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       OperationBarInfo$$Parcelable.CREATOR = new OperationBarInfo$$Parcelable$a();
    }
    public void OperationBarInfo$$Parcelable(OperationBarInfo p0){
       super();
       this.operationBarInfo$$0 = p0;
    }
    public static OperationBarInfo read(Parcel p0,a p1){
       List list;
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
          OperationBarInfo operationBar = new OperationBarInfo();
          p1.f(p1.g(), operationBar);
          operationBar.mIconWidth = p0.readInt();
          int i1 = 0;
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          operationBar.mIsExtraTrendingFeed = b;
          int i2 = p0.readInt();
          CDNUrl[] uCDNUrlArray = null;
          if (i2 < 0) {
             list = uCDNUrlArray;
          }else {
             uArrayList = new ArrayList(i2);
             for (i3 = 0; i3 < i2; i3 = i3 + 1) {
                uArrayList.add(OperationBarInfo$RelatedVideoItem$$Parcelable.read(p0, p1));
             }
          }
          operationBar.mRelatedPhotoList = list;
          operationBar.mLink = p0.readString();
          operationBar.mGeneralInfo = OperationBarInfo$GeneralInfo$$Parcelable.read(p0, p1);
          operationBar.mIconHeight = p0.readInt();
          operationBar.moreTrendingsLink = p0.readString();
          i2 = p0.readInt();
          if (i2 < 0) {
             list = uCDNUrlArray;
          }else {
             uArrayList = new ArrayList(i2);
             for (i3 = 0; i3 < i2; i3 = i3 + 1) {
                uArrayList.add(OperationBarInfo$TopTrendingItem$$Parcelable.read(p0, p1));
             }
          }
          operationBar.mTopTrendingList = list;
          operationBar.mId = p0.readString();
          operationBar.mDescTextColor = p0.readString();
          operationBar.mDesc = p0.readString();
          i2 = p0.readInt();
          if (i2 >= 0) {
             uCDNUrlArray = new CDNUrl[i2];
             for (; i1 < i2; i1 = i1 + 1) {
                uCDNUrlArray[i1] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          operationBar.mIconUrl = uCDNUrlArray;
          p1.f(i, operationBar);
          return operationBar;
       }
    }
    public static void write(OperationBarInfo p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mIconWidth);
          p1.writeInt(p0.mIsExtraTrendingFeed);
          OperationBarInfo mRelatedPhot = p0.mRelatedPhotoList;
          if (mRelatedPhot == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mRelatedPhot.size());
             iterator = p0.mRelatedPhotoList.iterator();
             while (iterator.hasNext()) {
                OperationBarInfo$RelatedVideoItem$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mLink);
          OperationBarInfo$GeneralInfo$$Parcelable.write(p0.mGeneralInfo, p1, p2, p3);
          p1.writeInt(p0.mIconHeight);
          p1.writeString(p0.moreTrendingsLink);
          mRelatedPhot = p0.mTopTrendingList;
          if (mRelatedPhot == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mRelatedPhot.size());
             iterator = p0.mTopTrendingList.iterator();
             while (iterator.hasNext()) {
                OperationBarInfo$TopTrendingItem$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mId);
          p1.writeString(p0.mDescTextColor);
          p1.writeString(p0.mDesc);
          mRelatedPhot = p0.mIconUrl;
          if (mRelatedPhot == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mRelatedPhot.length);
             p0 = p0.mIconUrl;
             i = p0.length;
             for (i1 = 0; i1 < i; i1 = i1 + 1) {
                CDNUrl$$Parcelable.write(p0[i1], p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public OperationBarInfo getParcel(){
       return this.operationBarInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       OperationBarInfo$$Parcelable.write(this.operationBarInfo$$0, p0, p1, new a());
    }
}
