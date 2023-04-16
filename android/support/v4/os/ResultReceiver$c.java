package android.support.v4.os.ResultReceiver$c;
import java.lang.Runnable;
import android.support.v4.os.ResultReceiver;
import android.os.Bundle;
import java.lang.Object;

public class ResultReceiver$c implements Runnable	// class@00040a
{
    public final int b;
    public final Bundle c;
    public final ResultReceiver d;

    public void ResultReceiver$c(ResultReceiver p0,int p1,Bundle p2){
       this.d = p0;
       super();
       this.b = p1;
       this.c = p2;
    }
    public void run(){
       this.d.a(this.b, this.c);
    }
}
