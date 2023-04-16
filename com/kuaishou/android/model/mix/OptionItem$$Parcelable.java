package com.kuaishou.android.model.mix.OptionItem$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.OptionItem$$Parcelable$a;
import com.kuaishou.android.model.mix.OptionItem;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class OptionItem$$Parcelable implements Parcelable, d	// class@000d2d
{
    public OptionItem optionItem$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       OptionItem$$Parcelable.CREATOR = new OptionItem$$Parcelable$a();
    }
    public void OptionItem$$Parcelable(OptionItem p0){
       super();
       this.optionItem$$0 = p0;
    }
    public static OptionItem read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          OptionItem optionItem = new OptionItem();
          p1.f(p1.g(), optionItem);
          optionItem.mWeight = p0.readInt();
          optionItem.mToast = p0.readString();
          optionItem.mText = p0.readString();
          optionItem.mType = p0.readInt();
          p1.f(i, optionItem);
          return optionItem;
       }
    }
    public static void write(OptionItem p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mWeight);
          p1.writeString(p0.mToast);
          p1.writeString(p0.mText);
          p1.writeInt(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public OptionItem getParcel(){
       return this.optionItem$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       OptionItem$$Parcelable.write(this.optionItem$$0, p0, p1, new a());
    }
}
