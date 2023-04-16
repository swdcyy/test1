package com.yxcorp.gifshow.record.interactive.RelayUserInfo;
import android.os.Parcelable;
import java.io.Serializable;
import com.yxcorp.gifshow.record.interactive.RelayUserInfo$a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Integer;

public final class RelayUserInfo implements Parcelable, Serializable	// class@001792
{
    public final String id;
    public String profileLocalPath;
    public final String profileUrl;
    public static final Parcelable$Creator CREATOR;

    static {
       RelayUserInfo.CREATOR = new RelayUserInfo$a();
    }
    public void RelayUserInfo(String p0,String p1,String p2){
       a.p(p0, "id");
       super();
       this.id = p0;
       this.profileLocalPath = p1;
       this.profileUrl = p2;
    }
    public static RelayUserInfo copy$default(RelayUserInfo p0,String p1,String p2,String p3,int p4,Object p5){
       RelayUserInfo id;
       RelayUserInfo profileLocal;
       RelayUserInfo profileUrl;
       if (p4 & 0x01) {
          id = p0.id;
       }
       if (p4 & 0x02) {
          profileLocal = p0.profileLocalPath;
       }
       if (p4 & 0x04) {
          profileUrl = p0.profileUrl;
       }
       return p0.copy(id, profileLocal, profileUrl);
    }
    public final String component1(){
       return this.id;
    }
    public final String component2(){
       return this.profileLocalPath;
    }
    public final String component3(){
       return this.profileUrl;
    }
    public final RelayUserInfo copy(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, RelayUserInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "id");
       return new RelayUserInfo(p0, p1, p2);
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RelayUserInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof RelayUserInfo) {
          return TextUtils.n(this.id, p0.id);
       }
       return false;
    }
    public final String getId(){
       return this.id;
    }
    public final String getProfileLocalPath(){
       return this.profileLocalPath;
    }
    public final String getProfileUrl(){
       return this.profileUrl;
    }
    public int hashCode(){
       RelayUserInfo obj = PatchProxy.apply(null, this, RelayUserInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.id;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       RelayUserInfo tprofileLoca = this.profileLocalPath;
       int i2 = (tprofileLoca != null)? tprofileLoca.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tprofileLoca = this.profileUrl;
       if (tprofileLoca != null) {
          i = tprofileLoca.hashCode();
       }
       return (i1 + i);
    }
    public final void setProfileLocalPath(String p0){
       this.profileLocalPath = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RelayUserInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RelayUserInfo\(id="+this.id+", profileLocalPath="+this.profileLocalPath+", profileUrl="+this.profileUrl+"\)";
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(RelayUserInfo.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, RelayUserInfo.class, "5")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeString(this.id);
       p0.writeString(this.profileLocalPath);
       p0.writeString(this.profileUrl);
       return;
    }
}
