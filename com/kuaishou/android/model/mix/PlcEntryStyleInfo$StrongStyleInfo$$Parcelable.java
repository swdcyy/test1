package com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage$$Parcelable;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo$$Parcelable;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo$$Parcelable;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleItem;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleItem$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class PlcEntryStyleInfo$StrongStyleInfo$$Parcelable implements Parcelable, d	// class@000d91
{
    public PlcEntryStyleInfo$StrongStyleInfo strongStyleInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PlcEntryStyleInfo$StrongStyleInfo$$Parcelable.CREATOR = new PlcEntryStyleInfo$StrongStyleInfo$$Parcelable$a();
    }
    public void PlcEntryStyleInfo$StrongStyleInfo$$Parcelable(PlcEntryStyleInfo$StrongStyleInfo p0){
       super();
       this.strongStyleInfo$$0 = p0;
    }
    public static PlcEntryStyleInfo$StrongStyleInfo read(Parcel p0,a p1){
       List list1;
       List list2;
       ArrayList uArrayList;
       int i2;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PlcEntryStyleInfo$StrongStyleInfo strongStyleI = new PlcEntryStyleInfo$StrongStyleInfo();
          p1.f(p1.g(), strongStyleI);
          int i1 = 0;
          boolean b = true;
          boolean b1 = (p0.readInt() == b)? true: false;
          strongStyleI.mHideAdTag = b1;
          strongStyleI.mHighlightLabel = p0.readString();
          strongStyleI.mCategoryText = p0.readString();
          strongStyleI.mStrongStyleSubType = p0.readInt();
          strongStyleI.mTagPackage = PlcEntryStyleInfo$TagPackage$$Parcelable.read(p0, p1);
          b1 = p0.readInt();
          List list = null;
          if (b1 < 0) {
             list1 = list;
          }else {
             list1 = new ArrayList(b1);
             for (int i3 = 0; i3 < b1; i3 = i3 + 1) {
                list1.add(CDNUrl$$Parcelable.read(p0, p1));
             }
          }
          strongStyleI.mAtmosphereBar = list1;
          strongStyleI.mTagInfoText = p0.readString();
          strongStyleI.mCategoryMaxLength = p0.readInt();
          b1 = (p0.readInt() == b)? true: false;
          strongStyleI.mEnableForceClose = b1;
          if (p0.readInt() != b) {
             b = false;
          }
          strongStyleI.mIsRoundCornerIcon = b;
          strongStyleI.mStyleType = p0.readInt();
          strongStyleI.mTKBundleInfo = PlcEntryStyleInfo$TKBundleInfo$$Parcelable.read(p0, p1);
          strongStyleI.mIconUrl = p0.readString();
          strongStyleI.mIconLeftLabel = p0.readString();
          b1 = p0.readInt();
          if (b1 < 0) {
             list2 = list;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(p0.readString());
             }
          }
          strongStyleI.mLabels = list2;
          strongStyleI.mHighlightLabelColor = p0.readString();
          strongStyleI.mHighlightIcon = p0.readString();
          b1 = p0.readInt();
          if (b1 < 0) {
             list2 = list;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(CDNUrl$$Parcelable.read(p0, p1));
             }
          }
          strongStyleI.mCDNUrls = list2;
          strongStyleI.mTitle = p0.readString();
          b1 = p0.readInt();
          if (b1 < 0) {
             list2 = list;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(p0.readString());
             }
          }
          strongStyleI.mMultiHighlightLabels = list2;
          strongStyleI.mActionInfo = PlcEntryStyleInfo$ActionInfo$$Parcelable.read(p0, p1);
          b1 = p0.readInt();
          if (b1 >= 0) {
             list = new ArrayList(b1);
             for (; i1 < b1; i1 = i1 + 1) {
                list.add(PlcEntryStyleInfo$StrongStyleItem$$Parcelable.read(p0, p1));
             }
          }
          strongStyleI.mStrongStyleItems = list;
          p1.f(i, strongStyleI);
          return strongStyleI;
       }
    }
    public static void write(PlcEntryStyleInfo$StrongStyleInfo p0,Parcel p1,int p2,a p3){
       Iterator iterator1;
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mHideAdTag);
          p1.writeString(p0.mHighlightLabel);
          p1.writeString(p0.mCategoryText);
          p1.writeInt(p0.mStrongStyleSubType);
          PlcEntryStyleInfo$TagPackage$$Parcelable.write(p0.mTagPackage, p1, p2, p3);
          PlcEntryStyleInfo$StrongStyleInfo mAtmosphereB = p0.mAtmosphereBar;
          if (mAtmosphereB == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mAtmosphereB.size());
             iterator1 = p0.mAtmosphereBar.iterator();
             while (iterator1.hasNext()) {
                CDNUrl$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mTagInfoText);
          p1.writeInt(p0.mCategoryMaxLength);
          p1.writeInt(p0.mEnableForceClose);
          p1.writeInt(p0.mIsRoundCornerIcon);
          p1.writeInt(p0.mStyleType);
          PlcEntryStyleInfo$TKBundleInfo$$Parcelable.write(p0.mTKBundleInfo, p1, p2, p3);
          p1.writeString(p0.mIconUrl);
          p1.writeString(p0.mIconLeftLabel);
          mAtmosphereB = p0.mLabels;
          if (mAtmosphereB == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mAtmosphereB.size());
             iterator1 = p0.mLabels.iterator();
             while (iterator1.hasNext()) {
                p1.writeString(iterator1.next());
             }
          }
          p1.writeString(p0.mHighlightLabelColor);
          p1.writeString(p0.mHighlightIcon);
          mAtmosphereB = p0.mCDNUrls;
          if (mAtmosphereB == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mAtmosphereB.size());
             iterator1 = p0.mCDNUrls.iterator();
             while (iterator1.hasNext()) {
                CDNUrl$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mTitle);
          mAtmosphereB = p0.mMultiHighlightLabels;
          if (mAtmosphereB == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mAtmosphereB.size());
             iterator1 = p0.mMultiHighlightLabels.iterator();
             while (iterator1.hasNext()) {
                p1.writeString(iterator1.next());
             }
          }
          PlcEntryStyleInfo$ActionInfo$$Parcelable.write(p0.mActionInfo, p1, p2, p3);
          mAtmosphereB = p0.mStrongStyleItems;
          if (mAtmosphereB == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mAtmosphereB.size());
             Iterator iterator = p0.mStrongStyleItems.iterator();
             while (iterator.hasNext()) {
                PlcEntryStyleInfo$StrongStyleItem$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PlcEntryStyleInfo$StrongStyleInfo getParcel(){
       return this.strongStyleInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PlcEntryStyleInfo$StrongStyleInfo$$Parcelable.write(this.strongStyleInfo$$0, p0, p1, new a());
    }
}
