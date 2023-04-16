package com.yxcorp.gifshow.detail.model.meta.OnlineStateTag$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.detail.model.meta.OnlineStateTag$$Parcelable$a;
import com.yxcorp.gifshow.detail.model.meta.OnlineStateTag;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class OnlineStateTag$$Parcelable implements Parcelable, d	// class@0015a7
{
    public OnlineStateTag onlineStateTag$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       OnlineStateTag$$Parcelable.CREATOR = new OnlineStateTag$$Parcelable$a();
    }
    public void OnlineStateTag$$Parcelable(OnlineStateTag p0){
       super();
       this.onlineStateTag$$0 = p0;
    }
    public static OnlineStateTag read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          OnlineStateTag onlineStateT = new OnlineStateTag();
          p1.f(p1.g(), onlineStateT);
          onlineStateT.mText = p0.readString();
          onlineStateT.mStateType = p0.readInt();
          p1.f(i, onlineStateT);
          return onlineStateT;
       }
    }
    public static void write(OnlineStateTag p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mText);
          p1.writeInt(p0.mStateType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public OnlineStateTag getParcel(){
       return this.onlineStateTag$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       OnlineStateTag$$Parcelable.write(this.onlineStateTag$$0, p0, p1, new a());
    }
}
