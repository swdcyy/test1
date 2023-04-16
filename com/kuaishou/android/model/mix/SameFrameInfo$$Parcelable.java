package com.kuaishou.android.model.mix.SameFrameInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.SameFrameInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.SameFrameInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kuaishou.android.model.mix.SameFrameModel;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class SameFrameInfo$$Parcelable implements Parcelable, d	// class@000de9
{
    public SameFrameInfo sameFrameInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SameFrameInfo$$Parcelable.CREATOR = new SameFrameInfo$$Parcelable$a();
    }
    public void SameFrameInfo$$Parcelable(SameFrameInfo p0){
       super();
       this.sameFrameInfo$$0 = p0;
    }
    public static SameFrameInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SameFrameInfo sameFrameInf = new SameFrameInfo();
          p1.f(p1.g(), sameFrameInf);
          sameFrameInf.mAvailableDepth = p0.readInt();
          sameFrameInf.mSameFrameModel = p0.readSerializable();
          sameFrameInf.mCurrentDepth = p0.readInt();
          boolean i1 = p0.readInt();
          boolean b = false;
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(CDNUrl$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          sameFrameInf.mLrcUrls = list;
          sameFrameInf.mOriginPhotoId = p0.readString();
          sameFrameInf.mUserName = p0.readString();
          i1 = (p0.readInt() == 1)? true: false;
          sameFrameInf.mShowSameFrameCurrentTag = i1;
          if (p0.readInt() == 1) {
             b = true;
          }
          sameFrameInf.mAllowSameFrame = b;
          p1.f(i, sameFrameInf);
          return sameFrameInf;
       }
    }
    public static void write(SameFrameInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mAvailableDepth);
          p1.writeSerializable(p0.mSameFrameModel);
          p1.writeInt(p0.mCurrentDepth);
          SameFrameInfo mLrcUrls = p0.mLrcUrls;
          if (mLrcUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mLrcUrls.size());
             Iterator iterator = p0.mLrcUrls.iterator();
             while (iterator.hasNext()) {
                CDNUrl$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mOriginPhotoId);
          p1.writeString(p0.mUserName);
          p1.writeInt(p0.mShowSameFrameCurrentTag);
          p1.writeInt(p0.mAllowSameFrame);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SameFrameInfo getParcel(){
       return this.sameFrameInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SameFrameInfo$$Parcelable.write(this.sameFrameInfo$$0, p0, p1, new a());
    }
}
