package com.yxcorp.gifshow.profile.model.CommercialCooperationLabel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.profile.model.CommercialCooperationLabel$$Parcelable$a;
import com.yxcorp.gifshow.profile.model.CommercialCooperationLabel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class CommercialCooperationLabel$$Parcelable implements Parcelable, d	// class@001381
{
    public CommercialCooperationLabel commercialCooperationLabel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CommercialCooperationLabel$$Parcelable.CREATOR = new CommercialCooperationLabel$$Parcelable$a();
    }
    public void CommercialCooperationLabel$$Parcelable(CommercialCooperationLabel p0){
       super();
       this.commercialCooperationLabel$$0 = p0;
    }
    public static CommercialCooperationLabel read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CommercialCooperationLabel uCommercialC = new CommercialCooperationLabel();
          p1.f(p1.g(), uCommercialC);
          uCommercialC.mLabelActionType = p0.readInt();
          uCommercialC.mLabelDarkIcon = p0.readString();
          uCommercialC.mActionUrl = p0.readString();
          uCommercialC.mLabelIcon = p0.readString();
          uCommercialC.mLabelName = p0.readString();
          uCommercialC.mLabelType = p0.readString();
          p1.f(i, uCommercialC);
          return uCommercialC;
       }
    }
    public static void write(CommercialCooperationLabel p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mLabelActionType);
          p1.writeString(p0.mLabelDarkIcon);
          p1.writeString(p0.mActionUrl);
          p1.writeString(p0.mLabelIcon);
          p1.writeString(p0.mLabelName);
          p1.writeString(p0.mLabelType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CommercialCooperationLabel getParcel(){
       return this.commercialCooperationLabel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CommercialCooperationLabel$$Parcelable.write(this.commercialCooperationLabel$$0, p0, p1, new a());
    }
}
