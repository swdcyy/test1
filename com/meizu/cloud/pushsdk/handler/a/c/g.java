package com.meizu.cloud.pushsdk.handler.a.c.g;
import android.os.Parcelable;
import com.meizu.cloud.pushsdk.handler.a.c.g$1;
import android.os.Parcel;
import java.lang.Object;
import java.util.ArrayList;
import com.meizu.cloud.pushsdk.handler.a.c.b;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.String;
import org.json.JSONObject;
import org.json.JSONArray;
import java.util.List;
import java.lang.StringBuilder;
import org.json.JSONException;
import com.meizu.cloud.pushinternal.DebugLogger;

public class g implements Parcelable	// class@001543
{
    public int a;
    public boolean b;
    public List c;
    public b d;
    public String e;
    public static final Parcelable$Creator CREATOR;

    static {
       g.CREATOR = new g$1();
    }
    public void g(Parcel p0){
       super();
       this.a = p0.readInt();
       boolean b = (p0.readByte())? true: false;
       this.b = b;
       this.c = p0.createStringArrayList();
       this.d = p0.readParcelable(b.class.getClassLoader());
       this.e = p0.readString();
       return;
    }
    public void g(String p0,String p1,String p2,String p3){
       String str = "upload_files";
       String str1 = "wifi_upload";
       String str2 = "max_size";
       super();
       try{
          this.e = p0;
          JSONObject jSONObject = new JSONObject(p0);
          if (!jSONObject.isNull(str2)) {
             this.a = jSONObject.getInt(str2);
          label_001c :
             if (!jSONObject.isNull(str1)) {
                this.b = jSONObject.getBoolean(str1);
             }
             if (!jSONObject.isNull(str)) {
                JSONArray jSONArray = jSONObject.getJSONArray(str);
                this.c = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i = i + 1) {
                   this.c.add(jSONArray.getString(i));
                }
             }
          }else {
             goto label_001c ;
          }
       }catch(org.json.JSONException e5){
          DebugLogger.e("UploadLogMessage", "parse upload message error "+e5.getMessage());
       }
       this.d = new b(p1, p2, p3);
       return;
    }
    public int a(){
       return this.a;
    }
    public boolean b(){
       return this.b;
    }
    public List c(){
       return this.c;
    }
    public b d(){
       return this.d;
    }
    public int describeContents(){
       return 0;
    }
    public String toString(){
       return "UploadLogMessage{maxSize="+this.a+", wifiUpload="+this.b+", fileList="+this.c+", controlMessage="+this.d+", uploadMessage=\'"+this.e+'''+'}';
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.a);
       p0.writeByte((byte)this.b);
       p0.writeStringList(this.c);
       p0.writeParcelable(this.d, p1);
       p0.writeString(this.e);
    }
}
