package com.yxcorp.gifshow.entity.TagDetailItem$Permission$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.entity.TagDetailItem$Permission$$Parcelable$a;
import com.yxcorp.gifshow.entity.TagDetailItem$Permission;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Class;
import java.lang.Enum;

public class TagDetailItem$Permission$$Parcelable implements Parcelable, d	// class@000d78
{
    public TagDetailItem$Permission permission$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TagDetailItem$Permission$$Parcelable.CREATOR = new TagDetailItem$Permission$$Parcelable$a();
    }
    public void TagDetailItem$Permission$$Parcelable(TagDetailItem$Permission p0){
       super();
       this.permission$$0 = p0;
    }
    public static TagDetailItem$Permission read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          String str = p0.readString();
          TagDetailItem$Permission permission = (str == null)? null: Enum.valueOf(TagDetailItem$Permission.class, str);
          p1.f(i, permission);
          return permission;
       }
    }
    public static void write(TagDetailItem$Permission p0,Parcel p1,int p2,a p3){
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
    public TagDetailItem$Permission getParcel(){
       return this.permission$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TagDetailItem$Permission$$Parcelable.write(this.permission$$0, p0, p1, new a());
    }
}
