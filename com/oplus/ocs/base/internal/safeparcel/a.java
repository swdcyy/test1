package com.oplus.ocs.base.internal.safeparcel.a;
import android.os.Parcel;
import com.oplus.ocs.base.internal.safeparcel.a$a;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Integer;

public final class a	// class@000afc
{

    public static int a(Parcel p0,int p1){
       a.c(p0, p1);
       return p0.readInt();
    }
    public static int b(Parcel p0,int p1){
       if ((p1 & 0xffff0000) != 0xffff0000) {
          return ((p1 >> 16) & 0xffff);
       }
       return p0.readInt();
    }
    public static void c(Parcel p0,int p1){
       int i = a.b(p0, p1);
       if (i == 4) {
          return;
       }
       throw new a$a("Expected size 4 got "+i+" \(0x"+Integer.toHexString(i)+"\)");
    }
}
