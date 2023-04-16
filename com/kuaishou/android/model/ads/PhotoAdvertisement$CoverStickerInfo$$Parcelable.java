package com.kuaishou.android.model.ads.PhotoAdvertisement$CoverStickerInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverStickerInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverStickerInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverSticker;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverSticker$$Parcelable;

public class PhotoAdvertisement$CoverStickerInfo$$Parcelable implements Parcelable, d	// class@000913
{
    public PhotoAdvertisement$CoverStickerInfo coverStickerInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$CoverStickerInfo$$Parcelable.CREATOR = new PhotoAdvertisement$CoverStickerInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$CoverStickerInfo$$Parcelable(PhotoAdvertisement$CoverStickerInfo p0){
       super();
       this.coverStickerInfo$$0 = p0;
    }
    public static PhotoAdvertisement$CoverStickerInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$CoverStickerInfo uCoverSticke = new PhotoAdvertisement$CoverStickerInfo();
          p1.f(p1.g(), uCoverSticke);
          uCoverSticke.mImageUrl = p0.readString();
          uCoverSticke.mCoverSticker = PhotoAdvertisement$CoverSticker$$Parcelable.read(p0, p1);
          uCoverSticke.mStickerTitle = p0.readString();
          p1.f(i, uCoverSticke);
          return uCoverSticke;
       }
    }
    public static void write(PhotoAdvertisement$CoverStickerInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mImageUrl);
          PhotoAdvertisement$CoverSticker$$Parcelable.write(p0.mCoverSticker, p1, p2, p3);
          p1.writeString(p0.mStickerTitle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$CoverStickerInfo getParcel(){
       return this.coverStickerInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$CoverStickerInfo$$Parcelable.write(this.coverStickerInfo$$0, p0, p1, new a());
    }
}
