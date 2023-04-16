package com.sina.weibo.sdk.api.MediaObject;
import android.os.Parcelable;
import java.io.Serializable;
import com.sina.weibo.sdk.api.MediaObject$1;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;

public class MediaObject implements Parcelable, Serializable	// class@000b9e
{
    public String actionUrl;
    public String description;
    public String identify;
    public String schema;
    public byte[] thumbData;
    public String title;
    public static final Parcelable$Creator CREATOR;
    public static final long serialVersionUID;

    static {
       MediaObject.CREATOR = new MediaObject$1();
    }
    public void MediaObject(){
       super();
    }
    public void MediaObject(Parcel p0){
       super();
       this.actionUrl = p0.readString();
       this.schema = p0.readString();
       this.identify = p0.readString();
       this.title = p0.readString();
       this.description = p0.readString();
       this.thumbData = p0.createByteArray();
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.actionUrl);
       p0.writeString(this.schema);
       p0.writeString(this.identify);
       p0.writeString(this.title);
       p0.writeString(this.description);
       p0.writeByteArray(this.thumbData);
    }
}
