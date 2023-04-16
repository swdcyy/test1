package com.vivo.push.c;
import android.os.Handler$Callback;
import com.vivo.push.b;
import java.lang.Object;
import android.os.Message;
import java.lang.String;
import com.vivo.push.util.p;
import java.lang.StringBuilder;
import java.util.concurrent.atomic.AtomicInteger;

public final class c implements Handler$Callback	// class@001050
{
    public final b a;

    public void c(b p0){
       this.a = p0;
       super();
    }
    public final boolean handleMessage(Message p0){
       String str = "AidlManager";
       if (p0 == null) {
          p.a(str, "handleMessage error : msg is null");
          return false;
       }else {
          Message what = p0.what;
          String str1 = 2;
          if (what != true) {
             if (what != str1) {
                p.b(str, "unknow msg what ["+p0.what+"]");
             }else if(b.a(this.a).get() == 4){
                b.c(this.a);
             }
             b.b(this.a);
          }else {
             p.a(str, "In connect, bind core service time out");
             if (b.a(this.a).get() == str1) {
                b.b(this.a);
             }
          }
          return true;
       }
    }
}
