package com.kwai.components.nearbymodel.model.BoundaryText$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.nearbymodel.model.BoundaryText$$Parcelable$a;
import com.kwai.components.nearbymodel.model.BoundaryText;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class BoundaryText$$Parcelable implements Parcelable, d	// class@000c67
{
    public BoundaryText boundaryText$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       BoundaryText$$Parcelable.CREATOR = new BoundaryText$$Parcelable$a();
    }
    public void BoundaryText$$Parcelable(BoundaryText p0){
       super();
       this.boundaryText$$0 = p0;
    }
    public static BoundaryText read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          BoundaryText uBoundaryTex = new BoundaryText();
          p1.f(p1.g(), uBoundaryTex);
          uBoundaryTex.mColor = p0.readString();
          uBoundaryTex.mText = p0.readString();
          uBoundaryTex.mFontWeight = p0.readString();
          p1.f(i, uBoundaryTex);
          return uBoundaryTex;
       }
    }
    public static void write(BoundaryText p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mColor);
          p1.writeString(p0.mText);
          p1.writeString(p0.mFontWeight);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public BoundaryText getParcel(){
       return this.boundaryText$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       BoundaryText$$Parcelable.write(this.boundaryText$$0, p0, p1, new a());
    }
}
