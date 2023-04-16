package com.kwai.feature.api.social.message.model.IMShareTargetInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.social.message.model.IMShareTargetInfo$$Parcelable$a;
import com.kwai.feature.api.social.message.model.IMShareTargetInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class IMShareTargetInfo$$Parcelable implements Parcelable, d	// class@001171
{
    public IMShareTargetInfo iMShareTargetInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       IMShareTargetInfo$$Parcelable.CREATOR = new IMShareTargetInfo$$Parcelable$a();
    }
    public void IMShareTargetInfo$$Parcelable(IMShareTargetInfo p0){
       super();
       this.iMShareTargetInfo$$0 = p0;
    }
    public static IMShareTargetInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          IMShareTargetInfo iMShareTarge = new IMShareTargetInfo();
          p1.f(p1.g(), iMShareTarge);
          int i1 = p0.readInt();
          CDNUrl[] uCDNUrlArray = null;
          int i2 = 0;
          if (i1 < 0) {
             list = uCDNUrlArray;
          }else {
             list = new ArrayList(i1);
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                list.add(p0.readString());
             }
          }
          iMShareTarge.mTopMembers = list;
          iMShareTarge.mRelationType = p0.readInt();
          iMShareTarge.mTargetType = p0.readInt();
          iMShareTarge.mSex = p0.readString();
          iMShareTarge.mName = p0.readString();
          iMShareTarge.mHeadUrl = p0.readString();
          i1 = p0.readInt();
          if (i1 >= 0) {
             uCDNUrlArray = new CDNUrl[i1];
             for (; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          iMShareTarge.mHeadUrls = uCDNUrlArray;
          iMShareTarge.mGroupMemberCount = p0.readInt();
          iMShareTarge.mTargetId = p0.readString();
          p1.f(i, iMShareTarge);
          return iMShareTarge;
       }
    }
    public static void write(IMShareTargetInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          IMShareTargetInfo mTopMembers = p0.mTopMembers;
          if (mTopMembers == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mTopMembers.size());
             Iterator iterator = p0.mTopMembers.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeInt(p0.mRelationType);
          p1.writeInt(p0.mTargetType);
          p1.writeString(p0.mSex);
          p1.writeString(p0.mName);
          p1.writeString(p0.mHeadUrl);
          mTopMembers = p0.mHeadUrls;
          if (mTopMembers == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mTopMembers.length);
             mTopMembers = p0.mHeadUrls;
             i1 = mTopMembers.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mTopMembers[i2], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mGroupMemberCount);
          p1.writeString(p0.mTargetId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public IMShareTargetInfo getParcel(){
       return this.iMShareTargetInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       IMShareTargetInfo$$Parcelable.write(this.iMShareTargetInfo$$0, p0, p1, new a());
    }
}
