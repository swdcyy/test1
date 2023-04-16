package com.kuaishou.android.model.mix.PostShowInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PostShowInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.PostShowInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class PostShowInfo$$Parcelable implements Parcelable, d	// class@000db9
{
    public PostShowInfo postShowInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PostShowInfo$$Parcelable.CREATOR = new PostShowInfo$$Parcelable$a();
    }
    public void PostShowInfo$$Parcelable(PostShowInfo p0){
       super();
       this.postShowInfo$$0 = p0;
    }
    public static PostShowInfo read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PostShowInfo postShowInfo = new PostShowInfo();
          p1.f(p1.g(), postShowInfo);
          int i1 = p0.readInt();
          CDNUrl[] uCDNUrlArray = null;
          int i2 = 0;
          if (i1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          postShowInfo.mIcon = uCDNUrlArray1;
          postShowInfo.mJumpUrl = p0.readString();
          i1 = p0.readInt();
          if (i1 >= 0) {
             uCDNUrlArray = new CDNUrl[i1];
             for (; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          postShowInfo.mRightTopIcon = uCDNUrlArray;
          postShowInfo.mType = p0.readInt();
          p1.f(i, postShowInfo);
          return postShowInfo;
       }
    }
    public static void write(PostShowInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PostShowInfo mIcon = p0.mIcon;
          int i2 = 0;
          if (mIcon == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mIcon.length);
             mIcon = p0.mIcon;
             int len = mIcon.length;
             for (int i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mIcon[i3], p1, p2, p3);
             }
          }
          p1.writeString(p0.mJumpUrl);
          mIcon = p0.mRightTopIcon;
          if (mIcon == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mIcon.length);
             mIcon = p0.mRightTopIcon;
             i1 = mIcon.length;
             for (; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mIcon[i2], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PostShowInfo getParcel(){
       return this.postShowInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PostShowInfo$$Parcelable.write(this.postShowInfo$$0, p0, p1, new a());
    }
}
