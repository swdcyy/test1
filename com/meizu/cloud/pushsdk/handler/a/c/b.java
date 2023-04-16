package com.meizu.cloud.pushsdk.handler.a.c.b;
import android.os.Parcelable;
import com.meizu.cloud.pushsdk.handler.a.c.b$1;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import com.meizu.cloud.pushsdk.handler.a.c.a;
import java.lang.ClassLoader;
import java.lang.Class;
import com.meizu.cloud.pushsdk.handler.a.c.f;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import java.lang.StringBuilder;
import org.json.JSONException;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.Exception;

public class b implements Parcelable	// class@001539
{
    public String a;
    public a b;
    public f c;
    public static final Parcelable$Creator CREATOR;

    static {
       b.CREATOR = new b$1();
    }
    public void b(){
       super();
    }
    public void b(Parcel p0){
       super();
       this.a = p0.readString();
       this.b = p0.readParcelable(a.class.getClassLoader());
       this.c = p0.readParcelable(f.class.getClassLoader());
    }
    public void b(String p0,String p1,String p2){
       super();
       this.a = p0;
       if (!TextUtils.isEmpty(p0)) {
          try{
             JSONObject jSONObject = new JSONObject(p0);
             this.b = a.a(jSONObject.getJSONObject("ctl"));
             f uof = f.a(jSONObject.getJSONObject("statics"));
             this.c = uof;
             uof.c(p1);
             this.c.d(p2);
          }catch(org.json.JSONException e2){
             this.b = new a();
             this.c = new f();
             DebugLogger.e("ControlMessage", "parse control message error "+e2.getMessage());
          }
       }else {
          this.b = new a();
          this.c = new f();
       }
    }
    public static b a(String p0){
       b uob;
       try{
          uob = new b();
          JSONObject jSONObject = new JSONObject(p0);
          uob.a(a.a(jSONObject.getJSONObject("ctl")));
          uob.a(f.a(jSONObject.getJSONObject("statics")));
       }catch(java.lang.Exception e3){
          DebugLogger.e("ControlMessage", "parse control message error "+e3.getMessage());
          uob.a(new f());
          uob.a(new a());
       }
       return uob;
    }
    public a a(){
       return this.b;
    }
    public void a(a p0){
       this.b = p0;
    }
    public void a(f p0){
       this.c = p0;
    }
    public f b(){
       return this.c;
    }
    public int describeContents(){
       return 0;
    }
    public String toString(){
       return "ControlMessage{controlMessage=\'"+this.a+'''+", control="+this.b+", statics="+this.c+'}';
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.a);
       p0.writeParcelable(this.b, p1);
       p0.writeParcelable(this.c, p1);
    }
}
