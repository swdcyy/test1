package com.kwai.feature.api.social.message.imshare.model.ShareGroupInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.social.message.imshare.model.ShareGroupInfo$$Parcelable$a;
import com.kwai.feature.api.social.message.imshare.model.ShareGroupInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class ShareGroupInfo$$Parcelable implements Parcelable, d	// class@00115f
{
    public ShareGroupInfo shareGroupInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ShareGroupInfo$$Parcelable.CREATOR = new ShareGroupInfo$$Parcelable$a();
    }
    public void ShareGroupInfo$$Parcelable(ShareGroupInfo p0){
       super();
       this.shareGroupInfo$$0 = p0;
    }
    public static ShareGroupInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          ShareGroupInfo shareGroupIn = new ShareGroupInfo();
          p1.f(p1.g(), shareGroupIn);
          shareGroupIn.mGroupName = p0.readString();
          shareGroupIn.mShareSource = p0.readInt();
          shareGroupIn.mGroupNo = p0.readString();
          shareGroupIn.mShareContent = p0.readInt();
          shareGroupIn.mGroupId = p0.readString();
          shareGroupIn.mGroupMemberCount = p0.readInt();
          p1.f(i, shareGroupIn);
          return shareGroupIn;
       }
    }
    public static void write(ShareGroupInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mGroupName);
          p1.writeInt(p0.mShareSource);
          p1.writeString(p0.mGroupNo);
          p1.writeInt(p0.mShareContent);
          p1.writeString(p0.mGroupId);
          p1.writeInt(p0.mGroupMemberCount);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ShareGroupInfo getParcel(){
       return this.shareGroupInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ShareGroupInfo$$Parcelable.write(this.shareGroupInfo$$0, p0, p1, new a());
    }
}
