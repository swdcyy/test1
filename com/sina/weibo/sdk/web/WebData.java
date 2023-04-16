package com.sina.weibo.sdk.web.WebData;
import android.os.Parcelable;
import java.io.Serializable;
import com.sina.weibo.sdk.web.WebData$1;
import android.os.Parcel;
import java.lang.Object;
import com.sina.weibo.sdk.auth.AuthInfo;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.String;

public class WebData implements Parcelable, Serializable	// class@000bde
{
    public AuthInfo av;
    public String aw;
    public String i;
    public int type;
    public static final Parcelable$Creator CREATOR;
    public static final long serialVersionUID;

    static {
       WebData.CREATOR = new WebData$1();
    }
    public void WebData(Parcel p0){
       super();
       this.av = p0.readParcelable(AuthInfo.class.getClassLoader());
       this.type = p0.readInt();
       this.i = p0.readString();
       this.aw = p0.readString();
    }
    public void WebData(AuthInfo p0,int p1,String p2,String p3){
       super();
       this.av = p0;
       this.type = p1;
       this.i = p2;
       this.aw = p3;
    }
    public final AuthInfo a(){
       return this.av;
    }
    public int describeContents(){
       return 0;
    }
    public final int getType(){
       return this.type;
    }
    public final String getUrl(){
       return this.i;
    }
    public final String r(){
       return this.aw;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeParcelable(this.av, p1);
       p0.writeInt(this.type);
       p0.writeString(this.i);
       p0.writeString(this.aw);
    }
}
