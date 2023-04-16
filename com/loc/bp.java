package com.loc.bp;
import android.content.Context;
import com.loc.w;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import com.loc.o;
import java.lang.Throwable;
import com.loc.x;

public final class bp	// class@0013a4
{
    public Context a;
    public w b;
    public String c;

    public void bp(Context p0,w p1,String p2){
       super();
       this.a = p0.getApplicationContext();
       this.b = p1;
       this.c = p2;
    }
    public static String a(Context p0,w p1,String p2){
       StringBuilder str = "\"sdkversion\":\""+p1.c()+"\",\"product\":\""+p1.a()+"\",\"nt\":\""+o.d(p0)+"\",\"details\":"+p2;
       return str;
    }
    public final byte[] a(){
       return x.a(bp.a(this.a, this.b, this.c));
    }
}
