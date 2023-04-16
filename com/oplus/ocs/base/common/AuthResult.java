package com.oplus.ocs.base.common.AuthResult;
import android.os.Parcelable;
import com.oplus.ocs.base.common.AuthResult$1;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;

public class AuthResult implements Parcelable	// class@000ab3
{
    public String a;
    public int b;
    public int c;
    public int d;
    public byte[] e;
    public static final Parcelable$Creator CREATOR;

    static {
       AuthResult.CREATOR = new AuthResult$1();
    }
    public void AuthResult(Parcel p0){
       super();
       this.a = p0.readString();
       this.b = p0.readInt();
       this.c = p0.readInt();
       this.d = p0.readInt();
       this.e = p0.createByteArray();
    }
    public void AuthResult(String p0,int p1,int p2,int p3,byte[] p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public int describeContents(){
       return 0;
    }
    public int getErrrorCode(){
       return this.d;
    }
    public String getPackageName(){
       return this.a;
    }
    public byte[] getPermitBits(){
       return this.e;
    }
    public int getPid(){
       return this.c;
    }
    public int getUid(){
       return this.b;
    }
    public void setErrrorCode(int p0){
       this.d = p0;
    }
    public void setPackageName(String p0){
       this.a = p0;
    }
    public void setPermitBits(byte[] p0){
       this.e = p0;
    }
    public void setPid(int p0){
       this.c = p0;
    }
    public void setUid(int p0){
       this.b = p0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.a);
       p0.writeInt(this.b);
       p0.writeInt(this.c);
       p0.writeInt(this.d);
       p0.writeByteArray(this.e);
    }
}
