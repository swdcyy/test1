package com.meizu.cloud.pushsdk.handler.a.c.h;
import android.os.Parcelable;
import com.meizu.cloud.pushsdk.handler.a.c.h$1;
import android.os.Parcel;
import java.lang.Object;
import com.meizu.cloud.pushsdk.handler.a.c.b;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.String;
import org.json.JSONObject;
import java.lang.StringBuilder;
import org.json.JSONException;
import com.meizu.cloud.pushinternal.DebugLogger;

public class h implements Parcelable	// class@001545
{
    public b a;
    public String b;
    public int c;
    public static final Parcelable$Creator CREATOR;

    static {
       h.CREATOR = new h$1();
    }
    public void h(Parcel p0){
       super();
       this.a = p0.readParcelable(b.class.getClassLoader());
       this.b = p0.readString();
       this.c = p0.readInt();
    }
    public void h(String p0,String p1,String p2,String p3,String p4){
       super();
       try{
          this.b = p1;
          JSONObject jSONObject = new JSONObject(p0);
          if (!jSONObject.isNull("notifyId")) {
             this.c = jSONObject.getInt("notifyId");
          }
       }catch(org.json.JSONException e2){
          DebugLogger.e("WithDrawMessage", "parse WithDrawMessage error "+e2.getMessage());
       }
       this.a = new b(p2, p3, p4);
       return;
    }
    public b a(){
       return this.a;
    }
    public int b(){
       return this.c;
    }
    public String c(){
       return this.b;
    }
    public int describeContents(){
       return 0;
    }
    public String toString(){
       return "WithDrawMessage{controlMessage="+this.a+", revokePackageName=\'"+this.b+'''+", notifyId="+this.c+'}';
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeParcelable(this.a, p1);
       p0.writeString(this.b);
       p0.writeInt(this.c);
    }
}
