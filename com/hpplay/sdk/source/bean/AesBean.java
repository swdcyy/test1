package com.hpplay.sdk.source.bean.AesBean;
import android.os.Parcelable;
import com.hpplay.sdk.source.bean.AesBean$1;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import org.json.JSONObject;
import java.lang.Throwable;
import com.hpplay.sdk.source.a.a;

public class AesBean implements Parcelable	// class@000643
{
    public String iv;
    public String key;
    public int mode;
    public static final Parcelable$Creator CREATOR;

    static {
       AesBean.CREATOR = new AesBean$1();
    }
    public void AesBean(){
       super();
    }
    public void AesBean(Parcel p0){
       super();
       this.mode = p0.readInt();
       this.key = p0.readString();
       this.iv = p0.readString();
    }
    public int describeContents(){
       return 0;
    }
    public JSONObject encode(){
       JSONObject jSONObject;
       try{
          jSONObject = new JSONObject();
          jSONObject.put("mode", this.mode);
          jSONObject.put("key", this.key);
          jSONObject.put("iv", this.iv);
       }catch(java.lang.Exception e1){
          a.b("AesBean", e1);
       }
       return jSONObject;
    }
    public String getIv(){
       return this.iv;
    }
    public String getKey(){
       return this.key;
    }
    public int getMode(){
       return this.mode;
    }
    public void setIv(String p0){
       this.iv = p0;
    }
    public void setKey(String p0){
       this.key = p0;
    }
    public void setMode(int p0){
       this.mode = p0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.mode);
       p0.writeString(this.key);
       p0.writeString(this.iv);
    }
}
