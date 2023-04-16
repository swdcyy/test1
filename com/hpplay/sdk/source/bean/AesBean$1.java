package com.hpplay.sdk.source.bean.AesBean$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.hpplay.sdk.source.bean.AesBean;

public final class AesBean$1 implements Parcelable$Creator	// class@000642
{

    public void AesBean$1(){
       super();
    }
    public AesBean createFromParcel(Parcel p0){
       return new AesBean(p0);
    }
    public Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public AesBean[] newArray(int p0){
       AesBean[] uAesBeanArra = new AesBean[p0];
       return uAesBeanArra;
    }
    public Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
