package com.sina.weibo.sdk.auth.AuthInfo;
import android.os.Parcelable;
import java.io.Serializable;
import com.sina.weibo.sdk.auth.AuthInfo$1;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import com.sina.weibo.sdk.b.e;
import android.os.Parcel;

public final class AuthInfo implements Parcelable, Serializable	// class@000bad
{
    public String app_key;
    public String hash;
    public String package_name;
    public String redirect_url;
    public String scope;
    public static final Parcelable$Creator CREATOR;
    public static final long serialVersionUID;

    static {
       AuthInfo.CREATOR = new AuthInfo$1();
    }
    public void AuthInfo(Context p0,String p1,String p2,String p3){
       super();
       this.app_key = p1;
       this.redirect_url = p2;
       this.scope = p3;
       p1 = p0.getPackageName();
       this.package_name = p1;
       this.hash = e.b(p0, p1);
    }
    public void AuthInfo(Parcel p0){
       super();
       this.app_key = p0.readString();
       this.redirect_url = p0.readString();
       this.scope = p0.readString();
       this.package_name = p0.readString();
       this.hash = p0.readString();
    }
    public final int describeContents(){
       return 0;
    }
    public final String getAppKey(){
       return this.app_key;
    }
    public final String getHash(){
       return this.hash;
    }
    public final String getPackageName(){
       return this.package_name;
    }
    public final String getRedirectUrl(){
       return this.redirect_url;
    }
    public final String getScope(){
       return this.scope;
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.app_key);
       p0.writeString(this.redirect_url);
       p0.writeString(this.scope);
       p0.writeString(this.package_name);
       p0.writeString(this.hash);
    }
}
