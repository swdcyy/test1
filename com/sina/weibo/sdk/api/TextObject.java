package com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.MediaObject;
import com.sina.weibo.sdk.api.TextObject$1;
import android.os.Parcel;
import java.lang.String;

public class TextObject extends MediaObject	// class@000ba4
{
    public String text;
    public static final Parcelable$Creator CREATOR;
    public static final long serialVersionUID;

    static {
       TextObject.CREATOR = new TextObject$1();
    }
    public void TextObject(){
       super();
    }
    public void TextObject(Parcel p0){
       super();
       this.text = p0.readString();
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.text);
    }
}
