package com.kuaishou.android.model.ads.PhotoAdvertisement$WidgetInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WidgetInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WidgetInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$WidgetInfo$$Parcelable implements Parcelable, d	// class@000a65
{
    public PhotoAdvertisement$WidgetInfo widgetInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$WidgetInfo$$Parcelable.CREATOR = new PhotoAdvertisement$WidgetInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$WidgetInfo$$Parcelable(PhotoAdvertisement$WidgetInfo p0){
       super();
       this.widgetInfo$$0 = p0;
    }
    public static PhotoAdvertisement$WidgetInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$WidgetInfo widgetInfo = new PhotoAdvertisement$WidgetInfo();
          p1.f(p1.g(), widgetInfo);
          widgetInfo.mTemplateId = p0.readString();
          p1.f(i, widgetInfo);
          return widgetInfo;
       }
    }
    public static void write(PhotoAdvertisement$WidgetInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mTemplateId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$WidgetInfo getParcel(){
       return this.widgetInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$WidgetInfo$$Parcelable.write(this.widgetInfo$$0, p0, p1, new a());
    }
}