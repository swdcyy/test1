package com.meizu.cloud.pushsdk.d.e.c;
import com.meizu.cloud.pushsdk.d.e.c$a;
import java.lang.Object;
import java.util.HashMap;
import android.content.Context;
import java.lang.String;
import com.meizu.cloud.pushsdk.d.f.c;
import com.meizu.cloud.pushsdk.d.e.c$1;
import java.util.Map;
import com.meizu.cloud.pushsdk.d.f.e;
import java.lang.StringBuilder;
import android.os.Build$VERSION;
import android.os.Build;

public class c	// class@001525
{
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public static final String a = "c";

    public void c(c$a p0){
       super();
       this.b = new HashMap();
       this.c = new HashMap();
       this.d = new HashMap();
       this.d();
       this.e();
       this.f();
       this.g();
       if (c$a.a(p0) != null) {
          this.a(c$a.a(p0));
       }
       Object[] objArray = new Object[0];
       c.c(c.a, "Subject created successfully.", objArray);
       return;
    }
    public void c(c$a p0,c$1 p1){
       super(p0);
    }
    public Map a(){
       return this.c;
    }
    public void a(Context p0){
       this.b(p0);
    }
    public final void a(String p0,String p1){
       if (p0 != null && (p1 != null && (!p0.isEmpty() && !p1.isEmpty()))) {
          this.d.put(p0, p1);
       }
    label_0015 :
       return;
    }
    public Map b(){
       return this.d;
    }
    public void b(Context p0){
       String str = e.b(p0);
       if (str != null) {
          this.a("ca", str);
       }
       return;
    }
    public Map c(){
       return this.b;
    }
    public final void d(){
       this.a("ot", "android-"+Build$VERSION.RELEASE);
    }
    public final void e(){
       this.a("ov", Build.DISPLAY);
    }
    public final void f(){
       this.a("dm", Build.MODEL);
    }
    public final void g(){
       this.a("df", Build.MANUFACTURER);
    }
}
