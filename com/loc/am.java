package com.loc.am;
import com.loc.r;
import java.lang.String;
import java.lang.Object;
import com.loc.bl$a;
import com.loc.bl;
import com.loc.bl$c;
import java.util.Map;
import java.util.HashMap;
import com.loc.ag;
import com.loc.x;
import java.lang.System;
import com.loc.s;

public final class am extends r	// class@00136d
{
    public byte[] a;
    public String b;

    public void am(byte[] p0,String p1){
       super();
       this.b = "1";
       this.a = p0.clone();
       this.b = p1;
       this.a(bl$a.e);
       this.a(bl$c.a);
    }
    public final Map a(){
       HashMap hashMap = new HashMap();
       hashMap.put("Content-Type", "application/zip");
       hashMap.put("Content-Length", String.valueOf(this.a.length));
       return hashMap;
    }
    public final String b(){
       byte[] uobyteArray1;
       Object[] objArray = new Object[]{"1",this.b,"1","open",s.a(uobyteArray1)};
       byte[] uobyteArray = x.a(ag.a);
       uobyteArray1 = new byte[(uobyteArray.length + 50)];
       System.arraycopy(this.a, 0, uobyteArray1, 0, 50);
       System.arraycopy(uobyteArray, 0, uobyteArray1, 50, uobyteArray.length);
       return String.format(x.c(ag.b), objArray);
    }
    public final boolean c_(){
       return false;
    }
    public final Map d(){
       return null;
    }
    public final byte[] e(){
       return this.a;
    }
}
