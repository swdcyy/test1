package com.vivo.push.b.x;
import com.vivo.push.o;
import java.util.HashMap;
import com.vivo.push.a;
import java.lang.String;
import java.io.Serializable;
import com.vivo.push.util.p;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class x extends o	// class@001047
{
    public HashMap a;
    public long b;

    public void x(){
       super(2012);
    }
    public void x(long p0){
       super();
       this.b = p0;
    }
    public final void a(HashMap p0){
       this.a = p0;
    }
    public final void c(a p0){
       p0.a("ReporterCommand.EXTRA_PARAMS", this.a);
       p0.a("ReporterCommand.EXTRA_REPORTER_TYPE", this.b);
    }
    public final void d(){
       if (this.a == null) {
          p.d("ReporterCommand", "reportParams is empty");
          return;
       }else {
          StringBuilder str = "report message reportType:"+this.b+",msgId:";
          String str1 = this.a.get("messageID");
          if (TextUtils.isEmpty(str1)) {
             str1 = this.a.get("message_id");
          }
          p.d("ReporterCommand", str+str1);
          return;
       }
    }
    public final void d(a p0){
       this.a = p0.d("ReporterCommand.EXTRA_PARAMS");
       this.b = p0.b("ReporterCommand.EXTRA_REPORTER_TYPE", this.b);
    }
    public final String toString(){
       return "ReporterCommand£¨"+this.b+"\)";
    }
}
