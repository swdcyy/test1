package com.kuaishou.krn.apm.KdsMemoryInfo;
import android.os.Debug$MemoryInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Parcel;

public final class KdsMemoryInfo extends Debug$MemoryInfo	// class@0007b0
{
    public int b;
    public int c;

    public void KdsMemoryInfo(){
       super();
    }
    public void KdsMemoryInfo(Debug$MemoryInfo p0){
       a.p(p0, "debugMemoryInfo");
       super();
       Parcel parcel = Parcel.obtain();
       a.o(parcel, "Parcel.obtain\(\)");
       p0.writeToParcel(parcel, 0);
       this.readFromParcel(parcel);
    }
    public final int a(){
       return this.b;
    }
    public final int b(){
       return this.c;
    }
}
