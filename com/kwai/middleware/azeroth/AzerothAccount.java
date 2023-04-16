package com.kwai.middleware.azeroth.AzerothAccount;
import android.os.Parcelable;
import com.kwai.middleware.azeroth.AzerothAccount$b;
import nsd.u;
import com.kwai.middleware.azeroth.AzerothAccount$a;
import java.lang.String;
import android.os.Parcel;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import java.lang.Class;
import kotlin.TypeCastException;
import java.lang.Boolean;
import java.lang.StringBuilder;

public final class AzerothAccount implements Parcelable	// class@000ef6
{
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public static final Parcelable$Creator CREATOR;
    public static final AzerothAccount$b g;

    static {
       AzerothAccount.g = new AzerothAccount$b(null);
       AzerothAccount.CREATOR = new AzerothAccount$a();
    }
    public void AzerothAccount(){
       super("", "", "", "", false);
    }
    public void AzerothAccount(Parcel p0){
       a.q(p0, "source");
       String str = p0.readString();
       String str1 = (str != null)? str: "";
       str = p0.readString();
       String str2 = (str != null)? str: "";
       str = p0.readString();
       String str3 = (str != null)? str: "";
       str = p0.readString();
       String str4 = (str != null)? str: "";
       boolean b = (1 == p0.readInt())? true: false;
       super(str1, str2, str3, str4, b);
       return;
    }
    public void AzerothAccount(String p0,String p1,String p2,String p3,boolean p4){
       a.q(p0, "userId");
       a.q(p1, "userPassToken");
       a.q(p2, "serviceToken");
       a.q(p3, "security");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final boolean a(){
       boolean b = false;
       AzerothAccount uAzerothAcco = (this.b.length() > 0)? 1: null;
       if (uAzerothAcco && (a.g(this.b, "0") ^ 1)) {
          b = true;
       }
       return b;
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       AzerothAccount uAzerothAcco = AzerothAccount.class;
       Class class = (p0 != null)? p0.getClass(): null;
       if (a.g(uAzerothAcco, class) ^ b) {
          return false;
       }else if(p0 != null){
          if (a.g(this.b, p0.b) ^ b) {
             return false;
          }else if(a.g(this.c, p0.c) ^ b){
             return false;
          }else if(a.g(this.d, p0.d) ^ b){
             return false;
          }else if(a.g(this.e, p0.e) ^ b){
             return false;
          }else if(this.f != p0.f){
             return false;
          }else {
             return b;
          }
       }else {
          throw new TypeCastException("null cannot be cast to non-null type com.kwai.middleware.azeroth.AzerothAccount");
       }
    }
    public int hashCode(){
       return (((((((((this.b).hashCode() * 31) + (this.c).hashCode()) * 31) + (this.d).hashCode()) * 31) + (this.e).hashCode()) * 31) + Boolean.valueOf(this.f).hashCode());
    }
    public String toString(){
       return "[Azeroth Account]: uid - "+this.b+" passToken - "+this.c+" serviceToken - "+this.d+" security - "+this.e+" isVisitor - "+this.f;
    }
    public void writeToParcel(Parcel p0,int p1){
       a.q(p0, "dest");
       p0.writeString(this.b);
       p0.writeString(this.c);
       p0.writeString(this.d);
       p0.writeString(this.e);
    }
}
