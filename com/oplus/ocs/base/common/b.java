package com.oplus.ocs.base.common.b;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.oplus.ocs.base.internal.safeparcel.a;
import com.oplus.ocs.base.common.Status;
import java.lang.String;
import android.app.PendingIntent;
import com.oplus.ocs.base.internal.safeparcel.a$a;
import android.os.Parcelable;
import java.lang.StringBuilder;
import java.lang.Integer;

public final class b implements Parcelable$Creator	// class@000af5
{

    public void b(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       int i = p0.readInt();
       int i1 = a.b(p0, i);
       int i2 = p0.dataPosition();
       int i3 = 0xffff;
       if ((i & i3) != 0x4f45) {
          throw new a$a("Expected object header. Got 0x"+Integer.toHexString(i));
       }
       i1 = i1 + i2;
       if (i1 < i2 || i1 > p0.dataSize()) {
          throw new a$a("Size read is invalid start="+i2+" end="+i1);
       }
       i = 0;
       String str = null;
       PendingIntent pendingInten = str;
       i2 = 0;
       while (p0.dataPosition() < i1) {
          int i4 = p0.readInt();
          int i5 = i4 & i3;
          if (i5 != 1) {
             if (i5 != 2) {
                if (i5 != 3) {
                   if (i5 != 1000) {
                      i5 = p0.dataPosition() + a.b(p0, i4);
                      p0.setDataPosition(i5);
                   }else {
                      i = a.a(p0, i4);
                   }
                }else {
                   Parcelable$Creator cREATOR = PendingIntent.CREATOR;
                   i4 = a.b(p0, i4);
                   i5 = p0.dataPosition();
                   if (!i4) {
                      pendingInten = null;
                   }else {
                      pendingInten = cREATOR.createFromParcel(p0);
                      i5 = i5 + i4;
                      p0.setDataPosition(i5);
                   }
                }
             }else {
                int i6 = a.b(p0, i4);
                i4 = p0.dataPosition();
                if (!i6) {
                   str = null;
                }else {
                   i4 = i4 + i6;
                   p0.setDataPosition(i4);
                   str = p0.readString();
                }
             }
          }else {
             i2 = a.a(p0, i4);
          }
       }
       if (p0.dataPosition() == i1) {
          return new Status(i, i2, str, pendingInten);
       }else {
          throw new a$a(("Overread allowed size end=").concat(String.valueOf(i1)));
       }
    }
    public final Object[] newArray(int p0){
       Status[] statusArray = new Status[p0];
       return statusArray;
    }
}
