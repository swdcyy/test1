package com.kwai.framework.model.ExtendableModelMap$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.ExtendableModelMap$$Parcelable$a;
import com.kwai.framework.model.ExtendableModelMap;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import java.util.HashMap;
import java.lang.Class;
import org.parceler.a;
import org.parceler.a$c;

public class ExtendableModelMap$$Parcelable implements Parcelable, d	// class@001686
{
    public ExtendableModelMap extendableModelMap$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ExtendableModelMap$$Parcelable.CREATOR = new ExtendableModelMap$$Parcelable$a();
    }
    public void ExtendableModelMap$$Parcelable(ExtendableModelMap p0){
       super();
       this.extendableModelMap$$0 = p0;
    }
    public static ExtendableModelMap read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          ExtendableModelMap uExtendableM = new ExtendableModelMap();
          p1.f(p1.g(), uExtendableM);
          a.d(ExtendableModelMap.class, uExtendableM, "mParcelExtraMap", p0.readSerializable());
          p1.f(i, uExtendableM);
          return uExtendableM;
       }
    }
    public static void write(ExtendableModelMap p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(a.c(new a$c(), ExtendableModelMap.class, p0, "mParcelExtraMap"));
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ExtendableModelMap getParcel(){
       return this.extendableModelMap$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ExtendableModelMap$$Parcelable.write(this.extendableModelMap$$0, p0, p1, new a());
    }
}
