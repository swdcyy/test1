package com.kuaishou.android.model.feed.VisibilityExpiration$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.feed.VisibilityExpiration$$Parcelable$a;
import com.kuaishou.android.model.feed.VisibilityExpiration;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class VisibilityExpiration$$Parcelable implements Parcelable, d	// class@000b7c
{
    public VisibilityExpiration visibilityExpiration$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       VisibilityExpiration$$Parcelable.CREATOR = new VisibilityExpiration$$Parcelable$a();
    }
    public void VisibilityExpiration$$Parcelable(VisibilityExpiration p0){
       super();
       this.visibilityExpiration$$0 = p0;
    }
    public static VisibilityExpiration read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          VisibilityExpiration visibilityEx = new VisibilityExpiration();
          p1.f(p1.g(), visibilityEx);
          visibilityEx.mExpiryDays = p0.readInt();
          p1.f(i, visibilityEx);
          return visibilityEx;
       }
    }
    public static void write(VisibilityExpiration p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mExpiryDays);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public VisibilityExpiration getParcel(){
       return this.visibilityExpiration$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       VisibilityExpiration$$Parcelable.write(this.visibilityExpiration$$0, p0, p1, new a());
    }
}
