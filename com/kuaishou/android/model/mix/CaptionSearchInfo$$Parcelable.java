package com.kuaishou.android.model.mix.CaptionSearchInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.CaptionSearchInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.CaptionSearchInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.Iterator;

public class CaptionSearchInfo$$Parcelable implements Parcelable, d	// class@000bd4
{
    public CaptionSearchInfo captionSearchInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CaptionSearchInfo$$Parcelable.CREATOR = new CaptionSearchInfo$$Parcelable$a();
    }
    public void CaptionSearchInfo$$Parcelable(CaptionSearchInfo p0){
       super();
       this.captionSearchInfo$$0 = p0;
    }
    public static CaptionSearchInfo read(Parcel p0,a p1){
       ArrayList uArrayList1;
       int i3;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CaptionSearchInfo uCaptionSear = new CaptionSearchInfo();
          p1.f(p1.g(), uCaptionSear);
          int i1 = p0.readInt();
          int i2 = 0;
          ArrayList uArrayList = null;
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(p0.readString());
             }
          }
          uCaptionSear.mSearchWordList = uArrayList1;
          uCaptionSear.mSessionId = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(p0.readString());
             }
          }
          uCaptionSear.mQueryIdList = uArrayList1;
          uCaptionSear.mCaptionSearchType = p0.readInt();
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                ArrayList uArrayList2 = (p0.readInt() < 0)? uArrayList: Integer.valueOf(p0.readInt());
                uArrayList1.add(uArrayList2);
             }
          }
          uCaptionSear.mOffsetList = uArrayList1;
          i1 = p0.readInt();
          if (i1 >= 0) {
             uArrayList = new ArrayList(i1);
             for (; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(p0.readString());
             }
          }
          uCaptionSear.mActionUrlList = uArrayList;
          p1.f(i, uCaptionSear);
          return uCaptionSear;
       }
    }
    public static void write(CaptionSearchInfo p0,Parcel p1,int p2,a p3){
       Iterator iterator1;
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          CaptionSearchInfo mSearchWordL = p0.mSearchWordList;
          if (mSearchWordL == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mSearchWordL.size());
             iterator1 = p0.mSearchWordList.iterator();
             while (iterator1.hasNext()) {
                p1.writeString(iterator1.next());
             }
          }
          p1.writeString(p0.mSessionId);
          mSearchWordL = p0.mQueryIdList;
          if (mSearchWordL == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mSearchWordL.size());
             iterator1 = p0.mQueryIdList.iterator();
             while (iterator1.hasNext()) {
                p1.writeString(iterator1.next());
             }
          }
          p1.writeInt(p0.mCaptionSearchType);
          mSearchWordL = p0.mOffsetList;
          if (mSearchWordL == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mSearchWordL.size());
             iterator1 = p0.mOffsetList.iterator();
             while (iterator1.hasNext()) {
                Integer integer = iterator1.next();
                if (integer == null) {
                   p1.writeInt(-1);
                }else {
                   p1.writeInt(1);
                   p1.writeInt(integer.intValue());
                }
             }
          }
          mSearchWordL = p0.mActionUrlList;
          if (mSearchWordL == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mSearchWordL.size());
             Iterator iterator = p0.mActionUrlList.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CaptionSearchInfo getParcel(){
       return this.captionSearchInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CaptionSearchInfo$$Parcelable.write(this.captionSearchInfo$$0, p0, p1, new a());
    }
}
