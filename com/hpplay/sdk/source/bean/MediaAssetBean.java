package com.hpplay.sdk.source.bean.MediaAssetBean;
import android.os.Parcelable;
import com.hpplay.sdk.source.bean.MediaAssetBean$1;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import org.json.JSONObject;
import java.lang.Throwable;
import com.hpplay.sdk.source.a.a;

public class MediaAssetBean implements Parcelable	// class@00064e
{
    public String actor;
    public String director;
    public String id;
    public String manifestVer;
    public String mediaType;
    public String name;
    public String uri;
    public static final Parcelable$Creator CREATOR;

    static {
       MediaAssetBean.CREATOR = new MediaAssetBean$1();
    }
    public void MediaAssetBean(){
       super();
    }
    public void MediaAssetBean(Parcel p0){
       super();
       this.manifestVer = p0.readString();
       this.uri = p0.readString();
       this.id = p0.readString();
       this.mediaType = p0.readString();
       this.name = p0.readString();
       this.director = p0.readString();
       this.actor = p0.readString();
    }
    public int describeContents(){
       return 0;
    }
    public JSONObject encode(){
       JSONObject jSONObject;
       try{
          jSONObject = new JSONObject();
          jSONObject.put("manifestVer", this.manifestVer);
          jSONObject.put("uri", this.uri);
          jSONObject.put("id", this.id);
          jSONObject.put("mediaType", this.mediaType);
          jSONObject.put("name", this.name);
          jSONObject.put("director", this.director);
          jSONObject.put("actor", this.actor);
       }catch(java.lang.Exception e1){
          a.b("MediaAssetBean", e1);
       }
       return jSONObject;
    }
    public String getActor(){
       return this.actor;
    }
    public String getDirector(){
       return this.director;
    }
    public String getId(){
       return this.id;
    }
    public String getManifestVer(){
       return this.manifestVer;
    }
    public String getMediaType(){
       return this.mediaType;
    }
    public String getName(){
       return this.name;
    }
    public String getUri(){
       return this.uri;
    }
    public void setActor(String p0){
       this.actor = p0;
    }
    public void setDirector(String p0){
       this.director = p0;
    }
    public void setId(String p0){
       this.id = p0;
    }
    public void setManifestVer(String p0){
       this.manifestVer = p0;
    }
    public void setMediaType(String p0){
       this.mediaType = p0;
    }
    public void setName(String p0){
       this.name = p0;
    }
    public void setUri(String p0){
       this.uri = p0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeString("MediaAssetBean");
       p0.writeString(this.manifestVer);
       p0.writeString(this.uri);
       p0.writeString(this.id);
       p0.writeString(this.mediaType);
       p0.writeString(this.name);
       p0.writeString(this.director);
       p0.writeString(this.actor);
    }
}
