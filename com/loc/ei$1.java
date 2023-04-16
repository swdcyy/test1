package com.loc.ei$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.loc.ei;
import java.lang.String;

public final class ei$1 implements Parcelable$Creator	// class@001404
{

    public void ei$1(){
       super();
    }
    public static ei a(Parcel p0){
       ei uoei = new ei();
       uoei.c(p0.readString());
       uoei.d(p0.readString());
       uoei.e(p0.readString());
       uoei.f(p0.readString());
       uoei.b(p0.readString());
       uoei.c(p0.readLong());
       uoei.d(p0.readLong());
       uoei.a(p0.readLong());
       uoei.b(p0.readLong());
       uoei.a(p0.readString());
       return uoei;
    }
    public static ei[] a(int p0){
       ei[] uoeiArray = new ei[p0];
       return uoeiArray;
    }
    public final Object createFromParcel(Parcel p0){
       return ei$1.a(p0);
    }
    public final Object[] newArray(int p0){
       return ei$1.a(p0);
    }
}
