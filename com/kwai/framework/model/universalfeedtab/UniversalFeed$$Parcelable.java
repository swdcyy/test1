package com.kwai.framework.model.universalfeedtab.UniversalFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.universalfeedtab.UniversalFeed$$Parcelable$a;
import com.kwai.framework.model.universalfeedtab.UniversalFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class UniversalFeed$$Parcelable implements Parcelable, d	// class@0016d5
{
    public UniversalFeed universalFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UniversalFeed$$Parcelable.CREATOR = new UniversalFeed$$Parcelable$a();
    }
    public void UniversalFeed$$Parcelable(UniversalFeed p0){
       super();
       this.universalFeed$$0 = p0;
    }
    public static UniversalFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          UniversalFeed universalFee = new UniversalFeed();
          p1.f(p1.g(), universalFee);
          universalFee.mRequestPath = p0.readString();
          universalFee.mHeaderBundleId = p0.readString();
          universalFee.mHeaderBundleViewKey = p0.readString();
          universalFee.mFooterBundleViewKey = p0.readString();
          universalFee.mPage2 = p0.readString();
          universalFee.mId = p0.readString();
          universalFee.mSlideUpDownRequestPath = p0.readString();
          universalFee.mFooterBundleId = p0.readString();
          p1.f(i, universalFee);
          return universalFee;
       }
    }
    public static void write(UniversalFeed p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mRequestPath);
          p1.writeString(p0.mHeaderBundleId);
          p1.writeString(p0.mHeaderBundleViewKey);
          p1.writeString(p0.mFooterBundleViewKey);
          p1.writeString(p0.mPage2);
          p1.writeString(p0.mId);
          p1.writeString(p0.mSlideUpDownRequestPath);
          p1.writeString(p0.mFooterBundleId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UniversalFeed getParcel(){
       return this.universalFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UniversalFeed$$Parcelable.write(this.universalFeed$$0, p0, p1, new a());
    }
}
