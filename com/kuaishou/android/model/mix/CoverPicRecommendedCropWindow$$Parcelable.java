package com.kuaishou.android.model.mix.CoverPicRecommendedCropWindow$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.CoverPicRecommendedCropWindow$$Parcelable$a;
import com.kuaishou.android.model.mix.CoverPicRecommendedCropWindow;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class CoverPicRecommendedCropWindow$$Parcelable implements Parcelable, d	// class@000c51
{
    public CoverPicRecommendedCropWindow coverPicRecommendedCropWindow$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoverPicRecommendedCropWindow$$Parcelable.CREATOR = new CoverPicRecommendedCropWindow$$Parcelable$a();
    }
    public void CoverPicRecommendedCropWindow$$Parcelable(CoverPicRecommendedCropWindow p0){
       super();
       this.coverPicRecommendedCropWindow$$0 = p0;
    }
    public static CoverPicRecommendedCropWindow read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CoverPicRecommendedCropWindow uCoverPicRec = new CoverPicRecommendedCropWindow();
          p1.f(p1.g(), uCoverPicRec);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uCoverPicRec.mIsCropValid = b;
          uCoverPicRec.mCropWidth = p0.readInt();
          uCoverPicRec.mCropHeight = p0.readInt();
          uCoverPicRec.mBeginX = p0.readInt();
          uCoverPicRec.mPhotoWidth = p0.readInt();
          uCoverPicRec.mPhotoHeight = p0.readInt();
          uCoverPicRec.mBeginY = p0.readInt();
          p1.f(i, uCoverPicRec);
          return uCoverPicRec;
       }
    }
    public static void write(CoverPicRecommendedCropWindow p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mIsCropValid);
          p1.writeInt(p0.mCropWidth);
          p1.writeInt(p0.mCropHeight);
          p1.writeInt(p0.mBeginX);
          p1.writeInt(p0.mPhotoWidth);
          p1.writeInt(p0.mPhotoHeight);
          p1.writeInt(p0.mBeginY);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoverPicRecommendedCropWindow getParcel(){
       return this.coverPicRecommendedCropWindow$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoverPicRecommendedCropWindow$$Parcelable.write(this.coverPicRecommendedCropWindow$$0, p0, p1, new a());
    }
}
