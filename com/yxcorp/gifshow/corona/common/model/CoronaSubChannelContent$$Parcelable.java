package com.yxcorp.gifshow.corona.common.model.CoronaSubChannelContent$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelContent$$Parcelable$a;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelContent;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.util.ArrayList;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelFeedMeta;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelFeedMeta$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class CoronaSubChannelContent$$Parcelable implements Parcelable, d	// class@001215
{
    public CoronaSubChannelContent coronaSubChannelContent$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaSubChannelContent$$Parcelable.CREATOR = new CoronaSubChannelContent$$Parcelable$a();
    }
    public void CoronaSubChannelContent$$Parcelable(CoronaSubChannelContent p0){
       super();
       this.coronaSubChannelContent$$0 = p0;
    }
    public static CoronaSubChannelContent read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i3;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CoronaSubChannelContent uCoronaSubCh = new CoronaSubChannelContent();
          p1.f(p1.g(), uCoronaSubCh);
          int i1 = p0.readInt();
          List list = null;
          int i2 = 0;
          if (i1 < 0) {
             uCDNUrlArray = list;
          }else {
             uCDNUrlArray = new CDNUrl[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          uCoronaSubCh.mMoreSubTabIconUrls = uCDNUrlArray;
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray = list;
          }else {
             uCDNUrlArray = new CDNUrl[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          uCoronaSubCh.mMoreSubTabDarkIconUrls = uCDNUrlArray;
          uCoronaSubCh.mSubEntranceAllPosition = p0.readInt();
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (; i2 < i1; i2 = i2 + 1) {
                list.add(CoronaSubChannelFeedMeta$$Parcelable.read(p0, p1));
             }
          }
          uCoronaSubCh.mCoronaSubChannelFeedMetas = list;
          uCoronaSubCh.mMaxSubTabToDisplay = p0.readInt();
          uCoronaSubCh.mSortType = p0.readInt();
          p1.f(i, uCoronaSubCh);
          return uCoronaSubCh;
       }
    }
    public static void write(CoronaSubChannelContent p0,Parcel p1,int p2,a p3){
       int len;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          CoronaSubChannelContent mMoreSubTabI = p0.mMoreSubTabIconUrls;
          int i2 = 0;
          if (mMoreSubTabI == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mMoreSubTabI.length);
             mMoreSubTabI = p0.mMoreSubTabIconUrls;
             len = mMoreSubTabI.length;
             for (int i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mMoreSubTabI[i3], p1, p2, p3);
             }
          }
          mMoreSubTabI = p0.mMoreSubTabDarkIconUrls;
          if (mMoreSubTabI == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mMoreSubTabI.length);
             mMoreSubTabI = p0.mMoreSubTabDarkIconUrls;
             len = mMoreSubTabI.length;
             for (; i2 < len; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mMoreSubTabI[i2], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mSubEntranceAllPosition);
          mMoreSubTabI = p0.mCoronaSubChannelFeedMetas;
          if (mMoreSubTabI == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mMoreSubTabI.size());
             Iterator iterator = p0.mCoronaSubChannelFeedMetas.iterator();
             while (iterator.hasNext()) {
                CoronaSubChannelFeedMeta$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mMaxSubTabToDisplay);
          p1.writeInt(p0.mSortType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaSubChannelContent getParcel(){
       return this.coronaSubChannelContent$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaSubChannelContent$$Parcelable.write(this.coronaSubChannelContent$$0, p0, p1, new a());
    }
}
