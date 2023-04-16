package com.unionpay.utils.k;
import java.lang.Object;
import java.util.Locale;
import java.lang.String;
import com.unionpay.utils.l;
import com.unionpay.utils.m;

public class k	// class@001013
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public static k f;

    public void k(){
       super();
       this.a = "";
       this.b = "";
       this.c = "";
       this.d = "";
       this.e = "";
    }
    public static k a(){
       if (k.f == null) {
          l ol = ((Locale.getDefault().toString()).startsWith("zh"))? new l(): new m();
          k.f = ol;
       }
       return k.f;
    }
}
