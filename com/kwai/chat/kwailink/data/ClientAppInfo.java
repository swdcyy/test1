package com.kwai.chat.kwailink.data.ClientAppInfo;
import android.os.Parcelable;
import com.kwai.chat.kwailink.data.ClientAppInfo$a;
import java.lang.Object;
import java.util.HashMap;
import com.kwai.chat.kwailink.data.ClientAppInfo$b;
import java.lang.String;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Integer;

public class ClientAppInfo implements Parcelable	// class@000a44
{
    public int b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public int m;
    public Map n;
    public static final Parcelable$Creator CREATOR;

    static {
       ClientAppInfo.CREATOR = new ClientAppInfo$a();
    }
    public void ClientAppInfo(){
       super();
       this.b = 0;
       this.c = 0;
       this.d = "N/A";
       this.e = "N/A";
       this.f = "N/A";
       this.g = "N/A";
       this.h = "N/A";
       this.i = "N/A";
       this.j = "N/A";
       this.k = "N/A";
       this.l = "N/A";
       this.m = 0;
       this.n = new HashMap();
    }
    public void ClientAppInfo(ClientAppInfo$b p0){
       super();
       this.b = 0;
       this.c = 0;
       this.d = "N/A";
       this.e = "N/A";
       this.f = "N/A";
       this.g = "N/A";
       this.h = "N/A";
       this.i = "N/A";
       this.j = "N/A";
       this.k = "N/A";
       this.l = "N/A";
       this.m = 0;
       this.n = new HashMap();
       this.b = p0.a;
       this.c = p0.b;
       this.e = p0.d;
       this.f = p0.e;
       this.d = p0.c;
       this.g = p0.f;
       this.h = p0.g;
       this.i = p0.h;
       this.j = p0.i;
       this.k = p0.j;
       this.l = p0.k;
       this.m = p0.l;
       this.n = p0.m;
    }
    public void A(String p0){
       this.j = p0;
    }
    public void B(String p0){
       this.k = p0;
    }
    public void C(String p0){
       this.i = p0;
    }
    public int a(){
       return this.b;
    }
    public String b(){
       return this.d;
    }
    public String c(){
       return this.g;
    }
    public String d(){
       return this.f;
    }
    public int describeContents(){
       return 0;
    }
    public int e(){
       return this.c;
    }
    public String f(){
       return this.e;
    }
    public String g(){
       return this.h;
    }
    public String h(){
       return this.l;
    }
    public int i(){
       return this.m;
    }
    public Map j(){
       return this.n;
    }
    public String k(){
       return this.j;
    }
    public String l(){
       return this.k;
    }
    public String m(){
       return this.i;
    }
    public void n(int p0){
       this.b = p0;
    }
    public void o(String p0){
       this.d = p0;
    }
    public void q(String p0){
       this.g = p0;
    }
    public void t(String p0){
       this.f = p0;
    }
    public String toString(){
       StringBuilder obj = PatchProxy.apply(null, this, ClientAppInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = ";";
       obj = this.b+str+this.c+str+this.e+str+this.f+str+this.d+str+this.g+str+this.h+str+this.i+str+this.j+str+this.k+str+this.l+str+this.m+str;
       ClientAppInfo tn = this.n;
       String str1 = (tn != null)? tn.toString(): " extensionInfoMap is null";
       return obj+str1+str+this.l;
    }
    public void w(int p0){
       this.c = p0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(ClientAppInfo.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ClientAppInfo.class, "3")) {
          return;
       }
       p0.writeInt(this.a());
       p0.writeInt(this.e());
       p0.writeString(this.f());
       p0.writeString(this.d());
       p0.writeString(this.b());
       p0.writeString(this.c());
       p0.writeString(this.g());
       p0.writeString(this.m());
       p0.writeString(this.k());
       p0.writeString(this.l());
       p0.writeString(this.h());
       p0.writeInt(this.i());
       p0.writeMap(this.j());
       return;
    }
    public void x(String p0){
       this.e = p0;
    }
    public void y(String p0){
       this.h = p0;
    }
    public void z(int p0){
       this.m = p0;
    }
}
