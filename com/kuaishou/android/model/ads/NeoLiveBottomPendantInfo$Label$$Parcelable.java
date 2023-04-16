package com.kuaishou.android.model.ads.NeoLiveBottomPendantInfo$Label$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.NeoLiveBottomPendantInfo$Label$$Parcelable$a;
import com.kuaishou.android.model.ads.NeoLiveBottomPendantInfo$Label;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class NeoLiveBottomPendantInfo$Label$$Parcelable implements Parcelable, d	// class@000878
{
    public NeoLiveBottomPendantInfo$Label label$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NeoLiveBottomPendantInfo$Label$$Parcelable.CREATOR = new NeoLiveBottomPendantInfo$Label$$Parcelable$a();
    }
    public void NeoLiveBottomPendantInfo$Label$$Parcelable(NeoLiveBottomPendantInfo$Label p0){
       super();
       this.label$$0 = p0;
    }
    public static NeoLiveBottomPendantInfo$Label read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          NeoLiveBottomPendantInfo$Label label = new NeoLiveBottomPendantInfo$Label();
          p1.f(p1.g(), label);
          label.mMsg = p0.readString();
          label.mTip = p0.readString();
          p1.f(i, label);
          return label;
       }
    }
    public static void write(NeoLiveBottomPendantInfo$Label p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mMsg);
          p1.writeString(p0.mTip);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NeoLiveBottomPendantInfo$Label getParcel(){
       return this.label$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NeoLiveBottomPendantInfo$Label$$Parcelable.write(this.label$$0, p0, p1, new a());
    }
}
