package com.sina.weibo.sdk.api.ImageObject$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.sina.weibo.sdk.api.ImageObject;

public final class ImageObject$1 implements Parcelable$Creator	// class@000b9b
{

    public void ImageObject$1(){
       super();
    }
    public final ImageObject createFromParcel(Parcel p0){
       return new ImageObject(p0);
    }
    public final Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public final ImageObject[] newArray(int p0){
       ImageObject[] imageObjectA = new ImageObject[p0];
       return imageObjectA;
    }
    public final Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
