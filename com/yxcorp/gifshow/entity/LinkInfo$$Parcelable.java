package com.yxcorp.gifshow.entity.LinkInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.entity.LinkInfo$$Parcelable$a;
import com.yxcorp.gifshow.entity.LinkInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class LinkInfo$$Parcelable implements Parcelable, d	// class@000d67
{
    public LinkInfo linkInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LinkInfo$$Parcelable.CREATOR = new LinkInfo$$Parcelable$a();
    }
    public void LinkInfo$$Parcelable(LinkInfo p0){
       super();
       this.linkInfo$$0 = p0;
    }
    public static LinkInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          LinkInfo linkInfo = new LinkInfo();
          p1.f(p1.g(), linkInfo);
          linkInfo.mUrl = p0.readString();
          linkInfo.mSourceIconUrl = p0.readString();
          linkInfo.mTitle = p0.readString();
          linkInfo.mName = p0.readString();
          linkInfo.mStyle = p0.readInt();
          linkInfo.mDesc = p0.readString();
          linkInfo.mIconUrl = p0.readString();
          p1.f(i, linkInfo);
          return linkInfo;
       }
    }
    public static void write(LinkInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mUrl);
          p1.writeString(p0.mSourceIconUrl);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mName);
          p1.writeInt(p0.mStyle);
          p1.writeString(p0.mDesc);
          p1.writeString(p0.mIconUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LinkInfo getParcel(){
       return this.linkInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LinkInfo$$Parcelable.write(this.linkInfo$$0, p0, p1, new a());
    }
}
