package com.kwai.components.nearbymodel.model.BoundaryBlankCard$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.nearbymodel.model.BoundaryBlankCard$$Parcelable$a;
import com.kwai.components.nearbymodel.model.BoundaryBlankCard;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kwai.components.nearbymodel.model.BoundaryBlankCard$Button;

public class BoundaryBlankCard$$Parcelable implements Parcelable, d	// class@000c5b
{
    public BoundaryBlankCard boundaryBlankCard$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       BoundaryBlankCard$$Parcelable.CREATOR = new BoundaryBlankCard$$Parcelable$a();
    }
    public void BoundaryBlankCard$$Parcelable(BoundaryBlankCard p0){
       super();
       this.boundaryBlankCard$$0 = p0;
    }
    public static BoundaryBlankCard read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          BoundaryBlankCard uBoundaryBla = new BoundaryBlankCard();
          p1.f(p1.g(), uBoundaryBla);
          uBoundaryBla.mButton = p0.readSerializable();
          uBoundaryBla.mText = p0.readString();
          uBoundaryBla.mIconUrl = p0.readString();
          p1.f(i, uBoundaryBla);
          return uBoundaryBla;
       }
    }
    public static void write(BoundaryBlankCard p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(p0.mButton);
          p1.writeString(p0.mText);
          p1.writeString(p0.mIconUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public BoundaryBlankCard getParcel(){
       return this.boundaryBlankCard$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       BoundaryBlankCard$$Parcelable.write(this.boundaryBlankCard$$0, p0, p1, new a());
    }
}
