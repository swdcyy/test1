package q2.a$c;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class a$c	// class@002956
{
    public final IntentFilter a;
    public final BroadcastReceiver b;
    public boolean c;
    public boolean d;

    public void a$c(IntentFilter p0,BroadcastReceiver p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public String toString(){
       StringBuilder str = new StringBuilder(128)+"Receiver{"+this.b+" filter="+this.a;
       if (this.d != null) {
          str = str+" DEAD";
       }
       return str+"}";
    }
}
