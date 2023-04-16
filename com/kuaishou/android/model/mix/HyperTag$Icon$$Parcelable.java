package com.kuaishou.android.model.mix.HyperTag$Icon$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.HyperTag$Icon$$Parcelable$a;
import com.kuaishou.android.model.mix.HyperTag$Icon;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class HyperTag$Icon$$Parcelable implements Parcelable, d	// class@000cac
{
    public HyperTag$Icon icon$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       HyperTag$Icon$$Parcelable.CREATOR = new HyperTag$Icon$$Parcelable$a();
    }
    public void HyperTag$Icon$$Parcelable(HyperTag$Icon p0){
       super();
       this.icon$$0 = p0;
    }
    public static HyperTag$Icon read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          HyperTag$Icon icon = new HyperTag$Icon();
          p1.f(p1.g(), icon);
          icon.mHeight = p0.readInt();
          icon.mUrl = p0.readString();
          icon.mWidth = p0.readInt();
          p1.f(i, icon);
          return icon;
       }
    }
    public static void write(HyperTag$Icon p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mHeight);
          p1.writeString(p0.mUrl);
          p1.writeInt(p0.mWidth);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public HyperTag$Icon getParcel(){
       return this.icon$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       HyperTag$Icon$$Parcelable.write(this.icon$$0, p0, p1, new a());
    }
}
