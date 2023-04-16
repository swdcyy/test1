package com.kuaishou.android.model.mix.DetailStrongButtonConfig$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.DetailStrongButtonConfig$$Parcelable$a;
import com.kuaishou.android.model.mix.DetailStrongButtonConfig;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class DetailStrongButtonConfig$$Parcelable implements Parcelable, d	// class@000c59
{
    public DetailStrongButtonConfig detailStrongButtonConfig$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       DetailStrongButtonConfig$$Parcelable.CREATOR = new DetailStrongButtonConfig$$Parcelable$a();
    }
    public void DetailStrongButtonConfig$$Parcelable(DetailStrongButtonConfig p0){
       super();
       this.detailStrongButtonConfig$$0 = p0;
    }
    public static DetailStrongButtonConfig read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          DetailStrongButtonConfig uDetailStron = new DetailStrongButtonConfig();
          p1.f(p1.g(), uDetailStron);
          uDetailStron.mUrl = p0.readString();
          uDetailStron.mExtraParams = p0.readString();
          uDetailStron.mAnimationShowAfterXSeconds = p0.readInt();
          uDetailStron.mRightIconUrl = p0.readString();
          uDetailStron.mBizType = p0.readInt();
          uDetailStron.mText = p0.readString();
          p1.f(i, uDetailStron);
          return uDetailStron;
       }
    }
    public static void write(DetailStrongButtonConfig p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mUrl);
          p1.writeString(p0.mExtraParams);
          p1.writeInt(p0.mAnimationShowAfterXSeconds);
          p1.writeString(p0.mRightIconUrl);
          p1.writeInt(p0.mBizType);
          p1.writeString(p0.mText);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public DetailStrongButtonConfig getParcel(){
       return this.detailStrongButtonConfig$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       DetailStrongButtonConfig$$Parcelable.write(this.detailStrongButtonConfig$$0, p0, p1, new a());
    }
}
