package com.sina.weibo.sdk.api.WebpageObject$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.sina.weibo.sdk.api.WebpageObject;

public final class WebpageObject$1 implements Parcelable$Creator	// class@000ba7
{

    public void WebpageObject$1(){
       super();
    }
    public final WebpageObject createFromParcel(Parcel p0){
       return new WebpageObject(p0);
    }
    public final Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public final WebpageObject[] newArray(int p0){
       WebpageObject[] webpageObjec = new WebpageObject[p0];
       return webpageObjec;
    }
    public final Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
