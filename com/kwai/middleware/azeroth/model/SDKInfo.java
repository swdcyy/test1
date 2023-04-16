package com.kwai.middleware.azeroth.model.SDKInfo;
import android.os.Parcelable;
import com.kwai.middleware.azeroth.model.SDKInfo$b;
import nsd.u;
import com.kwai.middleware.azeroth.model.SDKInfo$a;
import java.lang.String;
import android.os.Parcel;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class SDKInfo implements Parcelable	// class@000f05
{
    public String name;
    public String version;
    public static final Parcelable$Creator CREATOR;
    public static final SDKInfo$b b;

    static {
       SDKInfo.b = new SDKInfo$b(null);
       SDKInfo.CREATOR = new SDKInfo$a();
    }
    public void SDKInfo(){
       super("", "");
    }
    public void SDKInfo(Parcel p0){
       a.q(p0, "source");
       String str = p0.readString();
       String str1 = "";
       if (str != null) {
       }else {
          str = str1;
       }
       String str2 = p0.readString();
       if (str2 != null) {
          str1 = str2;
       }
       super(str, str1);
       return;
    }
    public void SDKInfo(String p0,String p1){
       a.q(p0, "name");
       a.q(p1, "version");
       super();
       this.name = p0;
       this.version = p1;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       a.q(p0, "dest");
       p0.writeString(this.name);
       p0.writeString(this.version);
    }
}
