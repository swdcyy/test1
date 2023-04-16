package bw1.c;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.msghandler.b;
import java.lang.String;
import java.lang.Object;
import android.app.Activity;

public final class c implements Runnable	// class@00041f
{
    public final b b;
    public final int c;
    public final String d;

    public void c(b p0,int p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       c tb = this.b;
       tb.b(this.c, this.d, tb.b);
    }
}
