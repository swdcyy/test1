package com.unionpay.a.d;
import java.lang.String;
import java.lang.Object;
import java.net.URL;
import java.util.HashMap;

public final class d	// class@000ff2
{
    public int a;
    public String b;
    public HashMap c;
    public byte[] d;
    public String e;

    public void d(String p0){
       super();
       this.a = 1;
       this.b = p0;
       this.c = null;
       this.d = null;
    }
    public final URL a(){
       URL uRL;
       try{
          uRL = new URL(this.b);
       }catch(java.lang.Exception e0){
          uRL = null;
       }
       return uRL;
    }
    public final void a(String p0){
       if (p0 != null) {
          this.d = p0.getBytes();
          this.e = p0;
       }
       return;
    }
    public final String b(){
       if (this.a == 1) {
          return "POST";
       }
       return "GET";
    }
    public final String c(){
       return this.e;
    }
    public final HashMap d(){
       return this.c;
    }
}
