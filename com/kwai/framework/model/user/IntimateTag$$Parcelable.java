package com.kwai.framework.model.user.IntimateTag$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.IntimateTag$$Parcelable$a;
import com.kwai.framework.model.user.IntimateTag;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class IntimateTag$$Parcelable implements Parcelable, d	// class@0016fd
{
    public IntimateTag intimateTag$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       IntimateTag$$Parcelable.CREATOR = new IntimateTag$$Parcelable$a();
    }
    public void IntimateTag$$Parcelable(IntimateTag p0){
       super();
       this.intimateTag$$0 = p0;
    }
    public static IntimateTag read(Parcel p0,a p1){
       String[] stringArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          IntimateTag intimateTag = new IntimateTag();
          p1.f(p1.g(), intimateTag);
          intimateTag.level = p0.readInt();
          intimateTag.nickName = p0.readString();
          int i1 = p0.readInt();
          if (i1 < 0) {
             stringArray = null;
          }else {
             String[] stringArray1 = new String[i1];
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                stringArray1[i2] = p0.readString();
             }
             stringArray = stringArray1;
          }
          intimateTag.icons = stringArray;
          p1.f(i, intimateTag);
          return intimateTag;
       }
    }
    public static void write(IntimateTag p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       int i = -1;
       if (p2 != i) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.level);
          p1.writeString(p0.nickName);
          IntimateTag icons = p0.icons;
          if (icons == null) {
             p1.writeInt(i);
          }else {
             p1.writeInt(icons.length);
             p0 = p0.icons;
             icons = p0.length;
             for (int i1 = 0; i1 < icons; i1++) {
                p1.writeString(p0[i1]);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public IntimateTag getParcel(){
       return this.intimateTag$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       IntimateTag$$Parcelable.write(this.intimateTag$$0, p0, p1, new a());
    }
}
