package com.sina.weibo.sdk.api.SuperGroupObject;
import com.sina.weibo.sdk.api.MediaObject;
import com.sina.weibo.sdk.api.SuperGroupObject$1;
import android.os.Parcel;
import java.lang.String;

public class SuperGroupObject extends MediaObject	// class@000ba2
{
    public String secName;
    public String sgExtParam;
    public String sgName;
    public static final Parcelable$Creator CREATOR;

    static {
       SuperGroupObject.CREATOR = new SuperGroupObject$1();
    }
    public void SuperGroupObject(){
       super();
    }
    public void SuperGroupObject(Parcel p0){
       super();
       this.sgName = p0.readString();
       this.secName = p0.readString();
       this.sgExtParam = p0.readString();
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.sgName);
       p0.writeString(this.secName);
       p0.writeString(this.sgExtParam);
    }
}
