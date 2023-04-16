package com.sina.weibo.sdk.api.MultiImageObject$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.sina.weibo.sdk.api.MultiImageObject;

public final class MultiImageObject$1 implements Parcelable$Creator	// class@000b9f
{

    public void MultiImageObject$1(){
       super();
    }
    public final MultiImageObject createFromParcel(Parcel p0){
       return new MultiImageObject(p0);
    }
    public final Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public final MultiImageObject[] newArray(int p0){
       MultiImageObject[] multiImageOb = new MultiImageObject[p0];
       return multiImageOb;
    }
    public final Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
