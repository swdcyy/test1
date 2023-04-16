package com.vivo.push.b.c;
import com.vivo.push.o;
import java.lang.String;
import android.content.Context;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.vivo.push.util.p;
import com.vivo.push.util.t;
import com.vivo.push.a;

public class c extends o	// class@001032
{
    public String a;
    public String b;
    public long c;
    public int d;
    public int e;
    public String f;

    public void c(int p0,String p1){
       super(p0);
       this.c = -1;
       this.d = -1;
       this.a = null;
       this.b = p1;
    }
    public final int a(Context p0){
       String str;
       if (this.d == -1) {
          c tb = this.b;
          if (TextUtils.isEmpty(tb)) {
             str = "BaseAppCommand";
             p.a(str, "pkg name is null");
             String str1 = this.a();
             if (TextUtils.isEmpty(str1)) {
                p.a(str, "src is null");
                return -1;
             }else {
                str = str1;
             }
          }
          this.d = t.b(p0, str);
          if (!TextUtils.isEmpty(this.f)) {
             this.d = 2;
          }
       }
       return this.d;
    }
    public final void a(int p0){
       this.e = p0;
    }
    public final void b(String p0){
       this.a = p0;
    }
    public void c(a p0){
       p0.a("req_id", this.a);
       p0.a("package_name", this.b);
       p0.a("sdk_version", 323);
       p0.a("PUSH_APP_STATUS", this.d);
       if (!TextUtils.isEmpty(this.f)) {
          p0.a("BaseAppCommand.EXTRA__HYBRIDVERSION", this.f);
       }
       return;
    }
    public void d(a p0){
       this.a = p0.a("req_id");
       this.b = p0.a("package_name");
       this.c = p0.b("sdk_version", 0);
       this.d = p0.b("PUSH_APP_STATUS", 0);
       this.f = p0.a("BaseAppCommand.EXTRA__HYBRIDVERSION");
    }
    public final int f(){
       return this.e;
    }
    public final void g(){
       this.f = null;
    }
    public final String h(){
       return this.a;
    }
    public String toString(){
       return "BaseAppCommand";
    }
}
