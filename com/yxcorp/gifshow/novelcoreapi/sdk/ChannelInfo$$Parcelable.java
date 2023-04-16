package com.yxcorp.gifshow.novelcoreapi.sdk.ChannelInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.novelcoreapi.sdk.ChannelInfo$$Parcelable$a;
import com.yxcorp.gifshow.novelcoreapi.sdk.ChannelInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.novelcoreapi.sdk.MarkInfo;
import com.yxcorp.gifshow.novelcoreapi.sdk.MarkInfo$$Parcelable;

public class ChannelInfo$$Parcelable implements Parcelable, d	// class@0021bd
{
    public ChannelInfo channelInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ChannelInfo$$Parcelable.CREATOR = new ChannelInfo$$Parcelable$a();
    }
    public void ChannelInfo$$Parcelable(ChannelInfo p0){
       super();
       this.channelInfo$$0 = p0;
    }
    public static ChannelInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ChannelInfo uChannelInfo = new ChannelInfo();
          p1.f(p1.g(), uChannelInfo);
          uChannelInfo.markInfo = MarkInfo$$Parcelable.read(p0, p1);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uChannelInfo.isDefault = b;
          uChannelInfo.name = p0.readString();
          uChannelInfo.icon = p0.readString();
          uChannelInfo.channelType = p0.readString();
          uChannelInfo.id = p0.readString();
          uChannelInfo.h5LandingUrl = p0.readString();
          p1.f(i, uChannelInfo);
          return uChannelInfo;
       }
    }
    public static void write(ChannelInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          MarkInfo$$Parcelable.write(p0.markInfo, p1, p2, p3);
          p1.writeInt(p0.isDefault);
          p1.writeString(p0.name);
          p1.writeString(p0.icon);
          p1.writeString(p0.channelType);
          p1.writeString(p0.id);
          p1.writeString(p0.h5LandingUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ChannelInfo getParcel(){
       return this.channelInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ChannelInfo$$Parcelable.write(this.channelInfo$$0, p0, p1, new a());
    }
}
