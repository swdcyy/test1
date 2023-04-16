package com.kuaishou.android.model.mix.PlcEntryStyleInfo$WeakStyleInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$WeakStyleInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$WeakStyleInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage$$Parcelable;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo$$Parcelable;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class PlcEntryStyleInfo$WeakStyleInfo$$Parcelable implements Parcelable, d	// class@000db0
{
    public PlcEntryStyleInfo$WeakStyleInfo weakStyleInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PlcEntryStyleInfo$WeakStyleInfo$$Parcelable.CREATOR = new PlcEntryStyleInfo$WeakStyleInfo$$Parcelable$a();
    }
    public void PlcEntryStyleInfo$WeakStyleInfo$$Parcelable(PlcEntryStyleInfo$WeakStyleInfo p0){
       super();
       this.weakStyleInfo$$0 = p0;
    }
    public static PlcEntryStyleInfo$WeakStyleInfo read(Parcel p0,a p1){
       List list1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PlcEntryStyleInfo$WeakStyleInfo weakStyleInf = new PlcEntryStyleInfo$WeakStyleInfo();
          p1.f(p1.g(), weakStyleInf);
          int i1 = 0;
          boolean b = true;
          boolean b1 = (p0.readInt() == b)? true: false;
          weakStyleInf.mHideAdTag = b1;
          weakStyleInf.mCategoryText = p0.readString();
          weakStyleInf.mTagPackage = PlcEntryStyleInfo$TagPackage$$Parcelable.read(p0, p1);
          weakStyleInf.mTagInfoText = p0.readString();
          weakStyleInf.mCategoryMaxLength = p0.readInt();
          b1 = (p0.readInt() == b)? true: false;
          weakStyleInf.mIsRoundCornerIcon = b1;
          if (p0.readInt() != b) {
             b = false;
          }
          weakStyleInf.mEnableForceClose = b;
          weakStyleInf.mStyleType = p0.readInt();
          weakStyleInf.mTKBundleInfo = PlcEntryStyleInfo$TKBundleInfo$$Parcelable.read(p0, p1);
          weakStyleInf.mWeakStyleSubType = p0.readInt();
          weakStyleInf.mIconUrl = p0.readString();
          b1 = p0.readInt();
          List list = null;
          if (b1 < 0) {
             list1 = list;
          }else {
             list1 = new ArrayList(b1);
             for (int i2 = 0; i2 < b1; i2 = i2 + 1) {
                list1.add(p0.readString());
             }
          }
          weakStyleInf.mLabels = list1;
          weakStyleInf.mTitle = p0.readString();
          b1 = p0.readInt();
          if (b1 >= 0) {
             list = new ArrayList(b1);
             for (; i1 < b1; i1 = i1 + 1) {
                list.add(CDNUrl$$Parcelable.read(p0, p1));
             }
          }
          weakStyleInf.mCDNUrls = list;
          weakStyleInf.mActionInfo = PlcEntryStyleInfo$ActionInfo$$Parcelable.read(p0, p1);
          p1.f(i, weakStyleInf);
          return weakStyleInf;
       }
    }
    public static void write(PlcEntryStyleInfo$WeakStyleInfo p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mHideAdTag);
          p1.writeString(p0.mCategoryText);
          PlcEntryStyleInfo$TagPackage$$Parcelable.write(p0.mTagPackage, p1, p2, p3);
          p1.writeString(p0.mTagInfoText);
          p1.writeInt(p0.mCategoryMaxLength);
          p1.writeInt(p0.mIsRoundCornerIcon);
          p1.writeInt(p0.mEnableForceClose);
          p1.writeInt(p0.mStyleType);
          PlcEntryStyleInfo$TKBundleInfo$$Parcelable.write(p0.mTKBundleInfo, p1, p2, p3);
          p1.writeInt(p0.mWeakStyleSubType);
          p1.writeString(p0.mIconUrl);
          PlcEntryStyleInfo$WeakStyleInfo mLabels = p0.mLabels;
          if (mLabels == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mLabels.size());
             iterator = p0.mLabels.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeString(p0.mTitle);
          mLabels = p0.mCDNUrls;
          if (mLabels == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mLabels.size());
             iterator = p0.mCDNUrls.iterator();
             while (iterator.hasNext()) {
                CDNUrl$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          PlcEntryStyleInfo$ActionInfo$$Parcelable.write(p0.mActionInfo, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PlcEntryStyleInfo$WeakStyleInfo getParcel(){
       return this.weakStyleInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PlcEntryStyleInfo$WeakStyleInfo$$Parcelable.write(this.weakStyleInfo$$0, p0, p1, new a());
    }
}
