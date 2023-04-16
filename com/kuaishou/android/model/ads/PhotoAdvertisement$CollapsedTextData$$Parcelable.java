package com.kuaishou.android.model.ads.PhotoAdvertisement$CollapsedTextData$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CollapsedTextData$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CollapsedTextData;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$CollapsedTextData$$Parcelable implements Parcelable, d	// class@0008df
{
    public PhotoAdvertisement$CollapsedTextData collapsedTextData$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$CollapsedTextData$$Parcelable.CREATOR = new PhotoAdvertisement$CollapsedTextData$$Parcelable$a();
    }
    public void PhotoAdvertisement$CollapsedTextData$$Parcelable(PhotoAdvertisement$CollapsedTextData p0){
       super();
       this.collapsedTextData$$0 = p0;
    }
    public static PhotoAdvertisement$CollapsedTextData read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$CollapsedTextData uCollapsedTe = new PhotoAdvertisement$CollapsedTextData();
          p1.f(p1.g(), uCollapsedTe);
          uCollapsedTe.mContent = p0.readString();
          uCollapsedTe.mMinLineCount = p0.readInt();
          p1.f(i, uCollapsedTe);
          return uCollapsedTe;
       }
    }
    public static void write(PhotoAdvertisement$CollapsedTextData p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mContent);
          p1.writeInt(p0.mMinLineCount);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$CollapsedTextData getParcel(){
       return this.collapsedTextData$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$CollapsedTextData$$Parcelable.write(this.collapsedTextData$$0, p0, p1, new a());
    }
}
