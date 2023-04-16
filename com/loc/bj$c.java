package com.loc.bj$c;
import java.lang.Cloneable;
import java.lang.Object;
import com.loc.bl$b;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.loc.bc;
import com.loc.p;
import com.loc.bj;

public final class bj$c implements Cloneable	// class@001397
{
    public String a;
    public bl$b b;
    public String c;
    public String d;
    public String e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public String k;
    public String l;
    public int m;
    public int n;

    public void bj$c(){
       super();
       this.a = "";
       this.b = bl$b.a;
       this.c = "";
       this.d = "";
       this.e = "";
       this.f = 0;
       this.g = 0;
       this.h = 0;
       this.i = 0;
       this.j = 0;
       this.k = "-";
       this.l = "-";
       this.m = 0;
       this.n = 0;
    }
    public final bj$c a(){
       try{
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          return null;
       }
    }
    public final String b(){
       String str = "-#";
       String str1 = "#";
       String str2 = (!TextUtils.isEmpty(this.c))? this.c+str1: str;
       str2 = (!TextUtils.isEmpty(this.d))? str2+this.d+str1: str2+str;
       bj.a();
       return p.b(bc.a((str2+this.b.a()+str1+this.h+str1+this.j+str1+this.f).getBytes(), ("YXBtX25ldHdvcmtf").getBytes()));
    }
    public final Object clone(){
       return this.a();
    }
    public final String toString(){
       return "RequestInfo{csid=\'"+this.a+'''+", degradeType="+this.b+", serverIp=\'"+this.c+'''+", path=\'"+this.d+'''+", hostname=\'"+this.e+'''+", totalTime="+this.f+", DNSTime="+this.g+", connectionTime="+this.h+", writeTime="+this.i+", readTime="+this.j+", serverTime=\'"+this.k+'''+", datasize=\'"+this.l+'''+", errorcode="+this.m+", errorcodeSub="+this.n+'}';
    }
}
