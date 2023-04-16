package com.meizu.cloud.pushsdk.b.b$a;
import com.meizu.cloud.pushsdk.b.b;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.Thread;

public class b$a	// class@00149d
{
    public final String a;
    public final String b;
    public final String c;
    public final b d;

    public void b$a(b p0,String p1,String p2,String p3){
       this.d = p0;
       super();
       this.a = b.e(p0).format(new Date())+" "+b.f(p0)+"-"+Thread.currentThread().getId()+" "+p1+"/";
       this.b = p2;
       this.c = p3;
    }
}
