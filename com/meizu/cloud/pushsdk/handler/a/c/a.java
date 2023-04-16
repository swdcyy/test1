package com.meizu.cloud.pushsdk.handler.a.c.a;
import android.os.Parcelable;
import com.meizu.cloud.pushsdk.handler.a.c.a$1;
import java.lang.Object;
import android.os.Parcel;
import org.json.JSONObject;
import java.lang.String;
import java.lang.StringBuilder;
import org.json.JSONException;
import com.meizu.cloud.pushinternal.DebugLogger;

public class a implements Parcelable	// class@001537
{
    public int a;
    public int b;
    public int c;
    public static final Parcelable$Creator CREATOR;

    static {
       a.CREATOR = new a$1();
    }
    public void a(){
       super();
    }
    public void a(Parcel p0){
       super();
       this.a = p0.readInt();
       this.b = p0.readInt();
       this.c = p0.readInt();
    }
    public static a a(JSONObject p0){
       String str2;
       String str = "cached";
       String str1 = "pushType";
       a uoa = new a();
       if (p0 != null) {
          try{
             if (!p0.isNull(str1)) {
                uoa.a(p0.getInt(str1));
             label_001c :
                if (!p0.isNull(str)) {
                   uoa.b(p0.getInt(str));
                }
                if (!p0.isNull("cacheNum")) {
                   uoa.c(p0.getInt("cacheNum"));
                }
             }else {
                goto label_001c ;
             }
             return uoa;
          }catch(org.json.JSONException e6){
             str2 = " parse control message error "+e6.getMessage();
          }
          DebugLogger.e("ctl", str2);
          goto label_0053 ;
       }else {
          str2 = "no control message can parse ";
          goto label_0050 ;
       }
    }
    public int a(){
       return this.a;
    }
    public void a(int p0){
       this.a = p0;
    }
    public void b(int p0){
       this.b = p0;
    }
    public void c(int p0){
       this.c = p0;
    }
    public int describeContents(){
       return 0;
    }
    public String toString(){
       return "Control{pushType="+this.a+", cached="+this.b+", cacheNum="+this.c+'}';
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.a);
       p0.writeInt(this.b);
       p0.writeInt(this.c);
    }
}
