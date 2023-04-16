package com.oplus.ocs.base.common.AuthResult$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.oplus.ocs.base.common.AuthResult;

public final class AuthResult$1 implements Parcelable$Creator	// class@000ab2
{

    public void AuthResult$1(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       return new AuthResult(p0);
    }
    public final Object[] newArray(int p0){
       AuthResult[] uAuthResultA = new AuthResult[p0];
       return uAuthResultA;
    }
}
