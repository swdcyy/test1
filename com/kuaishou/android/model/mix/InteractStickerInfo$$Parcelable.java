package com.kuaishou.android.model.mix.InteractStickerInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.InteractStickerInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.InteractStickerInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class InteractStickerInfo$$Parcelable implements Parcelable, d	// class@000ce6
{
    public InteractStickerInfo interactStickerInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       InteractStickerInfo$$Parcelable.CREATOR = new InteractStickerInfo$$Parcelable$a();
    }
    public void InteractStickerInfo$$Parcelable(InteractStickerInfo p0){
       super();
       this.interactStickerInfo$$0 = p0;
    }
    public static InteractStickerInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          InteractStickerInfo interactStic = new InteractStickerInfo();
          p1.f(p1.g(), interactStic);
          interactStic.challengeId = p0.readString();
          p1.f(i, interactStic);
          return interactStic;
       }
    }
    public static void write(InteractStickerInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.challengeId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public InteractStickerInfo getParcel(){
       return this.interactStickerInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       InteractStickerInfo$$Parcelable.write(this.interactStickerInfo$$0, p0, p1, new a());
    }
}
