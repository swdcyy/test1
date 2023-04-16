package com.loc.bw;
import com.loc.ca;
import android.content.Context;
import com.loc.az;
import java.lang.String;
import java.lang.Object;
import com.loc.x;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.loc.an;

public final class bw extends ca	// class@0013ad
{
    public Context a;
    public String b;
    public az e;
    public Object[] f;

    public void bw(Context p0,ca p1,az p2,String p3,Object[] p4){
       super(p1);
       this.a = p0;
       this.b = p3;
       this.e = p2;
       this.f = p4;
    }
    public final byte[] a(byte[] p0){
       String str = x.a(p0);
       if (TextUtils.isEmpty(str)) {
          return null;
       }
       return x.a("{\"pinfo\":\""+x.a(this.e.b(x.a(this.b())))+"\",\"els\":["+str+"]}");
    }
    public final String b(){
       String str = String.format(x.c(this.b), this.f);
       return str;
    }
}
