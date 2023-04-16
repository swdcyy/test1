package com.kwai.middleware.azeroth.model.SDKInfoRequest;
import android.os.Parcelable;
import com.kwai.middleware.azeroth.model.SDKInfoRequest$b;
import nsd.u;
import com.kwai.middleware.azeroth.model.SDKInfoRequest$a;
import java.lang.String;
import android.os.Parcel;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class SDKInfoRequest implements Parcelable	// class@000f08
{
    public String appVersion;
    public String info;
    public final String os;
    public String productName;
    public final String token;
    public static final Parcelable$Creator CREATOR;
    public static final SDKInfoRequest$b b;

    static {
       SDKInfoRequest.b = new SDKInfoRequest$b(null);
       SDKInfoRequest.CREATOR = new SDKInfoRequest$a();
    }
    public void SDKInfoRequest(){
       super("", "", null, "android", "ChhjYXMuaW5mcmEucGFzc3BvcnQuYWRtaW4SIOegp/DiXNnBGs9cyuEF1fLwVaCAvP9D6enH/xzJNSZvGhKdckr5nP2FKGfTRAWPUCrYE9YoBTAB");
    }
    public void SDKInfoRequest(Parcel p0){
       a.q(p0, "source");
       String str = p0.readString();
       String str1 = (str != null)? str: "";
       str = p0.readString();
       String str2 = (str != null)? str: "";
       String str3 = p0.readString();
       str = p0.readString();
       String str4 = (str != null)? str: "";
       String str5 = p0.readString();
       String str6 = (str5 != null)? str5: "";
       super(str1, str2, str3, str4, str6);
       return;
    }
    public void SDKInfoRequest(String p0,String p1,String p2,String p3,String p4){
       a.q(p0, "productName");
       a.q(p1, "appVersion");
       a.q(p3, "os");
       a.q(p4, "token");
       super();
       this.productName = p0;
       this.appVersion = p1;
       this.info = p2;
       this.os = p3;
       this.token = p4;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       a.q(p0, "dest");
       p0.writeString(this.productName);
       p0.writeString(this.appVersion);
       p0.writeString(this.info);
       p0.writeString(this.os);
       p0.writeString(this.token);
    }
}
