package c.t.m.g.en$a;
import android.os.Handler;
import c.t.m.g.en;
import android.os.Looper;
import java.lang.StringBuilder;
import c.t.m.g.ex;
import java.lang.String;
import c.t.m.g.er;
import android.os.Message;
import java.lang.Throwable;

public class en$a extends Handler	// class@000c71
{
    public final en a;
    public StringBuilder b;

    public void en$a(en p0,Looper p1){
       this.a = p0;
       super(p1);
       this.b = new StringBuilder(1024);
    }
    public final void a(){
       if (ex.a) {
          ex.a("asyncTask", "start upload all files");
       }
       if (en.a(this.a) != null) {
          en.a(this.a).b();
       }
       return;
    }
    public void a(Message p0){
       if (p0.what != 0x2715) {
       }else if(ex.a){
          ex.a("asyncTask", "onWifiConnected");
       }
       this.a();
       return;
    }
    public void handleMessage(Message p0){
       super.handleMessage(p0);
       this.a(p0);
    }
}
