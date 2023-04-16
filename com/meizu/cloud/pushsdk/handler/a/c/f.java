package com.meizu.cloud.pushsdk.handler.a.c.f;
import android.os.Parcelable;
import com.meizu.cloud.pushsdk.handler.a.c.f$1;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import org.json.JSONObject;
import java.lang.StringBuilder;
import org.json.JSONException;
import com.meizu.cloud.pushinternal.DebugLogger;

public class f implements Parcelable	// class@001541
{
    public String a;
    public String b;
    public boolean c;
    public String d;
    public String e;
    public static final Parcelable$Creator CREATOR;

    static {
       f.CREATOR = new f$1();
    }
    public void f(){
       this.c = false;
    }
    public void f(Parcel p0){
       super();
       boolean b = false;
       this.c = b;
       this.a = p0.readString();
       this.b = p0.readString();
       if (p0.readByte()) {
          b = true;
       }
       this.c = b;
       this.d = p0.readString();
       this.e = p0.readString();
       return;
    }
    public static f a(JSONObject p0){
       String str2;
       String str = "time";
       String str1 = "taskId";
       f uof = new f();
       if (p0 != null) {
          try{
             if (!p0.isNull(str1)) {
                uof.a(p0.getString(str1));
             label_001c :
                if (!p0.isNull(str)) {
                   uof.b(p0.getString(str));
                }
                if (!p0.isNull("pushExtra")) {
                   boolean b = (!p0.getInt("pushExtra"))? true: false;
                   uof.a(b);
                }
             }else {
                goto label_001c ;
             }
             return uof;
          }catch(org.json.JSONException e6){
             str2 = " parse statics message error "+e6.getMessage();
          }
          DebugLogger.e("statics", str2);
          goto label_0058 ;
       }else {
          str2 = "no control statics can parse ";
          goto label_0055 ;
       }
    }
    public String a(){
       return this.a;
    }
    public void a(String p0){
       this.a = p0;
    }
    public void a(boolean p0){
       this.c = p0;
    }
    public String b(){
       return this.b;
    }
    public void b(String p0){
       this.b = p0;
    }
    public void c(String p0){
       this.d = p0;
    }
    public boolean c(){
       return this.c;
    }
    public String d(){
       return this.d;
    }
    public void d(String p0){
       this.e = p0;
    }
    public int describeContents(){
       return 0;
    }
    public String e(){
       return this.e;
    }
    public String toString(){
       return "Statics{taskId=\'"+this.a+'''+", time=\'"+this.b+'''+", pushExtra="+this.c+", deviceId=\'"+this.d+'''+", seqId=\'"+this.e+'''+'}';
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.a);
       p0.writeString(this.b);
       p0.writeByte((byte)this.c);
       p0.writeString(this.d);
       p0.writeString(this.e);
    }
}
