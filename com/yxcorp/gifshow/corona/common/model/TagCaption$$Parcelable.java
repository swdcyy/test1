package com.yxcorp.gifshow.corona.common.model.TagCaption$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.corona.common.model.TagCaption$$Parcelable$a;
import com.yxcorp.gifshow.corona.common.model.TagCaption;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class TagCaption$$Parcelable implements Parcelable, d	// class@001249
{
    public TagCaption tagCaption$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TagCaption$$Parcelable.CREATOR = new TagCaption$$Parcelable$a();
    }
    public void TagCaption$$Parcelable(TagCaption p0){
       super();
       this.tagCaption$$0 = p0;
    }
    public static TagCaption read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          TagCaption tagCaption = new TagCaption();
          p1.f(p1.g(), tagCaption);
          tagCaption.mCaption = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          tagCaption.mTagClickable = b;
          p1.f(i, tagCaption);
          return tagCaption;
       }
    }
    public static void write(TagCaption p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mCaption);
          p1.writeInt(p0.mTagClickable);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TagCaption getParcel(){
       return this.tagCaption$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TagCaption$$Parcelable.write(this.tagCaption$$0, p0, p1, new a());
    }
}
