package com.kuaishou.android.model.ads.PhotoAdvertisement$AdCardTemplateInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCardTemplateInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCardTemplateInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$AdCardTemplateInfo$$Parcelable implements Parcelable, d	// class@000898
{
    public PhotoAdvertisement$AdCardTemplateInfo adCardTemplateInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$AdCardTemplateInfo$$Parcelable.CREATOR = new PhotoAdvertisement$AdCardTemplateInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$AdCardTemplateInfo$$Parcelable(PhotoAdvertisement$AdCardTemplateInfo p0){
       super();
       this.adCardTemplateInfo$$0 = p0;
    }
    public static PhotoAdvertisement$AdCardTemplateInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$AdCardTemplateInfo uAdCardTempl = new PhotoAdvertisement$AdCardTemplateInfo();
          p1.f(p1.g(), uAdCardTempl);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uAdCardTempl.mUseTemplate = b;
          uAdCardTempl.mAnimationStyle = p0.readInt();
          uAdCardTempl.mDefaultIconUrl = p0.readString();
          uAdCardTempl.mDefaultTitle = p0.readString();
          uAdCardTempl.mDefaultActionbarTxt = p0.readString();
          uAdCardTempl.mTemplateId = p0.readString();
          uAdCardTempl.mDefaultBgColor = p0.readString();
          p1.f(i, uAdCardTempl);
          return uAdCardTempl;
       }
    }
    public static void write(PhotoAdvertisement$AdCardTemplateInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mUseTemplate);
          p1.writeInt(p0.mAnimationStyle);
          p1.writeString(p0.mDefaultIconUrl);
          p1.writeString(p0.mDefaultTitle);
          p1.writeString(p0.mDefaultActionbarTxt);
          p1.writeString(p0.mTemplateId);
          p1.writeString(p0.mDefaultBgColor);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$AdCardTemplateInfo getParcel(){
       return this.adCardTemplateInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$AdCardTemplateInfo$$Parcelable.write(this.adCardTemplateInfo$$0, p0, p1, new a());
    }
}
