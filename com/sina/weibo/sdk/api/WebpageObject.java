package com.sina.weibo.sdk.api.WebpageObject;
import com.sina.weibo.sdk.api.MediaObject;
import com.sina.weibo.sdk.api.WebpageObject$1;
import android.os.Parcel;

public class WebpageObject extends MediaObject	// class@000ba8
{
    public String defaultText;
    public static final Parcelable$Creator CREATOR;
    public static final long serialVersionUID;

    static {
       WebpageObject.CREATOR = new WebpageObject$1();
    }
    public void WebpageObject(){
       super();
    }
    public void WebpageObject(Parcel p0){
       super(p0);
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
    }
}
