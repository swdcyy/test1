package com.meizu.cloud.pushsdk.handler.a.c.c;
import android.os.Parcelable;
import com.meizu.cloud.pushsdk.handler.a.c.c$1;
import android.os.Parcel;
import java.lang.Object;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;

public class c implements Parcelable	// class@00153b
{
    public MessageV3 a;
    public String b;
    public int c;
    public int d;
    public static final Parcelable$Creator CREATOR;

    static {
       c.CREATOR = new c$1();
    }
    public void c(Parcel p0){
       super();
       this.a = p0.readParcelable(MessageV3.class.getClassLoader());
       this.b = p0.readString();
       this.c = p0.readInt();
       this.d = p0.readInt();
    }
    public void c(MessageV3 p0){
       this.a = p0;
    }
    public MessageV3 a(){
       return this.a;
    }
    public void a(int p0){
       this.c = p0;
    }
    public void a(String p0){
       this.b = p0;
    }
    public int b(){
       return this.c;
    }
    public void b(int p0){
       this.d = p0;
    }
    public int c(){
       return this.d;
    }
    public int describeContents(){
       return 0;
    }
    public String toString(){
       return "NotificationState{messageV3="+this.a+", notificationPkg=\'"+this.b+'''+", notificationId=\'"+this.c+'''+", state=\'"+this.d+'''+'}';
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeParcelable(this.a, p1);
       p0.writeString(this.b);
       p0.writeInt(this.c);
       p0.writeInt(this.d);
    }
}
