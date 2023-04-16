package com.kuaishou.android.model.mix.ChannelContentListInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.ChannelContentListInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.ChannelContentListInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class ChannelContentListInfo$$Parcelable implements Parcelable, d	// class@000be1
{
    public ChannelContentListInfo channelContentListInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ChannelContentListInfo$$Parcelable.CREATOR = new ChannelContentListInfo$$Parcelable$a();
    }
    public void ChannelContentListInfo$$Parcelable(ChannelContentListInfo p0){
       super();
       this.channelContentListInfo$$0 = p0;
    }
    public static ChannelContentListInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ChannelContentListInfo uChannelCont = new ChannelContentListInfo();
          p1.f(p1.g(), uChannelCont);
          uChannelCont.mContentListTitle = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uChannelCont.mShowContentList = b;
          p1.f(i, uChannelCont);
          return uChannelCont;
       }
    }
    public static void write(ChannelContentListInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mContentListTitle);
          p1.writeInt(p0.mShowContentList);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ChannelContentListInfo getParcel(){
       return this.channelContentListInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ChannelContentListInfo$$Parcelable.write(this.channelContentListInfo$$0, p0, p1, new a());
    }
}
