package com.hpplay.sdk.source.bean.DanmakuBean$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.hpplay.sdk.source.bean.DanmakuBean;

public final class DanmakuBean$1 implements Parcelable$Creator	// class@000646
{

    public void DanmakuBean$1(){
       super();
    }
    public DanmakuBean createFromParcel(Parcel p0){
       return new DanmakuBean(p0);
    }
    public Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public DanmakuBean[] newArray(int p0){
       DanmakuBean[] uDanmakuBean = new DanmakuBean[p0];
       return uDanmakuBean;
    }
    public Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
