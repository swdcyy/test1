package com.oplus.ocs.base.internal.safeparcel.b;
import android.os.Parcel;

public final class b	// class@000afd
{

    public static void a(Parcel p0,int p1){
       int i = p0.dataPosition();
       p0.setDataPosition((p1 - 4));
       p0.writeInt((i - p1));
       p0.setDataPosition(i);
    }
    public static void a(Parcel p0,int p1,int p2){
       b.c(p0, p1);
       p0.writeInt(p2);
    }
    public static int b(Parcel p0,int p1){
       p0.writeInt((p1 | 0xffff0000));
       p0.writeInt(0);
       return p0.dataPosition();
    }
    public static void c(Parcel p0,int p1){
       p0.writeInt((p1 | 0x40000));
    }
}
