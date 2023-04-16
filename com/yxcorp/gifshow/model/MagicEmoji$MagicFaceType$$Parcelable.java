package com.yxcorp.gifshow.model.MagicEmoji$MagicFaceType$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFaceType$$Parcelable$a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFaceType;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Class;
import java.lang.Enum;

public class MagicEmoji$MagicFaceType$$Parcelable implements Parcelable, d	// class@001e4d
{
    public MagicEmoji$MagicFaceType magicFaceType$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MagicEmoji$MagicFaceType$$Parcelable.CREATOR = new MagicEmoji$MagicFaceType$$Parcelable$a();
    }
    public void MagicEmoji$MagicFaceType$$Parcelable(MagicEmoji$MagicFaceType p0){
       super();
       this.magicFaceType$$0 = p0;
    }
    public static MagicEmoji$MagicFaceType read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          String str = p0.readString();
          MagicEmoji$MagicFaceType magicFaceTyp = (str == null)? null: Enum.valueOf(MagicEmoji$MagicFaceType.class, str);
          p1.f(i, magicFaceTyp);
          return magicFaceTyp;
       }
    }
    public static void write(MagicEmoji$MagicFaceType p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          String str = (p0 == null)? null: p0.name();
          p1.writeString(str);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MagicEmoji$MagicFaceType getParcel(){
       return this.magicFaceType$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MagicEmoji$MagicFaceType$$Parcelable.write(this.magicFaceType$$0, p0, p1, new a());
    }
}
