package com.hpplay.sdk.source.bean.PlayerInfoBean$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.hpplay.sdk.source.bean.PlayerInfoBean;

public final class PlayerInfoBean$1 implements Parcelable$Creator	// class@00064f
{

    public void PlayerInfoBean$1(){
       super();
    }
    public PlayerInfoBean createFromParcel(Parcel p0){
       return new PlayerInfoBean(p0);
    }
    public Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public PlayerInfoBean[] newArray(int p0){
       PlayerInfoBean[] playerInfoBe = new PlayerInfoBean[p0];
       return playerInfoBe;
    }
    public Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
