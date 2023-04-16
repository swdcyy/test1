package com.kwai.corona.startup.model.CoronaChannel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.corona.startup.model.CoronaChannel$$Parcelable$a;
import com.kwai.corona.startup.model.CoronaChannel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class CoronaChannel$$Parcelable implements Parcelable, d	// class@000ce8
{
    public CoronaChannel coronaChannel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaChannel$$Parcelable.CREATOR = new CoronaChannel$$Parcelable$a();
    }
    public void CoronaChannel$$Parcelable(CoronaChannel p0){
       super();
       this.coronaChannel$$0 = p0;
    }
    public static CoronaChannel read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CoronaChannel uCoronaChann = new CoronaChannel();
          p1.f(p1.g(), uCoronaChann);
          uCoronaChann.mRealIndex = p0.readInt();
          uCoronaChann.mChannelId = p0.readString();
          uCoronaChann.mId = p0.readInt();
          uCoronaChann.mUploadIndex = p0.readInt();
          uCoronaChann.mEntranceType = p0.readInt();
          uCoronaChann.mName = p0.readString();
          uCoronaChann.mType = p0.readInt();
          p1.f(i, uCoronaChann);
          return uCoronaChann;
       }
    }
    public static void write(CoronaChannel p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mRealIndex);
          p1.writeString(p0.mChannelId);
          p1.writeInt(p0.mId);
          p1.writeInt(p0.mUploadIndex);
          p1.writeInt(p0.mEntranceType);
          p1.writeString(p0.mName);
          p1.writeInt(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaChannel getParcel(){
       return this.coronaChannel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaChannel$$Parcelable.write(this.coronaChannel$$0, p0, p1, new a());
    }
}
