package com.kwai.framework.model.channel.HotChannel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.channel.HotChannel$$Parcelable$a;
import com.kwai.framework.model.channel.HotChannel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class HotChannel$$Parcelable implements Parcelable, d	// class@001689
{
    public HotChannel hotChannel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       HotChannel$$Parcelable.CREATOR = new HotChannel$$Parcelable$a();
    }
    public void HotChannel$$Parcelable(HotChannel p0){
       super();
       this.hotChannel$$0 = p0;
    }
    public static HotChannel read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          HotChannel hotChannel = new HotChannel();
          p1.f(p1.g(), hotChannel);
          hotChannel.mNameSc = p0.readString();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          hotChannel.mHasCoronaId = b1;
          hotChannel.mH5Url = p0.readString();
          hotChannel.mIndicatorColor = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          hotChannel.mTeenageMode = b1;
          hotChannel.mId = p0.readString();
          hotChannel.mNameEn = p0.readString();
          hotChannel.mNameTc = p0.readString();
          hotChannel.mIconUrl = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          hotChannel.disableEdit = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          hotChannel.mIsLive = b;
          hotChannel.mCoronaId = p0.readInt();
          hotChannel.mName = p0.readString();
          hotChannel.mTabType = p0.readInt();
          hotChannel.mSubChannelId = p0.readString();
          hotChannel.mIndex = p0.readInt();
          p1.f(i, hotChannel);
          return hotChannel;
       }
    }
    public static void write(HotChannel p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mNameSc);
          p1.writeInt(p0.mHasCoronaId);
          p1.writeString(p0.mH5Url);
          p1.writeString(p0.mIndicatorColor);
          p1.writeInt(p0.mTeenageMode);
          p1.writeString(p0.mId);
          p1.writeString(p0.mNameEn);
          p1.writeString(p0.mNameTc);
          p1.writeString(p0.mIconUrl);
          p1.writeInt(p0.disableEdit);
          p1.writeInt(p0.mIsLive);
          p1.writeInt(p0.mCoronaId);
          p1.writeString(p0.mName);
          p1.writeInt(p0.mTabType);
          p1.writeString(p0.mSubChannelId);
          p1.writeInt(p0.mIndex);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public HotChannel getParcel(){
       return this.hotChannel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       HotChannel$$Parcelable.write(this.hotChannel$$0, p0, p1, new a());
    }
}
