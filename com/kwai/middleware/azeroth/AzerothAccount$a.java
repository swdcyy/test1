package com.kwai.middleware.azeroth.AzerothAccount$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.middleware.azeroth.AzerothAccount;

public final class AzerothAccount$a implements Parcelable$Creator	// class@000ef4
{

    public void AzerothAccount$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       a.q(p0, "source");
       return new AzerothAccount(p0);
    }
    public Object[] newArray(int p0){
       AzerothAccount[] uAzerothAcco = new AzerothAccount[p0];
       return uAzerothAcco;
    }
}
