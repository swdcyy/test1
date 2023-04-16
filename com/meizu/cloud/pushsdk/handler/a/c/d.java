package com.meizu.cloud.pushsdk.handler.a.c.d;
import java.lang.Object;
import com.meizu.cloud.pushsdk.handler.a.c.d$a;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.d.a.c;

public class d	// class@00153d
{
    public String a;
    public String b;
    public String c;
    public String d;

    public void d(){
       super();
    }
    public void d(d$a p0){
       super();
       String str = "";
       String str1 = (!TextUtils.isEmpty(d$a.a(p0)))? d$a.a(p0): str;
       this.a = str1;
       str1 = (!TextUtils.isEmpty(d$a.b(p0)))? d$a.b(p0): str;
       this.b = str1;
       str1 = (!TextUtils.isEmpty(d$a.c(p0)))? d$a.c(p0): str;
       this.c = str1;
       if (!TextUtils.isEmpty(d$a.d(p0))) {
          str = d$a.d(p0);
       }
       this.d = str;
       return;
    }
    public static d$a a(){
       return new d$a();
    }
    public String b(){
       c uoc = new c();
       uoc.a("task_id", this.a);
       uoc.a("seq_id", this.b);
       uoc.a("push_timestamp", this.c);
       uoc.a("device_id", this.d);
       return uoc.toString();
    }
    public String c(){
       return this.a;
    }
    public String d(){
       return this.b;
    }
    public String e(){
       return this.c;
    }
    public String f(){
       return this.d;
    }
}
