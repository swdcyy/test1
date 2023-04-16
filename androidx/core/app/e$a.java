package androidx.core.app.e$a;
import androidx.core.app.e$d;
import java.lang.String;
import android.app.Notification;
import java.lang.Object;
import android.support.v4.app.a;
import java.lang.StringBuilder;

public class e$a implements e$d	// class@0006ff
{
    public final String a;
    public final int b;
    public final String c;
    public final Notification d;

    public void e$a(String p0,int p1,String p2,Notification p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void a(a p0){
       p0.j1(this.a, this.b, this.c, this.d);
    }
    public String toString(){
       return "NotifyTask["+"packageName:"+this.a+", id:"+this.b+", tag:"+this.c+"]";
    }
}
