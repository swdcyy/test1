package com.loc.ei;
import android.os.Parcelable;
import com.loc.ei$1;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;

public final class ei implements Parcelable	// class@001405
{
    public long a;
    public long b;
    public long c;
    public long d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public static final Parcelable$Creator CREATOR;

    static {
       ei.CREATOR = new ei$1();
    }
    public void ei(){
       super();
       this.a = 0;
       this.b = 0;
       this.c = 0;
       this.d = 0;
       this.g = "first";
       this.h = "";
       this.i = "";
       this.j = null;
    }
    public final long a(){
       ei td = this.d;
       ei tc = this.c;
       if ((td - tc) <= 0) {
          return 0;
       }
       return (td - tc);
    }
    public final void a(long p0){
       this.c = p0;
    }
    public final void a(String p0){
       this.i = p0;
    }
    public final String b(){
       return this.i;
    }
    public final void b(long p0){
       this.d = p0;
    }
    public final void b(String p0){
       this.j = p0;
    }
    public final String c(){
       return this.j;
    }
    public final void c(long p0){
       this.a = p0;
    }
    public final void c(String p0){
       this.e = p0;
    }
    public final String d(){
       return this.e;
    }
    public final void d(long p0){
       this.b = p0;
    }
    public final void d(String p0){
       this.f = p0;
    }
    public final int describeContents(){
       return 0;
    }
    public final String e(){
       return this.f;
    }
    public final void e(String p0){
       this.g = p0;
    }
    public final String f(){
       return this.g;
    }
    public final void f(String p0){
       this.h = p0;
    }
    public final String g(){
       return this.h;
    }
    public final long h(){
       ei tb = this.b;
       ei ta = this.a;
       if (tb - ta <= 0) {
          return 0;
       }
       return (tb - ta);
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.e);
       p0.writeString(this.f);
       p0.writeString(this.g);
       p0.writeString(this.h);
       p0.writeString(this.j);
       p0.writeLong(this.a);
       p0.writeLong(this.b);
       p0.writeLong(this.c);
       p0.writeLong(this.d);
       p0.writeString(this.i);
    }
}
