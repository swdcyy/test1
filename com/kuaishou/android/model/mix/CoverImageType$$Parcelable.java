package com.kuaishou.android.model.mix.CoverImageType$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.CoverImageType$$Parcelable$a;
import com.kuaishou.android.model.mix.CoverImageType;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class CoverImageType$$Parcelable implements Parcelable, d	// class@000c38
{
    public CoverImageType coverImageType$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoverImageType$$Parcelable.CREATOR = new CoverImageType$$Parcelable$a();
    }
    public void CoverImageType$$Parcelable(CoverImageType p0){
       super();
       this.coverImageType$$0 = p0;
    }
    public static CoverImageType read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CoverImageType uCoverImageT = new CoverImageType();
          p1.f(p1.g(), uCoverImageT);
          uCoverImageT.mCoverThumbnailType = p0.readInt();
          uCoverImageT.mCoverType = p0.readInt();
          uCoverImageT.mFFCoverThumbnailType = p0.readInt();
          uCoverImageT.mCoronaInfoCoverType = p0.readInt();
          uCoverImageT.mOverrideCoverThumbnailType = p0.readInt();
          p1.f(i, uCoverImageT);
          return uCoverImageT;
       }
    }
    public static void write(CoverImageType p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mCoverThumbnailType);
          p1.writeInt(p0.mCoverType);
          p1.writeInt(p0.mFFCoverThumbnailType);
          p1.writeInt(p0.mCoronaInfoCoverType);
          p1.writeInt(p0.mOverrideCoverThumbnailType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoverImageType getParcel(){
       return this.coverImageType$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoverImageType$$Parcelable.write(this.coverImageType$$0, p0, p1, new a());
    }
}
