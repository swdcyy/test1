package com.kuaishou.android.model.user.ImGroupInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.user.ImGroupInfo$$Parcelable$a;
import com.kuaishou.android.model.user.ImGroupInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class ImGroupInfo$$Parcelable implements Parcelable, d	// class@000e98
{
    public ImGroupInfo imGroupInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ImGroupInfo$$Parcelable.CREATOR = new ImGroupInfo$$Parcelable$a();
    }
    public void ImGroupInfo$$Parcelable(ImGroupInfo p0){
       super();
       this.imGroupInfo$$0 = p0;
    }
    public static ImGroupInfo read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ImGroupInfo imGroupInfo = new ImGroupInfo();
          p1.f(p1.g(), imGroupInfo);
          imGroupInfo.mGroupName = p0.readString();
          imGroupInfo.mGroupTag = p0.readString();
          boolean i1 = p0.readInt();
          boolean b = false;
          if (i1 < 0) {
             uCDNUrlArray = null;
          }else {
             CDNUrl[] uCDNUrlArray1 = new CDNUrl[i1];
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray1[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
             uCDNUrlArray = uCDNUrlArray1;
          }
          imGroupInfo.mGroupHeadUrls = uCDNUrlArray;
          i1 = (p0.readInt() == 1)? true: false;
          imGroupInfo.mShowInProfile = i1;
          imGroupInfo.mMemberCount = p0.readInt();
          imGroupInfo.mGroupTagText = p0.readString();
          imGroupInfo.mGroupNumber = p0.readString();
          imGroupInfo.mGroupId = p0.readString();
          imGroupInfo.mIntroduction = p0.readString();
          if (p0.readInt() == 1) {
             b = true;
          }
          imGroupInfo.mShowed = b;
          p1.f(i, imGroupInfo);
          return imGroupInfo;
       }
    }
    public static void write(ImGroupInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mGroupName);
          p1.writeString(p0.mGroupTag);
          ImGroupInfo mGroupHeadUr = p0.mGroupHeadUrls;
          if (mGroupHeadUr == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mGroupHeadUr.length);
             mGroupHeadUr = p0.mGroupHeadUrls;
             i1 = mGroupHeadUr.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mGroupHeadUr[i2], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mShowInProfile);
          p1.writeInt(p0.mMemberCount);
          p1.writeString(p0.mGroupTagText);
          p1.writeString(p0.mGroupNumber);
          p1.writeString(p0.mGroupId);
          p1.writeString(p0.mIntroduction);
          p1.writeInt(p0.mShowed);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ImGroupInfo getParcel(){
       return this.imGroupInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ImGroupInfo$$Parcelable.write(this.imGroupInfo$$0, p0, p1, new a());
    }
}
