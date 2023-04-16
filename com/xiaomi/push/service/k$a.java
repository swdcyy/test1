package com.xiaomi.push.service.k$a;
import java.util.concurrent.Callable;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.xiaomi.push.service.m$b;
import com.xiaomi.push.service.m;
import rs8.c;

public class k$a implements Callable	// class@00117a
{
    public String b;
    public Context c;
    public boolean d;

    public void k$a(String p0,Context p1,boolean p2){
       super();
       this.c = p1;
       this.b = p0;
       this.d = p2;
    }
    public Bitmap a(){
       m$b a;
       if (!TextUtils.isEmpty(this.b)) {
          if ((this.b).startsWith("http")) {
             a = m.d(this.c, this.b, this.d).a;
          }else {
             a = m.b(this.c, this.b);
             if (a == null) {
                c.l("Failed get online picture/icon resource");
             }
          }
       }else {
          c.l("Failed get online picture/icon resource cause picUrl is empty");
          a = null;
       }
       return a;
    }
    public Object call(){
       return this.a();
    }
}
