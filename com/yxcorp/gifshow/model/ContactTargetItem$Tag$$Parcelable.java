package com.yxcorp.gifshow.model.ContactTargetItem$Tag$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.model.ContactTargetItem$Tag$$Parcelable$a;
import com.yxcorp.gifshow.model.ContactTargetItem$Tag;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class ContactTargetItem$Tag$$Parcelable implements Parcelable, d	// class@001dfc
{
    public ContactTargetItem$Tag tag$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ContactTargetItem$Tag$$Parcelable.CREATOR = new ContactTargetItem$Tag$$Parcelable$a();
    }
    public void ContactTargetItem$Tag$$Parcelable(ContactTargetItem$Tag p0){
       super();
       this.tag$$0 = p0;
    }
    public static ContactTargetItem$Tag read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ContactTargetItem$Tag tag = new ContactTargetItem$Tag();
          p1.f(p1.g(), tag);
          tag.mPosition = p0.readInt();
          tag.mStyle = p0.readInt();
          tag.mText = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          tag.mShow = b;
          tag.mType = p0.readInt();
          p1.f(i, tag);
          return tag;
       }
    }
    public static void write(ContactTargetItem$Tag p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mPosition);
          p1.writeInt(p0.mStyle);
          p1.writeString(p0.mText);
          p1.writeInt(p0.mShow);
          p1.writeInt(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ContactTargetItem$Tag getParcel(){
       return this.tag$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ContactTargetItem$Tag$$Parcelable.write(this.tag$$0, p0, p1, new a());
    }
}
