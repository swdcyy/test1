package com.kwai.chat.kwailink.data.ZtCommonInfo;
import android.os.Parcelable;
import com.kwai.chat.kwailink.data.ZtCommonInfo$a;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class ZtCommonInfo implements Parcelable	// class@000a4d
{
    public String b;
    public String c;
    public long d;
    public String e;
    public long f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public static final Parcelable$Creator CREATOR;

    static {
       ZtCommonInfo.CREATOR = new ZtCommonInfo$a();
    }
    public void ZtCommonInfo(){
       super();
       this.b = "N/A";
       this.c = "N/A";
       this.e = "N/A";
       this.g = "N/A";
       this.h = "N/A";
       this.i = "N/A";
       this.j = "N/A";
       this.k = "N/A";
       this.l = "N/A";
       this.m = "N/A";
       this.n = "N/A";
       this.o = "N/A";
       this.p = "N/A";
    }
    public void ZtCommonInfo(Parcel p0){
       super();
       this.b = "N/A";
       this.c = "N/A";
       this.e = "N/A";
       this.g = "N/A";
       this.h = "N/A";
       this.i = "N/A";
       this.j = "N/A";
       this.k = "N/A";
       this.l = "N/A";
       this.m = "N/A";
       this.n = "N/A";
       this.o = "N/A";
       this.p = "N/A";
       this.b = p0.readString();
       this.c = p0.readString();
       this.d = p0.readLong();
       this.e = p0.readString();
       this.f = p0.readLong();
       this.g = p0.readString();
       this.h = p0.readString();
       this.i = p0.readString();
       this.j = p0.readString();
       this.k = p0.readString();
       this.l = p0.readString();
       this.m = p0.readString();
       this.n = p0.readString();
       this.o = p0.readString();
       this.p = p0.readString();
    }
    public String a(){
       return this.g;
    }
    public String b(){
       return this.n;
    }
    public String c(){
       return this.p;
    }
    public String d(){
       return this.c;
    }
    public int describeContents(){
       return 0;
    }
    public String e(){
       return this.b;
    }
    public String f(){
       return this.o;
    }
    public String g(){
       return this.i;
    }
    public String h(){
       return this.j;
    }
    public String i(){
       return this.k;
    }
    public String j(){
       return this.l;
    }
    public String k(){
       return this.m;
    }
    public long l(){
       return this.d;
    }
    public String m(){
       return this.h;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(ZtCommonInfo.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ZtCommonInfo.class, "1")) {
          return;
       }
       p0.writeString(this.b);
       p0.writeString(this.c);
       p0.writeLong(this.d);
       p0.writeString(this.e);
       p0.writeLong(this.f);
       p0.writeString(this.g);
       p0.writeString(this.h);
       p0.writeString(this.i);
       p0.writeString(this.j);
       p0.writeString(this.k);
       p0.writeString(this.l);
       p0.writeString(this.m);
       p0.writeString(this.n);
       p0.writeString(this.o);
       p0.writeString(this.p);
       return;
    }
}
