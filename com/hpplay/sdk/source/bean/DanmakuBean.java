package com.hpplay.sdk.source.bean.DanmakuBean;
import android.os.Parcelable;
import com.hpplay.sdk.source.bean.DanmakuBean$1;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import java.net.URLEncoder;
import java.lang.Throwable;
import com.hpplay.sdk.source.a.a;
import org.json.JSONObject;
import java.util.UUID;

public class DanmakuBean implements Parcelable	// class@000647
{
    public int columSpace;
    public String content;
    public long displayTime;
    public String fontColor;
    public int fontSize;
    public boolean immShow;
    public static final Parcelable$Creator CREATOR;

    static {
       DanmakuBean.CREATOR = new DanmakuBean$1();
    }
    public void DanmakuBean(){
       super();
    }
    public void DanmakuBean(Parcel p0){
       super();
       this.content = p0.readString();
       this.fontColor = p0.readString();
       this.displayTime = p0.readLong();
       this.fontSize = p0.readInt();
       this.columSpace = p0.readInt();
       boolean b = (p0.readByte())? true: false;
       this.immShow = b;
       return;
    }
    public int describeContents(){
       return 0;
    }
    public void setColumSpace(int p0){
       this.columSpace = p0;
    }
    public void setContent(String p0){
       try{
          this.content = URLEncoder.encode(p0, "utf-8");
       }catch(java.io.UnsupportedEncodingException e2){
          a.b("DanmakuBean", e2);
       }
       return;
    }
    public void setDisplayTime(long p0){
       this.displayTime = p0;
    }
    public void setFontColor(String p0){
       this.fontColor = p0;
    }
    public void setFontSize(int p0){
       this.fontSize = p0;
    }
    public void setImmShow(boolean p0){
       this.immShow = p0;
    }
    public String toJson(String p0,int p1){
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("manifestVer", p1);
          jSONObject.put("danmukuId", UUID.randomUUID().toString());
          jSONObject.put("content", this.content);
          jSONObject.put("displayTime", this.displayTime);
          jSONObject.put("fontSize", this.fontSize);
          jSONObject.put("fontColor", this.fontColor);
          jSONObject.put("columSpace", this.columSpace);
          jSONObject.put("immShow", this.immShow);
          jSONObject.put("uri", p0);
          a.f("DanmakuBean", jSONObject.toString());
          return jSONObject.toString();
       }catch(java.lang.Exception e5){
          a.b(v0, e5);
          return null;
       }
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.content);
       p0.writeString(this.fontColor);
       p0.writeLong(this.displayTime);
       p0.writeInt(this.fontSize);
       p0.writeInt(this.columSpace);
       p0.writeByte(this.immShow);
    }
}
