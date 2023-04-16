package com.kuaishou.android.model.mix.PlcEntryStyleInfo$CoverStyleInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CoverStyleInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CoverStyleInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage$$Parcelable;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo$$Parcelable;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class PlcEntryStyleInfo$CoverStyleInfo$$Parcelable implements Parcelable, d	// class@000d82
{
    public PlcEntryStyleInfo$CoverStyleInfo coverStyleInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PlcEntryStyleInfo$CoverStyleInfo$$Parcelable.CREATOR = new PlcEntryStyleInfo$CoverStyleInfo$$Parcelable$a();
    }
    public void PlcEntryStyleInfo$CoverStyleInfo$$Parcelable(PlcEntryStyleInfo$CoverStyleInfo p0){
       super();
       this.coverStyleInfo$$0 = p0;
    }
    public static PlcEntryStyleInfo$CoverStyleInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PlcEntryStyleInfo$CoverStyleInfo uCoverStyleI = new PlcEntryStyleInfo$CoverStyleInfo();
          p1.f(p1.g(), uCoverStyleI);
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(p0.readString());
             }
             list = uArrayList;
          }
          uCoverStyleI.mLabels = list;
          uCoverStyleI.mTagPackage = PlcEntryStyleInfo$TagPackage$$Parcelable.read(p0, p1);
          uCoverStyleI.mCategoryMaxLength = p0.readInt();
          uCoverStyleI.mTitle = p0.readString();
          uCoverStyleI.mCategory = p0.readString();
          uCoverStyleI.mStyleType = p0.readInt();
          uCoverStyleI.mTKBundleInfo = PlcEntryStyleInfo$TKBundleInfo$$Parcelable.read(p0, p1);
          uCoverStyleI.mIconUrl = p0.readString();
          uCoverStyleI.mCoverStyleSubType = p0.readInt();
          uCoverStyleI.mActionInfo = PlcEntryStyleInfo$ActionInfo$$Parcelable.read(p0, p1);
          p1.f(i, uCoverStyleI);
          return uCoverStyleI;
       }
    }
    public static void write(PlcEntryStyleInfo$CoverStyleInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PlcEntryStyleInfo$CoverStyleInfo mLabels = p0.mLabels;
          if (mLabels == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mLabels.size());
             Iterator iterator = p0.mLabels.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          PlcEntryStyleInfo$TagPackage$$Parcelable.write(p0.mTagPackage, p1, p2, p3);
          p1.writeInt(p0.mCategoryMaxLength);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mCategory);
          p1.writeInt(p0.mStyleType);
          PlcEntryStyleInfo$TKBundleInfo$$Parcelable.write(p0.mTKBundleInfo, p1, p2, p3);
          p1.writeString(p0.mIconUrl);
          p1.writeInt(p0.mCoverStyleSubType);
          PlcEntryStyleInfo$ActionInfo$$Parcelable.write(p0.mActionInfo, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PlcEntryStyleInfo$CoverStyleInfo getParcel(){
       return this.coverStyleInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PlcEntryStyleInfo$CoverStyleInfo$$Parcelable.write(this.coverStyleInfo$$0, p0, p1, new a());
    }
}
