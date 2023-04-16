package com.yxcorp.gifshow.hotinsert.HotInsertTypes$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.hotinsert.HotInsertTypes$$Parcelable$a;
import com.yxcorp.gifshow.hotinsert.HotInsertTypes;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import org.parceler.a;
import org.parceler.a$c;

public class HotInsertTypes$$Parcelable implements Parcelable, d	// class@0018e0
{
    public HotInsertTypes hotInsertTypes$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       HotInsertTypes$$Parcelable.CREATOR = new HotInsertTypes$$Parcelable$a();
    }
    public void HotInsertTypes$$Parcelable(HotInsertTypes p0){
       super();
       this.hotInsertTypes$$0 = p0;
    }
    public static HotInsertTypes read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          HotInsertTypes hotInsertTyp = new HotInsertTypes();
          p1.f(p1.g(), hotInsertTyp);
          a.d(HotInsertTypes.class, hotInsertTyp, "mContractMap", p0.readSerializable());
          a.d(HotInsertTypes.class, hotInsertTyp, "mTypeMap", p0.readSerializable());
          p1.f(i, hotInsertTyp);
          return hotInsertTyp;
       }
    }
    public static void write(HotInsertTypes p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(a.c(new a$c(), HotInsertTypes.class, p0, "mContractMap"));
          p1.writeSerializable(a.c(new a$c(), HotInsertTypes.class, p0, "mTypeMap"));
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public HotInsertTypes getParcel(){
       return this.hotInsertTypes$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       HotInsertTypes$$Parcelable.write(this.hotInsertTypes$$0, p0, p1, new a());
    }
}
